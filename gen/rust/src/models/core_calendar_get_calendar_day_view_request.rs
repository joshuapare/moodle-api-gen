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
pub struct CoreCalendarGetCalendarDayViewRequest {
    /// Category being viewed
    #[serde(rename = "categoryid", skip_serializing_if = "Option::is_none")]
    pub categoryid: Option<i32>,
    /// Course being viewed
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Day to be viewed
    #[serde(rename = "day")]
    pub day: i32,
    /// Month to be viewed
    #[serde(rename = "month")]
    pub month: i32,
    /// Year to be viewed
    #[serde(rename = "year")]
    pub year: i32,
}

impl CoreCalendarGetCalendarDayViewRequest {
    pub fn new(day: i32, month: i32, year: i32) -> CoreCalendarGetCalendarDayViewRequest {
        CoreCalendarGetCalendarDayViewRequest {
            categoryid: None,
            courseid: None,
            day,
            month,
            year,
        }
    }
}
