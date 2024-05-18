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
 * @interface CoreEnrolSubmitUserEnrolmentForm200Response
 */
export interface CoreEnrolSubmitUserEnrolmentForm200Response {
    /**
     * True if the user's enrolment was successfully updated
     * @type {boolean}
     * @memberof CoreEnrolSubmitUserEnrolmentForm200Response
     */
    result: boolean;
    /**
     * Indicates invalid form data
     * @type {boolean}
     * @memberof CoreEnrolSubmitUserEnrolmentForm200Response
     */
    validationerror?: boolean;
}

/**
 * Check if a given object implements the CoreEnrolSubmitUserEnrolmentForm200Response interface.
 */
export function instanceOfCoreEnrolSubmitUserEnrolmentForm200Response(value: object): boolean {
    if (!('result' in value)) return false;
    return true;
}

export function CoreEnrolSubmitUserEnrolmentForm200ResponseFromJSON(json: any): CoreEnrolSubmitUserEnrolmentForm200Response {
    return CoreEnrolSubmitUserEnrolmentForm200ResponseFromJSONTyped(json, false);
}

export function CoreEnrolSubmitUserEnrolmentForm200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreEnrolSubmitUserEnrolmentForm200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'result': json['result'],
        'validationerror': json['validationerror'] == null ? undefined : json['validationerror'],
    };
}

export function CoreEnrolSubmitUserEnrolmentForm200ResponseToJSON(value?: CoreEnrolSubmitUserEnrolmentForm200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'result': value['result'],
        'validationerror': value['validationerror'],
    };
}

