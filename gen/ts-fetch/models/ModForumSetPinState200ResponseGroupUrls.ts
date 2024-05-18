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
 * @interface ModForumSetPinState200ResponseGroupUrls
 */
export interface ModForumSetPinState200ResponseGroupUrls {
    /**
     * picture
     * @type {string}
     * @memberof ModForumSetPinState200ResponseGroupUrls
     */
    picture?: string;
    /**
     * userlist
     * @type {string}
     * @memberof ModForumSetPinState200ResponseGroupUrls
     */
    userlist?: string;
}

/**
 * Check if a given object implements the ModForumSetPinState200ResponseGroupUrls interface.
 */
export function instanceOfModForumSetPinState200ResponseGroupUrls(value: object): boolean {
    return true;
}

export function ModForumSetPinState200ResponseGroupUrlsFromJSON(json: any): ModForumSetPinState200ResponseGroupUrls {
    return ModForumSetPinState200ResponseGroupUrlsFromJSONTyped(json, false);
}

export function ModForumSetPinState200ResponseGroupUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumSetPinState200ResponseGroupUrls {
    if (json == null) {
        return json;
    }
    return {
        
        'picture': json['picture'] == null ? undefined : json['picture'],
        'userlist': json['userlist'] == null ? undefined : json['userlist'],
    };
}

export function ModForumSetPinState200ResponseGroupUrlsToJSON(value?: ModForumSetPinState200ResponseGroupUrls | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'picture': value['picture'],
        'userlist': value['userlist'],
    };
}

