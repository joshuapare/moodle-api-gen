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
pub struct CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {
    /// heading
    #[serde(rename = "heading", skip_serializing_if = "Option::is_none")]
    pub heading: Option<String>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// movetitle
    #[serde(rename = "movetitle", skip_serializing_if = "Option::is_none")]
    pub movetitle: Option<String>,
    /// sortdirection
    #[serde(rename = "sortdirection", skip_serializing_if = "Option::is_none")]
    pub sortdirection: Option<i32>,
    /// sortenabled
    #[serde(rename = "sortenabled", skip_serializing_if = "Option::is_none")]
    pub sortenabled: Option<bool>,
    /// sortenabledtitle
    #[serde(rename = "sortenabledtitle", skip_serializing_if = "Option::is_none")]
    pub sortenabledtitle: Option<String>,
    #[serde(rename = "sorticon", skip_serializing_if = "Option::is_none")]
    pub sorticon: Option<Box<models::CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon>>,
    /// sortorder
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<i32>,
    /// title
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
}

impl CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {
    pub fn new() -> CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {
        CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {
            heading: None,
            id: None,
            movetitle: None,
            sortdirection: None,
            sortenabled: None,
            sortenabledtitle: None,
            sorticon: None,
            sortorder: None,
            title: None,
        }
    }
}

