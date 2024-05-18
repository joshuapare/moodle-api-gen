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
pub struct ModDataGetEntries200ResponseEntriesInnerContentsInner {
    /// Contents.
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<String>,
    /// Contents.
    #[serde(rename = "content1", skip_serializing_if = "Option::is_none")]
    pub content1: Option<String>,
    /// Contents.
    #[serde(rename = "content2", skip_serializing_if = "Option::is_none")]
    pub content2: Option<String>,
    /// Contents.
    #[serde(rename = "content3", skip_serializing_if = "Option::is_none")]
    pub content3: Option<String>,
    /// Contents.
    #[serde(rename = "content4", skip_serializing_if = "Option::is_none")]
    pub content4: Option<String>,
    /// The field type of the content.
    #[serde(rename = "fieldid", skip_serializing_if = "Option::is_none")]
    pub fieldid: Option<i32>,
    #[serde(rename = "files", skip_serializing_if = "Option::is_none")]
    pub files: Option<Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>>,
    /// Content id.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The record this content belongs to.
    #[serde(rename = "recordid", skip_serializing_if = "Option::is_none")]
    pub recordid: Option<i32>,
}

impl ModDataGetEntries200ResponseEntriesInnerContentsInner {
    pub fn new() -> ModDataGetEntries200ResponseEntriesInnerContentsInner {
        ModDataGetEntries200ResponseEntriesInnerContentsInner {
            content: None,
            content1: None,
            content2: None,
            content3: None,
            content4: None,
            fieldid: None,
            files: None,
            id: None,
            recordid: None,
        }
    }
}
