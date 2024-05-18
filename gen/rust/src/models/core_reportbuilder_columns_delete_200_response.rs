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
pub struct CoreReportbuilderColumnsDelete200Response {
    /// hassortablecolumns
    #[serde(rename = "hassortablecolumns")]
    pub hassortablecolumns: bool,
    /// helpicon
    #[serde(rename = "helpicon")]
    pub helpicon: String,
    #[serde(rename = "sortablecolumns")]
    pub sortablecolumns: Vec<models::CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner>,
}

impl CoreReportbuilderColumnsDelete200Response {
    pub fn new(hassortablecolumns: bool, helpicon: String, sortablecolumns: Vec<models::CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner>) -> CoreReportbuilderColumnsDelete200Response {
        CoreReportbuilderColumnsDelete200Response {
            hassortablecolumns,
            helpicon,
            sortablecolumns,
        }
    }
}
