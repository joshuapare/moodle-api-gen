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
import type { EnrolGuestGetInstanceInfo200ResponseInstanceinfo } from './EnrolGuestGetInstanceInfo200ResponseInstanceinfo';
import {
    EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSON,
    EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSONTyped,
    EnrolGuestGetInstanceInfo200ResponseInstanceinfoToJSON,
} from './EnrolGuestGetInstanceInfo200ResponseInstanceinfo';

/**
 * 
 * @export
 * @interface EnrolGuestGetInstanceInfo200Response
 */
export interface EnrolGuestGetInstanceInfo200Response {
    /**
     * 
     * @type {EnrolGuestGetInstanceInfo200ResponseInstanceinfo}
     * @memberof EnrolGuestGetInstanceInfo200Response
     */
    instanceinfo: EnrolGuestGetInstanceInfo200ResponseInstanceinfo;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof EnrolGuestGetInstanceInfo200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the EnrolGuestGetInstanceInfo200Response interface.
 */
export function instanceOfEnrolGuestGetInstanceInfo200Response(value: object): boolean {
    if (!('instanceinfo' in value)) return false;
    return true;
}

export function EnrolGuestGetInstanceInfo200ResponseFromJSON(json: any): EnrolGuestGetInstanceInfo200Response {
    return EnrolGuestGetInstanceInfo200ResponseFromJSONTyped(json, false);
}

export function EnrolGuestGetInstanceInfo200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolGuestGetInstanceInfo200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'instanceinfo': EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSON(json['instanceinfo']),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function EnrolGuestGetInstanceInfo200ResponseToJSON(value?: EnrolGuestGetInstanceInfo200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instanceinfo': EnrolGuestGetInstanceInfo200ResponseInstanceinfoToJSON(value['instanceinfo']),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

