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
 * @interface ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner
 */
export interface ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner {
    /**
     * Name of option.
     * @type {string}
     * @memberof ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner
     */
    name?: string;
    /**
     * Value of option.
     * @type {string}
     * @memberof ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner interface.
 */
export function instanceOfModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner(value: object): boolean {
    return true;
}

export function ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInnerFromJSON(json: any): ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner {
    return ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInnerFromJSONTyped(json, false);
}

export function ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInnerToJSON(value?: ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}
