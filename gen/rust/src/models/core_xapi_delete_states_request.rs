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
pub struct CoreXapiDeleteStatesRequest {
    /// xAPI activity ID IRI
    #[serde(rename = "activityId")]
    pub activity_id: String,
    /// The xAPI agent json
    #[serde(rename = "agent")]
    pub agent: String,
    /// Component name
    #[serde(rename = "component")]
    pub component: String,
    /// The xAPI registration UUID
    #[serde(rename = "registration", skip_serializing_if = "Option::is_none")]
    pub registration: Option<String>,
}

impl CoreXapiDeleteStatesRequest {
    pub fn new(activity_id: String, agent: String, component: String) -> CoreXapiDeleteStatesRequest {
        CoreXapiDeleteStatesRequest {
            activity_id,
            agent,
            component,
            registration: None,
        }
    }
}

