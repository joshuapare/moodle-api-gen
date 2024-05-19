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
import type { ModDataGetEntries200ResponseEntriesInnerContentsInner } from './ModDataGetEntries200ResponseEntriesInnerContentsInner';
import {
    ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSON,
    ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSONTyped,
    ModDataGetEntries200ResponseEntriesInnerContentsInnerToJSON,
} from './ModDataGetEntries200ResponseEntriesInnerContentsInner';
import type { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './ModDataGetEntries200ResponseEntriesInnerTagsInner';
import {
    ModDataGetEntries200ResponseEntriesInnerTagsInnerFromJSON,
    ModDataGetEntries200ResponseEntriesInnerTagsInnerFromJSONTyped,
    ModDataGetEntries200ResponseEntriesInnerTagsInnerToJSON,
} from './ModDataGetEntries200ResponseEntriesInnerTagsInner';

/**
 * 
 * @export
 * @interface ModDataGetEntries200ResponseEntriesInner
 */
export interface ModDataGetEntries200ResponseEntriesInner {
    /**
     * Whether the entry has been approved (if the database is configured in that way).
     * @type {boolean}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Approved?: boolean;
    /**
     * Whether the current user can manage this entry
     * @type {boolean}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Canmanageentry?: boolean;
    /**
     * 
     * @type {Array<ModDataGetEntries200ResponseEntriesInnerContentsInner>}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Contents?: Array<ModDataGetEntries200ResponseEntriesInnerContentsInner>;
    /**
     * The database id this record belongs to.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Dataid?: number;
    /**
     * The user who created the entry fullname.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Fullname?: string;
    /**
     * The group id this record belongs to (0 for no groups).
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Groupid?: number;
    /**
     * Record id.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Id?: number;
    /**
     * 
     * @type {Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Tags?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
     * Time the record was created.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Timecreated?: number;
    /**
     * Last time the record was modified.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Timemodified?: number;
    /**
     * The id of the user who created the record.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModDataGetEntries200ResponseEntriesInner interface.
 */
export function instanceOfModDataGetEntries200ResponseEntriesInner(value: object): boolean {
    return true;
}

export function ModDataGetEntries200ResponseEntriesInnerFromJSON(json: any): ModDataGetEntries200ResponseEntriesInner {
    return ModDataGetEntries200ResponseEntriesInnerFromJSONTyped(json, false);
}

export function ModDataGetEntries200ResponseEntriesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataGetEntries200ResponseEntriesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Approved': json['approved'] == null ? undefined : json['approved'],
        'Canmanageentry': json['canmanageentry'] == null ? undefined : json['canmanageentry'],
        'Contents': json['contents'] == null ? undefined : ((json['contents'] as Array<any>).map(ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSON)),
        'Dataid': json['dataid'] == null ? undefined : json['dataid'],
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Tags': json['tags'] == null ? undefined : ((json['tags'] as Array<any>).map(ModDataGetEntries200ResponseEntriesInnerTagsInnerFromJSON)),
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModDataGetEntries200ResponseEntriesInnerToJSON(value?: ModDataGetEntries200ResponseEntriesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'approved': value['Approved'],
        'canmanageentry': value['Canmanageentry'],
        'contents': value['Contents'] == null ? undefined : ((value['Contents'] as Array<any>).map(ModDataGetEntries200ResponseEntriesInnerContentsInnerToJSON)),
        'dataid': value['Dataid'],
        'fullname': value['Fullname'],
        'groupid': value['Groupid'],
        'id': value['Id'],
        'tags': value['Tags'] == null ? undefined : ((value['Tags'] as Array<any>).map(ModDataGetEntries200ResponseEntriesInnerTagsInnerToJSON)),
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

