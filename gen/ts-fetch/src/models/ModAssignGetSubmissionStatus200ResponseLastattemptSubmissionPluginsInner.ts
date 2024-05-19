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
import type { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner } from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner';
import {
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner';
import type { ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner } from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner';
import {
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner';

/**
 * 
 * @export
 * @interface ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner
 */
export interface ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner {
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner>}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner
     */
    Editorfields?: Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner>;
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner
     */
    Fileareas?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>;
    /**
     * submission plugin name
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner
     */
    Name?: string;
    /**
     * submission plugin type
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner
     */
    Type?: string;
}

/**
 * Check if a given object implements the ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner interface.
 */
export function instanceOfModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner(value: object): boolean {
    return true;
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSON(json: any): ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner {
    return ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSONTyped(json, false);
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Editorfields': json['editorfields'] == null ? undefined : ((json['editorfields'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInnerFromJSON)),
        'Fileareas': json['fileareas'] == null ? undefined : ((json['fileareas'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSON)),
        'Name': json['name'] == null ? undefined : json['name'],
        'Type': json['type'] == null ? undefined : json['type'],
    };
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerToJSON(value?: ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'editorfields': value['Editorfields'] == null ? undefined : ((value['Editorfields'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInnerToJSON)),
        'fileareas': value['Fileareas'] == null ? undefined : ((value['Fileareas'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerToJSON)),
        'name': value['Name'],
        'type': value['Type'],
    };
}

