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
pub struct ModWorkshopGetUserPlan200ResponseUserplan {
    #[serde(rename = "examples")]
    pub examples: Vec<models::ModWorkshopGetUserPlan200ResponseUserplanExamplesInner>,
    #[serde(rename = "phases")]
    pub phases: Vec<models::ModWorkshopGetUserPlan200ResponseUserplanPhasesInner>,
}

impl ModWorkshopGetUserPlan200ResponseUserplan {
    pub fn new(examples: Vec<models::ModWorkshopGetUserPlan200ResponseUserplanExamplesInner>, phases: Vec<models::ModWorkshopGetUserPlan200ResponseUserplanPhasesInner>) -> ModWorkshopGetUserPlan200ResponseUserplan {
        ModWorkshopGetUserPlan200ResponseUserplan {
            examples,
            phases,
        }
    }
}
