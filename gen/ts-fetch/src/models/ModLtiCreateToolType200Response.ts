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
import type { ModLtiCreateToolType200ResponseState } from './ModLtiCreateToolType200ResponseState';
import {
    ModLtiCreateToolType200ResponseStateFromJSON,
    ModLtiCreateToolType200ResponseStateFromJSONTyped,
    ModLtiCreateToolType200ResponseStateToJSON,
} from './ModLtiCreateToolType200ResponseState';
import type { ModLtiCreateToolType200ResponseUrls } from './ModLtiCreateToolType200ResponseUrls';
import {
    ModLtiCreateToolType200ResponseUrlsFromJSON,
    ModLtiCreateToolType200ResponseUrlsFromJSONTyped,
    ModLtiCreateToolType200ResponseUrlsToJSON,
} from './ModLtiCreateToolType200ResponseUrls';

/**
 * 
 * @export
 * @interface ModLtiCreateToolType200Response
 */
export interface ModLtiCreateToolType200Response {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLtiCreateToolType200Response
     */
    Capabilitygroups?: Array<object>;
    /**
     * Client ID
     * @type {string}
     * @memberof ModLtiCreateToolType200Response
     */
    Clientid: string;
    /**
     * Tool type course
     * @type {number}
     * @memberof ModLtiCreateToolType200Response
     */
    Courseid?: number;
    /**
     * Deployment ID
     * @type {number}
     * @memberof ModLtiCreateToolType200Response
     */
    Deploymentid: number;
    /**
     * Tool type description
     * @type {string}
     * @memberof ModLtiCreateToolType200Response
     */
    Description: string;
    /**
     * Indicate if capabilitygroups is populated
     * @type {boolean}
     * @memberof ModLtiCreateToolType200Response
     */
    Hascapabilitygroups: boolean;
    /**
     * Tool type id
     * @type {number}
     * @memberof ModLtiCreateToolType200Response
     */
    Id: number;
    /**
     * The number of times this tool is being used
     * @type {number}
     * @memberof ModLtiCreateToolType200Response
     */
    Instancecount: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLtiCreateToolType200Response
     */
    Instanceids?: Array<object>;
    /**
     * Tool type name
     * @type {string}
     * @memberof ModLtiCreateToolType200Response
     */
    Name: string;
    /**
     * Platform ID
     * @type {string}
     * @memberof ModLtiCreateToolType200Response
     */
    Platformid: string;
    /**
     * 
     * @type {ModLtiCreateToolType200ResponseState}
     * @memberof ModLtiCreateToolType200Response
     */
    State: ModLtiCreateToolType200ResponseState;
    /**
     * 
     * @type {ModLtiCreateToolType200ResponseUrls}
     * @memberof ModLtiCreateToolType200Response
     */
    Urls: ModLtiCreateToolType200ResponseUrls;
}

/**
 * Check if a given object implements the ModLtiCreateToolType200Response interface.
 */
export function instanceOfModLtiCreateToolType200Response(value: object): boolean {
    if (!('Clientid' in value)) return false;
    if (!('Deploymentid' in value)) return false;
    if (!('Description' in value)) return false;
    if (!('Hascapabilitygroups' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Instancecount' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Platformid' in value)) return false;
    if (!('State' in value)) return false;
    if (!('Urls' in value)) return false;
    return true;
}

export function ModLtiCreateToolType200ResponseFromJSON(json: any): ModLtiCreateToolType200Response {
    return ModLtiCreateToolType200ResponseFromJSONTyped(json, false);
}

export function ModLtiCreateToolType200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiCreateToolType200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Capabilitygroups': json['capabilitygroups'] == null ? undefined : json['capabilitygroups'],
        'Clientid': json['clientid'],
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Deploymentid': json['deploymentid'],
        'Description': json['description'],
        'Hascapabilitygroups': json['hascapabilitygroups'],
        'Id': json['id'],
        'Instancecount': json['instancecount'],
        'Instanceids': json['instanceids'] == null ? undefined : json['instanceids'],
        'Name': json['name'],
        'Platformid': json['platformid'],
        'State': ModLtiCreateToolType200ResponseStateFromJSON(json['state']),
        'Urls': ModLtiCreateToolType200ResponseUrlsFromJSON(json['urls']),
    };
}

export function ModLtiCreateToolType200ResponseToJSON(value?: ModLtiCreateToolType200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capabilitygroups': value['Capabilitygroups'],
        'clientid': value['Clientid'],
        'courseid': value['Courseid'],
        'deploymentid': value['Deploymentid'],
        'description': value['Description'],
        'hascapabilitygroups': value['Hascapabilitygroups'],
        'id': value['Id'],
        'instancecount': value['Instancecount'],
        'instanceids': value['Instanceids'],
        'name': value['Name'],
        'platformid': value['Platformid'],
        'state': ModLtiCreateToolType200ResponseStateToJSON(value['State']),
        'urls': ModLtiCreateToolType200ResponseUrlsToJSON(value['Urls']),
    };
}

