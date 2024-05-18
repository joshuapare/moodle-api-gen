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
pub struct BlockIomadCompanyAdminCheckTokenRequestKey0 {
    /// The user moodle session key
    #[serde(rename = "token")]
    pub token: String,
    /// The user that is going to be enrolled
    #[serde(rename = "username")]
    pub username: String,
}

impl BlockIomadCompanyAdminCheckTokenRequestKey0 {
    pub fn new(token: String, username: String) -> BlockIomadCompanyAdminCheckTokenRequestKey0 {
        BlockIomadCompanyAdminCheckTokenRequestKey0 {
            token,
            username,
        }
    }
}

