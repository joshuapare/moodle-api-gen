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
pub struct ModDataGetEntries200ResponseEntriesInner {
    /// Whether the entry has been approved (if the database is configured in that way).
    #[serde(rename = "approved", skip_serializing_if = "Option::is_none")]
    pub approved: Option<bool>,
    /// Whether the current user can manage this entry
    #[serde(rename = "canmanageentry", skip_serializing_if = "Option::is_none")]
    pub canmanageentry: Option<bool>,
    #[serde(rename = "contents", skip_serializing_if = "Option::is_none")]
    pub contents: Option<Vec<models::ModDataGetEntries200ResponseEntriesInnerContentsInner>>,
    /// The database id this record belongs to.
    #[serde(rename = "dataid", skip_serializing_if = "Option::is_none")]
    pub dataid: Option<i32>,
    /// The user who created the entry fullname.
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// The group id this record belongs to (0 for no groups).
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// Record id.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>>,
    /// Time the record was created.
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// Last time the record was modified.
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// The id of the user who created the record.
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModDataGetEntries200ResponseEntriesInner {
    pub fn new() -> ModDataGetEntries200ResponseEntriesInner {
        ModDataGetEntries200ResponseEntriesInner {
            approved: None,
            canmanageentry: None,
            contents: None,
            dataid: None,
            fullname: None,
            groupid: None,
            id: None,
            tags: None,
            timecreated: None,
            timemodified: None,
            userid: None,
        }
    }
}
