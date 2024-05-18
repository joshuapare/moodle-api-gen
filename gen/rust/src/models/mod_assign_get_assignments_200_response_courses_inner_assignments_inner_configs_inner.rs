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

/// ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner : assignment configuration object
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner {
    /// assignment id
    #[serde(rename = "assignment", skip_serializing_if = "Option::is_none")]
    pub assignment: Option<i32>,
    /// assign_plugin_config id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// plugin
    #[serde(rename = "plugin", skip_serializing_if = "Option::is_none")]
    pub plugin: Option<String>,
    /// subtype
    #[serde(rename = "subtype", skip_serializing_if = "Option::is_none")]
    pub subtype: Option<String>,
    /// value
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner {
    /// assignment configuration object
    pub fn new() -> ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner {
        ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner {
            assignment: None,
            id: None,
            name: None,
            plugin: None,
            subtype: None,
            value: None,
        }
    }
}

