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
    lessonattempt: number;
    /**
     * lesson instance id
     * @type {number}
     * @memberof ModLessonGetContentPagesViewedRequest
     */
    lessonid: number;
    /**
     * the user id (empty for current user)
     * @type {number}
     * @memberof ModLessonGetContentPagesViewedRequest
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModLessonGetContentPagesViewedRequest interface.
 */
export function instanceOfModLessonGetContentPagesViewedRequest(value: object): boolean {
    if (!('lessonattempt' in value)) return false;
    if (!('lessonid' in value)) return false;
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
        
        'lessonattempt': json['lessonattempt'],
        'lessonid': json['lessonid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModLessonGetContentPagesViewedRequestToJSON(value?: ModLessonGetContentPagesViewedRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonattempt': value['lessonattempt'],
        'lessonid': value['lessonid'],
        'userid': value['userid'],
    };
}

