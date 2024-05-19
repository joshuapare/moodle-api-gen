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
pub struct CoreGroupUpdateGroupsRequestGroupsInner {
    #[serde(rename = "customfields", skip_serializing_if = "Option::is_none")]
    pub customfields: Option<Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>>,
    /// group description text
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// group enrol secret phrase
    #[serde(rename = "enrolmentkey", skip_serializing_if = "Option::is_none")]
    pub enrolmentkey: Option<String>,
    /// ID of the group
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// id number
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// multilang compatible name, course unique
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// activity participation enabled? Only for \"all\" and \"members\" visibility
    #[serde(rename = "participation", skip_serializing_if = "Option::is_none")]
    pub participation: Option<bool>,
    /// group visibility mode. 0 = Visible to all. 1 = Visible to members. 2 = See own membership. 3 = Membership is hidden.
    #[serde(rename = "visibility", skip_serializing_if = "Option::is_none")]
    pub visibility: Option<String>,
}

impl CoreGroupUpdateGroupsRequestGroupsInner {
    pub fn new() -> CoreGroupUpdateGroupsRequestGroupsInner {
        CoreGroupUpdateGroupsRequestGroupsInner {
            customfields: None,
            description: None,
            descriptionformat: None,
            enrolmentkey: None,
            id: None,
            idnumber: None,
            name: None,
            participation: None,
            visibility: None,
        }
    }
}

