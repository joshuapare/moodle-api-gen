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
 * @interface MediaVideojsGetLanguageRequest
 */
export interface MediaVideojsGetLanguageRequest {
    /**
     * language
     * @type {string}
     * @memberof MediaVideojsGetLanguageRequest
     */
    Lang: string;
}

/**
 * Check if a given object implements the MediaVideojsGetLanguageRequest interface.
 */
export function instanceOfMediaVideojsGetLanguageRequest(value: object): boolean {
    if (!('Lang' in value)) return false;
    return true;
}

export function MediaVideojsGetLanguageRequestFromJSON(json: any): MediaVideojsGetLanguageRequest {
    return MediaVideojsGetLanguageRequestFromJSONTyped(json, false);
}

export function MediaVideojsGetLanguageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaVideojsGetLanguageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Lang': json['lang'],
    };
}

export function MediaVideojsGetLanguageRequestToJSON(value?: MediaVideojsGetLanguageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lang': value['Lang'],
    };
}
