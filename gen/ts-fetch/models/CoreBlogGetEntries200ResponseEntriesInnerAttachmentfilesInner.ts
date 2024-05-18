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
 * @interface CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
 */
export interface CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner {
    /**
     * File name.
     * @type {string}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    filename?: string;
    /**
     * File path.
     * @type {string}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    filepath?: string;
    /**
     * File size.
     * @type {number}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    filesize?: number;
    /**
     * Downloadable file url.
     * @type {string}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    fileurl?: string;
    /**
     * Whether is an external file.
     * @type {boolean}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    isexternalfile?: boolean;
    /**
     * File mime type.
     * @type {string}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    mimetype?: string;
    /**
     * The repository type for the external files.
     * @type {string}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    repositorytype?: string;
    /**
     * Time modified.
     * @type {number}
     * @memberof CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner
     */
    timemodified?: number;
}

/**
 * Check if a given object implements the CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner interface.
 */
export function instanceOfCoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner(value: object): boolean {
    return true;
}

export function CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInnerFromJSON(json: any): CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner {
    return CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInnerFromJSONTyped(json, false);
}

export function CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'filename': json['filename'] == null ? undefined : json['filename'],
        'filepath': json['filepath'] == null ? undefined : json['filepath'],
        'filesize': json['filesize'] == null ? undefined : json['filesize'],
        'fileurl': json['fileurl'] == null ? undefined : json['fileurl'],
        'isexternalfile': json['isexternalfile'] == null ? undefined : json['isexternalfile'],
        'mimetype': json['mimetype'] == null ? undefined : json['mimetype'],
        'repositorytype': json['repositorytype'] == null ? undefined : json['repositorytype'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
    };
}

export function CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInnerToJSON(value?: CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'filename': value['filename'],
        'filepath': value['filepath'],
        'filesize': value['filesize'],
        'fileurl': value['fileurl'],
        'isexternalfile': value['isexternalfile'],
        'mimetype': value['mimetype'],
        'repositorytype': value['repositorytype'],
        'timemodified': value['timemodified'],
    };
}
