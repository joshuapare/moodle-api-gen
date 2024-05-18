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
pub struct ToolMoodlenetSearchCourses200ResponseCoursesInner {
    /// Category name
    #[serde(rename = "coursecategory", skip_serializing_if = "Option::is_none")]
    pub coursecategory: Option<String>,
    /// course image
    #[serde(rename = "courseimage", skip_serializing_if = "Option::is_none")]
    pub courseimage: Option<String>,
    /// course full name
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// is the course visible
    #[serde(rename = "hidden", skip_serializing_if = "Option::is_none")]
    pub hidden: Option<i32>,
    /// course id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Next step of import
    #[serde(rename = "viewurl", skip_serializing_if = "Option::is_none")]
    pub viewurl: Option<String>,
}

impl ToolMoodlenetSearchCourses200ResponseCoursesInner {
    pub fn new() -> ToolMoodlenetSearchCourses200ResponseCoursesInner {
        ToolMoodlenetSearchCourses200ResponseCoursesInner {
            coursecategory: None,
            courseimage: None,
            fullname: None,
            hidden: None,
            id: None,
            viewurl: None,
        }
    }
}

