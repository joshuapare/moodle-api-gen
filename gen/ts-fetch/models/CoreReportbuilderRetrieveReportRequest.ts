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
 * @interface CoreReportbuilderRetrieveReportRequest
 */
export interface CoreReportbuilderRetrieveReportRequest {
    /**
     * Page number
     * @type {number}
     * @memberof CoreReportbuilderRetrieveReportRequest
     */
    page?: number;
    /**
     * Reports per page
     * @type {number}
     * @memberof CoreReportbuilderRetrieveReportRequest
     */
    perpage?: number;
    /**
     * Report ID
     * @type {number}
     * @memberof CoreReportbuilderRetrieveReportRequest
     */
    reportid: number;
}

/**
 * Check if a given object implements the CoreReportbuilderRetrieveReportRequest interface.
 */
export function instanceOfCoreReportbuilderRetrieveReportRequest(value: object): boolean {
    if (!('reportid' in value)) return false;
    return true;
}

export function CoreReportbuilderRetrieveReportRequestFromJSON(json: any): CoreReportbuilderRetrieveReportRequest {
    return CoreReportbuilderRetrieveReportRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderRetrieveReportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderRetrieveReportRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'page': json['page'] == null ? undefined : json['page'],
        'perpage': json['perpage'] == null ? undefined : json['perpage'],
        'reportid': json['reportid'],
    };
}

export function CoreReportbuilderRetrieveReportRequestToJSON(value?: CoreReportbuilderRetrieveReportRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'page': value['page'],
        'perpage': value['perpage'],
        'reportid': value['reportid'],
    };
}
