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
pub struct ModDataUpdateEntryRequest {
    #[serde(rename = "data")]
    pub data: Vec<models::ModDataUpdateEntryRequestDataInner>,
    /// The entry record id.
    #[serde(rename = "entryid")]
    pub entryid: i32,
}

impl ModDataUpdateEntryRequest {
    pub fn new(data: Vec<models::ModDataUpdateEntryRequestDataInner>, entryid: i32) -> ModDataUpdateEntryRequest {
        ModDataUpdateEntryRequest {
            data,
            entryid,
        }
    }
}

