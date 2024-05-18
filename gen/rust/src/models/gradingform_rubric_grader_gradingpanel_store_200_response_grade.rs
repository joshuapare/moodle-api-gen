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
pub struct GradingformRubricGraderGradingpanelStore200ResponseGrade {
    /// Can the user edit this
    #[serde(rename = "canedit")]
    pub canedit: bool,
    #[serde(rename = "criteria")]
    pub criteria: Vec<models::GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner>,
    /// The assumed grader of this grading instance
    #[serde(rename = "gradedby")]
    pub gradedby: String,
    /// The id of the current grading instance
    #[serde(rename = "instanceid")]
    pub instanceid: i32,
    /// Max possible grade
    #[serde(rename = "maxgrade")]
    pub maxgrade: String,
    /// The mode i.e. evaluate editable
    #[serde(rename = "rubricmode")]
    pub rubricmode: String,
    /// The time that the grade was created
    #[serde(rename = "timecreated")]
    pub timecreated: i32,
    /// The time that the grade was last updated
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// Current user grade
    #[serde(rename = "usergrade")]
    pub usergrade: String,
}

impl GradingformRubricGraderGradingpanelStore200ResponseGrade {
    pub fn new(canedit: bool, criteria: Vec<models::GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner>, gradedby: String, instanceid: i32, maxgrade: String, rubricmode: String, timecreated: i32, timemodified: i32, usergrade: String) -> GradingformRubricGraderGradingpanelStore200ResponseGrade {
        GradingformRubricGraderGradingpanelStore200ResponseGrade {
            canedit,
            criteria,
            gradedby,
            instanceid,
            maxgrade,
            rubricmode,
            timecreated,
            timemodified,
            usergrade,
        }
    }
}
