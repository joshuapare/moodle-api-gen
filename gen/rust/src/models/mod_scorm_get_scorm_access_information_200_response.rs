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
pub struct ModScormGetScormAccessInformation200Response {
    /// Whether the user has the capability mod/scorm:addinstance allowed.
    #[serde(rename = "canaddinstance", skip_serializing_if = "Option::is_none")]
    pub canaddinstance: Option<bool>,
    /// Whether the user has the capability mod/scorm:deleteownresponses allowed.
    #[serde(rename = "candeleteownresponses", skip_serializing_if = "Option::is_none")]
    pub candeleteownresponses: Option<bool>,
    /// Whether the user has the capability mod/scorm:deleteresponses allowed.
    #[serde(rename = "candeleteresponses", skip_serializing_if = "Option::is_none")]
    pub candeleteresponses: Option<bool>,
    /// Whether the user has the capability mod/scorm:savetrack allowed.
    #[serde(rename = "cansavetrack", skip_serializing_if = "Option::is_none")]
    pub cansavetrack: Option<bool>,
    /// Whether the user has the capability mod/scorm:skipview allowed.
    #[serde(rename = "canskipview", skip_serializing_if = "Option::is_none")]
    pub canskipview: Option<bool>,
    /// Whether the user has the capability mod/scorm:viewreport allowed.
    #[serde(rename = "canviewreport", skip_serializing_if = "Option::is_none")]
    pub canviewreport: Option<bool>,
    /// Whether the user has the capability mod/scorm:viewscores allowed.
    #[serde(rename = "canviewscores", skip_serializing_if = "Option::is_none")]
    pub canviewscores: Option<bool>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModScormGetScormAccessInformation200Response {
    pub fn new() -> ModScormGetScormAccessInformation200Response {
        ModScormGetScormAccessInformation200Response {
            canaddinstance: None,
            candeleteownresponses: None,
            candeleteresponses: None,
            cansavetrack: None,
            canskipview: None,
            canviewreport: None,
            canviewscores: None,
            warnings: None,
        }
    }
}

