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
pub struct ModLtiGetToolLaunchDataRequest {
    /// external tool instance id
    #[serde(rename = "toolid")]
    pub toolid: i32,
}

impl ModLtiGetToolLaunchDataRequest {
    pub fn new(toolid: i32) -> ModLtiGetToolLaunchDataRequest {
        ModLtiGetToolLaunchDataRequest {
            toolid,
        }
    }
}

