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
pub struct CoreBlogViewEntriesRequest {
    #[serde(rename = "filters", skip_serializing_if = "Option::is_none")]
    pub filters: Option<Vec<models::CoreBlogViewEntriesRequestFiltersInner>>,
}

impl CoreBlogViewEntriesRequest {
    pub fn new() -> CoreBlogViewEntriesRequest {
        CoreBlogViewEntriesRequest {
            filters: None,
        }
    }
}

