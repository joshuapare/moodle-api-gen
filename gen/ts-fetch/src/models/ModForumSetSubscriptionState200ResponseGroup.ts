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
import type { ModForumSetSubscriptionState200ResponseGroupUrls } from './ModForumSetSubscriptionState200ResponseGroupUrls';
import {
    ModForumSetSubscriptionState200ResponseGroupUrlsFromJSON,
    ModForumSetSubscriptionState200ResponseGroupUrlsFromJSONTyped,
    ModForumSetSubscriptionState200ResponseGroupUrlsToJSON,
} from './ModForumSetSubscriptionState200ResponseGroupUrls';

/**
 * 
 * @export
 * @interface ModForumSetSubscriptionState200ResponseGroup
 */
export interface ModForumSetSubscriptionState200ResponseGroup {
    /**
     * name
     * @type {string}
     * @memberof ModForumSetSubscriptionState200ResponseGroup
     */
    Name: string;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseGroupUrls}
     * @memberof ModForumSetSubscriptionState200ResponseGroup
     */
    Urls: ModForumSetSubscriptionState200ResponseGroupUrls;
}

/**
 * Check if a given object implements the ModForumSetSubscriptionState200ResponseGroup interface.
 */
export function instanceOfModForumSetSubscriptionState200ResponseGroup(value: object): boolean {
    if (!('Name' in value)) return false;
    if (!('Urls' in value)) return false;
    return true;
}

export function ModForumSetSubscriptionState200ResponseGroupFromJSON(json: any): ModForumSetSubscriptionState200ResponseGroup {
    return ModForumSetSubscriptionState200ResponseGroupFromJSONTyped(json, false);
}

export function ModForumSetSubscriptionState200ResponseGroupFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumSetSubscriptionState200ResponseGroup {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'],
        'Urls': ModForumSetSubscriptionState200ResponseGroupUrlsFromJSON(json['urls']),
    };
}

export function ModForumSetSubscriptionState200ResponseGroupToJSON(value?: ModForumSetSubscriptionState200ResponseGroup | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'urls': ModForumSetSubscriptionState200ResponseGroupUrlsToJSON(value['Urls']),
    };
}

