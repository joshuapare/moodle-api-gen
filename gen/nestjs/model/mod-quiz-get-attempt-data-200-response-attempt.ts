/**
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle\'s Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface ModQuizGetAttemptData200ResponseAttempt { 
    /**
     * Sequentially numbers this students attempts at this quiz.
     */
    Attempt?: number;
    /**
     * Attempt current page.
     */
    Currentpage?: number;
    /**
     * Time when the student was notified that manual grading of their attempt was complete.
     */
    Gradednotificationsenttime?: number;
    /**
     * Attempt id.
     */
    Id?: number;
    /**
     * Attempt layout.
     */
    Layout?: string;
    /**
     * Whether is a preview attempt or not.
     */
    Preview?: number;
    /**
     * Foreign key reference to the quiz that was attempted.
     */
    Quiz?: number;
    /**
     * The current state of the attempts. \'inprogress\',                                                 \'overdue\', \'finished\' or \'abandoned\'.
     */
    State?: string;
    /**
     * Total marks for this attempt.
     */
    Sumgrades?: number;
    /**
     * Next time quiz cron should check attempt for                                                         state changes.  NULL means never check.
     */
    Timecheckstate?: number;
    /**
     * Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet.
     */
    Timefinish?: number;
    /**
     * Last modified time.
     */
    Timemodified?: number;
    /**
     * Last modified time via webservices.
     */
    Timemodifiedoffline?: number;
    /**
     * Time when the attempt was started.
     */
    Timestart?: number;
    /**
     * Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt.
     */
    Uniqueid?: number;
    /**
     * Foreign key reference to the user whose attempt this is.
     */
    Userid?: number;
}

