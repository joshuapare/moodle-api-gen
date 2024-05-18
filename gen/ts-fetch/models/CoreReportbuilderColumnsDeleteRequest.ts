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
 * @interface CoreReportbuilderColumnsDeleteRequest
 */
export interface CoreReportbuilderColumnsDeleteRequest {
    /**
     * Column ID
     * @type {number}
     * @memberof CoreReportbuilderColumnsDeleteRequest
     */
    columnid: number;
    /**
     * Report ID
     * @type {number}
     * @memberof CoreReportbuilderColumnsDeleteRequest
     */
    reportid: number;
}

/**
 * Check if a given object implements the CoreReportbuilderColumnsDeleteRequest interface.
 */
export function instanceOfCoreReportbuilderColumnsDeleteRequest(value: object): boolean {
    if (!('columnid' in value)) return false;
    if (!('reportid' in value)) return false;
    return true;
}

export function CoreReportbuilderColumnsDeleteRequestFromJSON(json: any): CoreReportbuilderColumnsDeleteRequest {
    return CoreReportbuilderColumnsDeleteRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderColumnsDeleteRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderColumnsDeleteRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'columnid': json['columnid'],
        'reportid': json['reportid'],
    };
}

export function CoreReportbuilderColumnsDeleteRequestToJSON(value?: CoreReportbuilderColumnsDeleteRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'columnid': value['columnid'],
        'reportid': value['reportid'],
    };
}
