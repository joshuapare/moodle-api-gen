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
pub struct CoreCalendarGetCalendarEventById200ResponseEvent {
    #[serde(rename = "action", skip_serializing_if = "Option::is_none")]
    pub action: Option<Box<models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction>>,
    /// activityname
    #[serde(rename = "activityname", skip_serializing_if = "Option::is_none")]
    pub activityname: Option<String>,
    /// activitystr
    #[serde(rename = "activitystr", skip_serializing_if = "Option::is_none")]
    pub activitystr: Option<String>,
    /// candelete
    #[serde(rename = "candelete")]
    pub candelete: bool,
    /// canedit
    #[serde(rename = "canedit")]
    pub canedit: bool,
    #[serde(rename = "category", skip_serializing_if = "Option::is_none")]
    pub category: Option<Box<models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory>>,
    /// categoryid
    #[serde(rename = "categoryid", skip_serializing_if = "Option::is_none")]
    pub categoryid: Option<i32>,
    /// component
    #[serde(rename = "component", skip_serializing_if = "Option::is_none")]
    pub component: Option<String>,
    #[serde(rename = "course", skip_serializing_if = "Option::is_none")]
    pub course: Option<Box<models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse>>,
    /// deleteurl
    #[serde(rename = "deleteurl")]
    pub deleteurl: String,
    /// description
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "descriptionformat", skip_serializing_if = "Option::is_none")]
    pub descriptionformat: Option<i32>,
    /// editurl
    #[serde(rename = "editurl")]
    pub editurl: String,
    /// eventcount
    #[serde(rename = "eventcount", skip_serializing_if = "Option::is_none")]
    pub eventcount: Option<i32>,
    /// eventtype
    #[serde(rename = "eventtype")]
    pub eventtype: String,
    /// formattedlocation
    #[serde(rename = "formattedlocation")]
    pub formattedlocation: String,
    /// formattedtime
    #[serde(rename = "formattedtime")]
    pub formattedtime: String,
    /// groupid
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// groupname
    #[serde(rename = "groupname", skip_serializing_if = "Option::is_none")]
    pub groupname: Option<String>,
    #[serde(rename = "icon")]
    pub icon: Box<models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon>,
    /// id
    #[serde(rename = "id")]
    pub id: i32,
    /// instance
    #[serde(rename = "instance", skip_serializing_if = "Option::is_none")]
    pub instance: Option<i32>,
    /// isactionevent
    #[serde(rename = "isactionevent")]
    pub isactionevent: bool,
    /// iscategoryevent
    #[serde(rename = "iscategoryevent")]
    pub iscategoryevent: bool,
    /// iscourseevent
    #[serde(rename = "iscourseevent")]
    pub iscourseevent: bool,
    /// location
    #[serde(rename = "location", skip_serializing_if = "Option::is_none")]
    pub location: Option<String>,
    /// modulename
    #[serde(rename = "modulename", skip_serializing_if = "Option::is_none")]
    pub modulename: Option<String>,
    /// name
    #[serde(rename = "name")]
    pub name: String,
    /// normalisedeventtype
    #[serde(rename = "normalisedeventtype")]
    pub normalisedeventtype: String,
    /// normalisedeventtypetext
    #[serde(rename = "normalisedeventtypetext")]
    pub normalisedeventtypetext: String,
    /// overdue
    #[serde(rename = "overdue", skip_serializing_if = "Option::is_none")]
    pub overdue: Option<bool>,
    /// purpose
    #[serde(rename = "purpose")]
    pub purpose: String,
    /// repeatid
    #[serde(rename = "repeatid", skip_serializing_if = "Option::is_none")]
    pub repeatid: Option<i32>,
    #[serde(rename = "subscription", skip_serializing_if = "Option::is_none")]
    pub subscription: Option<Box<models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription>>,
    /// timeduration
    #[serde(rename = "timeduration")]
    pub timeduration: i32,
    /// timemodified
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// timesort
    #[serde(rename = "timesort")]
    pub timesort: i32,
    /// timestart
    #[serde(rename = "timestart")]
    pub timestart: i32,
    /// timeusermidnight
    #[serde(rename = "timeusermidnight")]
    pub timeusermidnight: i32,
    /// url
    #[serde(rename = "url")]
    pub url: String,
    /// userid
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    /// viewurl
    #[serde(rename = "viewurl")]
    pub viewurl: String,
    /// visible
    #[serde(rename = "visible")]
    pub visible: i32,
}

impl CoreCalendarGetCalendarEventById200ResponseEvent {
    pub fn new(candelete: bool, canedit: bool, deleteurl: String, editurl: String, eventtype: String, formattedlocation: String, formattedtime: String, icon: models::CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, id: i32, isactionevent: bool, iscategoryevent: bool, iscourseevent: bool, name: String, normalisedeventtype: String, normalisedeventtypetext: String, purpose: String, timeduration: i32, timemodified: i32, timesort: i32, timestart: i32, timeusermidnight: i32, url: String, viewurl: String, visible: i32) -> CoreCalendarGetCalendarEventById200ResponseEvent {
        CoreCalendarGetCalendarEventById200ResponseEvent {
            action: None,
            activityname: None,
            activitystr: None,
            candelete,
            canedit,
            category: None,
            categoryid: None,
            component: None,
            course: None,
            deleteurl,
            description: None,
            descriptionformat: None,
            editurl,
            eventcount: None,
            eventtype,
            formattedlocation,
            formattedtime,
            groupid: None,
            groupname: None,
            icon: Box::new(icon),
            id,
            instance: None,
            isactionevent,
            iscategoryevent,
            iscourseevent,
            location: None,
            modulename: None,
            name,
            normalisedeventtype,
            normalisedeventtypetext,
            overdue: None,
            purpose,
            repeatid: None,
            subscription: None,
            timeduration,
            timemodified,
            timesort,
            timestart,
            timeusermidnight,
            url,
            userid: None,
            viewurl,
            visible,
        }
    }
}

