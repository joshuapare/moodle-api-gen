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
import type { ModForumSetSubscriptionState200ResponseCapabilities } from './ModForumSetSubscriptionState200ResponseCapabilities';
import {
    ModForumSetSubscriptionState200ResponseCapabilitiesFromJSON,
    ModForumSetSubscriptionState200ResponseCapabilitiesFromJSONTyped,
    ModForumSetSubscriptionState200ResponseCapabilitiesToJSON,
} from './ModForumSetSubscriptionState200ResponseCapabilities';
import type { ModForumSetSubscriptionState200ResponseGroup } from './ModForumSetSubscriptionState200ResponseGroup';
import {
    ModForumSetSubscriptionState200ResponseGroupFromJSON,
    ModForumSetSubscriptionState200ResponseGroupFromJSONTyped,
    ModForumSetSubscriptionState200ResponseGroupToJSON,
} from './ModForumSetSubscriptionState200ResponseGroup';
import type { ModForumSetSubscriptionState200ResponseTimed } from './ModForumSetSubscriptionState200ResponseTimed';
import {
    ModForumSetSubscriptionState200ResponseTimedFromJSON,
    ModForumSetSubscriptionState200ResponseTimedFromJSONTyped,
    ModForumSetSubscriptionState200ResponseTimedToJSON,
} from './ModForumSetSubscriptionState200ResponseTimed';
import type { ModForumSetSubscriptionState200ResponseTimes } from './ModForumSetSubscriptionState200ResponseTimes';
import {
    ModForumSetSubscriptionState200ResponseTimesFromJSON,
    ModForumSetSubscriptionState200ResponseTimesFromJSONTyped,
    ModForumSetSubscriptionState200ResponseTimesToJSON,
} from './ModForumSetSubscriptionState200ResponseTimes';
import type { ModForumSetSubscriptionState200ResponseUrls } from './ModForumSetSubscriptionState200ResponseUrls';
import {
    ModForumSetSubscriptionState200ResponseUrlsFromJSON,
    ModForumSetSubscriptionState200ResponseUrlsFromJSONTyped,
    ModForumSetSubscriptionState200ResponseUrlsToJSON,
} from './ModForumSetSubscriptionState200ResponseUrls';
import type { ModForumSetSubscriptionState200ResponseUserstate } from './ModForumSetSubscriptionState200ResponseUserstate';
import {
    ModForumSetSubscriptionState200ResponseUserstateFromJSON,
    ModForumSetSubscriptionState200ResponseUserstateFromJSONTyped,
    ModForumSetSubscriptionState200ResponseUserstateToJSON,
} from './ModForumSetSubscriptionState200ResponseUserstate';

/**
 * 
 * @export
 * @interface ModForumSetSubscriptionState200Response
 */
export interface ModForumSetSubscriptionState200Response {
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseCapabilities}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Capabilities: ModForumSetSubscriptionState200ResponseCapabilities;
    /**
     * firstpostid
     * @type {number}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Firstpostid: number;
    /**
     * forumid
     * @type {number}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Forumid: number;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseGroup}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Group?: ModForumSetSubscriptionState200ResponseGroup;
    /**
     * id
     * @type {number}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Id: number;
    /**
     * istimelocked
     * @type {boolean}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Istimelocked: boolean;
    /**
     * locked
     * @type {boolean}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Locked: boolean;
    /**
     * name
     * @type {string}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Name: string;
    /**
     * pinned
     * @type {boolean}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Pinned: boolean;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseTimed}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Timed: ModForumSetSubscriptionState200ResponseTimed;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseTimes}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Times: ModForumSetSubscriptionState200ResponseTimes;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseUrls}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Urls: ModForumSetSubscriptionState200ResponseUrls;
    /**
     * 
     * @type {ModForumSetSubscriptionState200ResponseUserstate}
     * @memberof ModForumSetSubscriptionState200Response
     */
    Userstate: ModForumSetSubscriptionState200ResponseUserstate;
}

/**
 * Check if a given object implements the ModForumSetSubscriptionState200Response interface.
 */
export function instanceOfModForumSetSubscriptionState200Response(value: object): boolean {
    if (!('Capabilities' in value)) return false;
    if (!('Firstpostid' in value)) return false;
    if (!('Forumid' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Istimelocked' in value)) return false;
    if (!('Locked' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Pinned' in value)) return false;
    if (!('Timed' in value)) return false;
    if (!('Times' in value)) return false;
    if (!('Urls' in value)) return false;
    if (!('Userstate' in value)) return false;
    return true;
}

export function ModForumSetSubscriptionState200ResponseFromJSON(json: any): ModForumSetSubscriptionState200Response {
    return ModForumSetSubscriptionState200ResponseFromJSONTyped(json, false);
}

export function ModForumSetSubscriptionState200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumSetSubscriptionState200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Capabilities': ModForumSetSubscriptionState200ResponseCapabilitiesFromJSON(json['capabilities']),
        'Firstpostid': json['firstpostid'],
        'Forumid': json['forumid'],
        'Group': json['group'] == null ? undefined : ModForumSetSubscriptionState200ResponseGroupFromJSON(json['group']),
        'Id': json['id'],
        'Istimelocked': json['istimelocked'],
        'Locked': json['locked'],
        'Name': json['name'],
        'Pinned': json['pinned'],
        'Timed': ModForumSetSubscriptionState200ResponseTimedFromJSON(json['timed']),
        'Times': ModForumSetSubscriptionState200ResponseTimesFromJSON(json['times']),
        'Urls': ModForumSetSubscriptionState200ResponseUrlsFromJSON(json['urls']),
        'Userstate': ModForumSetSubscriptionState200ResponseUserstateFromJSON(json['userstate']),
    };
}

export function ModForumSetSubscriptionState200ResponseToJSON(value?: ModForumSetSubscriptionState200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capabilities': ModForumSetSubscriptionState200ResponseCapabilitiesToJSON(value['Capabilities']),
        'firstpostid': value['Firstpostid'],
        'forumid': value['Forumid'],
        'group': ModForumSetSubscriptionState200ResponseGroupToJSON(value['Group']),
        'id': value['Id'],
        'istimelocked': value['Istimelocked'],
        'locked': value['Locked'],
        'name': value['Name'],
        'pinned': value['Pinned'],
        'timed': ModForumSetSubscriptionState200ResponseTimedToJSON(value['Timed']),
        'times': ModForumSetSubscriptionState200ResponseTimesToJSON(value['Times']),
        'urls': ModForumSetSubscriptionState200ResponseUrlsToJSON(value['Urls']),
        'userstate': ModForumSetSubscriptionState200ResponseUserstateToJSON(value['Userstate']),
    };
}

