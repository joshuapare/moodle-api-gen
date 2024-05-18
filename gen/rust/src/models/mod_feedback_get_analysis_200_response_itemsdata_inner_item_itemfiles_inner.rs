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
pub struct ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
    /// author
    #[serde(rename = "author", skip_serializing_if = "Option::is_none")]
    pub author: Option<String>,
    /// component
    #[serde(rename = "component", skip_serializing_if = "Option::is_none")]
    pub component: Option<String>,
    /// contextid
    #[serde(rename = "contextid", skip_serializing_if = "Option::is_none")]
    pub contextid: Option<i32>,
    /// filearea
    #[serde(rename = "filearea", skip_serializing_if = "Option::is_none")]
    pub filearea: Option<String>,
    /// filename
    #[serde(rename = "filename", skip_serializing_if = "Option::is_none")]
    pub filename: Option<String>,
    /// filenameshort
    #[serde(rename = "filenameshort", skip_serializing_if = "Option::is_none")]
    pub filenameshort: Option<String>,
    /// filepath
    #[serde(rename = "filepath", skip_serializing_if = "Option::is_none")]
    pub filepath: Option<String>,
    /// filesize
    #[serde(rename = "filesize", skip_serializing_if = "Option::is_none")]
    pub filesize: Option<i32>,
    /// filesizeformatted
    #[serde(rename = "filesizeformatted", skip_serializing_if = "Option::is_none")]
    pub filesizeformatted: Option<String>,
    /// icon
    #[serde(rename = "icon", skip_serializing_if = "Option::is_none")]
    pub icon: Option<String>,
    /// isdir
    #[serde(rename = "isdir", skip_serializing_if = "Option::is_none")]
    pub isdir: Option<bool>,
    /// isimage
    #[serde(rename = "isimage", skip_serializing_if = "Option::is_none")]
    pub isimage: Option<bool>,
    /// itemid
    #[serde(rename = "itemid", skip_serializing_if = "Option::is_none")]
    pub itemid: Option<i32>,
    /// license
    #[serde(rename = "license", skip_serializing_if = "Option::is_none")]
    pub license: Option<String>,
    /// timecreated
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// timecreatedformatted
    #[serde(rename = "timecreatedformatted", skip_serializing_if = "Option::is_none")]
    pub timecreatedformatted: Option<String>,
    /// timemodified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// timemodifiedformatted
    #[serde(rename = "timemodifiedformatted", skip_serializing_if = "Option::is_none")]
    pub timemodifiedformatted: Option<String>,
    /// url
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
}

impl ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
    pub fn new() -> ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
        ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner {
            author: None,
            component: None,
            contextid: None,
            filearea: None,
            filename: None,
            filenameshort: None,
            filepath: None,
            filesize: None,
            filesizeformatted: None,
            icon: None,
            isdir: None,
            isimage: None,
            itemid: None,
            license: None,
            timecreated: None,
            timecreatedformatted: None,
            timemodified: None,
            timemodifiedformatted: None,
            url: None,
        }
    }
}
