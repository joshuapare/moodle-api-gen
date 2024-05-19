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

import { RequestFile } from './models';
import { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './modDataGetEntries200ResponseEntriesInnerTagsInner';
import { ModDataGetEntry200ResponseEntryContentsInner } from './modDataGetEntry200ResponseEntryContentsInner';

export class ModDataSearchEntries200ResponseEntriesInner {
    /**
    * Whether the entry has been approved (if the database is configured in that way).
    */
    'approved'?: boolean = 0;
    /**
    * Whether the current user can manage this entry
    */
    'canmanageentry'?: boolean;
    'contents'?: Array<ModDataGetEntry200ResponseEntryContentsInner>;
    /**
    * The database id this record belongs to.
    */
    'dataid'?: number = 0;
    /**
    * The user who created the entry fullname.
    */
    'fullname'?: string;
    /**
    * The group id this record belongs to (0 for no groups).
    */
    'groupid'?: number = 0;
    /**
    * Record id.
    */
    'id'?: number;
    'tags'?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
    * Time the record was created.
    */
    'timecreated'?: number = 0;
    /**
    * Last time the record was modified.
    */
    'timemodified'?: number = 0;
    /**
    * The id of the user who created the record.
    */
    'userid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "approved",
            "baseName": "approved",
            "type": "boolean"
        },
        {
            "name": "canmanageentry",
            "baseName": "canmanageentry",
            "type": "boolean"
        },
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<ModDataGetEntry200ResponseEntryContentsInner>"
        },
        {
            "name": "dataid",
            "baseName": "dataid",
            "type": "number"
        },
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModDataSearchEntries200ResponseEntriesInner.attributeTypeMap;
    }
}

