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
 * @interface ModForumGetDiscussionPost200ResponsePostCapabilities
 */
export interface ModForumGetDiscussionPost200ResponsePostCapabilities {
    /**
     * Whether the user can post a private reply
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    canreplyprivately: boolean;
    /**
     * Whether the user can control the read status of the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    controlreadstatus: boolean;
    /**
     * Whether the user can delete the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    _delete: boolean;
    /**
     * Whether the user can edit the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    edit: boolean;
    /**
     * Whether the user can export the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    _export: boolean;
    /**
     * Whether the user can reply to the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    reply: boolean;
    /**
     * Whether the user can self enrol into the course
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    selfenrol: boolean;
    /**
     * Whether the user can split the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    split: boolean;
    /**
     * Whether the user can view the post
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostCapabilities
     */
    view: boolean;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPost200ResponsePostCapabilities interface.
 */
export function instanceOfModForumGetDiscussionPost200ResponsePostCapabilities(value: object): boolean {
    if (!('canreplyprivately' in value)) return false;
    if (!('controlreadstatus' in value)) return false;
    if (!('_delete' in value)) return false;
    if (!('edit' in value)) return false;
    if (!('_export' in value)) return false;
    if (!('reply' in value)) return false;
    if (!('selfenrol' in value)) return false;
    if (!('split' in value)) return false;
    if (!('view' in value)) return false;
    return true;
}

export function ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSON(json: any): ModForumGetDiscussionPost200ResponsePostCapabilities {
    return ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPost200ResponsePostCapabilities {
    if (json == null) {
        return json;
    }
    return {
        
        'canreplyprivately': json['canreplyprivately'],
        'controlreadstatus': json['controlreadstatus'],
        '_delete': json['delete'],
        'edit': json['edit'],
        '_export': json['export'],
        'reply': json['reply'],
        'selfenrol': json['selfenrol'],
        'split': json['split'],
        'view': json['view'],
    };
}

export function ModForumGetDiscussionPost200ResponsePostCapabilitiesToJSON(value?: ModForumGetDiscussionPost200ResponsePostCapabilities | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canreplyprivately': value['canreplyprivately'],
        'controlreadstatus': value['controlreadstatus'],
        'delete': value['_delete'],
        'edit': value['edit'],
        'export': value['_export'],
        'reply': value['reply'],
        'selfenrol': value['selfenrol'],
        'split': value['split'],
        'view': value['view'],
    };
}

