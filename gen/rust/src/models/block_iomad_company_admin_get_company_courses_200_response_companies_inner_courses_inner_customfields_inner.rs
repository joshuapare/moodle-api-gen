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
pub struct BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
    /// Custom field id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Custom field name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Custom field data value
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
    pub fn new() -> BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
        BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
            id: None,
            name: None,
            value: None,
        }
    }
}
