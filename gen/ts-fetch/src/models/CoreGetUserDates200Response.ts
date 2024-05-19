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
 * @interface CoreGetUserDates200Response
 */
export interface CoreGetUserDates200Response {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreGetUserDates200Response
     */
    Dates: Array<object>;
}

/**
 * Check if a given object implements the CoreGetUserDates200Response interface.
 */
export function instanceOfCoreGetUserDates200Response(value: object): boolean {
    if (!('Dates' in value)) return false;
    return true;
}

export function CoreGetUserDates200ResponseFromJSON(json: any): CoreGetUserDates200Response {
    return CoreGetUserDates200ResponseFromJSONTyped(json, false);
}

export function CoreGetUserDates200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGetUserDates200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Dates': json['dates'],
    };
}

export function CoreGetUserDates200ResponseToJSON(value?: CoreGetUserDates200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'dates': value['Dates'],
    };
}
