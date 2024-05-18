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
pub struct ModGlossaryGetAuthorsRequestOptions {
    /// When false, includes self even if all of their entries require approval. When true, also includes authors only having entries pending approval.
    #[serde(rename = "includenotapproved", skip_serializing_if = "Option::is_none")]
    pub includenotapproved: Option<bool>,
}

impl ModGlossaryGetAuthorsRequestOptions {
    pub fn new() -> ModGlossaryGetAuthorsRequestOptions {
        ModGlossaryGetAuthorsRequestOptions {
            includenotapproved: None,
        }
    }
}
