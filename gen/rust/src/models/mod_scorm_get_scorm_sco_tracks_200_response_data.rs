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
pub struct ModScormGetScormScoTracks200ResponseData {
    /// Attempt number
    #[serde(rename = "attempt")]
    pub attempt: i32,
    #[serde(rename = "tracks")]
    pub tracks: Vec<models::ModScormGetScormScoTracks200ResponseDataTracksInner>,
}

impl ModScormGetScormScoTracks200ResponseData {
    pub fn new(attempt: i32, tracks: Vec<models::ModScormGetScormScoTracks200ResponseDataTracksInner>) -> ModScormGetScormScoTracks200ResponseData {
        ModScormGetScormScoTracks200ResponseData {
            attempt,
            tracks,
        }
    }
}

