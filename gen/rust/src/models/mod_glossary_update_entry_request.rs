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
pub struct ModGlossaryUpdateEntryRequest {
    /// Glossary concept
    #[serde(rename = "concept")]
    pub concept: String,
    /// Glossary concept definition
    #[serde(rename = "definition")]
    pub definition: String,
    /// definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "definitionformat")]
    pub definitionformat: i32,
    /// Glossary entry id to update
    #[serde(rename = "entryid")]
    pub entryid: i32,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Vec<models::ModGlossaryUpdateEntryRequestOptionsInner>>,
}

impl ModGlossaryUpdateEntryRequest {
    pub fn new(concept: String, definition: String, definitionformat: i32, entryid: i32) -> ModGlossaryUpdateEntryRequest {
        ModGlossaryUpdateEntryRequest {
            concept,
            definition,
            definitionformat,
            entryid,
            options: None,
        }
    }
}

