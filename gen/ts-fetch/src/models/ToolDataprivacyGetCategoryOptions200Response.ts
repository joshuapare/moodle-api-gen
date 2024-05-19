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
import type { ToolDataprivacyGetCategoryOptions200ResponseOptionsInner } from './ToolDataprivacyGetCategoryOptions200ResponseOptionsInner';
import {
    ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSON,
    ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSONTyped,
    ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerToJSON,
} from './ToolDataprivacyGetCategoryOptions200ResponseOptionsInner';

/**
 * 
 * @export
 * @interface ToolDataprivacyGetCategoryOptions200Response
 */
export interface ToolDataprivacyGetCategoryOptions200Response {
    /**
     * 
     * @type {Array<ToolDataprivacyGetCategoryOptions200ResponseOptionsInner>}
     * @memberof ToolDataprivacyGetCategoryOptions200Response
     */
    Options: Array<ToolDataprivacyGetCategoryOptions200ResponseOptionsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ToolDataprivacyGetCategoryOptions200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ToolDataprivacyGetCategoryOptions200Response interface.
 */
export function instanceOfToolDataprivacyGetCategoryOptions200Response(value: object): boolean {
    if (!('Options' in value)) return false;
    return true;
}

export function ToolDataprivacyGetCategoryOptions200ResponseFromJSON(json: any): ToolDataprivacyGetCategoryOptions200Response {
    return ToolDataprivacyGetCategoryOptions200ResponseFromJSONTyped(json, false);
}

export function ToolDataprivacyGetCategoryOptions200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyGetCategoryOptions200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Options': ((json['options'] as Array<any>).map(ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ToolDataprivacyGetCategoryOptions200ResponseToJSON(value?: ToolDataprivacyGetCategoryOptions200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'options': ((value['Options'] as Array<any>).map(ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
