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
pub struct CoreOutputLoadTemplateRequest {
    /// component containing the template
    #[serde(rename = "component")]
    pub component: String,
    /// Include comments or not
    #[serde(rename = "includecomments", skip_serializing_if = "Option::is_none")]
    pub includecomments: Option<bool>,
    /// name of the template
    #[serde(rename = "template")]
    pub template: String,
    /// The current theme.
    #[serde(rename = "themename")]
    pub themename: String,
}

impl CoreOutputLoadTemplateRequest {
    pub fn new(component: String, template: String, themename: String) -> CoreOutputLoadTemplateRequest {
        CoreOutputLoadTemplateRequest {
            component,
            includecomments: None,
            template,
            themename,
        }
    }
}
