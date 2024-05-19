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
pub struct CoreCustomfieldMoveFieldRequest {
    /// Id of the field before which it needs to be moved
    #[serde(rename = "beforeid", skip_serializing_if = "Option::is_none")]
    pub beforeid: Option<i32>,
    /// New parent category id
    #[serde(rename = "categoryid")]
    pub categoryid: i32,
    /// Id of the field to move
    #[serde(rename = "id")]
    pub id: i32,
}

impl CoreCustomfieldMoveFieldRequest {
    pub fn new(categoryid: i32, id: i32) -> CoreCustomfieldMoveFieldRequest {
        CoreCustomfieldMoveFieldRequest {
            beforeid: None,
            categoryid,
            id,
        }
    }
}

