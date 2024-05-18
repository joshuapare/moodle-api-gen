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
pub struct CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement {
    /// Badge id
    #[serde(rename = "badgeid")]
    pub badgeid: i32,
    /// Claim comment
    #[serde(rename = "claimcomment")]
    pub claimcomment: String,
    /// Claim URL
    #[serde(rename = "claimid")]
    pub claimid: String,
    /// Date issued
    #[serde(rename = "dateissued")]
    pub dateissued: i32,
    /// Endorsement id
    #[serde(rename = "id")]
    pub id: i32,
    /// Endorsement issuer email
    #[serde(rename = "issueremail")]
    pub issueremail: String,
    /// Endorsement issuer name
    #[serde(rename = "issuername")]
    pub issuername: String,
    /// Endorsement issuer URL
    #[serde(rename = "issuerurl")]
    pub issuerurl: String,
}

impl CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement {
    pub fn new(badgeid: i32, claimcomment: String, claimid: String, dateissued: i32, id: i32, issueremail: String, issuername: String, issuerurl: String) -> CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement {
        CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement {
            badgeid,
            claimcomment,
            claimid,
            dateissued,
            id,
            issueremail,
            issuername,
            issuerurl,
        }
    }
}
