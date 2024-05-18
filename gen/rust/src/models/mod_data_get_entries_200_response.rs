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
pub struct ModDataGetEntries200Response {
    #[serde(rename = "entries")]
    pub entries: Vec<models::ModDataGetEntries200ResponseEntriesInner>,
    /// The list view contents as is rendered in the site.
    #[serde(rename = "listviewcontents", skip_serializing_if = "Option::is_none")]
    pub listviewcontents: Option<String>,
    /// Total count of records.
    #[serde(rename = "totalcount")]
    pub totalcount: i32,
    /// Total size (bytes) of the files included in the records.
    #[serde(rename = "totalfilesize")]
    pub totalfilesize: i32,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModDataGetEntries200Response {
    pub fn new(entries: Vec<models::ModDataGetEntries200ResponseEntriesInner>, totalcount: i32, totalfilesize: i32) -> ModDataGetEntries200Response {
        ModDataGetEntries200Response {
            entries,
            listviewcontents: None,
            totalcount,
            totalfilesize,
            warnings: None,
        }
    }
}
