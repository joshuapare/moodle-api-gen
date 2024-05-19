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
pub struct CoreGroupGetActivityAllowedGroupsRequest {
    /// course module id
    #[serde(rename = "cmid")]
    pub cmid: i32,
    /// id of user, empty for current user
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl CoreGroupGetActivityAllowedGroupsRequest {
    pub fn new(cmid: i32) -> CoreGroupGetActivityAllowedGroupsRequest {
        CoreGroupGetActivityAllowedGroupsRequest {
            cmid,
            userid: None,
        }
    }
}

