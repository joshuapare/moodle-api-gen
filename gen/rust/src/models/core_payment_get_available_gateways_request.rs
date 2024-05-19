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
pub struct CorePaymentGetAvailableGatewaysRequest {
    /// Component
    #[serde(rename = "component")]
    pub component: String,
    /// An identifier for payment area in the component
    #[serde(rename = "itemid")]
    pub itemid: i32,
    /// Payment area in the component
    #[serde(rename = "paymentarea")]
    pub paymentarea: String,
}

impl CorePaymentGetAvailableGatewaysRequest {
    pub fn new(component: String, itemid: i32, paymentarea: String) -> CorePaymentGetAvailableGatewaysRequest {
        CorePaymentGetAvailableGatewaysRequest {
            component,
            itemid,
            paymentarea,
        }
    }
}

