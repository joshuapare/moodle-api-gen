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
pub struct CoreCalendarGetTimestamps200Response {
    #[serde(rename = "timestamps")]
    pub timestamps: Vec<models::CoreCalendarGetTimestamps200ResponseTimestampsInner>,
}

impl CoreCalendarGetTimestamps200Response {
    pub fn new(timestamps: Vec<models::CoreCalendarGetTimestamps200ResponseTimestampsInner>) -> CoreCalendarGetTimestamps200Response {
        CoreCalendarGetTimestamps200Response {
            timestamps,
        }
    }
}
