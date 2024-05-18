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

/// CoreTagGetTagCloud200ResponseTagsInner : Tags.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CoreTagGetTagCloud200ResponseTagsInner {
    /// Number of tag instances.
    #[serde(rename = "count", skip_serializing_if = "Option::is_none")]
    pub count: Option<i32>,
    /// Whether the tag is flagged as inappropriate.
    #[serde(rename = "flag", skip_serializing_if = "Option::is_none")]
    pub flag: Option<bool>,
    /// Whether is a standard tag or not.
    #[serde(rename = "isstandard", skip_serializing_if = "Option::is_none")]
    pub isstandard: Option<bool>,
    /// Tag name.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Proportional size to display the tag.
    #[serde(rename = "size", skip_serializing_if = "Option::is_none")]
    pub size: Option<i32>,
    /// URL to view the tag index.
    #[serde(rename = "viewurl", skip_serializing_if = "Option::is_none")]
    pub viewurl: Option<String>,
}

impl CoreTagGetTagCloud200ResponseTagsInner {
    /// Tags.
    pub fn new() -> CoreTagGetTagCloud200ResponseTagsInner {
        CoreTagGetTagCloud200ResponseTagsInner {
            count: None,
            flag: None,
            isstandard: None,
            name: None,
            size: None,
            viewurl: None,
        }
    }
}
