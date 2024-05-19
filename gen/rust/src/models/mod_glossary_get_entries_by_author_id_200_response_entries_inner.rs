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
pub struct ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner {
    /// Whether the entry was approved
    #[serde(rename = "approved", skip_serializing_if = "Option::is_none")]
    pub approved: Option<bool>,
    /// Whether or not the entry has attachments
    #[serde(rename = "attachment", skip_serializing_if = "Option::is_none")]
    pub attachment: Option<bool>,
    #[serde(rename = "attachments", skip_serializing_if = "Option::is_none")]
    pub attachments: Option<Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>>,
    /// When true, the matching is case sensitive
    #[serde(rename = "casesensitive", skip_serializing_if = "Option::is_none")]
    pub casesensitive: Option<bool>,
    /// The concept
    #[serde(rename = "concept", skip_serializing_if = "Option::is_none")]
    pub concept: Option<String>,
    /// The definition
    #[serde(rename = "definition", skip_serializing_if = "Option::is_none")]
    pub definition: Option<String>,
    /// definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "definitionformat", skip_serializing_if = "Option::is_none")]
    pub definitionformat: Option<i32>,
    #[serde(rename = "definitioninlinefiles", skip_serializing_if = "Option::is_none")]
    pub definitioninlinefiles: Option<Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>>,
    /// The definition trust flag
    #[serde(rename = "definitiontrust", skip_serializing_if = "Option::is_none")]
    pub definitiontrust: Option<bool>,
    /// When true, the matching is done on full words only
    #[serde(rename = "fullmatch", skip_serializing_if = "Option::is_none")]
    pub fullmatch: Option<bool>,
    /// The glossary ID
    #[serde(rename = "glossaryid", skip_serializing_if = "Option::is_none")]
    pub glossaryid: Option<i32>,
    /// The entry ID
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The source glossary ID
    #[serde(rename = "sourceglossaryid", skip_serializing_if = "Option::is_none")]
    pub sourceglossaryid: Option<i32>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<models::ModDataGetEntries200ResponseEntriesInnerTagsInner>>,
    /// The entry was created by a teacher, or equivalent.
    #[serde(rename = "teacherentry", skip_serializing_if = "Option::is_none")]
    pub teacherentry: Option<bool>,
    /// Time created
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// Time modified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// Whether the concept should be automatically linked
    #[serde(rename = "usedynalink", skip_serializing_if = "Option::is_none")]
    pub usedynalink: Option<bool>,
    /// Author full name
    #[serde(rename = "userfullname", skip_serializing_if = "Option::is_none")]
    pub userfullname: Option<String>,
    /// Author ID
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// Author picture
    #[serde(rename = "userpictureurl", skip_serializing_if = "Option::is_none")]
    pub userpictureurl: Option<String>,
}

impl ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner {
    pub fn new() -> ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner {
        ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner {
            approved: None,
            attachment: None,
            attachments: None,
            casesensitive: None,
            concept: None,
            definition: None,
            definitionformat: None,
            definitioninlinefiles: None,
            definitiontrust: None,
            fullmatch: None,
            glossaryid: None,
            id: None,
            sourceglossaryid: None,
            tags: None,
            teacherentry: None,
            timecreated: None,
            timemodified: None,
            usedynalink: None,
            userfullname: None,
            userid: None,
            userpictureurl: None,
        }
    }
}

