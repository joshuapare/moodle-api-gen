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
pub struct ModForumSetSubscriptionState200ResponseGroup {
    /// name
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "urls")]
    pub urls: Box<models::ModForumSetSubscriptionState200ResponseGroupUrls>,
}

impl ModForumSetSubscriptionState200ResponseGroup {
    pub fn new(name: String, urls: models::ModForumSetSubscriptionState200ResponseGroupUrls) -> ModForumSetSubscriptionState200ResponseGroup {
        ModForumSetSubscriptionState200ResponseGroup {
            name,
            urls: Box::new(urls),
        }
    }
}

