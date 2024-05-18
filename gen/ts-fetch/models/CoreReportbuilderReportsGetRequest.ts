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
 * @interface CoreReportbuilderReportsGetRequest
 */
export interface CoreReportbuilderReportsGetRequest {
    /**
     * Whether editing mode is enabled
     * @type {boolean}
     * @memberof CoreReportbuilderReportsGetRequest
     */
    editmode?: boolean;
    /**
     * Page size
     * @type {number}
     * @memberof CoreReportbuilderReportsGetRequest
     */
    pagesize?: number;
    /**
     * Report ID
     * @type {number}
     * @memberof CoreReportbuilderReportsGetRequest
     */
    reportid: number;
}

/**
 * Check if a given object implements the CoreReportbuilderReportsGetRequest interface.
 */
export function instanceOfCoreReportbuilderReportsGetRequest(value: object): boolean {
    if (!('reportid' in value)) return false;
    return true;
}

export function CoreReportbuilderReportsGetRequestFromJSON(json: any): CoreReportbuilderReportsGetRequest {
    return CoreReportbuilderReportsGetRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderReportsGetRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderReportsGetRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'editmode': json['editmode'] == null ? undefined : json['editmode'],
        'pagesize': json['pagesize'] == null ? undefined : json['pagesize'],
        'reportid': json['reportid'],
    };
}

export function CoreReportbuilderReportsGetRequestToJSON(value?: CoreReportbuilderReportsGetRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'editmode': value['editmode'],
        'pagesize': value['pagesize'],
        'reportid': value['reportid'],
    };
}
