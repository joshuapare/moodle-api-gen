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
 * @interface CoreQuestionSubmitTagsForm200Response
 */
export interface CoreQuestionSubmitTagsForm200Response {
    /**
     * status: true if success
     * @type {boolean}
     * @memberof CoreQuestionSubmitTagsForm200Response
     */
    Status: boolean;
}

/**
 * Check if a given object implements the CoreQuestionSubmitTagsForm200Response interface.
 */
export function instanceOfCoreQuestionSubmitTagsForm200Response(value: object): boolean {
    if (!('Status' in value)) return false;
    return true;
}

export function CoreQuestionSubmitTagsForm200ResponseFromJSON(json: any): CoreQuestionSubmitTagsForm200Response {
    return CoreQuestionSubmitTagsForm200ResponseFromJSONTyped(json, false);
}

export function CoreQuestionSubmitTagsForm200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreQuestionSubmitTagsForm200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Status': json['status'],
    };
}

export function CoreQuestionSubmitTagsForm200ResponseToJSON(value?: CoreQuestionSubmitTagsForm200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['Status'],
    };
}
