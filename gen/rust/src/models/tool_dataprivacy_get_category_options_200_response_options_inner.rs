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
pub struct ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
    /// The category ID
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The category name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
    pub fn new() -> ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
        ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
            id: None,
            name: None,
        }
    }
}

