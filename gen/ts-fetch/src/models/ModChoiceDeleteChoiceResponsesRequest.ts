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
 * @interface ModChoiceDeleteChoiceResponsesRequest
 */
export interface ModChoiceDeleteChoiceResponsesRequest {
    /**
     * choice instance id
     * @type {number}
     * @memberof ModChoiceDeleteChoiceResponsesRequest
     */
    Choiceid: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModChoiceDeleteChoiceResponsesRequest
     */
    Responses?: Array<object>;
}

/**
 * Check if a given object implements the ModChoiceDeleteChoiceResponsesRequest interface.
 */
export function instanceOfModChoiceDeleteChoiceResponsesRequest(value: object): boolean {
    if (!('Choiceid' in value)) return false;
    return true;
}

export function ModChoiceDeleteChoiceResponsesRequestFromJSON(json: any): ModChoiceDeleteChoiceResponsesRequest {
    return ModChoiceDeleteChoiceResponsesRequestFromJSONTyped(json, false);
}

export function ModChoiceDeleteChoiceResponsesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceDeleteChoiceResponsesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Choiceid': json['choiceid'],
        'Responses': json['responses'] == null ? undefined : json['responses'],
    };
}

export function ModChoiceDeleteChoiceResponsesRequestToJSON(value?: ModChoiceDeleteChoiceResponsesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'choiceid': value['Choiceid'],
        'responses': value['Responses'],
    };
}

