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

/// ModChoiceSubmitChoiceResponse200ResponseAnswersInner : Answers
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
    /// choiceid
    #[serde(rename = "choiceid", skip_serializing_if = "Option::is_none")]
    pub choiceid: Option<i32>,
    /// answer id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// optionid
    #[serde(rename = "optionid", skip_serializing_if = "Option::is_none")]
    pub optionid: Option<i32>,
    /// time of last modification
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// user id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
    /// Answers
    pub fn new() -> ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
        ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
            choiceid: None,
            id: None,
            optionid: None,
            timemodified: None,
            userid: None,
        }
    }
}

