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
pub struct CoreCourseGetEnrolledCoursesByTimelineClassification200Response {
    #[serde(rename = "courses")]
    pub courses: Vec<models::CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>,
    /// Offset for the next request
    #[serde(rename = "nextoffset")]
    pub nextoffset: i32,
}

impl CoreCourseGetEnrolledCoursesByTimelineClassification200Response {
    pub fn new(courses: Vec<models::CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>, nextoffset: i32) -> CoreCourseGetEnrolledCoursesByTimelineClassification200Response {
        CoreCourseGetEnrolledCoursesByTimelineClassification200Response {
            courses,
            nextoffset,
        }
    }
}
