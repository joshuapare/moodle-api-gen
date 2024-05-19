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
pub struct ModChatGetSessionMessages200Response {
    #[serde(rename = "messages")]
    pub messages: Vec<models::ModChatGetSessionMessages200ResponseMessagesInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModChatGetSessionMessages200Response {
    pub fn new(messages: Vec<models::ModChatGetSessionMessages200ResponseMessagesInner>) -> ModChatGetSessionMessages200Response {
        ModChatGetSessionMessages200Response {
            messages,
            warnings: None,
        }
    }
}

