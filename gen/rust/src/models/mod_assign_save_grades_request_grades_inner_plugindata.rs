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
pub struct ModAssignSaveGradesRequestGradesInnerPlugindata {
    #[serde(rename = "assignfeedbackcomments_editor", skip_serializing_if = "Option::is_none")]
    pub assignfeedbackcomments_editor: Option<Box<models::ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor>>,
    /// The id of a draft area containing files for this feedback.
    #[serde(rename = "files_filemanager", skip_serializing_if = "Option::is_none")]
    pub files_filemanager: Option<i32>,
}

impl ModAssignSaveGradesRequestGradesInnerPlugindata {
    pub fn new() -> ModAssignSaveGradesRequestGradesInnerPlugindata {
        ModAssignSaveGradesRequestGradesInnerPlugindata {
            assignfeedbackcomments_editor: None,
            files_filemanager: None,
        }
    }
}
