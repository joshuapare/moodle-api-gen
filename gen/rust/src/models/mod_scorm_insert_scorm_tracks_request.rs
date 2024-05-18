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
pub struct ModScormInsertScormTracksRequest {
    /// attempt number
    #[serde(rename = "attempt")]
    pub attempt: i32,
    /// SCO id
    #[serde(rename = "scoid")]
    pub scoid: i32,
    #[serde(rename = "tracks")]
    pub tracks: Vec<models::ModScormGetScormUserData200ResponseDataInnerDefaultdataInner>,
}

impl ModScormInsertScormTracksRequest {
    pub fn new(attempt: i32, scoid: i32, tracks: Vec<models::ModScormGetScormUserData200ResponseDataInnerDefaultdataInner>) -> ModScormInsertScormTracksRequest {
        ModScormInsertScormTracksRequest {
            attempt,
            scoid,
            tracks,
        }
    }
}
