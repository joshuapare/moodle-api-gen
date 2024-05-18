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
import type { CoreUserGetUserPreferences200ResponsePreferencesInner } from './CoreUserGetUserPreferences200ResponsePreferencesInner';
import {
    CoreUserGetUserPreferences200ResponsePreferencesInnerFromJSON,
    CoreUserGetUserPreferences200ResponsePreferencesInnerFromJSONTyped,
    CoreUserGetUserPreferences200ResponsePreferencesInnerToJSON,
} from './CoreUserGetUserPreferences200ResponsePreferencesInner';

/**
 * 
 * @export
 * @interface CoreUserGetUserPreferences200Response
 */
export interface CoreUserGetUserPreferences200Response {
    /**
     * 
     * @type {Array<CoreUserGetUserPreferences200ResponsePreferencesInner>}
     * @memberof CoreUserGetUserPreferences200Response
     */
    preferences: Array<CoreUserGetUserPreferences200ResponsePreferencesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreUserGetUserPreferences200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreUserGetUserPreferences200Response interface.
 */
export function instanceOfCoreUserGetUserPreferences200Response(value: object): boolean {
    if (!('preferences' in value)) return false;
    return true;
}

export function CoreUserGetUserPreferences200ResponseFromJSON(json: any): CoreUserGetUserPreferences200Response {
    return CoreUserGetUserPreferences200ResponseFromJSONTyped(json, false);
}

export function CoreUserGetUserPreferences200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserGetUserPreferences200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'preferences': ((json['preferences'] as Array<any>).map(CoreUserGetUserPreferences200ResponsePreferencesInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreUserGetUserPreferences200ResponseToJSON(value?: CoreUserGetUserPreferences200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'preferences': ((value['preferences'] as Array<any>).map(CoreUserGetUserPreferences200ResponsePreferencesInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
