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
 * @interface CoreGetFragment200Response
 */
export interface CoreGetFragment200Response {
    /**
     * HTML fragment.
     * @type {string}
     * @memberof CoreGetFragment200Response
     */
    html: string;
    /**
     * JavaScript fragment
     * @type {string}
     * @memberof CoreGetFragment200Response
     */
    javascript: string;
}

/**
 * Check if a given object implements the CoreGetFragment200Response interface.
 */
export function instanceOfCoreGetFragment200Response(value: object): boolean {
    if (!('html' in value)) return false;
    if (!('javascript' in value)) return false;
    return true;
}

export function CoreGetFragment200ResponseFromJSON(json: any): CoreGetFragment200Response {
    return CoreGetFragment200ResponseFromJSONTyped(json, false);
}

export function CoreGetFragment200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGetFragment200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'html': json['html'],
        'javascript': json['javascript'],
    };
}

export function CoreGetFragment200ResponseToJSON(value?: CoreGetFragment200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'html': value['html'],
        'javascript': value['javascript'],
    };
}

