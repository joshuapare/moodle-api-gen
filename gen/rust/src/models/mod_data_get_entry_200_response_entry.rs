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
pub struct ModDataGetEntry200ResponseEntry {
    /// Whether the entry has been approved (if the database is configured in that way).
    #[serde(rename = "approved")]
    pub approved: bool,
    /// Whether the current user can manage this entry
    #[serde(rename = "canmanageentry")]
    pub canmanageentry: bool,
    #[serde(rename = "contents", skip_serializing_if = "Option::is_none")]
    pub contents: Option<Vec<models::ModDataGetEntry200ResponseEntryContentsInner>>,
    /// The database id this record belongs to.
    #[serde(rename = "dataid")]
    pub dataid: i32,
    /// The user who created the entry fullname.
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// The group id this record belongs to (0 for no groups).
    #[serde(rename = "groupid")]
    pub groupid: i32,
    /// Record id.
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>>,
    /// Time the record was created.
    #[serde(rename = "timecreated")]
    pub timecreated: i32,
    /// Last time the record was modified.
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// The id of the user who created the record.
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl ModDataGetEntry200ResponseEntry {
    pub fn new(approved: bool, canmanageentry: bool, dataid: i32, groupid: i32, id: i32, timecreated: i32, timemodified: i32, userid: i32) -> ModDataGetEntry200ResponseEntry {
        ModDataGetEntry200ResponseEntry {
            approved,
            canmanageentry,
            contents: None,
            dataid,
            fullname: None,
            groupid,
            id,
            tags: None,
            timecreated,
            timemodified,
            userid,
        }
    }
}

