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
 * @interface CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
 */
export interface CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner {
    /**
     * File name.
     * @type {string}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Filename?: string;
    /**
     * File path.
     * @type {string}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Filepath?: string;
    /**
     * File size.
     * @type {number}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Filesize?: number;
    /**
     * Downloadable file url.
     * @type {string}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Fileurl?: string;
    /**
     * Whether is an external file.
     * @type {boolean}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Isexternalfile?: boolean;
    /**
     * File mime type.
     * @type {string}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Mimetype?: string;
    /**
     * The repository type for external files.
     * @type {string}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Repositorytype?: string;
    /**
     * Time modified.
     * @type {number}
     * @memberof CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner
     */
    Timemodified?: number;
}

/**
 * Check if a given object implements the CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner interface.
 */
export function instanceOfCoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner(value: object): boolean {
    return true;
}

export function CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON(json: any): CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner {
    return CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped(json, false);
}

export function CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Filename': json['filename'] == null ? undefined : json['filename'],
        'Filepath': json['filepath'] == null ? undefined : json['filepath'],
        'Filesize': json['filesize'] == null ? undefined : json['filesize'],
        'Fileurl': json['fileurl'] == null ? undefined : json['fileurl'],
        'Isexternalfile': json['isexternalfile'] == null ? undefined : json['isexternalfile'],
        'Mimetype': json['mimetype'] == null ? undefined : json['mimetype'],
        'Repositorytype': json['repositorytype'] == null ? undefined : json['repositorytype'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
    };
}

export function CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInnerToJSON(value?: CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'filename': value['Filename'],
        'filepath': value['Filepath'],
        'filesize': value['Filesize'],
        'fileurl': value['Fileurl'],
        'isexternalfile': value['Isexternalfile'],
        'mimetype': value['Mimetype'],
        'repositorytype': value['Repositorytype'],
        'timemodified': value['Timemodified'],
    };
}
