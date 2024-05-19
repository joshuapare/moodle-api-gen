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
 * @interface CoreDynamicTabsGetContentRequest
 */
export interface CoreDynamicTabsGetContentRequest {
    /**
     * Json-encoded data
     * @type {string}
     * @memberof CoreDynamicTabsGetContentRequest
     */
    Jsondata: string;
    /**
     * Tab class
     * @type {string}
     * @memberof CoreDynamicTabsGetContentRequest
     */
    Tab: string;
}

/**
 * Check if a given object implements the CoreDynamicTabsGetContentRequest interface.
 */
export function instanceOfCoreDynamicTabsGetContentRequest(value: object): boolean {
    if (!('Jsondata' in value)) return false;
    if (!('Tab' in value)) return false;
    return true;
}

export function CoreDynamicTabsGetContentRequestFromJSON(json: any): CoreDynamicTabsGetContentRequest {
    return CoreDynamicTabsGetContentRequestFromJSONTyped(json, false);
}

export function CoreDynamicTabsGetContentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreDynamicTabsGetContentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Jsondata': json['jsondata'],
        'Tab': json['tab'],
    };
}

export function CoreDynamicTabsGetContentRequestToJSON(value?: CoreDynamicTabsGetContentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'jsondata': value['Jsondata'],
        'tab': value['Tab'],
    };
}

