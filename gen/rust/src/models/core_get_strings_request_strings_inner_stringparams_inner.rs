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
pub struct CoreGetStringsRequestStringsInnerStringparamsInner {
    /// param name                                     - if the string expect only one $a parameter then don't send this field, just send the value.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// param value
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl CoreGetStringsRequestStringsInnerStringparamsInner {
    pub fn new() -> CoreGetStringsRequestStringsInnerStringparamsInner {
        CoreGetStringsRequestStringsInnerStringparamsInner {
            name: None,
            value: None,
        }
    }
}

