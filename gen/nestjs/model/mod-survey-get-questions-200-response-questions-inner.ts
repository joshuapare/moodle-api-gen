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


/**
 * Questions
 */
export interface ModSurveyGetQuestions200ResponseQuestionsInner { 
    /**
     * Question id
     */
    Id?: number;
    /**
     * The question intro
     */
    Intro?: string;
    /**
     * Subquestions ids
     */
    Multi?: string;
    /**
     * Question options
     */
    Options?: string;
    /**
     * Parent question (for subquestions)
     */
    Parent?: number;
    /**
     * Question short text
     */
    Shorttext?: string;
    /**
     * Question text
     */
    Text?: string;
    /**
     * Question type
     */
    Type?: number;
}
