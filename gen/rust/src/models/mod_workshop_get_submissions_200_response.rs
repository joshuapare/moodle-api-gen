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
pub struct ModWorkshopGetSubmissions200Response {
    #[serde(rename = "submissions")]
    pub submissions: Vec<models::ModWorkshopGetSubmissions200ResponseSubmissionsInner>,
    /// Total count of submissions.
    #[serde(rename = "totalcount")]
    pub totalcount: i32,
    /// Total size (bytes) of the files attached to all the                     submissions (even the ones not returned due to pagination).
    #[serde(rename = "totalfilesize")]
    pub totalfilesize: i32,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModWorkshopGetSubmissions200Response {
    pub fn new(submissions: Vec<models::ModWorkshopGetSubmissions200ResponseSubmissionsInner>, totalcount: i32, totalfilesize: i32) -> ModWorkshopGetSubmissions200Response {
        ModWorkshopGetSubmissions200Response {
            submissions,
            totalcount,
            totalfilesize,
            warnings: None,
        }
    }
}

