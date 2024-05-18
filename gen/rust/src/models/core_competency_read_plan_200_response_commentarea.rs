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
pub struct CoreCompetencyReadPlan200ResponseCommentarea {
    /// autostart
    #[serde(rename = "autostart")]
    pub autostart: bool,
    /// canpost
    #[serde(rename = "canpost")]
    pub canpost: bool,
    /// canpostorhascomments
    #[serde(rename = "canpostorhascomments")]
    pub canpostorhascomments: bool,
    /// canview
    #[serde(rename = "canview")]
    pub canview: bool,
    /// cid
    #[serde(rename = "cid")]
    pub cid: String,
    /// collapsediconkey
    #[serde(rename = "collapsediconkey")]
    pub collapsediconkey: String,
    /// commentarea
    #[serde(rename = "commentarea")]
    pub commentarea: String,
    /// component
    #[serde(rename = "component")]
    pub component: String,
    /// contextid
    #[serde(rename = "contextid")]
    pub contextid: i32,
    /// count
    #[serde(rename = "count")]
    pub count: i32,
    /// courseid
    #[serde(rename = "courseid")]
    pub courseid: i32,
    /// displaycancel
    #[serde(rename = "displaycancel")]
    pub displaycancel: bool,
    /// displaytotalcount
    #[serde(rename = "displaytotalcount")]
    pub displaytotalcount: bool,
    /// fullwidth
    #[serde(rename = "fullwidth")]
    pub fullwidth: bool,
    /// itemid
    #[serde(rename = "itemid")]
    pub itemid: i32,
    /// linktext
    #[serde(rename = "linktext")]
    pub linktext: String,
    /// notoggle
    #[serde(rename = "notoggle")]
    pub notoggle: bool,
    /// template
    #[serde(rename = "template")]
    pub template: String,
}

impl CoreCompetencyReadPlan200ResponseCommentarea {
    pub fn new(autostart: bool, canpost: bool, canpostorhascomments: bool, canview: bool, cid: String, collapsediconkey: String, commentarea: String, component: String, contextid: i32, count: i32, courseid: i32, displaycancel: bool, displaytotalcount: bool, fullwidth: bool, itemid: i32, linktext: String, notoggle: bool, template: String) -> CoreCompetencyReadPlan200ResponseCommentarea {
        CoreCompetencyReadPlan200ResponseCommentarea {
            autostart,
            canpost,
            canpostorhascomments,
            canview,
            cid,
            collapsediconkey,
            commentarea,
            component,
            contextid,
            count,
            courseid,
            displaycancel,
            displaytotalcount,
            fullwidth,
            itemid,
            linktext,
            notoggle,
            template,
        }
    }
}

