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
pub struct ModH5pactivityGetUserAttemptsRequest {
    /// Users whose first name starts with $firstinitial
    #[serde(rename = "firstinitial", skip_serializing_if = "Option::is_none")]
    pub firstinitial: Option<String>,
    /// h5p activity instance id
    #[serde(rename = "h5pactivityid")]
    pub h5pactivityid: i32,
    /// Users whose last name starts with $lastinitial
    #[serde(rename = "lastinitial", skip_serializing_if = "Option::is_none")]
    pub lastinitial: Option<String>,
    /// current page
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<i32>,
    /// items per page
    #[serde(rename = "perpage", skip_serializing_if = "Option::is_none")]
    pub perpage: Option<i32>,
    /// sort by either user id, firstname or lastname (with optional asc/desc)
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<String>,
}

impl ModH5pactivityGetUserAttemptsRequest {
    pub fn new(h5pactivityid: i32) -> ModH5pactivityGetUserAttemptsRequest {
        ModH5pactivityGetUserAttemptsRequest {
            firstinitial: None,
            h5pactivityid,
            lastinitial: None,
            page: None,
            perpage: None,
            sortorder: None,
        }
    }
}

