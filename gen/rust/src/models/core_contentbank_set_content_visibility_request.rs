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
pub struct CoreContentbankSetContentVisibilityRequest {
    /// The content id to rename
    #[serde(rename = "contentid")]
    pub contentid: i32,
    /// The new visibility for the content
    #[serde(rename = "visibility")]
    pub visibility: i32,
}

impl CoreContentbankSetContentVisibilityRequest {
    pub fn new(contentid: i32, visibility: i32) -> CoreContentbankSetContentVisibilityRequest {
        CoreContentbankSetContentVisibilityRequest {
            contentid,
            visibility,
        }
    }
}

