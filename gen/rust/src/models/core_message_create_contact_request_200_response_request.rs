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
pub struct CoreMessageCreateContactRequest200ResponseRequest {
    /// Message id
    #[serde(rename = "id")]
    pub id: i32,
    /// User to id
    #[serde(rename = "requesteduserid")]
    pub requesteduserid: i32,
    /// Time created
    #[serde(rename = "timecreated")]
    pub timecreated: i32,
    /// User from id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreMessageCreateContactRequest200ResponseRequest {
    pub fn new(id: i32, requesteduserid: i32, timecreated: i32, userid: i32) -> CoreMessageCreateContactRequest200ResponseRequest {
        CoreMessageCreateContactRequest200ResponseRequest {
            id,
            requesteduserid,
            timecreated,
            userid,
        }
    }
}

