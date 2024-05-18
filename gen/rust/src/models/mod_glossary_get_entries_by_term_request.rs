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
pub struct ModGlossaryGetEntriesByTermRequest {
    /// Start returning records from here
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<i32>,
    /// Glossary entry ID
    #[serde(rename = "id")]
    pub id: i32,
    /// Number of records to return
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Box<models::ModGlossaryGetEntriesByAuthorRequestOptions>>,
    /// The entry concept, or alias
    #[serde(rename = "term")]
    pub term: String,
}

impl ModGlossaryGetEntriesByTermRequest {
    pub fn new(id: i32, term: String) -> ModGlossaryGetEntriesByTermRequest {
        ModGlossaryGetEntriesByTermRequest {
            from: None,
            id,
            limit: None,
            options: None,
            term,
        }
    }
}

