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
pub struct ModGlossaryAddEntryRequestOptionsInner {
    /// The allowed keys (value format) are:                             inlineattachmentsid (int); the draft file area id for inline attachments                             attachmentsid (int); the draft file area id for attachments                             categories (comma separated int); comma separated category ids                             aliases (comma separated str); comma separated aliases                             usedynalink (bool); whether the entry should be automatically linked.                             casesensitive (bool); whether the entry is case sensitive.                             fullmatch (bool); whether to match whole words only.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// the value of the option (validated inside the function)
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl ModGlossaryAddEntryRequestOptionsInner {
    pub fn new() -> ModGlossaryAddEntryRequestOptionsInner {
        ModGlossaryAddEntryRequestOptionsInner {
            name: None,
            value: None,
        }
    }
}

