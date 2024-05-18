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
 * @interface QbankColumnsortorderSetColumnbankOrderRequest
 */
export interface QbankColumnsortorderSetColumnbankOrderRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof QbankColumnsortorderSetColumnbankOrderRequest
     */
    columns?: Array<object>;
    /**
     * Set global config setting, rather than user preference
     * @type {boolean}
     * @memberof QbankColumnsortorderSetColumnbankOrderRequest
     */
    global?: boolean;
}

/**
 * Check if a given object implements the QbankColumnsortorderSetColumnbankOrderRequest interface.
 */
export function instanceOfQbankColumnsortorderSetColumnbankOrderRequest(value: object): boolean {
    return true;
}

export function QbankColumnsortorderSetColumnbankOrderRequestFromJSON(json: any): QbankColumnsortorderSetColumnbankOrderRequest {
    return QbankColumnsortorderSetColumnbankOrderRequestFromJSONTyped(json, false);
}

export function QbankColumnsortorderSetColumnbankOrderRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): QbankColumnsortorderSetColumnbankOrderRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'columns': json['columns'] == null ? undefined : json['columns'],
        'global': json['global'] == null ? undefined : json['global'],
    };
}

export function QbankColumnsortorderSetColumnbankOrderRequestToJSON(value?: QbankColumnsortorderSetColumnbankOrderRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'columns': value['columns'],
        'global': value['global'],
    };
}

