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
pub struct CoreTagGetTagAreas200ResponseAreasInner {
    /// Component callback for processing tags.
    #[serde(rename = "callback", skip_serializing_if = "Option::is_none")]
    pub callback: Option<String>,
    /// Component callback file.
    #[serde(rename = "callbackfile", skip_serializing_if = "Option::is_none")]
    pub callbackfile: Option<String>,
    /// Component the area is related to.
    #[serde(rename = "component", skip_serializing_if = "Option::is_none")]
    pub component: Option<String>,
    /// Whether this area is enabled.
    #[serde(rename = "enabled", skip_serializing_if = "Option::is_none")]
    pub enabled: Option<bool>,
    /// Area id.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Type of item in the component.
    #[serde(rename = "itemtype", skip_serializing_if = "Option::is_none")]
    pub itemtype: Option<String>,
    /// Whether the area is locked.
    #[serde(rename = "locked", skip_serializing_if = "Option::is_none")]
    pub locked: Option<bool>,
    /// Whether the tag area allows tag instances to be created in multiple contexts. 
    #[serde(rename = "multiplecontexts", skip_serializing_if = "Option::is_none")]
    pub multiplecontexts: Option<bool>,
    /// Return whether to display only standard, only non-standard or both tags.
    #[serde(rename = "showstandard", skip_serializing_if = "Option::is_none")]
    pub showstandard: Option<i32>,
    /// The tag collection this are belongs to.
    #[serde(rename = "tagcollid", skip_serializing_if = "Option::is_none")]
    pub tagcollid: Option<i32>,
}

impl CoreTagGetTagAreas200ResponseAreasInner {
    pub fn new() -> CoreTagGetTagAreas200ResponseAreasInner {
        CoreTagGetTagAreas200ResponseAreasInner {
            callback: None,
            callbackfile: None,
            component: None,
            enabled: None,
            id: None,
            itemtype: None,
            locked: None,
            multiplecontexts: None,
            showstandard: None,
            tagcollid: None,
        }
    }
}

