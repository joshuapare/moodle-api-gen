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
pub struct CoreTableGetDynamicTableContentRequest {
    /// Component
    #[serde(rename = "component")]
    pub component: String,
    #[serde(rename = "filters", skip_serializing_if = "Option::is_none")]
    pub filters: Option<Vec<models::CoreTableGetDynamicTableContentRequestFiltersInner>>,
    /// The first initial to sort filter on
    #[serde(rename = "firstinitial")]
    pub firstinitial: String,
    /// Handler
    #[serde(rename = "handler")]
    pub handler: String,
    #[serde(rename = "hiddencolumns")]
    pub hiddencolumns: Vec<serde_json::Value>,
    /// Type of join to join all filters together
    #[serde(rename = "jointype")]
    pub jointype: i32,
    /// The last initial to sort filter on
    #[serde(rename = "lastinitial")]
    pub lastinitial: String,
    /// The page number
    #[serde(rename = "pagenumber")]
    pub pagenumber: i32,
    /// The number of records per page
    #[serde(rename = "pagesize")]
    pub pagesize: i32,
    /// Whether the table preferences should be reset
    #[serde(rename = "resetpreferences")]
    pub resetpreferences: bool,
    #[serde(rename = "sortdata", skip_serializing_if = "Option::is_none")]
    pub sortdata: Option<Vec<models::CoreTableGetDynamicTableContentRequestSortdataInner>>,
    /// Unique ID for the container
    #[serde(rename = "uniqueid")]
    pub uniqueid: String,
}

impl CoreTableGetDynamicTableContentRequest {
    pub fn new(component: String, firstinitial: String, handler: String, hiddencolumns: Vec<serde_json::Value>, jointype: i32, lastinitial: String, pagenumber: i32, pagesize: i32, resetpreferences: bool, uniqueid: String) -> CoreTableGetDynamicTableContentRequest {
        CoreTableGetDynamicTableContentRequest {
            component,
            filters: None,
            firstinitial,
            handler,
            hiddencolumns,
            jointype,
            lastinitial,
            pagenumber,
            pagesize,
            resetpreferences,
            sortdata: None,
            uniqueid,
        }
    }
}

