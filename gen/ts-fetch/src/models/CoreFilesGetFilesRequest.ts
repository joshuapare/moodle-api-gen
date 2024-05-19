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
 * @interface CoreFilesGetFilesRequest
 */
export interface CoreFilesGetFilesRequest {
    /**
     * component
     * @type {string}
     * @memberof CoreFilesGetFilesRequest
     */
    Component: string;
    /**
     * context id Set to -1 to use contextlevel and instanceid.
     * @type {number}
     * @memberof CoreFilesGetFilesRequest
     */
    Contextid: number;
    /**
     * The context level for the file location.
     * @type {string}
     * @memberof CoreFilesGetFilesRequest
     */
    Contextlevel?: string;
    /**
     * file area
     * @type {string}
     * @memberof CoreFilesGetFilesRequest
     */
    Filearea: string;
    /**
     * file name
     * @type {string}
     * @memberof CoreFilesGetFilesRequest
     */
    Filename: string;
    /**
     * file path
     * @type {string}
     * @memberof CoreFilesGetFilesRequest
     */
    Filepath: string;
    /**
     * The instance id for where the file is located.
     * @type {number}
     * @memberof CoreFilesGetFilesRequest
     */
    Instanceid?: number;
    /**
     * associated id
     * @type {number}
     * @memberof CoreFilesGetFilesRequest
     */
    Itemid: number;
    /**
     * timestamp to return files changed after this time.
     * @type {number}
     * @memberof CoreFilesGetFilesRequest
     */
    Modified?: number;
}

/**
 * Check if a given object implements the CoreFilesGetFilesRequest interface.
 */
export function instanceOfCoreFilesGetFilesRequest(value: object): boolean {
    if (!('Component' in value)) return false;
    if (!('Contextid' in value)) return false;
    if (!('Filearea' in value)) return false;
    if (!('Filename' in value)) return false;
    if (!('Filepath' in value)) return false;
    if (!('Itemid' in value)) return false;
    return true;
}

export function CoreFilesGetFilesRequestFromJSON(json: any): CoreFilesGetFilesRequest {
    return CoreFilesGetFilesRequestFromJSONTyped(json, false);
}

export function CoreFilesGetFilesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFilesGetFilesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'],
        'Contextid': json['contextid'],
        'Contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'Filearea': json['filearea'],
        'Filename': json['filename'],
        'Filepath': json['filepath'],
        'Instanceid': json['instanceid'] == null ? undefined : json['instanceid'],
        'Itemid': json['itemid'],
        'Modified': json['modified'] == null ? undefined : json['modified'],
    };
}

export function CoreFilesGetFilesRequestToJSON(value?: CoreFilesGetFilesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'contextid': value['Contextid'],
        'contextlevel': value['Contextlevel'],
        'filearea': value['Filearea'],
        'filename': value['Filename'],
        'filepath': value['Filepath'],
        'instanceid': value['Instanceid'],
        'itemid': value['Itemid'],
        'modified': value['Modified'],
    };
}
