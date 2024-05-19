/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { ModAssignSaveSubmissionRequestPlugindata } from './ModAssignSaveSubmissionRequestPlugindata';
import {
    ModAssignSaveSubmissionRequestPlugindataFromJSON,
    ModAssignSaveSubmissionRequestPlugindataFromJSONTyped,
    ModAssignSaveSubmissionRequestPlugindataToJSON,
} from './ModAssignSaveSubmissionRequestPlugindata';

/**
 * 
 * @export
 * @interface ModAssignSaveSubmissionRequest
 */
export interface ModAssignSaveSubmissionRequest {
    /**
     * The assignment id to operate on
     * @type {number}
     * @memberof ModAssignSaveSubmissionRequest
     */
    Assignmentid: number;
    /**
     * 
     * @type {ModAssignSaveSubmissionRequestPlugindata}
     * @memberof ModAssignSaveSubmissionRequest
     */
    Plugindata: ModAssignSaveSubmissionRequestPlugindata;
}

/**
 * Check if a given object implements the ModAssignSaveSubmissionRequest interface.
 */
export function instanceOfModAssignSaveSubmissionRequest(value: object): boolean {
    if (!('Assignmentid' in value)) return false;
    if (!('Plugindata' in value)) return false;
    return true;
}

export function ModAssignSaveSubmissionRequestFromJSON(json: any): ModAssignSaveSubmissionRequest {
    return ModAssignSaveSubmissionRequestFromJSONTyped(json, false);
}

export function ModAssignSaveSubmissionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveSubmissionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignmentid': json['assignmentid'],
        'Plugindata': ModAssignSaveSubmissionRequestPlugindataFromJSON(json['plugindata']),
    };
}

export function ModAssignSaveSubmissionRequestToJSON(value?: ModAssignSaveSubmissionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentid': value['Assignmentid'],
        'plugindata': ModAssignSaveSubmissionRequestPlugindataToJSON(value['Plugindata']),
    };
}

