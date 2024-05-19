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
pub struct GradereportUserGetGradeItems200ResponseUsergradesInner {
    /// course id
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// course idnumber
    #[serde(rename = "courseidnumber", skip_serializing_if = "Option::is_none")]
    pub courseidnumber: Option<String>,
    #[serde(rename = "gradeitems", skip_serializing_if = "Option::is_none")]
    pub gradeitems: Option<Vec<models::GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner>>,
    /// table max depth (needed for printing it)
    #[serde(rename = "maxdepth", skip_serializing_if = "Option::is_none")]
    pub maxdepth: Option<i32>,
    /// user fullname
    #[serde(rename = "userfullname", skip_serializing_if = "Option::is_none")]
    pub userfullname: Option<String>,
    /// user id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// user idnumber
    #[serde(rename = "useridnumber", skip_serializing_if = "Option::is_none")]
    pub useridnumber: Option<String>,
}

impl GradereportUserGetGradeItems200ResponseUsergradesInner {
    pub fn new() -> GradereportUserGetGradeItems200ResponseUsergradesInner {
        GradereportUserGetGradeItems200ResponseUsergradesInner {
            courseid: None,
            courseidnumber: None,
            gradeitems: None,
            maxdepth: None,
            userfullname: None,
            userid: None,
            useridnumber: None,
        }
    }
}

