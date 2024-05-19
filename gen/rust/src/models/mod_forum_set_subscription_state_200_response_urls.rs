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
pub struct ModForumSetSubscriptionState200ResponseUrls {
    /// markasread
    #[serde(rename = "markasread")]
    pub markasread: String,
    /// pin
    #[serde(rename = "pin", skip_serializing_if = "Option::is_none")]
    pub pin: Option<String>,
    /// subscribe
    #[serde(rename = "subscribe")]
    pub subscribe: String,
    /// view
    #[serde(rename = "view")]
    pub view: String,
    /// viewfirstunread
    #[serde(rename = "viewfirstunread", skip_serializing_if = "Option::is_none")]
    pub viewfirstunread: Option<String>,
    /// viewlatest
    #[serde(rename = "viewlatest", skip_serializing_if = "Option::is_none")]
    pub viewlatest: Option<String>,
}

impl ModForumSetSubscriptionState200ResponseUrls {
    pub fn new(markasread: String, subscribe: String, view: String) -> ModForumSetSubscriptionState200ResponseUrls {
        ModForumSetSubscriptionState200ResponseUrls {
            markasread,
            pin: None,
            subscribe,
            view,
            viewfirstunread: None,
            viewlatest: None,
        }
    }
}

