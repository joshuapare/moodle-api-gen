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
pub struct CoreCustomfieldReloadTemplateRequest {
    /// area
    #[serde(rename = "area")]
    pub area: String,
    /// component
    #[serde(rename = "component")]
    pub component: String,
    /// itemid
    #[serde(rename = "itemid")]
    pub itemid: i32,
}

impl CoreCustomfieldReloadTemplateRequest {
    pub fn new(area: String, component: String, itemid: i32) -> CoreCustomfieldReloadTemplateRequest {
        CoreCustomfieldReloadTemplateRequest {
            area,
            component,
            itemid,
        }
    }
}

