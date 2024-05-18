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
pub struct ModQuizSetQuestionVersionRequest {
    #[serde(rename = "newversion")]
    pub newversion: i32,
    #[serde(rename = "slotid")]
    pub slotid: i32,
}

impl ModQuizSetQuestionVersionRequest {
    pub fn new(newversion: i32, slotid: i32) -> ModQuizSetQuestionVersionRequest {
        ModQuizSetQuestionVersionRequest {
            newversion,
            slotid,
        }
    }
}

