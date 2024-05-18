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
pub struct CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner {
    /// definition
    #[serde(rename = "definition", skip_serializing_if = "Option::is_none")]
    pub definition: Option<String>,
    /// definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "definitionformat", skip_serializing_if = "Option::is_none")]
    pub definitionformat: Option<i32>,
    /// level id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// score
    #[serde(rename = "score", skip_serializing_if = "Option::is_none")]
    pub score: Option<f64>,
}

impl CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner {
    pub fn new() -> CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner {
        CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner {
            definition: None,
            definitionformat: None,
            id: None,
            score: None,
        }
    }
}
