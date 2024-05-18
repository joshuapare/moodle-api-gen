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

/**
 * 
 * @export
 * @interface CoreUserRemoveUserDevice200Response
 */
export interface CoreUserRemoveUserDevice200Response {
    /**
     * True if removed, false if not removed because it doesn't exists
     * @type {boolean}
     * @memberof CoreUserRemoveUserDevice200Response
     */
    removed: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreUserRemoveUserDevice200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreUserRemoveUserDevice200Response interface.
 */
export function instanceOfCoreUserRemoveUserDevice200Response(value: object): boolean {
    if (!('removed' in value)) return false;
    return true;
}

export function CoreUserRemoveUserDevice200ResponseFromJSON(json: any): CoreUserRemoveUserDevice200Response {
    return CoreUserRemoveUserDevice200ResponseFromJSONTyped(json, false);
}

export function CoreUserRemoveUserDevice200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserRemoveUserDevice200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'removed': json['removed'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreUserRemoveUserDevice200ResponseToJSON(value?: CoreUserRemoveUserDevice200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'removed': value['removed'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

