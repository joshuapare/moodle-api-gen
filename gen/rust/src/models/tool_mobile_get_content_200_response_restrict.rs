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
pub struct ToolMobileGetContent200ResponseRestrict {
    #[serde(rename = "courses", skip_serializing_if = "Option::is_none")]
    pub courses: Option<Vec<serde_json::Value>>,
    #[serde(rename = "users", skip_serializing_if = "Option::is_none")]
    pub users: Option<Vec<serde_json::Value>>,
}

impl ToolMobileGetContent200ResponseRestrict {
    pub fn new() -> ToolMobileGetContent200ResponseRestrict {
        ToolMobileGetContent200ResponseRestrict {
            courses: None,
            users: None,
        }
    }
}

