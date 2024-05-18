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
pub struct CoreReportbuilderFiltersDelete200Response {
    #[serde(rename = "activefilters")]
    pub activefilters: Vec<models::CoreReportbuilderFiltersDelete200ResponseActivefiltersInner>,
    #[serde(rename = "availablefilters")]
    pub availablefilters: Vec<models::CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>,
    /// hasactivefilters
    #[serde(rename = "hasactivefilters")]
    pub hasactivefilters: bool,
    /// hasavailablefilters
    #[serde(rename = "hasavailablefilters")]
    pub hasavailablefilters: bool,
    /// helpicon
    #[serde(rename = "helpicon")]
    pub helpicon: String,
}

impl CoreReportbuilderFiltersDelete200Response {
    pub fn new(activefilters: Vec<models::CoreReportbuilderFiltersDelete200ResponseActivefiltersInner>, availablefilters: Vec<models::CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>, hasactivefilters: bool, hasavailablefilters: bool, helpicon: String) -> CoreReportbuilderFiltersDelete200Response {
        CoreReportbuilderFiltersDelete200Response {
            activefilters,
            availablefilters,
            hasactivefilters,
            hasavailablefilters,
            helpicon,
        }
    }
}
