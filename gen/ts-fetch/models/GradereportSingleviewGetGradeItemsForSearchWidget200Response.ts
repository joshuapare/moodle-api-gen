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
import type { GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner } from './GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner';
import {
    GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSON,
    GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSONTyped,
    GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerToJSON,
} from './GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner';

/**
 * 
 * @export
 * @interface GradereportSingleviewGetGradeItemsForSearchWidget200Response
 */
export interface GradereportSingleviewGetGradeItemsForSearchWidget200Response {
    /**
     * 
     * @type {Array<GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner>}
     * @memberof GradereportSingleviewGetGradeItemsForSearchWidget200Response
     */
    gradeitems: Array<GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof GradereportSingleviewGetGradeItemsForSearchWidget200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the GradereportSingleviewGetGradeItemsForSearchWidget200Response interface.
 */
export function instanceOfGradereportSingleviewGetGradeItemsForSearchWidget200Response(value: object): boolean {
    if (!('gradeitems' in value)) return false;
    return true;
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseFromJSON(json: any): GradereportSingleviewGetGradeItemsForSearchWidget200Response {
    return GradereportSingleviewGetGradeItemsForSearchWidget200ResponseFromJSONTyped(json, false);
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportSingleviewGetGradeItemsForSearchWidget200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'gradeitems': ((json['gradeitems'] as Array<any>).map(GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseToJSON(value?: GradereportSingleviewGetGradeItemsForSearchWidget200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'gradeitems': ((value['gradeitems'] as Array<any>).map(GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
