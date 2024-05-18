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
pub struct CoreBlogViewEntriesRequestFiltersInner {
    /// The expected keys (value format) are:                                 tag      PARAM_NOTAGS blog tag                                 tagid    PARAM_INT    blog tag id                                 userid   PARAM_INT    blog author (userid)                                 cmid     PARAM_INT    course module id                                 entryid  PARAM_INT    entry id                                 groupid  PARAM_INT    group id                                 courseid PARAM_INT    course id                                 search   PARAM_RAW    search term                                 
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The value of the filter.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl CoreBlogViewEntriesRequestFiltersInner {
    pub fn new() -> CoreBlogViewEntriesRequestFiltersInner {
        CoreBlogViewEntriesRequestFiltersInner {
            name: None,
            value: None,
        }
    }
}

