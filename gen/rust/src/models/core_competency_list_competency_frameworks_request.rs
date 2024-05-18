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
pub struct CoreCompetencyListCompetencyFrameworksRequest {
    #[serde(rename = "context")]
    pub context: Box<models::CoreCohortSearchCohortsRequestContext>,
    /// What other contextes to fetch the frameworks from. (children, parents, self)
    #[serde(rename = "includes", skip_serializing_if = "Option::is_none")]
    pub includes: Option<String>,
    /// Return this number of records at most.
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    /// Only visible frameworks will be returned if visible true
    #[serde(rename = "onlyvisible", skip_serializing_if = "Option::is_none")]
    pub onlyvisible: Option<bool>,
    /// Sort direction. Should be either ASC or DESC
    #[serde(rename = "order", skip_serializing_if = "Option::is_none")]
    pub order: Option<String>,
    /// A query string to filter the results
    #[serde(rename = "query", skip_serializing_if = "Option::is_none")]
    pub query: Option<String>,
    /// Skip this number of records before returning results
    #[serde(rename = "skip", skip_serializing_if = "Option::is_none")]
    pub skip: Option<i32>,
    /// Column to sort by.
    #[serde(rename = "sort", skip_serializing_if = "Option::is_none")]
    pub sort: Option<String>,
}

impl CoreCompetencyListCompetencyFrameworksRequest {
    pub fn new(context: models::CoreCohortSearchCohortsRequestContext) -> CoreCompetencyListCompetencyFrameworksRequest {
        CoreCompetencyListCompetencyFrameworksRequest {
            context: Box::new(context),
            includes: None,
            limit: None,
            onlyvisible: None,
            order: None,
            query: None,
            skip: None,
            sort: None,
        }
    }
}

