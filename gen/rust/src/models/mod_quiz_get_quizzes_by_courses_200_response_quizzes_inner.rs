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
pub struct ModQuizGetQuizzesByCourses200ResponseQuizzesInner {
    /// Whether to allow the quiz to be attempted                                                                             offline in the mobile app
    #[serde(rename = "allowofflineattempts", skip_serializing_if = "Option::is_none")]
    pub allowofflineattempts: Option<i32>,
    /// Whether subsequent attempts start from the answer                                                                     to the previous attempt (1) or start blank (0).
    #[serde(rename = "attemptonlast", skip_serializing_if = "Option::is_none")]
    pub attemptonlast: Option<i32>,
    /// The maximum number of attempts a student is allowed.
    #[serde(rename = "attempts", skip_serializing_if = "Option::is_none")]
    pub attempts: Option<i32>,
    /// Auto-save delay
    #[serde(rename = "autosaveperiod", skip_serializing_if = "Option::is_none")]
    pub autosaveperiod: Option<i32>,
    /// Restriciton on the browser the student must                                                                     use. E.g. 'securewindow'.
    #[serde(rename = "browsersecurity", skip_serializing_if = "Option::is_none")]
    pub browsersecurity: Option<String>,
    /// Allows students to redo any completed question                                                                         within a quiz attempt.
    #[serde(rename = "canredoquestions", skip_serializing_if = "Option::is_none")]
    pub canredoquestions: Option<i32>,
    /// Mark quiz complete when the student has                                                                                 exhausted the maximum number of attempts
    #[serde(rename = "completionattemptsexhausted", skip_serializing_if = "Option::is_none")]
    pub completionattemptsexhausted: Option<i32>,
    /// Whether to require passing grade
    #[serde(rename = "completionpass", skip_serializing_if = "Option::is_none")]
    pub completionpass: Option<i32>,
    /// Course id
    #[serde(rename = "course", skip_serializing_if = "Option::is_none")]
    pub course: Option<i32>,
    /// Course module id
    #[serde(rename = "coursemodule", skip_serializing_if = "Option::is_none")]
    pub coursemodule: Option<i32>,
    /// Number of decimal points to use when displaying                                                                     grades.
    #[serde(rename = "decimalpoints", skip_serializing_if = "Option::is_none")]
    pub decimalpoints: Option<i32>,
    /// Delay that must be left between the first and second attempt,                                                             in seconds.
    #[serde(rename = "delay1", skip_serializing_if = "Option::is_none")]
    pub delay1: Option<i32>,
    /// Delay that must be left between the second and subsequent                                                             attempt, in seconds.
    #[serde(rename = "delay2", skip_serializing_if = "Option::is_none")]
    pub delay2: Option<i32>,
    /// The amount of time (in seconds) after the time limit                                                                 runs out during which attempts can still be submitted,                                                                 if overduehandling is set to allow it.
    #[serde(rename = "graceperiod", skip_serializing_if = "Option::is_none")]
    pub graceperiod: Option<i32>,
    /// The total that the quiz overall grade is scaled to be                                                             out of.
    #[serde(rename = "grade", skip_serializing_if = "Option::is_none")]
    pub grade: Option<f64>,
    /// One of the values QUIZ_GRADEHIGHEST, QUIZ_GRADEAVERAGE,                                                                     QUIZ_ATTEMPTFIRST or QUIZ_ATTEMPTLAST.
    #[serde(rename = "grademethod", skip_serializing_if = "Option::is_none")]
    pub grademethod: Option<i32>,
    /// Group id
    #[serde(rename = "groupingid", skip_serializing_if = "Option::is_none")]
    pub groupingid: Option<i32>,
    /// Group mode
    #[serde(rename = "groupmode", skip_serializing_if = "Option::is_none")]
    pub groupmode: Option<i32>,
    /// Whether the quiz has any non-blank feedback text
    #[serde(rename = "hasfeedback", skip_serializing_if = "Option::is_none")]
    pub hasfeedback: Option<i32>,
    /// Whether the quiz has questions
    #[serde(rename = "hasquestions", skip_serializing_if = "Option::is_none")]
    pub hasquestions: Option<i32>,
    /// Activity instance id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Activity introduction
    #[serde(rename = "intro", skip_serializing_if = "Option::is_none")]
    pub intro: Option<String>,
    #[serde(rename = "introfiles", skip_serializing_if = "Option::is_none")]
    pub introfiles: Option<Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>>,
    /// intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "introformat", skip_serializing_if = "Option::is_none")]
    pub introformat: Option<i32>,
    /// Forced activity language
    #[serde(rename = "lang", skip_serializing_if = "Option::is_none")]
    pub lang: Option<String>,
    /// Activity name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Any constraints on how the user is allowed to navigate                                                                 around the quiz. Currently recognised values are                                                                 'free' and 'seq'.
    #[serde(rename = "navmethod", skip_serializing_if = "Option::is_none")]
    pub navmethod: Option<String>,
    /// The method used to handle overdue attempts.                                                                     'autosubmit', 'graceperiod' or 'autoabandon'.
    #[serde(rename = "overduehandling", skip_serializing_if = "Option::is_none")]
    pub overduehandling: Option<String>,
    /// A password that the student must enter before starting or                                                                 continuing a quiz attempt.
    #[serde(rename = "password", skip_serializing_if = "Option::is_none")]
    pub password: Option<String>,
    /// The behaviour to ask questions to use.
    #[serde(rename = "preferredbehaviour", skip_serializing_if = "Option::is_none")]
    pub preferredbehaviour: Option<String>,
    /// Number of decimal points to use when                                                                             displaying question grades.                                                                             (-1 means use decimalpoints.)
    #[serde(rename = "questiondecimalpoints", skip_serializing_if = "Option::is_none")]
    pub questiondecimalpoints: Option<i32>,
    /// How often to insert a page break when editing                                                                         the quiz, or when shuffling the question order.
    #[serde(rename = "questionsperpage", skip_serializing_if = "Option::is_none")]
    pub questionsperpage: Option<i32>,
    /// Whether users are allowed to review their quiz                                                                     attempts at various times. This is a bit field, decoded by the                                                                     \\mod_quiz\\question\\display_options class. It is formed by ORing                                                                     together the constants defined there.
    #[serde(rename = "reviewattempt", skip_serializing_if = "Option::is_none")]
    pub reviewattempt: Option<i32>,
    /// Whether users are allowed to review their quiz                                                        attempts at various times.A bit field, like reviewattempt.
    #[serde(rename = "reviewcorrectness", skip_serializing_if = "Option::is_none")]
    pub reviewcorrectness: Option<i32>,
    /// Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt.
    #[serde(rename = "reviewgeneralfeedback", skip_serializing_if = "Option::is_none")]
    pub reviewgeneralfeedback: Option<i32>,
    /// Whether users are allowed to review their quiz attempts                                                                 at various times. A bit field, like reviewattempt.
    #[serde(rename = "reviewmarks", skip_serializing_if = "Option::is_none")]
    pub reviewmarks: Option<i32>,
    /// Whether users are allowed to review their quiz                                                   attempts at various times. A bit field, like reviewattempt.
    #[serde(rename = "reviewmaxmarks", skip_serializing_if = "Option::is_none")]
    pub reviewmaxmarks: Option<i32>,
    /// Whether users are allowed to review their quiz                                                                             attempts at various times. A bit field, like                                                                             reviewattempt.
    #[serde(rename = "reviewoverallfeedback", skip_serializing_if = "Option::is_none")]
    pub reviewoverallfeedback: Option<i32>,
    /// Whether users are allowed to review their quiz                                                                         attempts at various times. A bit field, like                                                                         reviewattempt.
    #[serde(rename = "reviewrightanswer", skip_serializing_if = "Option::is_none")]
    pub reviewrightanswer: Option<i32>,
    /// Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt.
    #[serde(rename = "reviewspecificfeedback", skip_serializing_if = "Option::is_none")]
    pub reviewspecificfeedback: Option<i32>,
    /// Course section id
    #[serde(rename = "section", skip_serializing_if = "Option::is_none")]
    pub section: Option<i32>,
    /// Whether blocks should be shown on the attempt.php and                                                                 review.php pages.
    #[serde(rename = "showblocks", skip_serializing_if = "Option::is_none")]
    pub showblocks: Option<i32>,
    /// Option to show the user's picture during the                                                                     attempt and on the review page.
    #[serde(rename = "showuserpicture", skip_serializing_if = "Option::is_none")]
    pub showuserpicture: Option<i32>,
    /// Whether the parts of the question should be shuffled,                                                                     in those question types that support it.
    #[serde(rename = "shuffleanswers", skip_serializing_if = "Option::is_none")]
    pub shuffleanswers: Option<i32>,
    /// Used to restrict the IP addresses from which this quiz can                                                             be attempted. The format is as requried by the address_in_subnet                                                             function.
    #[serde(rename = "subnet", skip_serializing_if = "Option::is_none")]
    pub subnet: Option<String>,
    /// The total of all the question instance maxmarks.
    #[serde(rename = "sumgrades", skip_serializing_if = "Option::is_none")]
    pub sumgrades: Option<f64>,
    /// The time when this quiz closes. (0 = no restriction.)
    #[serde(rename = "timeclose", skip_serializing_if = "Option::is_none")]
    pub timeclose: Option<i32>,
    /// The time when the quiz was added to the course.
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// The time limit for quiz attempts, in seconds.
    #[serde(rename = "timelimit", skip_serializing_if = "Option::is_none")]
    pub timelimit: Option<i32>,
    /// Last modified time.
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// The time when this quiz opens. (0 = no restriction.)
    #[serde(rename = "timeopen", skip_serializing_if = "Option::is_none")]
    pub timeopen: Option<i32>,
    /// Visible
    #[serde(rename = "visible", skip_serializing_if = "Option::is_none")]
    pub visible: Option<bool>,
}

impl ModQuizGetQuizzesByCourses200ResponseQuizzesInner {
    pub fn new() -> ModQuizGetQuizzesByCourses200ResponseQuizzesInner {
        ModQuizGetQuizzesByCourses200ResponseQuizzesInner {
            allowofflineattempts: None,
            attemptonlast: None,
            attempts: None,
            autosaveperiod: None,
            browsersecurity: None,
            canredoquestions: None,
            completionattemptsexhausted: None,
            completionpass: None,
            course: None,
            coursemodule: None,
            decimalpoints: None,
            delay1: None,
            delay2: None,
            graceperiod: None,
            grade: None,
            grademethod: None,
            groupingid: None,
            groupmode: None,
            hasfeedback: None,
            hasquestions: None,
            id: None,
            intro: None,
            introfiles: None,
            introformat: None,
            lang: None,
            name: None,
            navmethod: None,
            overduehandling: None,
            password: None,
            preferredbehaviour: None,
            questiondecimalpoints: None,
            questionsperpage: None,
            reviewattempt: None,
            reviewcorrectness: None,
            reviewgeneralfeedback: None,
            reviewmarks: None,
            reviewmaxmarks: None,
            reviewoverallfeedback: None,
            reviewrightanswer: None,
            reviewspecificfeedback: None,
            section: None,
            showblocks: None,
            showuserpicture: None,
            shuffleanswers: None,
            subnet: None,
            sumgrades: None,
            timeclose: None,
            timecreated: None,
            timelimit: None,
            timemodified: None,
            timeopen: None,
            visible: None,
        }
    }
}
