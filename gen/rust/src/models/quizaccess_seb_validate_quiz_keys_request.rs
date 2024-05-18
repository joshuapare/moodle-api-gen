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
pub struct QuizaccessSebValidateQuizKeysRequest {
    /// SEB browser exam key
    #[serde(rename = "browserexamkey", skip_serializing_if = "Option::is_none")]
    pub browserexamkey: Option<String>,
    /// Course module ID
    #[serde(rename = "cmid")]
    pub cmid: i32,
    /// SEB config key
    #[serde(rename = "configkey", skip_serializing_if = "Option::is_none")]
    pub configkey: Option<String>,
    /// Page URL to check
    #[serde(rename = "url")]
    pub url: String,
}

impl QuizaccessSebValidateQuizKeysRequest {
    pub fn new(cmid: i32, url: String) -> QuizaccessSebValidateQuizKeysRequest {
        QuizaccessSebValidateQuizKeysRequest {
            browserexamkey: None,
            cmid,
            configkey: None,
            url,
        }
    }
}

