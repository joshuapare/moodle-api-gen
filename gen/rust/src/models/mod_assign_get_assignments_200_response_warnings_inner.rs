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

/// ModAssignGetAssignments200ResponseWarningsInner : warning
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModAssignGetAssignments200ResponseWarningsInner {
    /// item can be 'course' (errorcode 1 or 2) or 'module' (errorcode 1)
    #[serde(rename = "item", skip_serializing_if = "Option::is_none")]
    pub item: Option<String>,
    /// When item is a course then itemid is a course id. When the item is a module then itemid is a module id
    #[serde(rename = "itemid", skip_serializing_if = "Option::is_none")]
    pub itemid: Option<i32>,
    /// untranslated english message to explain the warning
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions)
    #[serde(rename = "warningcode", skip_serializing_if = "Option::is_none")]
    pub warningcode: Option<String>,
}

impl ModAssignGetAssignments200ResponseWarningsInner {
    /// warning
    pub fn new() -> ModAssignGetAssignments200ResponseWarningsInner {
        ModAssignGetAssignments200ResponseWarningsInner {
            item: None,
            itemid: None,
            message: None,
            warningcode: None,
        }
    }
}
