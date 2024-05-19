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
import type { BlockIomadCompanyAdminEditLicensesRequestLicensesInner } from './BlockIomadCompanyAdminEditLicensesRequestLicensesInner';
import {
    BlockIomadCompanyAdminEditLicensesRequestLicensesInnerFromJSON,
    BlockIomadCompanyAdminEditLicensesRequestLicensesInnerFromJSONTyped,
    BlockIomadCompanyAdminEditLicensesRequestLicensesInnerToJSON,
} from './BlockIomadCompanyAdminEditLicensesRequestLicensesInner';

/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminEditLicensesRequest
 */
export interface BlockIomadCompanyAdminEditLicensesRequest {
    /**
     * 
     * @type {Array<BlockIomadCompanyAdminEditLicensesRequestLicensesInner>}
     * @memberof BlockIomadCompanyAdminEditLicensesRequest
     */
    Licenses: Array<BlockIomadCompanyAdminEditLicensesRequestLicensesInner>;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminEditLicensesRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminEditLicensesRequest(value: object): boolean {
    if (!('Licenses' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminEditLicensesRequestFromJSON(json: any): BlockIomadCompanyAdminEditLicensesRequest {
    return BlockIomadCompanyAdminEditLicensesRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminEditLicensesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminEditLicensesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Licenses': ((json['licenses'] as Array<any>).map(BlockIomadCompanyAdminEditLicensesRequestLicensesInnerFromJSON)),
    };
}

export function BlockIomadCompanyAdminEditLicensesRequestToJSON(value?: BlockIomadCompanyAdminEditLicensesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'licenses': ((value['Licenses'] as Array<any>).map(BlockIomadCompanyAdminEditLicensesRequestLicensesInnerToJSON)),
    };
}

