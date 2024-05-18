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
pub struct CoreEnrolSubmitUserEnrolmentFormRequest {
    /// The data from the event form
    #[serde(rename = "formdata")]
    pub formdata: String,
}

impl CoreEnrolSubmitUserEnrolmentFormRequest {
    pub fn new(formdata: String) -> CoreEnrolSubmitUserEnrolmentFormRequest {
        CoreEnrolSubmitUserEnrolmentFormRequest {
            formdata,
        }
    }
}

