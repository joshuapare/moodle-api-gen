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
pub struct ModDataGetDataAccessInformationRequest {
    /// Database instance id.
    #[serde(rename = "databaseid")]
    pub databaseid: i32,
    /// Group id, 0 means that the function will determine the user group.
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
}

impl ModDataGetDataAccessInformationRequest {
    pub fn new(databaseid: i32) -> ModDataGetDataAccessInformationRequest {
        ModDataGetDataAccessInformationRequest {
            databaseid,
            groupid: None,
        }
    }
}
