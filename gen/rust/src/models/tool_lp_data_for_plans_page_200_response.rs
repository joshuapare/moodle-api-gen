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
pub struct ToolLpDataForPlansPage200Response {
    /// Can the current user manage the user's plans
    #[serde(rename = "canmanageuserplans")]
    pub canmanageuserplans: bool,
    /// Can the current user view the user's evidence
    #[serde(rename = "canreaduserevidence")]
    pub canreaduserevidence: bool,
    #[serde(rename = "navigation")]
    pub navigation: Vec<serde_json::Value>,
    #[serde(rename = "plans")]
    pub plans: Vec<models::ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>,
    /// Url to the tool_lp plugin folder on this Moodle site
    #[serde(rename = "pluginbaseurl")]
    pub pluginbaseurl: String,
    /// The learning plan user id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl ToolLpDataForPlansPage200Response {
    pub fn new(canmanageuserplans: bool, canreaduserevidence: bool, navigation: Vec<serde_json::Value>, plans: Vec<models::ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>, pluginbaseurl: String, userid: i32) -> ToolLpDataForPlansPage200Response {
        ToolLpDataForPlansPage200Response {
            canmanageuserplans,
            canreaduserevidence,
            navigation,
            plans,
            pluginbaseurl,
            userid,
        }
    }
}

