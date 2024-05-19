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
import { ModAssignGetUserMappings200ResponseWarningsInner } from './mod-assign-get-user-mappings200-response-warnings-inner';
import { ModAssignGetUserMappings200ResponseAssignmentsInner } from './mod-assign-get-user-mappings200-response-assignments-inner';


export interface ModAssignGetUserMappings200Response { 
    Assignments: Array<ModAssignGetUserMappings200ResponseAssignmentsInner>;
    Warnings?: Array<ModAssignGetUserMappings200ResponseWarningsInner>;
}

