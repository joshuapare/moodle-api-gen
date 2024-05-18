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
pub struct ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
    #[serde(rename = "feedbackattachmentfiles", skip_serializing_if = "Option::is_none")]
    pub feedbackattachmentfiles: Option<Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>>,
    /// The comment/feedback from the reviewer for the author.
    #[serde(rename = "feedbackauthor", skip_serializing_if = "Option::is_none")]
    pub feedbackauthor: Option<String>,
    /// Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager().
    #[serde(rename = "feedbackauthorattachment", skip_serializing_if = "Option::is_none")]
    pub feedbackauthorattachment: Option<i32>,
    /// feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "feedbackauthorformat", skip_serializing_if = "Option::is_none")]
    pub feedbackauthorformat: Option<i32>,
    #[serde(rename = "feedbackcontentfiles", skip_serializing_if = "Option::is_none")]
    pub feedbackcontentfiles: Option<Vec<models::CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>>,
    /// The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden
    #[serde(rename = "feedbackreviewer", skip_serializing_if = "Option::is_none")]
    pub feedbackreviewer: Option<String>,
    /// feedbackreviewer format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "feedbackreviewerformat", skip_serializing_if = "Option::is_none")]
    pub feedbackreviewerformat: Option<i32>,
    /// The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet.
    #[serde(rename = "grade", skip_serializing_if = "Option::is_none")]
    pub grade: Option<f64>,
    /// The computed grade 0..100 for this assessment. If NULL then it has not been computed yet.
    #[serde(rename = "gradinggrade", skip_serializing_if = "Option::is_none")]
    pub gradinggrade: Option<f64>,
    /// Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden.
    #[serde(rename = "gradinggradeover", skip_serializing_if = "Option::is_none")]
    pub gradinggradeover: Option<f64>,
    /// The id of the user who has overridden the grade for submission.
    #[serde(rename = "gradinggradeoverby", skip_serializing_if = "Option::is_none")]
    pub gradinggradeoverby: Option<i32>,
    /// The primary key of the record.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The id of the reviewer who makes this assessment
    #[serde(rename = "reviewerid", skip_serializing_if = "Option::is_none")]
    pub reviewerid: Option<i32>,
    /// The id of the assessed submission
    #[serde(rename = "submissionid", skip_serializing_if = "Option::is_none")]
    pub submissionid: Option<i32>,
    /// If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// The weight of the assessment for the purposes of aggregation
    #[serde(rename = "weight", skip_serializing_if = "Option::is_none")]
    pub weight: Option<i32>,
}

impl ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
    pub fn new() -> ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
        ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
            feedbackattachmentfiles: None,
            feedbackauthor: None,
            feedbackauthorattachment: None,
            feedbackauthorformat: None,
            feedbackcontentfiles: None,
            feedbackreviewer: None,
            feedbackreviewerformat: None,
            grade: None,
            gradinggrade: None,
            gradinggradeover: None,
            gradinggradeoverby: None,
            id: None,
            reviewerid: None,
            submissionid: None,
            timecreated: None,
            timemodified: None,
            weight: None,
        }
    }
}
