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
pub struct CoreGetStringsRequest {
    #[serde(rename = "strings")]
    pub strings: Vec<models::CoreGetStringsRequestStringsInner>,
}

impl CoreGetStringsRequest {
    pub fn new(strings: Vec<models::CoreGetStringsRequestStringsInner>) -> CoreGetStringsRequest {
        CoreGetStringsRequest {
            strings,
        }
    }
}
