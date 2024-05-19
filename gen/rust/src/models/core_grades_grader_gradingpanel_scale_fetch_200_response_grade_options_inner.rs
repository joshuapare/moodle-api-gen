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
pub struct CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
    /// Whether this item is currently selected
    #[serde(rename = "selected", skip_serializing_if = "Option::is_none")]
    pub selected: Option<bool>,
    /// The description fo the option
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
    /// The grade value
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<f64>,
}

impl CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
    pub fn new() -> CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
        CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
            selected: None,
            title: None,
            value: None,
        }
    }
}

