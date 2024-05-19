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
 * @interface ModLessonGetPageDataRequest
 */
export interface ModLessonGetPageDataRequest {
    /**
     * lesson instance id
     * @type {number}
     * @memberof ModLessonGetPageDataRequest
     */
    Lessonid: number;
    /**
     * the page id
     * @type {number}
     * @memberof ModLessonGetPageDataRequest
     */
    Pageid: number;
    /**
     * optional password (the lesson may be protected)
     * @type {string}
     * @memberof ModLessonGetPageDataRequest
     */
    Password?: string;
    /**
     * if we must return the complete page contents once rendered
     * @type {boolean}
     * @memberof ModLessonGetPageDataRequest
     */
    Returncontents?: boolean;
    /**
     * if we want to review just after finishing (1 hour margin)
     * @type {boolean}
     * @memberof ModLessonGetPageDataRequest
     */
    Review?: boolean;
}

/**
 * Check if a given object implements the ModLessonGetPageDataRequest interface.
 */
export function instanceOfModLessonGetPageDataRequest(value: object): boolean {
    if (!('Lessonid' in value)) return false;
    if (!('Pageid' in value)) return false;
    return true;
}

export function ModLessonGetPageDataRequestFromJSON(json: any): ModLessonGetPageDataRequest {
    return ModLessonGetPageDataRequestFromJSONTyped(json, false);
}

export function ModLessonGetPageDataRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetPageDataRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Lessonid': json['lessonid'],
        'Pageid': json['pageid'],
        'Password': json['password'] == null ? undefined : json['password'],
        'Returncontents': json['returncontents'] == null ? undefined : json['returncontents'],
        'Review': json['review'] == null ? undefined : json['review'],
    };
}

export function ModLessonGetPageDataRequestToJSON(value?: ModLessonGetPageDataRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonid': value['Lessonid'],
        'pageid': value['Pageid'],
        'password': value['Password'],
        'returncontents': value['Returncontents'],
        'review': value['Review'],
    };
}
