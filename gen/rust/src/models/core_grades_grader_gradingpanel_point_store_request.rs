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
pub struct CoreGradesGraderGradingpanelPointStoreRequest {
    /// The name of the component
    #[serde(rename = "component")]
    pub component: String,
    /// The ID of the context being graded
    #[serde(rename = "contextid")]
    pub contextid: i32,
    /// The serialised form data representing the grade
    #[serde(rename = "formdata")]
    pub formdata: String,
    /// The ID of the user show
    #[serde(rename = "gradeduserid")]
    pub gradeduserid: i32,
    /// The grade item itemname being graded
    #[serde(rename = "itemname")]
    pub itemname: String,
    /// Wheteher to notify the user or not
    #[serde(rename = "notifyuser", skip_serializing_if = "Option::is_none")]
    pub notifyuser: Option<bool>,
}

impl CoreGradesGraderGradingpanelPointStoreRequest {
    pub fn new(component: String, contextid: i32, formdata: String, gradeduserid: i32, itemname: String) -> CoreGradesGraderGradingpanelPointStoreRequest {
        CoreGradesGraderGradingpanelPointStoreRequest {
            component,
            contextid,
            formdata,
            gradeduserid,
            itemname,
            notifyuser: None,
        }
    }
}

