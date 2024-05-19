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
 * @interface CoreFilesGetFiles200ResponseParentsInner
 */
export interface CoreFilesGetFiles200ResponseParentsInner {
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Component?: string;
    /**
     * 
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Contextid?: number;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Filearea?: string;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Filename?: string;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Filepath?: string;
    /**
     * 
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseParentsInner
     */
    Itemid?: number;
}

/**
 * Check if a given object implements the CoreFilesGetFiles200ResponseParentsInner interface.
 */
export function instanceOfCoreFilesGetFiles200ResponseParentsInner(value: object): boolean {
    return true;
}

export function CoreFilesGetFiles200ResponseParentsInnerFromJSON(json: any): CoreFilesGetFiles200ResponseParentsInner {
    return CoreFilesGetFiles200ResponseParentsInnerFromJSONTyped(json, false);
}

export function CoreFilesGetFiles200ResponseParentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFilesGetFiles200ResponseParentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'] == null ? undefined : json['component'],
        'Contextid': json['contextid'] == null ? undefined : json['contextid'],
        'Filearea': json['filearea'] == null ? undefined : json['filearea'],
        'Filename': json['filename'] == null ? undefined : json['filename'],
        'Filepath': json['filepath'] == null ? undefined : json['filepath'],
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
    };
}

export function CoreFilesGetFiles200ResponseParentsInnerToJSON(value?: CoreFilesGetFiles200ResponseParentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'contextid': value['Contextid'],
        'filearea': value['Filearea'],
        'filename': value['Filename'],
        'filepath': value['Filepath'],
        'itemid': value['Itemid'],
    };
}
