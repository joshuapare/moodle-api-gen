/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModFeedbackGetFeedbackAccessInformation200Response {
    /// Whether the user can complete the feedback or not.
    #[serde(rename = "cancomplete")]
    pub cancomplete: bool,
    /// Whether the user can delete submissions or not.
    #[serde(rename = "candeletesubmissions")]
    pub candeletesubmissions: bool,
    /// Whether the user can edit feedback items or not.
    #[serde(rename = "canedititems")]
    pub canedititems: bool,
    /// Whether the user can submit the feedback or not.
    #[serde(rename = "cansubmit")]
    pub cansubmit: bool,
    /// Whether the user can view the analysis or not.
    #[serde(rename = "canviewanalysis")]
    pub canviewanalysis: bool,
    /// Whether the user can view the feedback reports or not.
    #[serde(rename = "canviewreports")]
    pub canviewreports: bool,
    /// Whether the feedback is already submitted or not.
    #[serde(rename = "isalreadysubmitted")]
    pub isalreadysubmitted: bool,
    /// Whether the feedback is anonymous or not.
    #[serde(rename = "isanonymous")]
    pub isanonymous: bool,
    /// Whether the feedback has questions or not.
    #[serde(rename = "isempty")]
    pub isempty: bool,
    /// Whether the feedback has active access time restrictions or not.
    #[serde(rename = "isopen")]
    pub isopen: bool,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModFeedbackGetFeedbackAccessInformation200Response {
    pub fn new(cancomplete: bool, candeletesubmissions: bool, canedititems: bool, cansubmit: bool, canviewanalysis: bool, canviewreports: bool, isalreadysubmitted: bool, isanonymous: bool, isempty: bool, isopen: bool) -> ModFeedbackGetFeedbackAccessInformation200Response {
        ModFeedbackGetFeedbackAccessInformation200Response {
            cancomplete,
            candeletesubmissions,
            canedititems,
            cansubmit,
            canviewanalysis,
            canviewreports,
            isalreadysubmitted,
            isanonymous,
            isempty,
            isopen,
            warnings: None,
        }
    }
}
