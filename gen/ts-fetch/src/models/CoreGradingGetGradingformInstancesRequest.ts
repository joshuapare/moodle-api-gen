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
 * @interface CoreGradingGetGradingformInstancesRequest
 */
export interface CoreGradingGetGradingformInstancesRequest {
    /**
     * definition id
     * @type {number}
     * @memberof CoreGradingGetGradingformInstancesRequest
     */
    Definitionid: number;
    /**
     * submitted since
     * @type {number}
     * @memberof CoreGradingGetGradingformInstancesRequest
     */
    Since?: number;
}

/**
 * Check if a given object implements the CoreGradingGetGradingformInstancesRequest interface.
 */
export function instanceOfCoreGradingGetGradingformInstancesRequest(value: object): boolean {
    if (!('Definitionid' in value)) return false;
    return true;
}

export function CoreGradingGetGradingformInstancesRequestFromJSON(json: any): CoreGradingGetGradingformInstancesRequest {
    return CoreGradingGetGradingformInstancesRequestFromJSONTyped(json, false);
}

export function CoreGradingGetGradingformInstancesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingGetGradingformInstancesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Definitionid': json['definitionid'],
        'Since': json['since'] == null ? undefined : json['since'],
    };
}

export function CoreGradingGetGradingformInstancesRequestToJSON(value?: CoreGradingGetGradingformInstancesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'definitionid': value['Definitionid'],
        'since': value['Since'],
    };
}

