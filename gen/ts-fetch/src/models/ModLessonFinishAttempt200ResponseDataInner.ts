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
 * @interface ModLessonFinishAttempt200ResponseDataInner
 */
export interface ModLessonFinishAttempt200ResponseDataInner {
    /**
     * Data message (translated string).
     * @type {string}
     * @memberof ModLessonFinishAttempt200ResponseDataInner
     */
    Message?: string;
    /**
     * Data name.
     * @type {string}
     * @memberof ModLessonFinishAttempt200ResponseDataInner
     */
    Name?: string;
    /**
     * Data value.
     * @type {string}
     * @memberof ModLessonFinishAttempt200ResponseDataInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModLessonFinishAttempt200ResponseDataInner interface.
 */
export function instanceOfModLessonFinishAttempt200ResponseDataInner(value: object): boolean {
    return true;
}

export function ModLessonFinishAttempt200ResponseDataInnerFromJSON(json: any): ModLessonFinishAttempt200ResponseDataInner {
    return ModLessonFinishAttempt200ResponseDataInnerFromJSONTyped(json, false);
}

export function ModLessonFinishAttempt200ResponseDataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonFinishAttempt200ResponseDataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Message': json['message'] == null ? undefined : json['message'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModLessonFinishAttempt200ResponseDataInnerToJSON(value?: ModLessonFinishAttempt200ResponseDataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'message': value['Message'],
        'name': value['Name'],
        'value': value['Value'],
    };
}

