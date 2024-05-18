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
pub struct CoreCourseUpdateCategoriesRequestCategoriesInner {
    /// category description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// course id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// category id number
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// category name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// parent category id
    #[serde(rename = "parent", skip_serializing_if = "Option::is_none")]
    pub parent: Option<i32>,
    /// the category theme. This option must be enabled on moodle
    #[serde(rename = "theme", skip_serializing_if = "Option::is_none")]
    pub theme: Option<String>,
}

impl CoreCourseUpdateCategoriesRequestCategoriesInner {
    pub fn new() -> CoreCourseUpdateCategoriesRequestCategoriesInner {
        CoreCourseUpdateCategoriesRequestCategoriesInner {
            description: None,
            descriptionformat: None,
            id: None,
            idnumber: None,
            name: None,
            parent: None,
            theme: None,
        }
    }
}

