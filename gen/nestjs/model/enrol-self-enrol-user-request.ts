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


export interface EnrolSelfEnrolUserRequest { 
    /**
     * Id of the course
     */
    Courseid: number;
    /**
     * Instance id of self enrolment plugin.
     */
    Instanceid?: number;
    /**
     * Enrolment key
     */
    Password?: string;
}

