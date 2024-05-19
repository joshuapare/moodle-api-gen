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
 * @interface BlockIomadCompanyAdminGetLicenseFromIdRequest
 */
export interface BlockIomadCompanyAdminGetLicenseFromIdRequest {
    /**
     * License ID.
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseFromIdRequest
     */
    licenseid: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetLicenseFromIdRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminGetLicenseFromIdRequest(value: object): boolean {
    if (!('licenseid' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminGetLicenseFromIdRequestFromJSON(json: any): BlockIomadCompanyAdminGetLicenseFromIdRequest {
    return BlockIomadCompanyAdminGetLicenseFromIdRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetLicenseFromIdRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetLicenseFromIdRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'licenseid': json['licenseid'],
    };
}

export function BlockIomadCompanyAdminGetLicenseFromIdRequestToJSON(value?: BlockIomadCompanyAdminGetLicenseFromIdRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'licenseid': value['licenseid'],
    };
}

