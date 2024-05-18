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
pub struct ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner {
    /// canmanage
    #[serde(rename = "canmanage", skip_serializing_if = "Option::is_none")]
    pub canmanage: Option<bool>,
    /// competencycount
    #[serde(rename = "competencycount", skip_serializing_if = "Option::is_none")]
    pub competencycount: Option<i32>,
    /// description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// filecount
    #[serde(rename = "filecount", skip_serializing_if = "Option::is_none")]
    pub filecount: Option<i32>,
    #[serde(rename = "files", skip_serializing_if = "Option::is_none")]
    pub files: Option<Vec<models::ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>>,
    /// hasurlorfiles
    #[serde(rename = "hasurlorfiles", skip_serializing_if = "Option::is_none")]
    pub hasurlorfiles: Option<bool>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// timecreated
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// timemodified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// url
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
    /// urlshort
    #[serde(rename = "urlshort", skip_serializing_if = "Option::is_none")]
    pub urlshort: Option<String>,
    #[serde(rename = "usercompetencies", skip_serializing_if = "Option::is_none")]
    pub usercompetencies: Option<Vec<models::ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner>>,
    /// userhasplan
    #[serde(rename = "userhasplan", skip_serializing_if = "Option::is_none")]
    pub userhasplan: Option<bool>,
    /// userid
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// usermodified
    #[serde(rename = "usermodified", skip_serializing_if = "Option::is_none")]
    pub usermodified: Option<i32>,
}

impl ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner {
    pub fn new() -> ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner {
        ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner {
            canmanage: None,
            competencycount: None,
            description: None,
            descriptionformat: None,
            filecount: None,
            files: None,
            hasurlorfiles: None,
            id: None,
            name: None,
            timecreated: None,
            timemodified: None,
            url: None,
            urlshort: None,
            usercompetencies: None,
            userhasplan: None,
            userid: None,
            usermodified: None,
        }
    }
}
