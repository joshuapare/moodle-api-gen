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
 * @interface CoreFilesUploadRequest
 */
export interface CoreFilesUploadRequest {
    /**
     * component
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Component: string;
    /**
     * context id
     * @type {number}
     * @memberof CoreFilesUploadRequest
     */
    Contextid?: number;
    /**
     * The context level to put the file in,
     *                         (block, course, coursecat, system, user, module)
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Contextlevel?: string;
    /**
     * file area
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Filearea: string;
    /**
     * file content
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Filecontent: string;
    /**
     * file name
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Filename: string;
    /**
     * file path
     * @type {string}
     * @memberof CoreFilesUploadRequest
     */
    Filepath: string;
    /**
     * The Instance id of item associated
     *                          with the context level
     * @type {number}
     * @memberof CoreFilesUploadRequest
     */
    Instanceid?: number;
    /**
     * associated id
     * @type {number}
     * @memberof CoreFilesUploadRequest
     */
    Itemid: number;
}

/**
 * Check if a given object implements the CoreFilesUploadRequest interface.
 */
export function instanceOfCoreFilesUploadRequest(value: object): boolean {
    if (!('Component' in value)) return false;
    if (!('Filearea' in value)) return false;
    if (!('Filecontent' in value)) return false;
    if (!('Filename' in value)) return false;
    if (!('Filepath' in value)) return false;
    if (!('Itemid' in value)) return false;
    return true;
}

export function CoreFilesUploadRequestFromJSON(json: any): CoreFilesUploadRequest {
    return CoreFilesUploadRequestFromJSONTyped(json, false);
}

export function CoreFilesUploadRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFilesUploadRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'],
        'Contextid': json['contextid'] == null ? undefined : json['contextid'],
        'Contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'Filearea': json['filearea'],
        'Filecontent': json['filecontent'],
        'Filename': json['filename'],
        'Filepath': json['filepath'],
        'Instanceid': json['instanceid'] == null ? undefined : json['instanceid'],
        'Itemid': json['itemid'],
    };
}

export function CoreFilesUploadRequestToJSON(value?: CoreFilesUploadRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'contextid': value['Contextid'],
        'contextlevel': value['Contextlevel'],
        'filearea': value['Filearea'],
        'filecontent': value['Filecontent'],
        'filename': value['Filename'],
        'filepath': value['Filepath'],
        'instanceid': value['Instanceid'],
        'itemid': value['Itemid'],
    };
}

