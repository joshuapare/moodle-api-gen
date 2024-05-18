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
pub struct BlockIomadCompanyAdminMoveUsersRequestUsersInner {
    /// User company ID
    #[serde(rename = "companyid", skip_serializing_if = "Option::is_none")]
    pub companyid: Option<i32>,
    /// User company department ID
    #[serde(rename = "departmentid", skip_serializing_if = "Option::is_none")]
    pub departmentid: Option<i32>,
    /// User manager type 0 => User, 1 => company manager 2 => department manager
    #[serde(rename = "managertype", skip_serializing_if = "Option::is_none")]
    pub managertype: Option<i32>,
    /// User ID
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl BlockIomadCompanyAdminMoveUsersRequestUsersInner {
    pub fn new() -> BlockIomadCompanyAdminMoveUsersRequestUsersInner {
        BlockIomadCompanyAdminMoveUsersRequestUsersInner {
            companyid: None,
            departmentid: None,
            managertype: None,
            userid: None,
        }
    }
}

