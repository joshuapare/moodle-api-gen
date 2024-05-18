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
pub struct ModWorkshopGetAssessmentFormDefinition200Response {
    #[serde(rename = "current")]
    pub current: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner>,
    #[serde(rename = "descriptionfiles")]
    pub descriptionfiles: Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>,
    #[serde(rename = "dimensionsinfo")]
    pub dimensionsinfo: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner>,
    /// The number of dimenssions used by the form.
    #[serde(rename = "dimenssionscount")]
    pub dimenssionscount: i32,
    #[serde(rename = "fields")]
    pub fields: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner>,
    #[serde(rename = "options")]
    pub options: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModWorkshopGetAssessmentFormDefinition200Response {
    pub fn new(current: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner>, descriptionfiles: Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>, dimensionsinfo: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner>, dimenssionscount: i32, fields: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner>, options: Vec<models::ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner>) -> ModWorkshopGetAssessmentFormDefinition200Response {
        ModWorkshopGetAssessmentFormDefinition200Response {
            current,
            descriptionfiles,
            dimensionsinfo,
            dimenssionscount,
            fields,
            options,
            warnings: None,
        }
    }
}
