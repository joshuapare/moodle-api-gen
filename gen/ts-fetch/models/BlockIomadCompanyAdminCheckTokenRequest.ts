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
import type { BlockIomadCompanyAdminCheckTokenRequestKey0 } from './BlockIomadCompanyAdminCheckTokenRequestKey0';
import {
    BlockIomadCompanyAdminCheckTokenRequestKey0FromJSON,
    BlockIomadCompanyAdminCheckTokenRequestKey0FromJSONTyped,
    BlockIomadCompanyAdminCheckTokenRequestKey0ToJSON,
} from './BlockIomadCompanyAdminCheckTokenRequestKey0';

/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminCheckTokenRequest
 */
export interface BlockIomadCompanyAdminCheckTokenRequest {
    /**
     * 
     * @type {BlockIomadCompanyAdminCheckTokenRequestKey0}
     * @memberof BlockIomadCompanyAdminCheckTokenRequest
     */
    key0: BlockIomadCompanyAdminCheckTokenRequestKey0;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminCheckTokenRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminCheckTokenRequest(value: object): boolean {
    if (!('key0' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminCheckTokenRequestFromJSON(json: any): BlockIomadCompanyAdminCheckTokenRequest {
    return BlockIomadCompanyAdminCheckTokenRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminCheckTokenRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminCheckTokenRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'key0': BlockIomadCompanyAdminCheckTokenRequestKey0FromJSON(json['key0']),
    };
}

export function BlockIomadCompanyAdminCheckTokenRequestToJSON(value?: BlockIomadCompanyAdminCheckTokenRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'key0': BlockIomadCompanyAdminCheckTokenRequestKey0ToJSON(value['key0']),
    };
}

