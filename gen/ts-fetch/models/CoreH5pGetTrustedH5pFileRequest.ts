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
 * @interface CoreH5pGetTrustedH5pFileRequest
 */
export interface CoreH5pGetTrustedH5pFileRequest {
    /**
     * The copyright option
     * @type {number}
     * @memberof CoreH5pGetTrustedH5pFileRequest
     */
    copyright?: number;
    /**
     * The embed allow to copy the code to your site
     * @type {number}
     * @memberof CoreH5pGetTrustedH5pFileRequest
     */
    embed?: number;
    /**
     * The export allow to download the package
     * @type {number}
     * @memberof CoreH5pGetTrustedH5pFileRequest
     */
    _export?: number;
    /**
     * The frame allow to show the bar options below the content
     * @type {number}
     * @memberof CoreH5pGetTrustedH5pFileRequest
     */
    frame?: number;
    /**
     * H5P file url.
     * @type {string}
     * @memberof CoreH5pGetTrustedH5pFileRequest
     */
    url: string;
}

/**
 * Check if a given object implements the CoreH5pGetTrustedH5pFileRequest interface.
 */
export function instanceOfCoreH5pGetTrustedH5pFileRequest(value: object): boolean {
    if (!('url' in value)) return false;
    return true;
}

export function CoreH5pGetTrustedH5pFileRequestFromJSON(json: any): CoreH5pGetTrustedH5pFileRequest {
    return CoreH5pGetTrustedH5pFileRequestFromJSONTyped(json, false);
}

export function CoreH5pGetTrustedH5pFileRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreH5pGetTrustedH5pFileRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'copyright': json['copyright'] == null ? undefined : json['copyright'],
        'embed': json['embed'] == null ? undefined : json['embed'],
        '_export': json['export'] == null ? undefined : json['export'],
        'frame': json['frame'] == null ? undefined : json['frame'],
        'url': json['url'],
    };
}

export function CoreH5pGetTrustedH5pFileRequestToJSON(value?: CoreH5pGetTrustedH5pFileRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'copyright': value['copyright'],
        'embed': value['embed'],
        'export': value['_export'],
        'frame': value['frame'],
        'url': value['url'],
    };
}
