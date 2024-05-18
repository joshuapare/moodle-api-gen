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
pub struct CoreCompetencyReadUserEvidence200Response {
    /// canmanage
    #[serde(rename = "canmanage")]
    pub canmanage: bool,
    #[serde(rename = "competencies")]
    pub competencies: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>,
    /// competencycount
    #[serde(rename = "competencycount")]
    pub competencycount: i32,
    /// description
    #[serde(rename = "description")]
    pub description: String,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// filecount
    #[serde(rename = "filecount")]
    pub filecount: i32,
    #[serde(rename = "files")]
    pub files: Vec<models::CoreCompetencyReadUserEvidence200ResponseFilesInner>,
    /// hasurlorfiles
    #[serde(rename = "hasurlorfiles")]
    pub hasurlorfiles: bool,
    /// id
    #[serde(rename = "id")]
    pub id: i32,
    /// name
    #[serde(rename = "name")]
    pub name: String,
    /// timecreated
    #[serde(rename = "timecreated")]
    pub timecreated: i32,
    /// timemodified
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// url
    #[serde(rename = "url")]
    pub url: String,
    /// urlshort
    #[serde(rename = "urlshort")]
    pub urlshort: String,
    /// userid
    #[serde(rename = "userid")]
    pub userid: i32,
    /// usermodified
    #[serde(rename = "usermodified")]
    pub usermodified: i32,
}

impl CoreCompetencyReadUserEvidence200Response {
    pub fn new(canmanage: bool, competencies: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>, competencycount: i32, description: String, filecount: i32, files: Vec<models::CoreCompetencyReadUserEvidence200ResponseFilesInner>, hasurlorfiles: bool, id: i32, name: String, timecreated: i32, timemodified: i32, url: String, urlshort: String, userid: i32, usermodified: i32) -> CoreCompetencyReadUserEvidence200Response {
        CoreCompetencyReadUserEvidence200Response {
            canmanage,
            competencies,
            competencycount,
            description,
            descriptionformat: None,
            filecount,
            files,
            hasurlorfiles,
            id,
            name,
            timecreated,
            timemodified,
            url,
            urlshort,
            userid,
            usermodified,
        }
    }
}
