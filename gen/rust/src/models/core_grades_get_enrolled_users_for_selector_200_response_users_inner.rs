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
pub struct CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner {
    /// Postal address
    #[serde(rename = "address", skip_serializing_if = "Option::is_none")]
    pub address: Option<String>,
    /// Auth plugins include manual, ldap, etc
    #[serde(rename = "auth", skip_serializing_if = "Option::is_none")]
    pub auth: Option<String>,
    /// Calendar type such as \"gregorian\", must exist on server
    #[serde(rename = "calendartype", skip_serializing_if = "Option::is_none")]
    pub calendartype: Option<String>,
    /// Home city of the user
    #[serde(rename = "city", skip_serializing_if = "Option::is_none")]
    pub city: Option<String>,
    /// Active user: 1 if confirmed, 0 otherwise
    #[serde(rename = "confirmed", skip_serializing_if = "Option::is_none")]
    pub confirmed: Option<bool>,
    /// Home country code of the user, such as AU or CZ
    #[serde(rename = "country", skip_serializing_if = "Option::is_none")]
    pub country: Option<String>,
    #[serde(rename = "customfields", skip_serializing_if = "Option::is_none")]
    pub customfields: Option<Vec<models::CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner>>,
    /// department
    #[serde(rename = "department", skip_serializing_if = "Option::is_none")]
    pub department: Option<String>,
    /// User profile description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// An email address - allow email as root@localhost
    #[serde(rename = "email", skip_serializing_if = "Option::is_none")]
    pub email: Option<String>,
    /// first access to the site (0 if never)
    #[serde(rename = "firstaccess", skip_serializing_if = "Option::is_none")]
    pub firstaccess: Option<i32>,
    /// The first name(s) of the user
    #[serde(rename = "firstname", skip_serializing_if = "Option::is_none")]
    pub firstname: Option<String>,
    /// The fullname of the user
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// ID of the user
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// An arbitrary ID code number perhaps from the institution
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// institution
    #[serde(rename = "institution", skip_serializing_if = "Option::is_none")]
    pub institution: Option<String>,
    /// user interests (separated by commas)
    #[serde(rename = "interests", skip_serializing_if = "Option::is_none")]
    pub interests: Option<String>,
    /// Language code such as \"en\", must exist on server
    #[serde(rename = "lang", skip_serializing_if = "Option::is_none")]
    pub lang: Option<String>,
    /// last access to the site (0 if never)
    #[serde(rename = "lastaccess", skip_serializing_if = "Option::is_none")]
    pub lastaccess: Option<i32>,
    /// The family name of the user
    #[serde(rename = "lastname", skip_serializing_if = "Option::is_none")]
    pub lastname: Option<String>,
    /// Mail format code is 0 for plain text, 1 for HTML etc
    #[serde(rename = "mailformat", skip_serializing_if = "Option::is_none")]
    pub mailformat: Option<i32>,
    /// Phone 1
    #[serde(rename = "phone1", skip_serializing_if = "Option::is_none")]
    pub phone1: Option<String>,
    /// Phone 2
    #[serde(rename = "phone2", skip_serializing_if = "Option::is_none")]
    pub phone2: Option<String>,
    #[serde(rename = "preferences", skip_serializing_if = "Option::is_none")]
    pub preferences: Option<Vec<models::CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner>>,
    /// User image profile URL - big version
    #[serde(rename = "profileimageurl", skip_serializing_if = "Option::is_none")]
    pub profileimageurl: Option<String>,
    /// User image profile URL - small version
    #[serde(rename = "profileimageurlsmall", skip_serializing_if = "Option::is_none")]
    pub profileimageurlsmall: Option<String>,
    /// Suspend user account, either false to enable user login or true to disable it
    #[serde(rename = "suspended", skip_serializing_if = "Option::is_none")]
    pub suspended: Option<bool>,
    /// Theme name such as \"standard\", must exist on server
    #[serde(rename = "theme", skip_serializing_if = "Option::is_none")]
    pub theme: Option<String>,
    /// Timezone code such as Australia/Perth, or 99 for default
    #[serde(rename = "timezone", skip_serializing_if = "Option::is_none")]
    pub timezone: Option<String>,
    /// The username
    #[serde(rename = "username", skip_serializing_if = "Option::is_none")]
    pub username: Option<String>,
}

impl CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner {
    pub fn new() -> CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner {
        CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner {
            address: None,
            auth: None,
            calendartype: None,
            city: None,
            confirmed: None,
            country: None,
            customfields: None,
            department: None,
            description: None,
            descriptionformat: None,
            email: None,
            firstaccess: None,
            firstname: None,
            fullname: None,
            id: None,
            idnumber: None,
            institution: None,
            interests: None,
            lang: None,
            lastaccess: None,
            lastname: None,
            mailformat: None,
            phone1: None,
            phone2: None,
            preferences: None,
            profileimageurl: None,
            profileimageurlsmall: None,
            suspended: None,
            theme: None,
            timezone: None,
            username: None,
        }
    }
}
