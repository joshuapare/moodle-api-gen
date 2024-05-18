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
pub struct CoreCompetencyUpdateTemplateRequestTemplate {
    /// The context id
    #[serde(rename = "contextid", skip_serializing_if = "Option::is_none")]
    pub contextid: Option<i32>,
    /// The context level
    #[serde(rename = "contextlevel", skip_serializing_if = "Option::is_none")]
    pub contextlevel: Option<String>,
    /// description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// duedate
    #[serde(rename = "duedate", skip_serializing_if = "Option::is_none")]
    pub duedate: Option<i32>,
    /// id
    #[serde(rename = "id")]
    pub id: i32,
    /// The Instance id
    #[serde(rename = "instanceid", skip_serializing_if = "Option::is_none")]
    pub instanceid: Option<i32>,
    /// shortname
    #[serde(rename = "shortname", skip_serializing_if = "Option::is_none")]
    pub shortname: Option<String>,
    /// timecreated
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// timemodified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// usermodified
    #[serde(rename = "usermodified", skip_serializing_if = "Option::is_none")]
    pub usermodified: Option<i32>,
    /// visible
    #[serde(rename = "visible", skip_serializing_if = "Option::is_none")]
    pub visible: Option<bool>,
}

impl CoreCompetencyUpdateTemplateRequestTemplate {
    pub fn new(id: i32) -> CoreCompetencyUpdateTemplateRequestTemplate {
        CoreCompetencyUpdateTemplateRequestTemplate {
            contextid: None,
            contextlevel: None,
            description: None,
            descriptionformat: None,
            duedate: None,
            id,
            instanceid: None,
            shortname: None,
            timecreated: None,
            timemodified: None,
            usermodified: None,
            visible: None,
        }
    }
}
