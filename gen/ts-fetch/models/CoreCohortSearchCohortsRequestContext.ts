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
 * @interface CoreCohortSearchCohortsRequestContext
 */
export interface CoreCohortSearchCohortsRequestContext {
    /**
     * Context ID. Either use this value, or level and instanceid.
     * @type {number}
     * @memberof CoreCohortSearchCohortsRequestContext
     */
    contextid?: number;
    /**
     * Context level. To be used with instanceid.
     * @type {string}
     * @memberof CoreCohortSearchCohortsRequestContext
     */
    contextlevel?: string;
    /**
     * Context instance ID. To be used with level
     * @type {number}
     * @memberof CoreCohortSearchCohortsRequestContext
     */
    instanceid?: number;
}

/**
 * Check if a given object implements the CoreCohortSearchCohortsRequestContext interface.
 */
export function instanceOfCoreCohortSearchCohortsRequestContext(value: object): boolean {
    return true;
}

export function CoreCohortSearchCohortsRequestContextFromJSON(json: any): CoreCohortSearchCohortsRequestContext {
    return CoreCohortSearchCohortsRequestContextFromJSONTyped(json, false);
}

export function CoreCohortSearchCohortsRequestContextFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortSearchCohortsRequestContext {
    if (json == null) {
        return json;
    }
    return {
        
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'instanceid': json['instanceid'] == null ? undefined : json['instanceid'],
    };
}

export function CoreCohortSearchCohortsRequestContextToJSON(value?: CoreCohortSearchCohortsRequestContext | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contextid': value['contextid'],
        'contextlevel': value['contextlevel'],
        'instanceid': value['instanceid'],
    };
}

