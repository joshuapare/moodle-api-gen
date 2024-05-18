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
pub struct CoreSessionTimeRemaining200Response {
    /// The number of seconds remaining in this session.
    #[serde(rename = "timeremaining")]
    pub timeremaining: i32,
    /// The current user id.
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreSessionTimeRemaining200Response {
    pub fn new(timeremaining: i32, userid: i32) -> CoreSessionTimeRemaining200Response {
        CoreSessionTimeRemaining200Response {
            timeremaining,
            userid,
        }
    }
}
