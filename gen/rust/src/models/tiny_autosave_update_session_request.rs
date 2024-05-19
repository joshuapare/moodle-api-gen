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
pub struct TinyAutosaveUpdateSessionRequest {
    /// The context id that owns the editor
    #[serde(rename = "contextid")]
    pub contextid: i32,
    /// The draft text
    #[serde(rename = "drafttext")]
    pub drafttext: String,
    /// The ID of the element
    #[serde(rename = "elementid")]
    pub elementid: String,
    /// The page hash
    #[serde(rename = "pagehash")]
    pub pagehash: String,
    /// The page instance
    #[serde(rename = "pageinstance")]
    pub pageinstance: String,
}

impl TinyAutosaveUpdateSessionRequest {
    pub fn new(contextid: i32, drafttext: String, elementid: String, pagehash: String, pageinstance: String) -> TinyAutosaveUpdateSessionRequest {
        TinyAutosaveUpdateSessionRequest {
            contextid,
            drafttext,
            elementid,
            pagehash,
            pageinstance,
        }
    }
}

