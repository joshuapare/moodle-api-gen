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
pub struct CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
    /// the name of the field: id (numeric value                                         of course category id) or idnumber (alphanumeric value of idnumber course category)                                         or system (value ignored)
    #[serde(rename = "type")]
    pub r#type: String,
    /// the value of the categorytype
    #[serde(rename = "value")]
    pub value: String,
}

impl CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
    pub fn new(r#type: String, value: String) -> CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
        CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
            r#type,
            value,
        }
    }
}

