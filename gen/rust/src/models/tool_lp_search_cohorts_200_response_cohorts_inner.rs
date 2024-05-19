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
pub struct ToolLpSearchCohorts200ResponseCohortsInner {
    #[serde(rename = "customfields", skip_serializing_if = "Option::is_none")]
    pub customfields: Option<Vec<models::CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>>,
    /// cohort description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// ID of the cohort
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// cohort idnumber
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// cohort name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// cohort theme
    #[serde(rename = "theme", skip_serializing_if = "Option::is_none")]
    pub theme: Option<String>,
    /// cohort visible
    #[serde(rename = "visible", skip_serializing_if = "Option::is_none")]
    pub visible: Option<bool>,
}

impl ToolLpSearchCohorts200ResponseCohortsInner {
    pub fn new() -> ToolLpSearchCohorts200ResponseCohortsInner {
        ToolLpSearchCohorts200ResponseCohortsInner {
            customfields: None,
            description: None,
            descriptionformat: None,
            id: None,
            idnumber: None,
            name: None,
            theme: None,
            visible: None,
        }
    }
}

