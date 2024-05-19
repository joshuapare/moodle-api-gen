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
pub struct GradereportUserGetAccessInformation200Response {
    /// Whether the user can view all users grades in the course.
    #[serde(rename = "canviewallgrades")]
    pub canviewallgrades: bool,
    /// Whether the user can view his grades in the course.
    #[serde(rename = "canviewmygrades")]
    pub canviewmygrades: bool,
    /// Whether the user can view the user grade report.
    #[serde(rename = "canviewusergradereport")]
    pub canviewusergradereport: bool,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl GradereportUserGetAccessInformation200Response {
    pub fn new(canviewallgrades: bool, canviewmygrades: bool, canviewusergradereport: bool) -> GradereportUserGetAccessInformation200Response {
        GradereportUserGetAccessInformation200Response {
            canviewallgrades,
            canviewmygrades,
            canviewusergradereport,
            warnings: None,
        }
    }
}

