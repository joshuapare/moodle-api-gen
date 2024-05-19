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
import type { CoreCourseGetUpdatesSince200ResponseInstancesInner } from './CoreCourseGetUpdatesSince200ResponseInstancesInner';
import {
    CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSON,
    CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSONTyped,
    CoreCourseGetUpdatesSince200ResponseInstancesInnerToJSON,
} from './CoreCourseGetUpdatesSince200ResponseInstancesInner';

/**
 * 
 * @export
 * @interface CoreCourseGetUpdatesSince200Response
 */
export interface CoreCourseGetUpdatesSince200Response {
    /**
     * 
     * @type {Array<CoreCourseGetUpdatesSince200ResponseInstancesInner>}
     * @memberof CoreCourseGetUpdatesSince200Response
     */
    Instances: Array<CoreCourseGetUpdatesSince200ResponseInstancesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreCourseGetUpdatesSince200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreCourseGetUpdatesSince200Response interface.
 */
export function instanceOfCoreCourseGetUpdatesSince200Response(value: object): boolean {
    if (!('Instances' in value)) return false;
    return true;
}

export function CoreCourseGetUpdatesSince200ResponseFromJSON(json: any): CoreCourseGetUpdatesSince200Response {
    return CoreCourseGetUpdatesSince200ResponseFromJSONTyped(json, false);
}

export function CoreCourseGetUpdatesSince200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetUpdatesSince200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Instances': ((json['instances'] as Array<any>).map(CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreCourseGetUpdatesSince200ResponseToJSON(value?: CoreCourseGetUpdatesSince200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instances': ((value['Instances'] as Array<any>).map(CoreCourseGetUpdatesSince200ResponseInstancesInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

