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

/// ModAssignGetAssignments200ResponseCoursesInner : course information object
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModAssignGetAssignments200ResponseCoursesInner {
    #[serde(rename = "assignments", skip_serializing_if = "Option::is_none")]
    pub assignments: Option<Vec<models::ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner>>,
    /// course full name
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// course id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// course short name
    #[serde(rename = "shortname", skip_serializing_if = "Option::is_none")]
    pub shortname: Option<String>,
    /// last time modified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
}

impl ModAssignGetAssignments200ResponseCoursesInner {
    /// course information object
    pub fn new() -> ModAssignGetAssignments200ResponseCoursesInner {
        ModAssignGetAssignments200ResponseCoursesInner {
            assignments: None,
            fullname: None,
            id: None,
            shortname: None,
            timemodified: None,
        }
    }
}
