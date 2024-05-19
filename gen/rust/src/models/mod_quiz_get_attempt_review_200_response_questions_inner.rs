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

/// ModQuizGetAttemptReview200ResponseQuestionsInner : The question data. Some fields may not be returned depending on the quiz display settings.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModQuizGetAttemptReview200ResponseQuestionsInner {
    /// whether the question is blocked by the previous question
    #[serde(rename = "blockedbyprevious", skip_serializing_if = "Option::is_none")]
    pub blockedbyprevious: Option<bool>,
    /// whether the question is flagged or not
    #[serde(rename = "flagged", skip_serializing_if = "Option::is_none")]
    pub flagged: Option<bool>,
    /// whether this question attempt has autosaved data
    #[serde(rename = "hasautosavedstep", skip_serializing_if = "Option::is_none")]
    pub hasautosavedstep: Option<bool>,
    /// the question rendered
    #[serde(rename = "html", skip_serializing_if = "Option::is_none")]
    pub html: Option<String>,
    /// the timestamp of the most recent step in this question attempt
    #[serde(rename = "lastactiontime", skip_serializing_if = "Option::is_none")]
    pub lastactiontime: Option<i32>,
    /// the mark awarded.                     It will be returned only if the user is allowed to see it.
    #[serde(rename = "mark", skip_serializing_if = "Option::is_none")]
    pub mark: Option<String>,
    /// the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it.
    #[serde(rename = "maxmark", skip_serializing_if = "Option::is_none")]
    pub maxmark: Option<f64>,
    /// DO NOT USE. Use questionnumber. Only retained for backwards compatibility.
    #[serde(rename = "number", skip_serializing_if = "Option::is_none")]
    pub number: Option<i32>,
    /// page of the quiz this question appears on
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<i32>,
    /// The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\".
    #[serde(rename = "questionnumber", skip_serializing_if = "Option::is_none")]
    pub questionnumber: Option<String>,
    #[serde(rename = "responsefileareas", skip_serializing_if = "Option::is_none")]
    pub responsefileareas: Option<Vec<models::ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>>,
    /// the number of real steps in this attempt
    #[serde(rename = "sequencecheck", skip_serializing_if = "Option::is_none")]
    pub sequencecheck: Option<i32>,
    /// Question settings (JSON encoded).
    #[serde(rename = "settings", skip_serializing_if = "Option::is_none")]
    pub settings: Option<String>,
    /// slot number
    #[serde(rename = "slot", skip_serializing_if = "Option::is_none")]
    pub slot: Option<i32>,
    /// the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings.
    #[serde(rename = "state", skip_serializing_if = "Option::is_none")]
    pub state: Option<String>,
    /// current formatted state of the question
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
    /// question type, i.e: multichoice
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl ModQuizGetAttemptReview200ResponseQuestionsInner {
    /// The question data. Some fields may not be returned depending on the quiz display settings.
    pub fn new() -> ModQuizGetAttemptReview200ResponseQuestionsInner {
        ModQuizGetAttemptReview200ResponseQuestionsInner {
            blockedbyprevious: None,
            flagged: None,
            hasautosavedstep: None,
            html: None,
            lastactiontime: None,
            mark: None,
            maxmark: None,
            number: None,
            page: None,
            questionnumber: None,
            responsefileareas: None,
            sequencecheck: None,
            settings: None,
            slot: None,
            state: None,
            status: None,
            r#type: None,
        }
    }
}

