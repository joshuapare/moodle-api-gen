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
pub struct CoreEnrolGetUsersCoursesRequest {
    /// Include count of enrolled users for each course? This can add several seconds to the response time if a user is on several large courses, so set this to false if the value will not be used to improve performance.
    #[serde(rename = "returnusercount", skip_serializing_if = "Option::is_none")]
    pub returnusercount: Option<bool>,
    /// user id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreEnrolGetUsersCoursesRequest {
    pub fn new(userid: i32) -> CoreEnrolGetUsersCoursesRequest {
        CoreEnrolGetUsersCoursesRequest {
            returnusercount: None,
            userid,
        }
    }
}
