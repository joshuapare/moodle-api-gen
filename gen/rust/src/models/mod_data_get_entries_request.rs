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
pub struct ModDataGetEntriesRequest {
    /// data instance id
    #[serde(rename = "databaseid")]
    pub databaseid: i32,
    /// Group id, 0 means that the function will determine the user group
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// The direction of the sorting: 'ASC' or 'DESC'.                                                 Empty for using the default database setting.
    #[serde(rename = "order", skip_serializing_if = "Option::is_none")]
    pub order: Option<String>,
    /// The page of records to return.
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<i32>,
    /// The number of records to return per page
    #[serde(rename = "perpage", skip_serializing_if = "Option::is_none")]
    pub perpage: Option<i32>,
    /// Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template).
    #[serde(rename = "returncontents", skip_serializing_if = "Option::is_none")]
    pub returncontents: Option<bool>,
    /// Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting.
    #[serde(rename = "sort", skip_serializing_if = "Option::is_none")]
    pub sort: Option<i32>,
}

impl ModDataGetEntriesRequest {
    pub fn new(databaseid: i32) -> ModDataGetEntriesRequest {
        ModDataGetEntriesRequest {
            databaseid,
            groupid: None,
            order: None,
            page: None,
            perpage: None,
            returncontents: None,
            sort: None,
        }
    }
}
