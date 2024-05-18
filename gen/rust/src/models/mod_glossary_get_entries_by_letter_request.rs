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
pub struct ModGlossaryGetEntriesByLetterRequest {
    /// Start returning records from here
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<i32>,
    /// Glossary entry ID
    #[serde(rename = "id")]
    pub id: i32,
    /// A letter, or either keywords: 'ALL' or 'SPECIAL'.
    #[serde(rename = "letter")]
    pub letter: String,
    /// Number of records to return
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Box<models::ModGlossaryGetEntriesByAuthorRequestOptions>>,
}

impl ModGlossaryGetEntriesByLetterRequest {
    pub fn new(id: i32, letter: String) -> ModGlossaryGetEntriesByLetterRequest {
        ModGlossaryGetEntriesByLetterRequest {
            from: None,
            id,
            letter,
            limit: None,
            options: None,
        }
    }
}

