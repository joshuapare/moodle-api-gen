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
pub struct ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
    /// The iomadpolicy version content
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<String>,
    /// The iomadpolicy version name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The iomadpolicy version id
    #[serde(rename = "versionid", skip_serializing_if = "Option::is_none")]
    pub versionid: Option<i32>,
}

impl ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
    pub fn new() -> ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
        ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
            content: None,
            name: None,
            versionid: None,
        }
    }
}

