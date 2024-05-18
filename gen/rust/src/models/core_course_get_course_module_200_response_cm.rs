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
pub struct CoreCourseGetCourseModule200ResponseCm {
    /// Time added
    #[serde(rename = "added", skip_serializing_if = "Option::is_none")]
    pub added: Option<i32>,
    #[serde(rename = "advancedgrading", skip_serializing_if = "Option::is_none")]
    pub advancedgrading: Option<Vec<models::CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner>>,
    /// Availability settings
    #[serde(rename = "availability", skip_serializing_if = "Option::is_none")]
    pub availability: Option<String>,
    /// If completion is enabled
    #[serde(rename = "completion")]
    pub completion: i32,
    /// Completion time expected
    #[serde(rename = "completionexpected", skip_serializing_if = "Option::is_none")]
    pub completionexpected: Option<i32>,
    /// Completion grade item
    #[serde(rename = "completiongradeitemnumber", skip_serializing_if = "Option::is_none")]
    pub completiongradeitemnumber: Option<i32>,
    /// Completion pass grade setting
    #[serde(rename = "completionpassgrade", skip_serializing_if = "Option::is_none")]
    pub completionpassgrade: Option<i32>,
    /// Completion view setting
    #[serde(rename = "completionview", skip_serializing_if = "Option::is_none")]
    pub completionview: Option<i32>,
    /// The course id
    #[serde(rename = "course")]
    pub course: i32,
    /// The download content value
    #[serde(rename = "downloadcontent", skip_serializing_if = "Option::is_none")]
    pub downloadcontent: Option<i32>,
    /// Grade (max value or scale id)
    #[serde(rename = "grade", skip_serializing_if = "Option::is_none")]
    pub grade: Option<f64>,
    /// Grade category
    #[serde(rename = "gradecat", skip_serializing_if = "Option::is_none")]
    pub gradecat: Option<i32>,
    /// Grade to pass (float)
    #[serde(rename = "gradepass", skip_serializing_if = "Option::is_none")]
    pub gradepass: Option<String>,
    /// Grouping id
    #[serde(rename = "groupingid")]
    pub groupingid: i32,
    /// Group mode
    #[serde(rename = "groupmode")]
    pub groupmode: i32,
    /// The course module id
    #[serde(rename = "id")]
    pub id: i32,
    /// Module id number
    #[serde(rename = "idnumber", skip_serializing_if = "Option::is_none")]
    pub idnumber: Option<String>,
    /// Indentation
    #[serde(rename = "indent", skip_serializing_if = "Option::is_none")]
    pub indent: Option<i32>,
    /// The activity instance id
    #[serde(rename = "instance")]
    pub instance: i32,
    /// The module component name (forum, assign, etc..)
    #[serde(rename = "modname")]
    pub modname: String,
    /// The module type id
    #[serde(rename = "module")]
    pub module: i32,
    /// The activity name
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "outcomes", skip_serializing_if = "Option::is_none")]
    pub outcomes: Option<Vec<models::CoreCourseGetCourseModule200ResponseCmOutcomesInner>>,
    /// Scale items (if used)
    #[serde(rename = "scale", skip_serializing_if = "Option::is_none")]
    pub scale: Option<String>,
    /// Score
    #[serde(rename = "score", skip_serializing_if = "Option::is_none")]
    pub score: Option<i32>,
    /// The module section id
    #[serde(rename = "section")]
    pub section: i32,
    /// The module section number
    #[serde(rename = "sectionnum")]
    pub sectionnum: i32,
    /// If the description is showed
    #[serde(rename = "showdescription", skip_serializing_if = "Option::is_none")]
    pub showdescription: Option<i32>,
    /// If visible
    #[serde(rename = "visible", skip_serializing_if = "Option::is_none")]
    pub visible: Option<i32>,
    /// Visible old
    #[serde(rename = "visibleold", skip_serializing_if = "Option::is_none")]
    pub visibleold: Option<i32>,
    /// If visible on course page
    #[serde(rename = "visibleoncoursepage", skip_serializing_if = "Option::is_none")]
    pub visibleoncoursepage: Option<i32>,
}

impl CoreCourseGetCourseModule200ResponseCm {
    pub fn new(completion: i32, course: i32, groupingid: i32, groupmode: i32, id: i32, instance: i32, modname: String, module: i32, name: String, section: i32, sectionnum: i32) -> CoreCourseGetCourseModule200ResponseCm {
        CoreCourseGetCourseModule200ResponseCm {
            added: None,
            advancedgrading: None,
            availability: None,
            completion,
            completionexpected: None,
            completiongradeitemnumber: None,
            completionpassgrade: None,
            completionview: None,
            course,
            downloadcontent: None,
            grade: None,
            gradecat: None,
            gradepass: None,
            groupingid,
            groupmode,
            id,
            idnumber: None,
            indent: None,
            instance,
            modname,
            module,
            name,
            outcomes: None,
            scale: None,
            score: None,
            section,
            sectionnum,
            showdescription: None,
            visible: None,
            visibleold: None,
            visibleoncoursepage: None,
        }
    }
}
