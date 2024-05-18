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
pub struct ModForumSetSubscriptionState200ResponseUserstate {
    /// favourited
    #[serde(rename = "favourited")]
    pub favourited: bool,
    /// subscribed
    #[serde(rename = "subscribed")]
    pub subscribed: bool,
}

impl ModForumSetSubscriptionState200ResponseUserstate {
    pub fn new(favourited: bool, subscribed: bool) -> ModForumSetSubscriptionState200ResponseUserstate {
        ModForumSetSubscriptionState200ResponseUserstate {
            favourited,
            subscribed,
        }
    }
}
