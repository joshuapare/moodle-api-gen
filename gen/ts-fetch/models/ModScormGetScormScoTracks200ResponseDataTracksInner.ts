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
 * Tracks data
 * @export
 * @interface ModScormGetScormScoTracks200ResponseDataTracksInner
 */
export interface ModScormGetScormScoTracks200ResponseDataTracksInner {
    /**
     * Element name
     * @type {string}
     * @memberof ModScormGetScormScoTracks200ResponseDataTracksInner
     */
    element?: string;
    /**
     * Element value
     * @type {string}
     * @memberof ModScormGetScormScoTracks200ResponseDataTracksInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModScormGetScormScoTracks200ResponseDataTracksInner interface.
 */
export function instanceOfModScormGetScormScoTracks200ResponseDataTracksInner(value: object): boolean {
    return true;
}

export function ModScormGetScormScoTracks200ResponseDataTracksInnerFromJSON(json: any): ModScormGetScormScoTracks200ResponseDataTracksInner {
    return ModScormGetScormScoTracks200ResponseDataTracksInnerFromJSONTyped(json, false);
}

export function ModScormGetScormScoTracks200ResponseDataTracksInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormScoTracks200ResponseDataTracksInner {
    if (json == null) {
        return json;
    }
    return {
        
        'element': json['element'] == null ? undefined : json['element'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModScormGetScormScoTracks200ResponseDataTracksInnerToJSON(value?: ModScormGetScormScoTracks200ResponseDataTracksInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'element': value['element'],
        'value': value['value'],
    };
}
