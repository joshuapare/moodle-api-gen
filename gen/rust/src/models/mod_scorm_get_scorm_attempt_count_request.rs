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
pub struct ModScormGetScormAttemptCountRequest {
    /// Ignores attempts that haven't reported a grade/completion
    #[serde(rename = "ignoremissingcompletion", skip_serializing_if = "Option::is_none")]
    pub ignoremissingcompletion: Option<bool>,
    /// SCORM instance id
    #[serde(rename = "scormid")]
    pub scormid: i32,
    /// User id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl ModScormGetScormAttemptCountRequest {
    pub fn new(scormid: i32, userid: i32) -> ModScormGetScormAttemptCountRequest {
        ModScormGetScormAttemptCountRequest {
            ignoremissingcompletion: None,
            scormid,
            userid,
        }
    }
}

