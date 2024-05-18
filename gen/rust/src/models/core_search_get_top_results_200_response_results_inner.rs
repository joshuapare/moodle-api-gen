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
pub struct CoreSearchGetTopResults200ResponseResultsInner {
    /// search area name
    #[serde(rename = "areaname", skip_serializing_if = "Option::is_none")]
    pub areaname: Option<String>,
    /// component name
    #[serde(rename = "componentname", skip_serializing_if = "Option::is_none")]
    pub componentname: Option<String>,
    /// result contents
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<String>,
    /// result context id
    #[serde(rename = "contextid", skip_serializing_if = "Option::is_none")]
    pub contextid: Option<i32>,
    /// result context url
    #[serde(rename = "contexturl", skip_serializing_if = "Option::is_none")]
    pub contexturl: Option<String>,
    /// result course fullname
    #[serde(rename = "coursefullname", skip_serializing_if = "Option::is_none")]
    pub coursefullname: Option<String>,
    /// result course url
    #[serde(rename = "courseurl", skip_serializing_if = "Option::is_none")]
    pub courseurl: Option<String>,
    /// extra result contents, depends on the search area
    #[serde(rename = "description1", skip_serializing_if = "Option::is_none")]
    pub description1: Option<String>,
    /// extra result contents, depends on the search area
    #[serde(rename = "description2", skip_serializing_if = "Option::is_none")]
    pub description2: Option<String>,
    /// result url
    #[serde(rename = "docurl", skip_serializing_if = "Option::is_none")]
    pub docurl: Option<String>,
    /// result file name if present
    #[serde(rename = "filename", skip_serializing_if = "Option::is_none")]
    pub filename: Option<String>,
    /// result file names if present
    #[serde(rename = "filenames", skip_serializing_if = "Option::is_none")]
    pub filenames: Option<String>,
    /// icon url
    #[serde(rename = "iconurl", skip_serializing_if = "Option::is_none")]
    pub iconurl: Option<String>,
    /// unique id in the search area scope
    #[serde(rename = "itemid", skip_serializing_if = "Option::is_none")]
    pub itemid: Option<i32>,
    /// whether multiple files are returned or not
    #[serde(rename = "multiplefiles", skip_serializing_if = "Option::is_none")]
    pub multiplefiles: Option<i32>,
    /// text fields format, it is the same for all of them
    #[serde(rename = "textformat", skip_serializing_if = "Option::is_none")]
    pub textformat: Option<i32>,
    /// result modified time
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// result title
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
    /// user fullname
    #[serde(rename = "userfullname", skip_serializing_if = "Option::is_none")]
    pub userfullname: Option<String>,
    /// user id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// user url
    #[serde(rename = "userurl", skip_serializing_if = "Option::is_none")]
    pub userurl: Option<String>,
}

impl CoreSearchGetTopResults200ResponseResultsInner {
    pub fn new() -> CoreSearchGetTopResults200ResponseResultsInner {
        CoreSearchGetTopResults200ResponseResultsInner {
            areaname: None,
            componentname: None,
            content: None,
            contextid: None,
            contexturl: None,
            coursefullname: None,
            courseurl: None,
            description1: None,
            description2: None,
            docurl: None,
            filename: None,
            filenames: None,
            iconurl: None,
            itemid: None,
            multiplefiles: None,
            textformat: None,
            timemodified: None,
            title: None,
            userfullname: None,
            userid: None,
            userurl: None,
        }
    }
}
