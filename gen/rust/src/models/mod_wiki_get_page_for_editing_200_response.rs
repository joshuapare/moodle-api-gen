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
pub struct ModWikiGetPageForEditing200Response {
    #[serde(rename = "pagesection")]
    pub pagesection: Box<models::ModWikiGetPageForEditing200ResponsePagesection>,
}

impl ModWikiGetPageForEditing200Response {
    pub fn new(pagesection: models::ModWikiGetPageForEditing200ResponsePagesection) -> ModWikiGetPageForEditing200Response {
        ModWikiGetPageForEditing200Response {
            pagesection: Box::new(pagesection),
        }
    }
}
