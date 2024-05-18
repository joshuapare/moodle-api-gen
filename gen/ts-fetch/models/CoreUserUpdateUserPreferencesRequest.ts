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
import type { CoreUserUpdateUserPreferencesRequestPreferencesInner } from './CoreUserUpdateUserPreferencesRequestPreferencesInner';
import {
    CoreUserUpdateUserPreferencesRequestPreferencesInnerFromJSON,
    CoreUserUpdateUserPreferencesRequestPreferencesInnerFromJSONTyped,
    CoreUserUpdateUserPreferencesRequestPreferencesInnerToJSON,
} from './CoreUserUpdateUserPreferencesRequestPreferencesInner';

/**
 * 
 * @export
 * @interface CoreUserUpdateUserPreferencesRequest
 */
export interface CoreUserUpdateUserPreferencesRequest {
    /**
     * Enable or disable notifications for this user
     * @type {number}
     * @memberof CoreUserUpdateUserPreferencesRequest
     */
    emailstop?: number;
    /**
     * 
     * @type {Array<CoreUserUpdateUserPreferencesRequestPreferencesInner>}
     * @memberof CoreUserUpdateUserPreferencesRequest
     */
    preferences?: Array<CoreUserUpdateUserPreferencesRequestPreferencesInner>;
    /**
     * id of the user, default to current user
     * @type {number}
     * @memberof CoreUserUpdateUserPreferencesRequest
     */
    userid?: number;
}

/**
 * Check if a given object implements the CoreUserUpdateUserPreferencesRequest interface.
 */
export function instanceOfCoreUserUpdateUserPreferencesRequest(value: object): boolean {
    return true;
}

export function CoreUserUpdateUserPreferencesRequestFromJSON(json: any): CoreUserUpdateUserPreferencesRequest {
    return CoreUserUpdateUserPreferencesRequestFromJSONTyped(json, false);
}

export function CoreUserUpdateUserPreferencesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserUpdateUserPreferencesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'emailstop': json['emailstop'] == null ? undefined : json['emailstop'],
        'preferences': json['preferences'] == null ? undefined : ((json['preferences'] as Array<any>).map(CoreUserUpdateUserPreferencesRequestPreferencesInnerFromJSON)),
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function CoreUserUpdateUserPreferencesRequestToJSON(value?: CoreUserUpdateUserPreferencesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'emailstop': value['emailstop'],
        'preferences': value['preferences'] == null ? undefined : ((value['preferences'] as Array<any>).map(CoreUserUpdateUserPreferencesRequestPreferencesInnerToJSON)),
        'userid': value['userid'],
    };
}

