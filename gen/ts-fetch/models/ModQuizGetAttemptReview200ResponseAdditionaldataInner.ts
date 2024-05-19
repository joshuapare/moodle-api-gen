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
 * @interface ModQuizGetAttemptReview200ResponseAdditionaldataInner
 */
export interface ModQuizGetAttemptReview200ResponseAdditionaldataInner {
    /**
     * data content
     * @type {string}
     * @memberof ModQuizGetAttemptReview200ResponseAdditionaldataInner
     */
    content?: string;
    /**
     * id of the data
     * @type {string}
     * @memberof ModQuizGetAttemptReview200ResponseAdditionaldataInner
     */
    id?: string;
    /**
     * data title
     * @type {string}
     * @memberof ModQuizGetAttemptReview200ResponseAdditionaldataInner
     */
    title?: string;
}

/**
 * Check if a given object implements the ModQuizGetAttemptReview200ResponseAdditionaldataInner interface.
 */
export function instanceOfModQuizGetAttemptReview200ResponseAdditionaldataInner(value: object): boolean {
    return true;
}

export function ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSON(json: any): ModQuizGetAttemptReview200ResponseAdditionaldataInner {
    return ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSONTyped(json, false);
}

export function ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetAttemptReview200ResponseAdditionaldataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'content': json['content'] == null ? undefined : json['content'],
        'id': json['id'] == null ? undefined : json['id'],
        'title': json['title'] == null ? undefined : json['title'],
    };
}

export function ModQuizGetAttemptReview200ResponseAdditionaldataInnerToJSON(value?: ModQuizGetAttemptReview200ResponseAdditionaldataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['content'],
        'id': value['id'],
        'title': value['title'],
    };
}

