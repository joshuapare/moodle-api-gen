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
import type { CoreMessageGetConversationCounts200ResponseTypes } from './CoreMessageGetConversationCounts200ResponseTypes';
import {
    CoreMessageGetConversationCounts200ResponseTypesFromJSON,
    CoreMessageGetConversationCounts200ResponseTypesFromJSONTyped,
    CoreMessageGetConversationCounts200ResponseTypesToJSON,
} from './CoreMessageGetConversationCounts200ResponseTypes';

/**
 * 
 * @export
 * @interface CoreMessageGetConversationCounts200Response
 */
export interface CoreMessageGetConversationCounts200Response {
    /**
     * Total number of favourite conversations
     * @type {number}
     * @memberof CoreMessageGetConversationCounts200Response
     */
    Favourites: number;
    /**
     * 
     * @type {CoreMessageGetConversationCounts200ResponseTypes}
     * @memberof CoreMessageGetConversationCounts200Response
     */
    Types: CoreMessageGetConversationCounts200ResponseTypes;
}

/**
 * Check if a given object implements the CoreMessageGetConversationCounts200Response interface.
 */
export function instanceOfCoreMessageGetConversationCounts200Response(value: object): boolean {
    if (!('Favourites' in value)) return false;
    if (!('Types' in value)) return false;
    return true;
}

export function CoreMessageGetConversationCounts200ResponseFromJSON(json: any): CoreMessageGetConversationCounts200Response {
    return CoreMessageGetConversationCounts200ResponseFromJSONTyped(json, false);
}

export function CoreMessageGetConversationCounts200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetConversationCounts200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Favourites': json['favourites'],
        'Types': CoreMessageGetConversationCounts200ResponseTypesFromJSON(json['types']),
    };
}

export function CoreMessageGetConversationCounts200ResponseToJSON(value?: CoreMessageGetConversationCounts200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'favourites': value['Favourites'],
        'types': CoreMessageGetConversationCounts200ResponseTypesToJSON(value['Types']),
    };
}
