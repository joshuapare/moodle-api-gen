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
pub struct CoreReportbuilderFiltersResetRequest {
    /// JSON encoded report parameters
    #[serde(rename = "parameters", skip_serializing_if = "Option::is_none")]
    pub parameters: Option<String>,
    /// Report ID
    #[serde(rename = "reportid")]
    pub reportid: i32,
}

impl CoreReportbuilderFiltersResetRequest {
    pub fn new(reportid: i32) -> CoreReportbuilderFiltersResetRequest {
        CoreReportbuilderFiltersResetRequest {
            parameters: None,
            reportid,
        }
    }
}

