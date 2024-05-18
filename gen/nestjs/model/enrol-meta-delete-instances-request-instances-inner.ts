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


export interface EnrolMetaDeleteInstancesRequestInstancesInner { 
    /**
     * ID of the course where meta enrolment is linked to.
     */
    Courseid?: string;
    /**
     * ID of the course with meta enrolment.
     */
    Metacourseid?: number;
}
