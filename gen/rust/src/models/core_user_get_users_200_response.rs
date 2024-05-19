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
pub struct CoreUserGetUsers200Response {
    #[serde(rename = "users")]
    pub users: Vec<models::CoreGradesGetGradableUsers200ResponseUsersInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>>,
}

impl CoreUserGetUsers200Response {
    pub fn new(users: Vec<models::CoreGradesGetGradableUsers200ResponseUsersInner>) -> CoreUserGetUsers200Response {
        CoreUserGetUsers200Response {
            users,
            warnings: None,
        }
    }
}

