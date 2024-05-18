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
pub struct CoreChangeEditmodeRequest {
    /// Page context id
    #[serde(rename = "context")]
    pub context: i32,
    /// Set edit mode to
    #[serde(rename = "setmode")]
    pub setmode: bool,
}

impl CoreChangeEditmodeRequest {
    pub fn new(context: i32, setmode: bool) -> CoreChangeEditmodeRequest {
        CoreChangeEditmodeRequest {
            context,
            setmode,
        }
    }
}
