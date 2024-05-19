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
 * @interface ModLtiGetToolTypesRequest
 */
export interface ModLtiGetToolTypesRequest {
    /**
     * Tool proxy id
     * @type {number}
     * @memberof ModLtiGetToolTypesRequest
     */
    Toolproxyid?: number;
}

/**
 * Check if a given object implements the ModLtiGetToolTypesRequest interface.
 */
export function instanceOfModLtiGetToolTypesRequest(value: object): boolean {
    return true;
}

export function ModLtiGetToolTypesRequestFromJSON(json: any): ModLtiGetToolTypesRequest {
    return ModLtiGetToolTypesRequestFromJSONTyped(json, false);
}

export function ModLtiGetToolTypesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiGetToolTypesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Toolproxyid': json['toolproxyid'] == null ? undefined : json['toolproxyid'],
    };
}

export function ModLtiGetToolTypesRequestToJSON(value?: ModLtiGetToolTypesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'toolproxyid': value['Toolproxyid'],
    };
}

