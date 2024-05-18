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
/**
 * 
 * @export
 * @interface CoreNotesUpdateNotesRequestNotesInner
 */
export interface CoreNotesUpdateNotesRequestNotesInner {
    /**
     * text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreNotesUpdateNotesRequestNotesInner
     */
    format?: number;
    /**
     * id of the note
     * @type {number}
     * @memberof CoreNotesUpdateNotesRequestNotesInner
     */
    id?: number;
    /**
     * 'personal', 'course' or 'site'
     * @type {string}
     * @memberof CoreNotesUpdateNotesRequestNotesInner
     */
    publishstate?: string;
    /**
     * the text of the message - text or HTML
     * @type {string}
     * @memberof CoreNotesUpdateNotesRequestNotesInner
     */
    text?: string;
}

/**
 * Check if a given object implements the CoreNotesUpdateNotesRequestNotesInner interface.
 */
export function instanceOfCoreNotesUpdateNotesRequestNotesInner(value: object): boolean {
    return true;
}

export function CoreNotesUpdateNotesRequestNotesInnerFromJSON(json: any): CoreNotesUpdateNotesRequestNotesInner {
    return CoreNotesUpdateNotesRequestNotesInnerFromJSONTyped(json, false);
}

export function CoreNotesUpdateNotesRequestNotesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreNotesUpdateNotesRequestNotesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'format': json['format'] == null ? undefined : json['format'],
        'id': json['id'] == null ? undefined : json['id'],
        'publishstate': json['publishstate'] == null ? undefined : json['publishstate'],
        'text': json['text'] == null ? undefined : json['text'],
    };
}

export function CoreNotesUpdateNotesRequestNotesInnerToJSON(value?: CoreNotesUpdateNotesRequestNotesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'format': value['format'],
        'id': value['id'],
        'publishstate': value['publishstate'],
        'text': value['text'],
    };
}
