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
pub struct CoreMessageSendInstantMessagesRequestMessagesInner {
    /// your own client id for the message. If this id is provided, the fail message id will be returned to you
    #[serde(rename = "clientmsgid", skip_serializing_if = "Option::is_none")]
    pub clientmsgid: Option<String>,
    /// the text of the message
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "textformat", skip_serializing_if = "Option::is_none")]
    pub textformat: Option<i32>,
    /// id of the user to send the private message
    #[serde(rename = "touserid", skip_serializing_if = "Option::is_none")]
    pub touserid: Option<i32>,
}

impl CoreMessageSendInstantMessagesRequestMessagesInner {
    pub fn new() -> CoreMessageSendInstantMessagesRequestMessagesInner {
        CoreMessageSendInstantMessagesRequestMessagesInner {
            clientmsgid: None,
            text: None,
            textformat: None,
            touserid: None,
        }
    }
}
