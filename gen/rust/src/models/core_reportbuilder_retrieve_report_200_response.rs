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
pub struct CoreReportbuilderRetrieveReport200Response {
    #[serde(rename = "data")]
    pub data: Box<models::CoreReportbuilderRetrieveReport200ResponseData>,
    #[serde(rename = "details")]
    pub details: Box<models::CoreReportbuilderRetrieveReport200ResponseDetails>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreReportbuilderRetrieveReport200Response {
    pub fn new(data: models::CoreReportbuilderRetrieveReport200ResponseData, details: models::CoreReportbuilderRetrieveReport200ResponseDetails) -> CoreReportbuilderRetrieveReport200Response {
        CoreReportbuilderRetrieveReport200Response {
            data: Box::new(data),
            details: Box::new(details),
            warnings: None,
        }
    }
}
