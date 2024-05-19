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
 * @interface CoreReportbuilderAudiencesDeleteRequest
 */
export interface CoreReportbuilderAudiencesDeleteRequest {
    /**
     * Audience instance id
     * @type {number}
     * @memberof CoreReportbuilderAudiencesDeleteRequest
     */
    Instanceid: number;
    /**
     * Report id
     * @type {number}
     * @memberof CoreReportbuilderAudiencesDeleteRequest
     */
    Reportid: number;
}

/**
 * Check if a given object implements the CoreReportbuilderAudiencesDeleteRequest interface.
 */
export function instanceOfCoreReportbuilderAudiencesDeleteRequest(value: object): boolean {
    if (!('Instanceid' in value)) return false;
    if (!('Reportid' in value)) return false;
    return true;
}

export function CoreReportbuilderAudiencesDeleteRequestFromJSON(json: any): CoreReportbuilderAudiencesDeleteRequest {
    return CoreReportbuilderAudiencesDeleteRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderAudiencesDeleteRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderAudiencesDeleteRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Instanceid': json['instanceid'],
        'Reportid': json['reportid'],
    };
}

export function CoreReportbuilderAudiencesDeleteRequestToJSON(value?: CoreReportbuilderAudiencesDeleteRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instanceid': value['Instanceid'],
        'reportid': value['Reportid'],
    };
}

