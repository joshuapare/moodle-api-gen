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
 * @interface ErrorResponse
 */
export interface ErrorResponse {
    /**
     * Debug information
     * @type {string}
     * @memberof ErrorResponse
     */
    debuginfo?: string;
    /**
     * Error code
     * @type {string}
     * @memberof ErrorResponse
     */
    errorcode?: string;
    /**
     * Type of the exception
     * @type {string}
     * @memberof ErrorResponse
     */
    exception?: string;
    /**
     * Error message
     * @type {string}
     * @memberof ErrorResponse
     */
    message?: string;
}

/**
 * Check if a given object implements the ErrorResponse interface.
 */
export function instanceOfErrorResponse(value: object): boolean {
    return true;
}

export function ErrorResponseFromJSON(json: any): ErrorResponse {
    return ErrorResponseFromJSONTyped(json, false);
}

export function ErrorResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ErrorResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'debuginfo': json['debuginfo'] == null ? undefined : json['debuginfo'],
        'errorcode': json['errorcode'] == null ? undefined : json['errorcode'],
        'exception': json['exception'] == null ? undefined : json['exception'],
        'message': json['message'] == null ? undefined : json['message'],
    };
}

export function ErrorResponseToJSON(value?: ErrorResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'debuginfo': value['debuginfo'],
        'errorcode': value['errorcode'],
        'exception': value['exception'],
        'message': value['message'],
    };
}
