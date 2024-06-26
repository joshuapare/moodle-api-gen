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
 * @interface ModLtiGetToolTypesAndProxiesCountRequest
 */
export interface ModLtiGetToolTypesAndProxiesCountRequest {
    /**
     * Orphaned tool types only
     * @type {boolean}
     * @memberof ModLtiGetToolTypesAndProxiesCountRequest
     */
    orphanedonly?: boolean;
    /**
     * Tool proxy id
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxiesCountRequest
     */
    toolproxyid?: number;
}

/**
 * Check if a given object implements the ModLtiGetToolTypesAndProxiesCountRequest interface.
 */
export function instanceOfModLtiGetToolTypesAndProxiesCountRequest(value: object): boolean {
    return true;
}

export function ModLtiGetToolTypesAndProxiesCountRequestFromJSON(json: any): ModLtiGetToolTypesAndProxiesCountRequest {
    return ModLtiGetToolTypesAndProxiesCountRequestFromJSONTyped(json, false);
}

export function ModLtiGetToolTypesAndProxiesCountRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiGetToolTypesAndProxiesCountRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'orphanedonly': json['orphanedonly'] == null ? undefined : json['orphanedonly'],
        'toolproxyid': json['toolproxyid'] == null ? undefined : json['toolproxyid'],
    };
}

export function ModLtiGetToolTypesAndProxiesCountRequestToJSON(value?: ModLtiGetToolTypesAndProxiesCountRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'orphanedonly': value['orphanedonly'],
        'toolproxyid': value['toolproxyid'],
    };
}

