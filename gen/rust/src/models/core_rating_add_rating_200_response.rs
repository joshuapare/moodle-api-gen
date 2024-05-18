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
pub struct CoreRatingAddRating200Response {
    /// New aggregate
    #[serde(rename = "aggregate", skip_serializing_if = "Option::is_none")]
    pub aggregate: Option<String>,
    /// Ratings count
    #[serde(rename = "count", skip_serializing_if = "Option::is_none")]
    pub count: Option<i32>,
    /// Rating item id
    #[serde(rename = "itemid", skip_serializing_if = "Option::is_none")]
    pub itemid: Option<i32>,
    /// Whether the rate was successfully created
    #[serde(rename = "success")]
    pub success: bool,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreRatingAddRating200Response {
    pub fn new(success: bool) -> CoreRatingAddRating200Response {
        CoreRatingAddRating200Response {
            aggregate: None,
            count: None,
            itemid: None,
            success,
            warnings: None,
        }
    }
}
