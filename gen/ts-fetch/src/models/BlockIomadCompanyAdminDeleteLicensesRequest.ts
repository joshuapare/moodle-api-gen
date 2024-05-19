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
import type { BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner } from './BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner';
import {
    BlockIomadCompanyAdminDeleteLicensesRequestLicensesInnerFromJSON,
    BlockIomadCompanyAdminDeleteLicensesRequestLicensesInnerFromJSONTyped,
    BlockIomadCompanyAdminDeleteLicensesRequestLicensesInnerToJSON,
} from './BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner';

/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminDeleteLicensesRequest
 */
export interface BlockIomadCompanyAdminDeleteLicensesRequest {
    /**
     * 
     * @type {Array<BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner>}
     * @memberof BlockIomadCompanyAdminDeleteLicensesRequest
     */
    Licenses: Array<BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner>;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminDeleteLicensesRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminDeleteLicensesRequest(value: object): boolean {
    if (!('Licenses' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminDeleteLicensesRequestFromJSON(json: any): BlockIomadCompanyAdminDeleteLicensesRequest {
    return BlockIomadCompanyAdminDeleteLicensesRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminDeleteLicensesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminDeleteLicensesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Licenses': ((json['licenses'] as Array<any>).map(BlockIomadCompanyAdminDeleteLicensesRequestLicensesInnerFromJSON)),
    };
}

export function BlockIomadCompanyAdminDeleteLicensesRequestToJSON(value?: BlockIomadCompanyAdminDeleteLicensesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'licenses': ((value['Licenses'] as Array<any>).map(BlockIomadCompanyAdminDeleteLicensesRequestLicensesInnerToJSON)),
    };
}
