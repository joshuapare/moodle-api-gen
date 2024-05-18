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
pub struct CoreUserUpdatePictureRequest {
    /// If we should delete the user picture
    #[serde(rename = "delete", skip_serializing_if = "Option::is_none")]
    pub delete: Option<bool>,
    /// Id of the user draft file to use as image
    #[serde(rename = "draftitemid")]
    pub draftitemid: i32,
    /// Id of the user, 0 for current user
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl CoreUserUpdatePictureRequest {
    pub fn new(draftitemid: i32) -> CoreUserUpdatePictureRequest {
        CoreUserUpdatePictureRequest {
            delete: None,
            draftitemid,
            userid: None,
        }
    }
}
