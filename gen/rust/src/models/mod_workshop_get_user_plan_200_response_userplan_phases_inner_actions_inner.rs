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
pub struct ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner {
    /// Action label.
    #[serde(rename = "label", skip_serializing_if = "Option::is_none")]
    pub label: Option<String>,
    /// Get or post.
    #[serde(rename = "method", skip_serializing_if = "Option::is_none")]
    pub method: Option<String>,
    /// Action type.
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    /// Link to action.
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
}

impl ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner {
    pub fn new() -> ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner {
        ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner {
            label: None,
            method: None,
            r#type: None,
            url: None,
        }
    }
}
