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
pub struct CoreReportbuilderFiltersDelete200ResponseActivefiltersInner {
    /// entityname
    #[serde(rename = "entityname", skip_serializing_if = "Option::is_none")]
    pub entityname: Option<String>,
    /// heading
    #[serde(rename = "heading", skip_serializing_if = "Option::is_none")]
    pub heading: Option<String>,
    /// headingeditable
    #[serde(rename = "headingeditable", skip_serializing_if = "Option::is_none")]
    pub headingeditable: Option<String>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// movetitle
    #[serde(rename = "movetitle", skip_serializing_if = "Option::is_none")]
    pub movetitle: Option<String>,
    /// sortorder
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<i32>,
}

impl CoreReportbuilderFiltersDelete200ResponseActivefiltersInner {
    pub fn new() -> CoreReportbuilderFiltersDelete200ResponseActivefiltersInner {
        CoreReportbuilderFiltersDelete200ResponseActivefiltersInner {
            entityname: None,
            heading: None,
            headingeditable: None,
            id: None,
            movetitle: None,
            sortorder: None,
        }
    }
}

