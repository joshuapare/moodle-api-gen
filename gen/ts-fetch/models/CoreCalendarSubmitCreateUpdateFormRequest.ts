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
 * @interface CoreCalendarSubmitCreateUpdateFormRequest
 */
export interface CoreCalendarSubmitCreateUpdateFormRequest {
    /**
     * The data from the event form
     * @type {string}
     * @memberof CoreCalendarSubmitCreateUpdateFormRequest
     */
    formdata: string;
}

/**
 * Check if a given object implements the CoreCalendarSubmitCreateUpdateFormRequest interface.
 */
export function instanceOfCoreCalendarSubmitCreateUpdateFormRequest(value: object): boolean {
    if (!('formdata' in value)) return false;
    return true;
}

export function CoreCalendarSubmitCreateUpdateFormRequestFromJSON(json: any): CoreCalendarSubmitCreateUpdateFormRequest {
    return CoreCalendarSubmitCreateUpdateFormRequestFromJSONTyped(json, false);
}

export function CoreCalendarSubmitCreateUpdateFormRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarSubmitCreateUpdateFormRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'formdata': json['formdata'],
    };
}

export function CoreCalendarSubmitCreateUpdateFormRequestToJSON(value?: CoreCalendarSubmitCreateUpdateFormRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'formdata': value['formdata'],
    };
}
