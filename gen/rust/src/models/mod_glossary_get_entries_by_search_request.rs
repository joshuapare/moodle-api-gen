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
pub struct ModGlossaryGetEntriesBySearchRequest {
    /// Start returning records from here
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<i32>,
    /// The query
    #[serde(rename = "fullsearch", skip_serializing_if = "Option::is_none")]
    pub fullsearch: Option<bool>,
    /// Glossary entry ID
    #[serde(rename = "id")]
    pub id: i32,
    /// Number of records to return
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Box<models::ModGlossaryGetEntriesByAuthorRequestOptions>>,
    /// Order by: 'CONCEPT', 'CREATION' or 'UPDATE'
    #[serde(rename = "order", skip_serializing_if = "Option::is_none")]
    pub order: Option<String>,
    /// The query string
    #[serde(rename = "query")]
    pub query: String,
    /// The direction of the order: 'ASC' or 'DESC'
    #[serde(rename = "sort", skip_serializing_if = "Option::is_none")]
    pub sort: Option<String>,
}

impl ModGlossaryGetEntriesBySearchRequest {
    pub fn new(id: i32, query: String) -> ModGlossaryGetEntriesBySearchRequest {
        ModGlossaryGetEntriesBySearchRequest {
            from: None,
            fullsearch: None,
            id,
            limit: None,
            options: None,
            order: None,
            query,
            sort: None,
        }
    }
}

