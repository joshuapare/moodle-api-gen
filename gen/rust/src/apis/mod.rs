use std::error;
use std::fmt;

#[derive(Debug, Clone)]
pub struct ResponseContent<T> {
    pub status: reqwest::StatusCode,
    pub content: String,
    pub entity: Option<T>,
}

#[derive(Debug)]
pub enum Error<T> {
    Reqwest(reqwest::Error),
    Serde(serde_json::Error),
    Io(std::io::Error),
    ResponseError(ResponseContent<T>),
}

impl <T> fmt::Display for Error<T> {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let (module, e) = match self {
            Error::Reqwest(e) => ("reqwest", e.to_string()),
            Error::Serde(e) => ("serde", e.to_string()),
            Error::Io(e) => ("IO", e.to_string()),
            Error::ResponseError(e) => ("response", format!("status code {}", e.status)),
        };
        write!(f, "error in {}: {}", module, e)
    }
}

impl <T: fmt::Debug> error::Error for Error<T> {
    fn source(&self) -> Option<&(dyn error::Error + 'static)> {
        Some(match self {
            Error::Reqwest(e) => e,
            Error::Serde(e) => e,
            Error::Io(e) => e,
            Error::ResponseError(_) => return None,
        })
    }
}

impl <T> From<reqwest::Error> for Error<T> {
    fn from(e: reqwest::Error) -> Self {
        Error::Reqwest(e)
    }
}

impl <T> From<serde_json::Error> for Error<T> {
    fn from(e: serde_json::Error) -> Self {
        Error::Serde(e)
    }
}

impl <T> From<std::io::Error> for Error<T> {
    fn from(e: std::io::Error) -> Self {
        Error::Io(e)
    }
}

pub fn urlencode<T: AsRef<str>>(s: T) -> String {
    ::url::form_urlencoded::byte_serialize(s.as_ref().as_bytes()).collect()
}

pub fn parse_deep_object(prefix: &str, value: &serde_json::Value) -> Vec<(String, String)> {
    if let serde_json::Value::Object(object) = value {
        let mut params = vec![];

        for (key, value) in object {
            match value {
                serde_json::Value::Object(_) => params.append(&mut parse_deep_object(
                    &format!("{}[{}]", prefix, key),
                    value,
                )),
                serde_json::Value::Array(array) => {
                    for (i, value) in array.iter().enumerate() {
                        params.append(&mut parse_deep_object(
                            &format!("{}[{}][{}]", prefix, key, i),
                            value,
                        ));
                    }
                },
                serde_json::Value::String(s) => params.push((format!("{}[{}]", prefix, key), s.clone())),
                _ => params.push((format!("{}[{}]", prefix, key), value.to_string())),
            }
        }

        return params;
    }

    unimplemented!("Only objects are supported with style=deepObject")
}

pub mod auth_email_api;
pub mod block_accessreview_api;
pub mod block_iomad_company_admin_api;
pub mod block_recentlyaccesseditems_api;
pub mod block_starredcourses_api;
pub mod enrol_guest_api;
pub mod enrol_license_api;
pub mod enrol_manual_api;
pub mod enrol_meta_api;
pub mod enrol_self_api;
pub mod gradereport_grader_api;
pub mod gradereport_overview_api;
pub mod gradereport_singleview_api;
pub mod gradereport_user_api;
pub mod gradingform_guide_api;
pub mod gradingform_rubric_api;
pub mod local_iomad_learningpath_api;
pub mod media_videojs_api;
pub mod message_airnotifier_api;
pub mod message_popup_api;
pub mod mod_assign_api;
pub mod mod_bigbluebuttonbn_api;
pub mod mod_book_api;
pub mod mod_chat_api;
pub mod mod_choice_api;
pub mod mod_data_api;
pub mod mod_feedback_api;
pub mod mod_folder_api;
pub mod mod_forum_api;
pub mod mod_glossary_api;
pub mod mod_h5pactivity_api;
pub mod mod_imscp_api;
pub mod mod_iomadcertificate_api;
pub mod mod_label_api;
pub mod mod_lesson_api;
pub mod mod_lti_api;
pub mod mod_page_api;
pub mod mod_quiz_api;
pub mod mod_resource_api;
pub mod mod_scorm_api;
pub mod mod_survey_api;
pub mod mod_url_api;
pub mod mod_wiki_api;
pub mod mod_workshop_api;
pub mod moodle_api;
pub mod paygw_paypal_api;
pub mod qbank_columnsortorder_api;
pub mod qbank_editquestion_api;
pub mod qbank_tagquestion_api;
pub mod qbank_viewquestiontext_api;
pub mod quizaccess_seb_api;
pub mod report_competency_api;
pub mod report_insights_api;
pub mod tiny_autosave_api;
pub mod tiny_equation_api;
pub mod tiny_premium_api;
pub mod tool_analytics_api;
pub mod tool_behat_api;
pub mod tool_dataprivacy_api;
pub mod tool_iomadpolicy_api;
pub mod tool_lp_api;
pub mod tool_mobile_api;
pub mod tool_moodlenet_api;
pub mod tool_policy_api;
pub mod tool_templatelibrary_api;
pub mod tool_usertours_api;
pub mod tool_xmldb_api;

pub mod configuration;
