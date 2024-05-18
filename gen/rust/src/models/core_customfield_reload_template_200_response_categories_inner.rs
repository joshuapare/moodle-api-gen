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
pub struct CoreCustomfieldReloadTemplate200ResponseCategoriesInner {
    /// addfieldmenu
    #[serde(rename = "addfieldmenu", skip_serializing_if = "Option::is_none")]
    pub addfieldmenu: Option<String>,
    #[serde(rename = "fields", skip_serializing_if = "Option::is_none")]
    pub fields: Option<Vec<models::CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner>>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// inplace editable name
    #[serde(rename = "nameeditable", skip_serializing_if = "Option::is_none")]
    pub nameeditable: Option<String>,
}

impl CoreCustomfieldReloadTemplate200ResponseCategoriesInner {
    pub fn new() -> CoreCustomfieldReloadTemplate200ResponseCategoriesInner {
        CoreCustomfieldReloadTemplate200ResponseCategoriesInner {
            addfieldmenu: None,
            fields: None,
            id: None,
            nameeditable: None,
        }
    }
}
