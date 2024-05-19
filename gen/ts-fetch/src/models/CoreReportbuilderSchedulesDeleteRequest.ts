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
 * @interface CoreReportbuilderSchedulesDeleteRequest
 */
export interface CoreReportbuilderSchedulesDeleteRequest {
    /**
     * Report ID
     * @type {number}
     * @memberof CoreReportbuilderSchedulesDeleteRequest
     */
    Reportid: number;
    /**
     * Schedule ID
     * @type {number}
     * @memberof CoreReportbuilderSchedulesDeleteRequest
     */
    Scheduleid: number;
}

/**
 * Check if a given object implements the CoreReportbuilderSchedulesDeleteRequest interface.
 */
export function instanceOfCoreReportbuilderSchedulesDeleteRequest(value: object): boolean {
    if (!('Reportid' in value)) return false;
    if (!('Scheduleid' in value)) return false;
    return true;
}

export function CoreReportbuilderSchedulesDeleteRequestFromJSON(json: any): CoreReportbuilderSchedulesDeleteRequest {
    return CoreReportbuilderSchedulesDeleteRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderSchedulesDeleteRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderSchedulesDeleteRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Reportid': json['reportid'],
        'Scheduleid': json['scheduleid'],
    };
}

export function CoreReportbuilderSchedulesDeleteRequestToJSON(value?: CoreReportbuilderSchedulesDeleteRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'reportid': value['Reportid'],
        'scheduleid': value['Scheduleid'],
    };
}

