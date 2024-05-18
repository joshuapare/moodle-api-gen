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
pub struct CoreReportbuilderRetrieveReportRequest {
    /// Page number
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<i32>,
    /// Reports per page
    #[serde(rename = "perpage", skip_serializing_if = "Option::is_none")]
    pub perpage: Option<i32>,
    /// Report ID
    #[serde(rename = "reportid")]
    pub reportid: i32,
}

impl CoreReportbuilderRetrieveReportRequest {
    pub fn new(reportid: i32) -> CoreReportbuilderRetrieveReportRequest {
        CoreReportbuilderRetrieveReportRequest {
            page: None,
            perpage: None,
            reportid,
        }
    }
}
