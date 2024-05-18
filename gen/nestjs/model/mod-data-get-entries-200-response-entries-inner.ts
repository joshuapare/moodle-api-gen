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
import { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './mod-data-get-entries200-response-entries-inner-tags-inner';
import { ModDataGetEntries200ResponseEntriesInnerContentsInner } from './mod-data-get-entries200-response-entries-inner-contents-inner';


export interface ModDataGetEntries200ResponseEntriesInner { 
    /**
     * Whether the entry has been approved (if the database is configured in that way).
     */
    Approved?: boolean;
    /**
     * Whether the current user can manage this entry
     */
    Canmanageentry?: boolean;
    Contents?: Array<ModDataGetEntries200ResponseEntriesInnerContentsInner>;
    /**
     * The database id this record belongs to.
     */
    Dataid?: number;
    /**
     * The user who created the entry fullname.
     */
    Fullname?: string;
    /**
     * The group id this record belongs to (0 for no groups).
     */
    Groupid?: number;
    /**
     * Record id.
     */
    Id?: number;
    Tags?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
     * Time the record was created.
     */
    Timecreated?: number;
    /**
     * Last time the record was modified.
     */
    Timemodified?: number;
    /**
     * The id of the user who created the record.
     */
    Userid?: number;
}

