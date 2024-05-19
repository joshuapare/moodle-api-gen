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
pub struct CoreMessageGetMemberInfoRequest {
    /// include contact requests in response
    #[serde(rename = "includecontactrequests", skip_serializing_if = "Option::is_none")]
    pub includecontactrequests: Option<bool>,
    /// include privacy info in response
    #[serde(rename = "includeprivacyinfo", skip_serializing_if = "Option::is_none")]
    pub includeprivacyinfo: Option<bool>,
    /// id of the user
    #[serde(rename = "referenceuserid")]
    pub referenceuserid: i32,
    #[serde(rename = "userids")]
    pub userids: Vec<serde_json::Value>,
}

impl CoreMessageGetMemberInfoRequest {
    pub fn new(referenceuserid: i32, userids: Vec<serde_json::Value>) -> CoreMessageGetMemberInfoRequest {
        CoreMessageGetMemberInfoRequest {
            includecontactrequests: None,
            includeprivacyinfo: None,
            referenceuserid,
            userids,
        }
    }
}

