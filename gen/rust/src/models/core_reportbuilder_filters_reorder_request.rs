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
pub struct CoreReportbuilderFiltersReorderRequest {
    /// Filter ID
    #[serde(rename = "filterid")]
    pub filterid: i32,
    /// New filter position
    #[serde(rename = "position")]
    pub position: i32,
    /// Report ID
    #[serde(rename = "reportid")]
    pub reportid: i32,
}

impl CoreReportbuilderFiltersReorderRequest {
    pub fn new(filterid: i32, position: i32, reportid: i32) -> CoreReportbuilderFiltersReorderRequest {
        CoreReportbuilderFiltersReorderRequest {
            filterid,
            position,
            reportid,
        }
    }
}
