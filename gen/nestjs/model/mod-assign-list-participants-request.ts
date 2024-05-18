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


export interface ModAssignListParticipantsRequest { 
    /**
     * assign instance id
     */
    Assignid: number;
    /**
     * search string to filter the results
     */
    Filter: string;
    /**
     * group id
     */
    Groupid: number;
    /**
     * Do return courses where the user is enrolled
     */
    Includeenrolments?: boolean;
    /**
     * maximum number of records to return
     */
    Limit?: number;
    /**
     * Do not return all user fields
     */
    Onlyids?: boolean;
    /**
     * number of records to skip
     */
    Skip?: number;
    /**
     * Apply current user table sorting preferences.
     */
    Tablesort?: boolean;
}
