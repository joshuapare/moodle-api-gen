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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInner';

/**
 * 
 * @export
 * @interface CoreBlockGetDashboardBlocks200Response
 */
export interface CoreBlockGetDashboardBlocks200Response {
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInner>}
     * @memberof CoreBlockGetDashboardBlocks200Response
     */
    blocks: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreBlockGetDashboardBlocks200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreBlockGetDashboardBlocks200Response interface.
 */
export function instanceOfCoreBlockGetDashboardBlocks200Response(value: object): boolean {
    if (!('blocks' in value)) return false;
    return true;
}

export function CoreBlockGetDashboardBlocks200ResponseFromJSON(json: any): CoreBlockGetDashboardBlocks200Response {
    return CoreBlockGetDashboardBlocks200ResponseFromJSONTyped(json, false);
}

export function CoreBlockGetDashboardBlocks200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockGetDashboardBlocks200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'blocks': ((json['blocks'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreBlockGetDashboardBlocks200ResponseToJSON(value?: CoreBlockGetDashboardBlocks200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'blocks': ((value['blocks'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
