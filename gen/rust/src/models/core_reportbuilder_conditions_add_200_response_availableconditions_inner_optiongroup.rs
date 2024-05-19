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
pub struct CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup {
    /// text
    #[serde(rename = "text")]
    pub text: String,
    #[serde(rename = "values")]
    pub values: Vec<models::CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner>,
}

impl CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup {
    pub fn new(text: String, values: Vec<models::CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner>) -> CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup {
        CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup {
            text,
            values,
        }
    }
}

