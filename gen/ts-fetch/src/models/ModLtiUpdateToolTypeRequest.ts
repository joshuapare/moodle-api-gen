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
 * @interface ModLtiUpdateToolTypeRequest
 */
export interface ModLtiUpdateToolTypeRequest {
    /**
     * Tool type description
     * @type {string}
     * @memberof ModLtiUpdateToolTypeRequest
     */
    Description?: string;
    /**
     * Tool type id
     * @type {number}
     * @memberof ModLtiUpdateToolTypeRequest
     */
    Id: number;
    /**
     * Tool type name
     * @type {string}
     * @memberof ModLtiUpdateToolTypeRequest
     */
    Name?: string;
    /**
     * Tool type state
     * @type {number}
     * @memberof ModLtiUpdateToolTypeRequest
     */
    State?: number;
}

/**
 * Check if a given object implements the ModLtiUpdateToolTypeRequest interface.
 */
export function instanceOfModLtiUpdateToolTypeRequest(value: object): boolean {
    if (!('Id' in value)) return false;
    return true;
}

export function ModLtiUpdateToolTypeRequestFromJSON(json: any): ModLtiUpdateToolTypeRequest {
    return ModLtiUpdateToolTypeRequestFromJSONTyped(json, false);
}

export function ModLtiUpdateToolTypeRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiUpdateToolTypeRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Id': json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'State': json['state'] == null ? undefined : json['state'],
    };
}

export function ModLtiUpdateToolTypeRequestToJSON(value?: ModLtiUpdateToolTypeRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'id': value['Id'],
        'name': value['Name'],
        'state': value['State'],
    };
}

