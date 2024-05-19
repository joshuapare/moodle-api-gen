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
 * File.
 * @export
 * @interface CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
 */
export interface CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
    /**
     * File name.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    filename?: string;
    /**
     * File path.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    filepath?: string;
    /**
     * File size.
     * @type {number}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    filesize?: number;
    /**
     * Downloadable file url.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    fileurl?: string;
    /**
     * Whether is an external file.
     * @type {boolean}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    isexternalfile?: boolean;
    /**
     * File mime type.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    mimetype?: string;
    /**
     * The repository type for external files.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    repositorytype?: string;
    /**
     * Time modified.
     * @type {number}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
     */
    timemodified?: number;
}

/**
 * Check if a given object implements the CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner interface.
 */
export function instanceOfCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner(value: object): boolean {
    return true;
}

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON(json: any): CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
    return CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped(json, false);
}

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner {
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

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON(value?: CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner | null): any {
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

