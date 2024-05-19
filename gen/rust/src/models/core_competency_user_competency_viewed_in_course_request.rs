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
pub struct CoreCompetencyUserCompetencyViewedInCourseRequest {
    /// The competency id
    #[serde(rename = "competencyid")]
    pub competencyid: i32,
    /// The course id
    #[serde(rename = "courseid")]
    pub courseid: i32,
    /// The user id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreCompetencyUserCompetencyViewedInCourseRequest {
    pub fn new(competencyid: i32, courseid: i32, userid: i32) -> CoreCompetencyUserCompetencyViewedInCourseRequest {
        CoreCompetencyUserCompetencyViewedInCourseRequest {
            competencyid,
            courseid,
            userid,
        }
    }
}

