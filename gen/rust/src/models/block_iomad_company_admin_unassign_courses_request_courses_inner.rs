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
pub struct BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
    /// Course company ID
    #[serde(rename = "companyid", skip_serializing_if = "Option::is_none")]
    pub companyid: Option<i32>,
    /// Course ID
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
}

impl BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
    pub fn new() -> BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
        BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
            companyid: None,
            courseid: None,
        }
    }
}

