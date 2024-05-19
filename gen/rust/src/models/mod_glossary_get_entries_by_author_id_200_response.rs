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
pub struct ModGlossaryGetEntriesByAuthorId200Response {
    /// The total number of records matching the request.
    #[serde(rename = "count")]
    pub count: i32,
    #[serde(rename = "entries")]
    pub entries: Vec<models::ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner>,
    #[serde(rename = "ratinginfo", skip_serializing_if = "Option::is_none")]
    pub ratinginfo: Option<Box<models::ModForumGetDiscussionPosts200ResponseRatinginfo>>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModGlossaryGetEntriesByAuthorId200Response {
    pub fn new(count: i32, entries: Vec<models::ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner>) -> ModGlossaryGetEntriesByAuthorId200Response {
        ModGlossaryGetEntriesByAuthorId200Response {
            count,
            entries,
            ratinginfo: None,
            warnings: None,
        }
    }
}

