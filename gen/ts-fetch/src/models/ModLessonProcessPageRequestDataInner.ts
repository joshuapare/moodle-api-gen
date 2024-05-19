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
 * @interface ModLessonProcessPageRequestDataInner
 */
export interface ModLessonProcessPageRequestDataInner {
    /**
     * data name
     * @type {string}
     * @memberof ModLessonProcessPageRequestDataInner
     */
    Name?: string;
    /**
     * data value
     * @type {string}
     * @memberof ModLessonProcessPageRequestDataInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModLessonProcessPageRequestDataInner interface.
 */
export function instanceOfModLessonProcessPageRequestDataInner(value: object): boolean {
    return true;
}

export function ModLessonProcessPageRequestDataInnerFromJSON(json: any): ModLessonProcessPageRequestDataInner {
    return ModLessonProcessPageRequestDataInnerFromJSONTyped(json, false);
}

export function ModLessonProcessPageRequestDataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonProcessPageRequestDataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModLessonProcessPageRequestDataInnerToJSON(value?: ModLessonProcessPageRequestDataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'value': value['Value'],
    };
}

