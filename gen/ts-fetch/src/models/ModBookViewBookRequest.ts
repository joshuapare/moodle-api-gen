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
 * @interface ModBookViewBookRequest
 */
export interface ModBookViewBookRequest {
    /**
     * book instance id
     * @type {number}
     * @memberof ModBookViewBookRequest
     */
    Bookid: number;
    /**
     * chapter id
     * @type {number}
     * @memberof ModBookViewBookRequest
     */
    Chapterid?: number;
}

/**
 * Check if a given object implements the ModBookViewBookRequest interface.
 */
export function instanceOfModBookViewBookRequest(value: object): boolean {
    if (!('Bookid' in value)) return false;
    return true;
}

export function ModBookViewBookRequestFromJSON(json: any): ModBookViewBookRequest {
    return ModBookViewBookRequestFromJSONTyped(json, false);
}

export function ModBookViewBookRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBookViewBookRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Bookid': json['bookid'],
        'Chapterid': json['chapterid'] == null ? undefined : json['chapterid'],
    };
}

export function ModBookViewBookRequestToJSON(value?: ModBookViewBookRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'bookid': value['Bookid'],
        'chapterid': value['Chapterid'],
    };
}

