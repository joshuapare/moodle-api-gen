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
pub struct CoreEnrolGetPotentialUsersRequest {
    /// course id
    #[serde(rename = "courseid")]
    pub courseid: i32,
    /// enrolment id
    #[serde(rename = "enrolid")]
    pub enrolid: i32,
    /// Page number
    #[serde(rename = "page")]
    pub page: i32,
    /// Number per page
    #[serde(rename = "perpage")]
    pub perpage: i32,
    /// query
    #[serde(rename = "search")]
    pub search: String,
    /// find a match anywhere, or only at the beginning
    #[serde(rename = "searchanywhere")]
    pub searchanywhere: bool,
}

impl CoreEnrolGetPotentialUsersRequest {
    pub fn new(courseid: i32, enrolid: i32, page: i32, perpage: i32, search: String, searchanywhere: bool) -> CoreEnrolGetPotentialUsersRequest {
        CoreEnrolGetPotentialUsersRequest {
            courseid,
            enrolid,
            page,
            perpage,
            search,
            searchanywhere,
        }
    }
}

