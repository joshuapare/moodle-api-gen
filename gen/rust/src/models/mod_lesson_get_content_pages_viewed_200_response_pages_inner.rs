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

/// ModLessonGetContentPagesViewed200ResponsePagesInner : The content pages viewed.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModLessonGetContentPagesViewed200ResponsePagesInner {
    /// 1 if the next page was calculated randomly.
    #[serde(rename = "flag", skip_serializing_if = "Option::is_none")]
    pub flag: Option<i32>,
    /// The attempt id.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The lesson id.
    #[serde(rename = "lessonid", skip_serializing_if = "Option::is_none")]
    pub lessonid: Option<i32>,
    /// The next page chosen id.
    #[serde(rename = "nextpageid", skip_serializing_if = "Option::is_none")]
    pub nextpageid: Option<i32>,
    /// The page id.
    #[serde(rename = "pageid", skip_serializing_if = "Option::is_none")]
    pub pageid: Option<i32>,
    /// The lesson attempt number.
    #[serde(rename = "retry", skip_serializing_if = "Option::is_none")]
    pub retry: Option<i32>,
    /// The time the page was seen.
    #[serde(rename = "timeseen", skip_serializing_if = "Option::is_none")]
    pub timeseen: Option<i32>,
    /// The user who viewed the page.
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModLessonGetContentPagesViewed200ResponsePagesInner {
    /// The content pages viewed.
    pub fn new() -> ModLessonGetContentPagesViewed200ResponsePagesInner {
        ModLessonGetContentPagesViewed200ResponsePagesInner {
            flag: None,
            id: None,
            lessonid: None,
            nextpageid: None,
            pageid: None,
            retry: None,
            timeseen: None,
            userid: None,
        }
    }
}
