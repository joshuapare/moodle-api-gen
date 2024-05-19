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
pub struct BlockStarredcoursesGetStarredCoursesRequest {
    /// Limit
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    /// Offset
    #[serde(rename = "offset", skip_serializing_if = "Option::is_none")]
    pub offset: Option<i32>,
}

impl BlockStarredcoursesGetStarredCoursesRequest {
    pub fn new() -> BlockStarredcoursesGetStarredCoursesRequest {
        BlockStarredcoursesGetStarredCoursesRequest {
            limit: None,
            offset: None,
        }
    }
}

