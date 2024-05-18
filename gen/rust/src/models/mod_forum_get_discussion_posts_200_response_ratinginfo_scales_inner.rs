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

/// ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner : Scale information
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
    /// Course id.
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Scale id.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Whether is a numeric scale.
    #[serde(rename = "isnumeric", skip_serializing_if = "Option::is_none")]
    pub isnumeric: Option<bool>,
    #[serde(rename = "items", skip_serializing_if = "Option::is_none")]
    pub items: Option<Vec<models::ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner>>,
    /// Max value for the scale.
    #[serde(rename = "max", skip_serializing_if = "Option::is_none")]
    pub max: Option<i32>,
    /// Scale name (when a real scale is used).
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
    /// Scale information
    pub fn new() -> ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
        ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
            courseid: None,
            id: None,
            isnumeric: None,
            items: None,
            max: None,
            name: None,
        }
    }
}

