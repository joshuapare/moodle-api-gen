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
pub struct PaygwPaypalCreateTransactionCompleteRequest {
    /// The component name
    #[serde(rename = "component")]
    pub component: String,
    /// The item id in the context of the component area
    #[serde(rename = "itemid")]
    pub itemid: i32,
    /// The order id coming back from PayPal
    #[serde(rename = "orderid")]
    pub orderid: String,
    /// Payment area in the component
    #[serde(rename = "paymentarea")]
    pub paymentarea: String,
}

impl PaygwPaypalCreateTransactionCompleteRequest {
    pub fn new(component: String, itemid: i32, orderid: String, paymentarea: String) -> PaygwPaypalCreateTransactionCompleteRequest {
        PaygwPaypalCreateTransactionCompleteRequest {
            component,
            itemid,
            orderid,
            paymentarea,
        }
    }
}
