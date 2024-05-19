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
 * The timers
 */
export interface ModLessonGetUserTimers200ResponseTimersInner { 
    /**
     * If the lesson for this timer was completed
     */
    Completed?: number;
    /**
     * The attempt id
     */
    Id?: number;
    /**
     * The lesson id
     */
    Lessonid?: number;
    /**
     * Last access time to the lesson during the timer session
     */
    Lessontime?: number;
    /**
     * First access time for a new timer session
     */
    Starttime?: number;
    /**
     * Last modified time via webservices.
     */
    Timemodifiedoffline?: number;
    /**
     * The user id
     */
    Userid?: number;
}

