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
import type { CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner } from './CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';
import {
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON,
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSONTyped,
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON,
} from './CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';

/**
 * 
 * @export
 * @interface ModDataGetEntries200ResponseEntriesInnerContentsInner
 */
export interface ModDataGetEntries200ResponseEntriesInnerContentsInner {
    /**
     * Contents.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Content?: string;
    /**
     * Contents.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Content1?: string;
    /**
     * Contents.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Content2?: string;
    /**
     * Contents.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Content3?: string;
    /**
     * Contents.
     * @type {string}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Content4?: string;
    /**
     * The field type of the content.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Fieldid?: number;
    /**
     * 
     * @type {Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Files?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
     * Content id.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Id?: number;
    /**
     * The record this content belongs to.
     * @type {number}
     * @memberof ModDataGetEntries200ResponseEntriesInnerContentsInner
     */
    Recordid?: number;
}

/**
 * Check if a given object implements the ModDataGetEntries200ResponseEntriesInnerContentsInner interface.
 */
export function instanceOfModDataGetEntries200ResponseEntriesInnerContentsInner(value: object): boolean {
    return true;
}

export function ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSON(json: any): ModDataGetEntries200ResponseEntriesInnerContentsInner {
    return ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSONTyped(json, false);
}

export function ModDataGetEntries200ResponseEntriesInnerContentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataGetEntries200ResponseEntriesInnerContentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Content': json['content'] == null ? undefined : json['content'],
        'Content1': json['content1'] == null ? undefined : json['content1'],
        'Content2': json['content2'] == null ? undefined : json['content2'],
        'Content3': json['content3'] == null ? undefined : json['content3'],
        'Content4': json['content4'] == null ? undefined : json['content4'],
        'Fieldid': json['fieldid'] == null ? undefined : json['fieldid'],
        'Files': json['files'] == null ? undefined : ((json['files'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON)),
        'Id': json['id'] == null ? undefined : json['id'],
        'Recordid': json['recordid'] == null ? undefined : json['recordid'],
    };
}

export function ModDataGetEntries200ResponseEntriesInnerContentsInnerToJSON(value?: ModDataGetEntries200ResponseEntriesInnerContentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['Content'],
        'content1': value['Content1'],
        'content2': value['Content2'],
        'content3': value['Content3'],
        'content4': value['Content4'],
        'fieldid': value['Fieldid'],
        'files': value['Files'] == null ? undefined : ((value['Files'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON)),
        'id': value['Id'],
        'recordid': value['Recordid'],
    };
}
