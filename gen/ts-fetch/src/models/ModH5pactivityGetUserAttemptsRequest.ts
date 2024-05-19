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
 * @interface ModH5pactivityGetUserAttemptsRequest
 */
export interface ModH5pactivityGetUserAttemptsRequest {
    /**
     * Users whose first name starts with $firstinitial
     * @type {string}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    Firstinitial?: string;
    /**
     * h5p activity instance id
     * @type {number}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    H5pactivityid: number;
    /**
     * Users whose last name starts with $lastinitial
     * @type {string}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    Lastinitial?: string;
    /**
     * current page
     * @type {number}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    Page?: number;
    /**
     * items per page
     * @type {number}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    Perpage?: number;
    /**
     * sort by either user id, firstname or lastname (with optional asc/desc)
     * @type {string}
     * @memberof ModH5pactivityGetUserAttemptsRequest
     */
    Sortorder?: string;
}

/**
 * Check if a given object implements the ModH5pactivityGetUserAttemptsRequest interface.
 */
export function instanceOfModH5pactivityGetUserAttemptsRequest(value: object): boolean {
    if (!('H5pactivityid' in value)) return false;
    return true;
}

export function ModH5pactivityGetUserAttemptsRequestFromJSON(json: any): ModH5pactivityGetUserAttemptsRequest {
    return ModH5pactivityGetUserAttemptsRequestFromJSONTyped(json, false);
}

export function ModH5pactivityGetUserAttemptsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetUserAttemptsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Firstinitial': json['firstinitial'] == null ? undefined : json['firstinitial'],
        'H5pactivityid': json['h5pactivityid'],
        'Lastinitial': json['lastinitial'] == null ? undefined : json['lastinitial'],
        'Page': json['page'] == null ? undefined : json['page'],
        'Perpage': json['perpage'] == null ? undefined : json['perpage'],
        'Sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function ModH5pactivityGetUserAttemptsRequestToJSON(value?: ModH5pactivityGetUserAttemptsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'firstinitial': value['Firstinitial'],
        'h5pactivityid': value['H5pactivityid'],
        'lastinitial': value['Lastinitial'],
        'page': value['Page'],
        'perpage': value['Perpage'],
        'sortorder': value['Sortorder'],
    };
}

