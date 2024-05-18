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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';
import type { CoreBadgesGetUserBadgeByHash200ResponseBadgeInner } from './CoreBadgesGetUserBadgeByHash200ResponseBadgeInner';
import {
    CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerFromJSON,
    CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerFromJSONTyped,
    CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerToJSON,
} from './CoreBadgesGetUserBadgeByHash200ResponseBadgeInner';

/**
 * 
 * @export
 * @interface CoreBadgesGetUserBadgeByHash200Response
 */
export interface CoreBadgesGetUserBadgeByHash200Response {
    /**
     * 
     * @type {Array<CoreBadgesGetUserBadgeByHash200ResponseBadgeInner>}
     * @memberof CoreBadgesGetUserBadgeByHash200Response
     */
    badge: Array<CoreBadgesGetUserBadgeByHash200ResponseBadgeInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreBadgesGetUserBadgeByHash200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreBadgesGetUserBadgeByHash200Response interface.
 */
export function instanceOfCoreBadgesGetUserBadgeByHash200Response(value: object): boolean {
    if (!('badge' in value)) return false;
    return true;
}

export function CoreBadgesGetUserBadgeByHash200ResponseFromJSON(json: any): CoreBadgesGetUserBadgeByHash200Response {
    return CoreBadgesGetUserBadgeByHash200ResponseFromJSONTyped(json, false);
}

export function CoreBadgesGetUserBadgeByHash200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBadgesGetUserBadgeByHash200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'badge': ((json['badge'] as Array<any>).map(CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreBadgesGetUserBadgeByHash200ResponseToJSON(value?: CoreBadgesGetUserBadgeByHash200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'badge': ((value['badge'] as Array<any>).map(CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
