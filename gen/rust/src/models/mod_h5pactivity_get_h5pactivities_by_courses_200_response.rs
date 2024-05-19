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
pub struct ModH5pactivityGetH5pactivitiesByCourses200Response {
    #[serde(rename = "h5pactivities")]
    pub h5pactivities: Vec<models::ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner>,
    #[serde(rename = "h5pglobalsettings", skip_serializing_if = "Option::is_none")]
    pub h5pglobalsettings: Option<Box<models::ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings>>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModH5pactivityGetH5pactivitiesByCourses200Response {
    pub fn new(h5pactivities: Vec<models::ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner>) -> ModH5pactivityGetH5pactivitiesByCourses200Response {
        ModH5pactivityGetH5pactivitiesByCourses200Response {
            h5pactivities,
            h5pglobalsettings: None,
            warnings: None,
        }
    }
}

