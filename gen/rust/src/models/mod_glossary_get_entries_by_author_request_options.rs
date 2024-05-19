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
pub struct ModGlossaryGetEntriesByAuthorRequestOptions {
    /// When false, includes the non-approved entries created by the user. When true, also includes the ones that the user has the permission to approve.
    #[serde(rename = "includenotapproved", skip_serializing_if = "Option::is_none")]
    pub includenotapproved: Option<bool>,
}

impl ModGlossaryGetEntriesByAuthorRequestOptions {
    pub fn new() -> ModGlossaryGetEntriesByAuthorRequestOptions {
        ModGlossaryGetEntriesByAuthorRequestOptions {
            includenotapproved: None,
        }
    }
}

