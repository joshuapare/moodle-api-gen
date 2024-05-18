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
 * @interface TinyPremiumGetApiKey200Response
 */
export interface TinyPremiumGetApiKey200Response {
    /**
     * The API key for Tiny Premium
     * @type {string}
     * @memberof TinyPremiumGetApiKey200Response
     */
    apikey: string;
}

/**
 * Check if a given object implements the TinyPremiumGetApiKey200Response interface.
 */
export function instanceOfTinyPremiumGetApiKey200Response(value: object): boolean {
    if (!('apikey' in value)) return false;
    return true;
}

export function TinyPremiumGetApiKey200ResponseFromJSON(json: any): TinyPremiumGetApiKey200Response {
    return TinyPremiumGetApiKey200ResponseFromJSONTyped(json, false);
}

export function TinyPremiumGetApiKey200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): TinyPremiumGetApiKey200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'apikey': json['apikey'],
    };
}

export function TinyPremiumGetApiKey200ResponseToJSON(value?: TinyPremiumGetApiKey200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'apikey': value['apikey'],
    };
}

