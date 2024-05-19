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
pub struct CoreCohortAddCohortMembersRequestMembersInner {
    #[serde(rename = "cohorttype", skip_serializing_if = "Option::is_none")]
    pub cohorttype: Option<Box<models::CoreCohortAddCohortMembersRequestMembersInnerCohorttype>>,
    #[serde(rename = "usertype", skip_serializing_if = "Option::is_none")]
    pub usertype: Option<Box<models::CoreCohortAddCohortMembersRequestMembersInnerUsertype>>,
}

impl CoreCohortAddCohortMembersRequestMembersInner {
    pub fn new() -> CoreCohortAddCohortMembersRequestMembersInner {
        CoreCohortAddCohortMembersRequestMembersInner {
            cohorttype: None,
            usertype: None,
        }
    }
}

