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
pub struct ModAssignGetGrades200Response {
    #[serde(rename = "assignments")]
    pub assignments: Vec<models::ModAssignGetGrades200ResponseAssignmentsInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::ModAssignGetGrades200ResponseWarningsInner>>,
}

impl ModAssignGetGrades200Response {
    pub fn new(assignments: Vec<models::ModAssignGetGrades200ResponseAssignmentsInner>) -> ModAssignGetGrades200Response {
        ModAssignGetGrades200Response {
            assignments,
            warnings: None,
        }
    }
}
