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
pub struct ToolMobileGetContent200Response {
    /// Whether we consider this disabled or not.
    #[serde(rename = "disabled", skip_serializing_if = "Option::is_none")]
    pub disabled: Option<bool>,
    #[serde(rename = "files")]
    pub files: Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>,
    /// JavaScript code.
    #[serde(rename = "javascript")]
    pub javascript: String,
    #[serde(rename = "otherdata")]
    pub otherdata: Vec<models::ToolMobileGetContent200ResponseOtherdataInner>,
    #[serde(rename = "restrict")]
    pub restrict: Box<models::ToolMobileGetContent200ResponseRestrict>,
    #[serde(rename = "templates")]
    pub templates: Vec<models::ToolMobileGetContent200ResponseTemplatesInner>,
}

impl ToolMobileGetContent200Response {
    pub fn new(files: Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>, javascript: String, otherdata: Vec<models::ToolMobileGetContent200ResponseOtherdataInner>, restrict: models::ToolMobileGetContent200ResponseRestrict, templates: Vec<models::ToolMobileGetContent200ResponseTemplatesInner>) -> ToolMobileGetContent200Response {
        ToolMobileGetContent200Response {
            disabled: None,
            files,
            javascript,
            otherdata,
            restrict: Box::new(restrict),
            templates,
        }
    }
}

