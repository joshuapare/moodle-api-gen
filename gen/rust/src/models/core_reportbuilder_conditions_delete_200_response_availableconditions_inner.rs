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
pub struct CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
    #[serde(rename = "optiongroup", skip_serializing_if = "Option::is_none")]
    pub optiongroup: Option<Box<models::CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup>>,
}

impl CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
    pub fn new() -> CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
        CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
            optiongroup: None,
        }
    }
}

