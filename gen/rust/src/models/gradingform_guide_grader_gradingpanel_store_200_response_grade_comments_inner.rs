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
pub struct GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner {
    /// The comment value
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// Comment id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The sortorder of this comment
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<i32>,
}

impl GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner {
    pub fn new() -> GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner {
        GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner {
            description: None,
            id: None,
            sortorder: None,
        }
    }
}
