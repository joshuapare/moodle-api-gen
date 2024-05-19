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
import type { CoreCourseCheckUpdates200ResponseInstancesInner } from './CoreCourseCheckUpdates200ResponseInstancesInner';
import {
    CoreCourseCheckUpdates200ResponseInstancesInnerFromJSON,
    CoreCourseCheckUpdates200ResponseInstancesInnerFromJSONTyped,
    CoreCourseCheckUpdates200ResponseInstancesInnerToJSON,
} from './CoreCourseCheckUpdates200ResponseInstancesInner';

/**
 * 
 * @export
 * @interface CoreCourseCheckUpdates200Response
 */
export interface CoreCourseCheckUpdates200Response {
    /**
     * 
     * @type {Array<CoreCourseCheckUpdates200ResponseInstancesInner>}
     * @memberof CoreCourseCheckUpdates200Response
     */
    Instances: Array<CoreCourseCheckUpdates200ResponseInstancesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreCourseCheckUpdates200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreCourseCheckUpdates200Response interface.
 */
export function instanceOfCoreCourseCheckUpdates200Response(value: object): boolean {
    if (!('Instances' in value)) return false;
    return true;
}

export function CoreCourseCheckUpdates200ResponseFromJSON(json: any): CoreCourseCheckUpdates200Response {
    return CoreCourseCheckUpdates200ResponseFromJSONTyped(json, false);
}

export function CoreCourseCheckUpdates200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseCheckUpdates200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Instances': ((json['instances'] as Array<any>).map(CoreCourseCheckUpdates200ResponseInstancesInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreCourseCheckUpdates200ResponseToJSON(value?: CoreCourseCheckUpdates200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instances': ((value['Instances'] as Array<any>).map(CoreCourseCheckUpdates200ResponseInstancesInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
