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
import { ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner } from './mod-assign-get-submission-status200-response-lastattempt-submission-plugins-inner';


export interface ModAssignGetSubmissionStatus200ResponseLastattemptSubmission { 
    /**
     * assignment id
     */
    Assignment?: number;
    /**
     * attempt number
     */
    Attemptnumber: number;
    /**
     * Grading status.
     */
    Gradingstatus?: string;
    /**
     * group id
     */
    Groupid: number;
    /**
     * submission id
     */
    Id: number;
    /**
     * latest attempt
     */
    Latest?: number;
    Plugins?: Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>;
    /**
     * submission status
     */
    Status: string;
    /**
     * submission creation time
     */
    Timecreated: number;
    /**
     * submission last modified time
     */
    Timemodified: number;
    /**
     * submission start time
     */
    Timestarted?: number;
    /**
     * student id
     */
    Userid: number;
}

