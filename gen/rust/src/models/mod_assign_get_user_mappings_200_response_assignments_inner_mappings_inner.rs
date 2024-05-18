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
pub struct ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
    /// user mapping id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// student id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
    pub fn new() -> ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
        ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
            id: None,
            userid: None,
        }
    }
}

