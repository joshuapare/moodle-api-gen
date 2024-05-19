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
pub struct ToolDataprivacyGetActivityOptions200ResponseOptionsInner {
    /// The display name of the activity
    #[serde(rename = "displayname", skip_serializing_if = "Option::is_none")]
    pub displayname: Option<String>,
    /// The plugin name of the activity
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl ToolDataprivacyGetActivityOptions200ResponseOptionsInner {
    pub fn new() -> ToolDataprivacyGetActivityOptions200ResponseOptionsInner {
        ToolDataprivacyGetActivityOptions200ResponseOptionsInner {
            displayname: None,
            name: None,
        }
    }
}

