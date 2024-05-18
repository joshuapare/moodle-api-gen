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
import type { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner } from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner';
import {
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner';
import type { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner } from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner';
import {
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner';

/**
 * 
 * @export
 * @interface ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
 */
export interface ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
     */
    editorfields?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>;
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
     */
    fileareas?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>;
    /**
     * submission plugin name
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
     */
    name?: string;
    /**
     * submission plugin type
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
     */
    type?: string;
}

/**
 * Check if a given object implements the ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner interface.
 */
export function instanceOfModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner(value: object): boolean {
    return true;
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSON(json: any): ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
    return ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSONTyped(json, false);
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'editorfields': json['editorfields'] == null ? undefined : ((json['editorfields'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerFromJSON)),
        'fileareas': json['fileareas'] == null ? undefined : ((json['fileareas'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerFromJSON)),
        'name': json['name'] == null ? undefined : json['name'],
        'type': json['type'] == null ? undefined : json['type'],
    };
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerToJSON(value?: ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'editorfields': value['editorfields'] == null ? undefined : ((value['editorfields'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInnerToJSON)),
        'fileareas': value['fileareas'] == null ? undefined : ((value['fileareas'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInnerToJSON)),
        'name': value['name'],
        'type': value['type'],
    };
}

