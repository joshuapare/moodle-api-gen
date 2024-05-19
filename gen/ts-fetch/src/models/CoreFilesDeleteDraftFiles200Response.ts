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
 * @interface CoreFilesDeleteDraftFiles200Response
 */
export interface CoreFilesDeleteDraftFiles200Response {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreFilesDeleteDraftFiles200Response
     */
    Parentpaths: Array<object>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreFilesDeleteDraftFiles200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreFilesDeleteDraftFiles200Response interface.
 */
export function instanceOfCoreFilesDeleteDraftFiles200Response(value: object): boolean {
    if (!('Parentpaths' in value)) return false;
    return true;
}

export function CoreFilesDeleteDraftFiles200ResponseFromJSON(json: any): CoreFilesDeleteDraftFiles200Response {
    return CoreFilesDeleteDraftFiles200ResponseFromJSONTyped(json, false);
}

export function CoreFilesDeleteDraftFiles200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFilesDeleteDraftFiles200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Parentpaths': json['parentpaths'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreFilesDeleteDraftFiles200ResponseToJSON(value?: CoreFilesDeleteDraftFiles200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'parentpaths': value['Parentpaths'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
