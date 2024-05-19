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
 * @interface CoreCourseformatFileHandlersRequest
 */
export interface CoreCourseformatFileHandlersRequest {
    /**
     * course id
     * @type {number}
     * @memberof CoreCourseformatFileHandlersRequest
     */
    Courseid: number;
}

/**
 * Check if a given object implements the CoreCourseformatFileHandlersRequest interface.
 */
export function instanceOfCoreCourseformatFileHandlersRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    return true;
}

export function CoreCourseformatFileHandlersRequestFromJSON(json: any): CoreCourseformatFileHandlersRequest {
    return CoreCourseformatFileHandlersRequestFromJSONTyped(json, false);
}

export function CoreCourseformatFileHandlersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseformatFileHandlersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
    };
}

export function CoreCourseformatFileHandlersRequestToJSON(value?: CoreCourseformatFileHandlersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
    };
}

