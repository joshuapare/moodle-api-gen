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
pub struct CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {
    /// criterion id
    #[serde(rename = "criterionid", skip_serializing_if = "Option::is_none")]
    pub criterionid: Option<i32>,
    /// filling id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// level id
    #[serde(rename = "levelid", skip_serializing_if = "Option::is_none")]
    pub levelid: Option<i32>,
    /// remark
    #[serde(rename = "remark", skip_serializing_if = "Option::is_none")]
    pub remark: Option<String>,
    /// remark format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "remarkformat", skip_serializing_if = "Option::is_none")]
    pub remarkformat: Option<i32>,
    /// maximum score
    #[serde(rename = "score", skip_serializing_if = "Option::is_none")]
    pub score: Option<f64>,
}

impl CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {
    pub fn new() -> CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {
        CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {
            criterionid: None,
            id: None,
            levelid: None,
            remark: None,
            remarkformat: None,
            score: None,
        }
    }
}

