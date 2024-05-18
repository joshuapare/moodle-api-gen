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
pub struct CoreCompletionGetActivitiesCompletionStatusRequest {
    /// Course ID
    #[serde(rename = "courseid")]
    pub courseid: i32,
    /// User ID
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreCompletionGetActivitiesCompletionStatusRequest {
    pub fn new(courseid: i32, userid: i32) -> CoreCompletionGetActivitiesCompletionStatusRequest {
        CoreCompletionGetActivitiesCompletionStatusRequest {
            courseid,
            userid,
        }
    }
}
