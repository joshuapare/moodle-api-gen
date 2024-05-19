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
pub struct ModH5pactivityGetH5pactivityAccessInformationRequest {
    /// h5p activity instance id
    #[serde(rename = "h5pactivityid")]
    pub h5pactivityid: i32,
}

impl ModH5pactivityGetH5pactivityAccessInformationRequest {
    pub fn new(h5pactivityid: i32) -> ModH5pactivityGetH5pactivityAccessInformationRequest {
        ModH5pactivityGetH5pactivityAccessInformationRequest {
            h5pactivityid,
        }
    }
}

