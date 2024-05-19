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
 * @interface ModForumSetPinState200ResponseUserstate
 */
export interface ModForumSetPinState200ResponseUserstate {
    /**
     * favourited
     * @type {boolean}
     * @memberof ModForumSetPinState200ResponseUserstate
     */
    Favourited: boolean;
    /**
     * subscribed
     * @type {boolean}
     * @memberof ModForumSetPinState200ResponseUserstate
     */
    Subscribed: boolean;
}

/**
 * Check if a given object implements the ModForumSetPinState200ResponseUserstate interface.
 */
export function instanceOfModForumSetPinState200ResponseUserstate(value: object): boolean {
    if (!('Favourited' in value)) return false;
    if (!('Subscribed' in value)) return false;
    return true;
}

export function ModForumSetPinState200ResponseUserstateFromJSON(json: any): ModForumSetPinState200ResponseUserstate {
    return ModForumSetPinState200ResponseUserstateFromJSONTyped(json, false);
}

export function ModForumSetPinState200ResponseUserstateFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumSetPinState200ResponseUserstate {
    if (json == null) {
        return json;
    }
    return {
        
        'Favourited': json['favourited'],
        'Subscribed': json['subscribed'],
    };
}

export function ModForumSetPinState200ResponseUserstateToJSON(value?: ModForumSetPinState200ResponseUserstate | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'favourited': value['Favourited'],
        'subscribed': value['Subscribed'],
    };
}
