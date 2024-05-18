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
pub struct CoreFilesGetFiles200Response {
    #[serde(rename = "files")]
    pub files: Vec<models::CoreFilesGetFiles200ResponseFilesInner>,
    #[serde(rename = "parents")]
    pub parents: Vec<models::CoreFilesGetFiles200ResponseParentsInner>,
}

impl CoreFilesGetFiles200Response {
    pub fn new(files: Vec<models::CoreFilesGetFiles200ResponseFilesInner>, parents: Vec<models::CoreFilesGetFiles200ResponseParentsInner>) -> CoreFilesGetFiles200Response {
        CoreFilesGetFiles200Response {
            files,
            parents,
        }
    }
}
