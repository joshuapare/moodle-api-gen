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
import type { CoreMessageMessageProcessorConfigFormRequestFormvaluesInner } from './CoreMessageMessageProcessorConfigFormRequestFormvaluesInner';
import {
    CoreMessageMessageProcessorConfigFormRequestFormvaluesInnerFromJSON,
    CoreMessageMessageProcessorConfigFormRequestFormvaluesInnerFromJSONTyped,
    CoreMessageMessageProcessorConfigFormRequestFormvaluesInnerToJSON,
} from './CoreMessageMessageProcessorConfigFormRequestFormvaluesInner';

/**
 * 
 * @export
 * @interface CoreMessageMessageProcessorConfigFormRequest
 */
export interface CoreMessageMessageProcessorConfigFormRequest {
    /**
     * 
     * @type {Array<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner>}
     * @memberof CoreMessageMessageProcessorConfigFormRequest
     */
    Formvalues: Array<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner>;
    /**
     * The name of the message processor
     * @type {string}
     * @memberof CoreMessageMessageProcessorConfigFormRequest
     */
    Name: string;
    /**
     * id of the user, 0 for current user
     * @type {number}
     * @memberof CoreMessageMessageProcessorConfigFormRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the CoreMessageMessageProcessorConfigFormRequest interface.
 */
export function instanceOfCoreMessageMessageProcessorConfigFormRequest(value: object): boolean {
    if (!('Formvalues' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Userid' in value)) return false;
    return true;
}

export function CoreMessageMessageProcessorConfigFormRequestFromJSON(json: any): CoreMessageMessageProcessorConfigFormRequest {
    return CoreMessageMessageProcessorConfigFormRequestFromJSONTyped(json, false);
}

export function CoreMessageMessageProcessorConfigFormRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageMessageProcessorConfigFormRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Formvalues': ((json['formvalues'] as Array<any>).map(CoreMessageMessageProcessorConfigFormRequestFormvaluesInnerFromJSON)),
        'Name': json['name'],
        'Userid': json['userid'],
    };
}

export function CoreMessageMessageProcessorConfigFormRequestToJSON(value?: CoreMessageMessageProcessorConfigFormRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'formvalues': ((value['Formvalues'] as Array<any>).map(CoreMessageMessageProcessorConfigFormRequestFormvaluesInnerToJSON)),
        'name': value['Name'],
        'userid': value['Userid'],
    };
}

