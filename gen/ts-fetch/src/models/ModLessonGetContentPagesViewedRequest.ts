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
 * @interface ModLessonGetContentPagesViewedRequest
 */
export interface ModLessonGetContentPagesViewedRequest {
    /**
     * lesson attempt number
     * @type {number}
     * @memberof ModLessonGetContentPagesViewedRequest
     */
    Lessonattempt: number;
    /**
     * lesson instance id
     * @type {number}
     * @memberof ModLessonGetContentPagesViewedRequest
     */
    Lessonid: number;
    /**
     * the user id (empty for current user)
     * @type {number}
     * @memberof ModLessonGetContentPagesViewedRequest
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModLessonGetContentPagesViewedRequest interface.
 */
export function instanceOfModLessonGetContentPagesViewedRequest(value: object): boolean {
    if (!('Lessonattempt' in value)) return false;
    if (!('Lessonid' in value)) return false;
    return true;
}

export function ModLessonGetContentPagesViewedRequestFromJSON(json: any): ModLessonGetContentPagesViewedRequest {
    return ModLessonGetContentPagesViewedRequestFromJSONTyped(json, false);
}

export function ModLessonGetContentPagesViewedRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetContentPagesViewedRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Lessonattempt': json['lessonattempt'],
        'Lessonid': json['lessonid'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModLessonGetContentPagesViewedRequestToJSON(value?: ModLessonGetContentPagesViewedRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonattempt': value['Lessonattempt'],
        'lessonid': value['Lessonid'],
        'userid': value['Userid'],
    };
}

