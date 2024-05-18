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

/// CoreGradesCreateGradecategoriesRequestCategoriesInner : Category to create
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CoreGradesCreateGradecategoriesRequestCategoriesInner {
    /// fullname of category
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Box<models::CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions>>,
}

impl CoreGradesCreateGradecategoriesRequestCategoriesInner {
    /// Category to create
    pub fn new() -> CoreGradesCreateGradecategoriesRequestCategoriesInner {
        CoreGradesCreateGradecategoriesRequestCategoriesInner {
            fullname: None,
            options: None,
        }
    }
}
