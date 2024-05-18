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
 * @interface ModIomadcertificateIssueIomadcertificateRequest
 */
export interface ModIomadcertificateIssueIomadcertificateRequest {
    /**
     * iomadcertificate instance id
     * @type {number}
     * @memberof ModIomadcertificateIssueIomadcertificateRequest
     */
    iomadcertificateid: number;
}

/**
 * Check if a given object implements the ModIomadcertificateIssueIomadcertificateRequest interface.
 */
export function instanceOfModIomadcertificateIssueIomadcertificateRequest(value: object): boolean {
    if (!('iomadcertificateid' in value)) return false;
    return true;
}

export function ModIomadcertificateIssueIomadcertificateRequestFromJSON(json: any): ModIomadcertificateIssueIomadcertificateRequest {
    return ModIomadcertificateIssueIomadcertificateRequestFromJSONTyped(json, false);
}

export function ModIomadcertificateIssueIomadcertificateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModIomadcertificateIssueIomadcertificateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'iomadcertificateid': json['iomadcertificateid'],
    };
}

export function ModIomadcertificateIssueIomadcertificateRequestToJSON(value?: ModIomadcertificateIssueIomadcertificateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'iomadcertificateid': value['iomadcertificateid'],
    };
}
