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
pub struct ModAssignGetSubmissionStatusRequest {
    /// assignment instance id
    #[serde(rename = "assignid")]
    pub assignid: i32,
    /// filter by users in group (used for generating the grading summary).                     0 for all groups information, any other empty value will calculate currrent group.
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// user id (empty for current user)
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModAssignGetSubmissionStatusRequest {
    pub fn new(assignid: i32) -> ModAssignGetSubmissionStatusRequest {
        ModAssignGetSubmissionStatusRequest {
            assignid,
            groupid: None,
            userid: None,
        }
    }
}

