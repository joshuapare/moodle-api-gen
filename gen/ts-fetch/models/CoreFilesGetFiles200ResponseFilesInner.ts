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
 * @interface CoreFilesGetFiles200ResponseFilesInner
 */
export interface CoreFilesGetFiles200ResponseFilesInner {
    /**
     * File owner
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    author?: string;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    component?: string;
    /**
     * 
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    contextid?: number;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    filearea?: string;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    filename?: string;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    filepath?: string;
    /**
     * File size
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    filesize?: number;
    /**
     * 
     * @type {boolean}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    isdir?: boolean;
    /**
     * 
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    itemid?: number;
    /**
     * File license
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    license?: string;
    /**
     * Time created
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    timecreated?: number;
    /**
     * 
     * @type {number}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    timemodified?: number;
    /**
     * 
     * @type {string}
     * @memberof CoreFilesGetFiles200ResponseFilesInner
     */
    url?: string;
}

/**
 * Check if a given object implements the CoreFilesGetFiles200ResponseFilesInner interface.
 */
export function instanceOfCoreFilesGetFiles200ResponseFilesInner(value: object): boolean {
    return true;
}

export function CoreFilesGetFiles200ResponseFilesInnerFromJSON(json: any): CoreFilesGetFiles200ResponseFilesInner {
    return CoreFilesGetFiles200ResponseFilesInnerFromJSONTyped(json, false);
}

export function CoreFilesGetFiles200ResponseFilesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFilesGetFiles200ResponseFilesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'author': json['author'] == null ? undefined : json['author'],
        'component': json['component'] == null ? undefined : json['component'],
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'filearea': json['filearea'] == null ? undefined : json['filearea'],
        'filename': json['filename'] == null ? undefined : json['filename'],
        'filepath': json['filepath'] == null ? undefined : json['filepath'],
        'filesize': json['filesize'] == null ? undefined : json['filesize'],
        'isdir': json['isdir'] == null ? undefined : json['isdir'],
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'license': json['license'] == null ? undefined : json['license'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'url': json['url'] == null ? undefined : json['url'],
    };
}

export function CoreFilesGetFiles200ResponseFilesInnerToJSON(value?: CoreFilesGetFiles200ResponseFilesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'author': value['author'],
        'component': value['component'],
        'contextid': value['contextid'],
        'filearea': value['filearea'],
        'filename': value['filename'],
        'filepath': value['filepath'],
        'filesize': value['filesize'],
        'isdir': value['isdir'],
        'itemid': value['itemid'],
        'license': value['license'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'url': value['url'],
    };
}

