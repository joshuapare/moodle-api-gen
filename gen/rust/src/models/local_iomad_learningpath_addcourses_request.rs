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
pub struct LocalIomadLearningpathAddcoursesRequest {
    #[serde(rename = "courseids")]
    pub courseids: Vec<serde_json::Value>,
    /// ID of group. If 0 just add to lowest numbered group
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// ID of Iomad Learning Path
    #[serde(rename = "pathid")]
    pub pathid: i32,
}

impl LocalIomadLearningpathAddcoursesRequest {
    pub fn new(courseids: Vec<serde_json::Value>, pathid: i32) -> LocalIomadLearningpathAddcoursesRequest {
        LocalIomadLearningpathAddcoursesRequest {
            courseids,
            groupid: None,
            pathid,
        }
    }
}
