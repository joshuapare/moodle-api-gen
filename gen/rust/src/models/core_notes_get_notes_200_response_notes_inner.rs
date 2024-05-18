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

/// CoreNotesGetNotes200ResponseNotesInner : note
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CoreNotesGetNotes200ResponseNotesInner {
    /// course id of the note
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "format", skip_serializing_if = "Option::is_none")]
    pub format: Option<i32>,
    /// id of the note
    #[serde(rename = "noteid", skip_serializing_if = "Option::is_none")]
    pub noteid: Option<i32>,
    /// 'personal', 'course' or 'site'
    #[serde(rename = "publishstate", skip_serializing_if = "Option::is_none")]
    pub publishstate: Option<String>,
    /// the text of the message - text or HTML
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// id of the user the note is about
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl CoreNotesGetNotes200ResponseNotesInner {
    /// note
    pub fn new() -> CoreNotesGetNotes200ResponseNotesInner {
        CoreNotesGetNotes200ResponseNotesInner {
            courseid: None,
            format: None,
            noteid: None,
            publishstate: None,
            text: None,
            userid: None,
        }
    }
}

