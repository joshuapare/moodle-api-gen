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
pub struct ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {
    /// Whether is an anonymous response.
    #[serde(rename = "anonymous_response")]
    pub anonymous_response: i32,
    /// The course id where the feedback was completed.
    #[serde(rename = "courseid")]
    pub courseid: i32,
    /// The feedback instance id this records belongs to.
    #[serde(rename = "feedback")]
    pub feedback: i32,
    /// For guests, this is the session key.
    #[serde(rename = "guestid")]
    pub guestid: String,
    /// The record id.
    #[serde(rename = "id")]
    pub id: i32,
    /// The response number (used when shuffling anonymous responses).
    #[serde(rename = "random_response")]
    pub random_response: i32,
    /// The last time the feedback was completed.
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// The user who completed the feedback (0 for anonymous).
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {
    pub fn new(anonymous_response: i32, courseid: i32, feedback: i32, guestid: String, id: i32, random_response: i32, timemodified: i32, userid: i32) -> ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {
        ModFeedbackGetCurrentCompletedTmp200ResponseFeedback {
            anonymous_response,
            courseid,
            feedback,
            guestid,
            id,
            random_response,
            timemodified,
            userid,
        }
    }
}

