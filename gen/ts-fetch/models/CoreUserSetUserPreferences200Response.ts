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
import type { CoreUserSetUserPreferences200ResponseSavedInner } from './CoreUserSetUserPreferences200ResponseSavedInner';
import {
    CoreUserSetUserPreferences200ResponseSavedInnerFromJSON,
    CoreUserSetUserPreferences200ResponseSavedInnerFromJSONTyped,
    CoreUserSetUserPreferences200ResponseSavedInnerToJSON,
} from './CoreUserSetUserPreferences200ResponseSavedInner';

/**
 * 
 * @export
 * @interface CoreUserSetUserPreferences200Response
 */
export interface CoreUserSetUserPreferences200Response {
    /**
     * 
     * @type {Array<CoreUserSetUserPreferences200ResponseSavedInner>}
     * @memberof CoreUserSetUserPreferences200Response
     */
    saved: Array<CoreUserSetUserPreferences200ResponseSavedInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreUserSetUserPreferences200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreUserSetUserPreferences200Response interface.
 */
export function instanceOfCoreUserSetUserPreferences200Response(value: object): boolean {
    if (!('saved' in value)) return false;
    return true;
}

export function CoreUserSetUserPreferences200ResponseFromJSON(json: any): CoreUserSetUserPreferences200Response {
    return CoreUserSetUserPreferences200ResponseFromJSONTyped(json, false);
}

export function CoreUserSetUserPreferences200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserSetUserPreferences200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'saved': ((json['saved'] as Array<any>).map(CoreUserSetUserPreferences200ResponseSavedInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreUserSetUserPreferences200ResponseToJSON(value?: CoreUserSetUserPreferences200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'saved': ((value['saved'] as Array<any>).map(CoreUserSetUserPreferences200ResponseSavedInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

