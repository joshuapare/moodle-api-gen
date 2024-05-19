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
pub struct CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner {
    /// description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// markers description
    #[serde(rename = "descriptionmarkers", skip_serializing_if = "Option::is_none")]
    pub descriptionmarkers: Option<String>,
    /// descriptionmarkers format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionmarkersformat", skip_serializing_if = "Option::is_none")]
    pub descriptionmarkersformat: Option<i32>,
    /// criterion id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// maximum score
    #[serde(rename = "maxscore", skip_serializing_if = "Option::is_none")]
    pub maxscore: Option<f64>,
    /// description
    #[serde(rename = "shortname", skip_serializing_if = "Option::is_none")]
    pub shortname: Option<String>,
    /// sortorder
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<i32>,
}

impl CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner {
    pub fn new() -> CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner {
        CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner {
            description: None,
            descriptionformat: None,
            descriptionmarkers: None,
            descriptionmarkersformat: None,
            id: None,
            maxscore: None,
            shortname: None,
            sortorder: None,
        }
    }
}

