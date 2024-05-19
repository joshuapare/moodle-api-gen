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
pub struct ToolUsertoursResetTourRequest {
    /// Context ID
    #[serde(rename = "context")]
    pub context: i32,
    /// Current page location
    #[serde(rename = "pageurl")]
    pub pageurl: String,
    /// Tour ID
    #[serde(rename = "tourid")]
    pub tourid: i32,
}

impl ToolUsertoursResetTourRequest {
    pub fn new(context: i32, pageurl: String, tourid: i32) -> ToolUsertoursResetTourRequest {
        ToolUsertoursResetTourRequest {
            context,
            pageurl,
            tourid,
        }
    }
}

