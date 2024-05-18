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
pub struct CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
    /// coursecategory
    #[serde(rename = "coursecategory", skip_serializing_if = "Option::is_none")]
    pub coursecategory: Option<String>,
    /// courseimage
    #[serde(rename = "courseimage", skip_serializing_if = "Option::is_none")]
    pub courseimage: Option<String>,
    /// enddate
    #[serde(rename = "enddate", skip_serializing_if = "Option::is_none")]
    pub enddate: Option<i32>,
    /// fullname
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    /// fullnamedisplay
    #[serde(rename = "fullnamedisplay", skip_serializing_if = "Option::is_none")]
    pub fullnamedisplay: Option<String>,
    /// hasprogress
    #[serde(rename = "hasprogress", skip_serializing_if = "Option::is_none")]
    pub hasprogress: Option<bool>,
    /// hidden
    #[serde(rename = "hidden", skip_serializing_if = "Option::is_none")]
    pub hidden: Option<bool>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// idnumber
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// isfavourite
    #[serde(rename = "isfavourite", skip_serializing_if = "Option::is_none")]
    pub isfavourite: Option<bool>,
    /// pdfexportfont
    #[serde(rename = "pdfexportfont", skip_serializing_if = "Option::is_none")]
    pub pdfexportfont: Option<String>,
    /// progress
    #[serde(rename = "progress", skip_serializing_if = "Option::is_none")]
    pub progress: Option<i32>,
    /// shortname
    #[serde(rename = "shortname", skip_serializing_if = "Option::is_none")]
    pub shortname: Option<String>,
    /// showactivitydates
    #[serde(rename = "showactivitydates", skip_serializing_if = "Option::is_none")]
    pub showactivitydates: Option<bool>,
    /// showcompletionconditions
    #[serde(rename = "showcompletionconditions", skip_serializing_if = "Option::is_none")]
    pub showcompletionconditions: Option<bool>,
    /// showshortname
    #[serde(rename = "showshortname", skip_serializing_if = "Option::is_none")]
    pub showshortname: Option<bool>,
    /// startdate
    #[serde(rename = "startdate", skip_serializing_if = "Option::is_none")]
    pub startdate: Option<i32>,
    /// summary
    #[serde(rename = "summary", skip_serializing_if = "Option::is_none")]
    pub summary: Option<String>,
    /// summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "summaryformat", skip_serializing_if = "Option::is_none")]
    pub summaryformat: Option<i32>,
    /// timeaccess
    #[serde(rename = "timeaccess", skip_serializing_if = "Option::is_none")]
    pub timeaccess: Option<i32>,
    /// viewurl
    #[serde(rename = "viewurl", skip_serializing_if = "Option::is_none")]
    pub viewurl: Option<String>,
    /// visible
    #[serde(rename = "visible", skip_serializing_if = "Option::is_none")]
    pub visible: Option<bool>,
}

impl CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
    pub fn new() -> CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
        CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner {
            coursecategory: None,
            courseimage: None,
            enddate: None,
            fullname: None,
            fullnamedisplay: None,
            hasprogress: None,
            hidden: None,
            id: None,
            idnumber: None,
            isfavourite: None,
            pdfexportfont: None,
            progress: None,
            shortname: None,
            showactivitydates: None,
            showcompletionconditions: None,
            showshortname: None,
            startdate: None,
            summary: None,
            summaryformat: None,
            timeaccess: None,
            viewurl: None,
            visible: None,
        }
    }
}
