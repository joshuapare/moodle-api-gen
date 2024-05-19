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
 * @interface CoreReportbuilderFiltersAddRequest
 */
export interface CoreReportbuilderFiltersAddRequest {
    /**
     * Report ID
     * @type {number}
     * @memberof CoreReportbuilderFiltersAddRequest
     */
    reportid: number;
    /**
     * Unique identifier of the filter
     * @type {string}
     * @memberof CoreReportbuilderFiltersAddRequest
     */
    uniqueidentifier: string;
}

/**
 * Check if a given object implements the CoreReportbuilderFiltersAddRequest interface.
 */
export function instanceOfCoreReportbuilderFiltersAddRequest(value: object): boolean {
    if (!('reportid' in value)) return false;
    if (!('uniqueidentifier' in value)) return false;
    return true;
}

export function CoreReportbuilderFiltersAddRequestFromJSON(json: any): CoreReportbuilderFiltersAddRequest {
    return CoreReportbuilderFiltersAddRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderFiltersAddRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderFiltersAddRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'reportid': json['reportid'],
        'uniqueidentifier': json['uniqueidentifier'],
    };
}

export function CoreReportbuilderFiltersAddRequestToJSON(value?: CoreReportbuilderFiltersAddRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'reportid': value['reportid'],
        'uniqueidentifier': value['uniqueidentifier'],
    };
}

