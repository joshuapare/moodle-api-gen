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
pub struct CoreFilesDeleteDraftFilesRequest {
    /// Item id of the draft file area
    #[serde(rename = "draftitemid")]
    pub draftitemid: i32,
    #[serde(rename = "files")]
    pub files: Vec<models::CoreFilesDeleteDraftFilesRequestFilesInner>,
}

impl CoreFilesDeleteDraftFilesRequest {
    pub fn new(draftitemid: i32, files: Vec<models::CoreFilesDeleteDraftFilesRequestFilesInner>) -> CoreFilesDeleteDraftFilesRequest {
        CoreFilesDeleteDraftFilesRequest {
            draftitemid,
            files,
        }
    }
}
