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
pub struct CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {
    /// The first name(s) of the user
    #[serde(rename = "firstname", skip_serializing_if = "Option::is_none")]
    pub firstname: Option<String>,
    /// The full name of the user
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// ID of the user
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The family name of the user
    #[serde(rename = "lastname", skip_serializing_if = "Option::is_none")]
    pub lastname: Option<String>,
    /// The location of the users larger image
    #[serde(rename = "profileimage", skip_serializing_if = "Option::is_none")]
    pub profileimage: Option<String>,
}

impl CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {
    pub fn new() -> CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {
        CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {
            firstname: None,
            fullname: None,
            id: None,
            lastname: None,
            profileimage: None,
        }
    }
}
