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
pub struct ModWikiGetSubwikiPagesRequest {
    /// Subwiki's group ID, -1 means current group. It will be ignored if the wiki doesn't use groups.
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Box<models::ModWikiGetSubwikiPagesRequestOptions>>,
    /// Subwiki's user ID, 0 means current user. It will be ignored in collaborative wikis.
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// Wiki instance ID.
    #[serde(rename = "wikiid")]
    pub wikiid: i32,
}

impl ModWikiGetSubwikiPagesRequest {
    pub fn new(wikiid: i32) -> ModWikiGetSubwikiPagesRequest {
        ModWikiGetSubwikiPagesRequest {
            groupid: None,
            options: None,
            userid: None,
            wikiid,
        }
    }
}

