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
 * @interface CoreRatingAddRating200Response
 */
export interface CoreRatingAddRating200Response {
    /**
     * New aggregate
     * @type {string}
     * @memberof CoreRatingAddRating200Response
     */
    Aggregate?: string;
    /**
     * Ratings count
     * @type {number}
     * @memberof CoreRatingAddRating200Response
     */
    Count?: number;
    /**
     * Rating item id
     * @type {number}
     * @memberof CoreRatingAddRating200Response
     */
    Itemid?: number;
    /**
     * Whether the rate was successfully created
     * @type {boolean}
     * @memberof CoreRatingAddRating200Response
     */
    Success: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreRatingAddRating200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreRatingAddRating200Response interface.
 */
export function instanceOfCoreRatingAddRating200Response(value: object): boolean {
    if (!('Success' in value)) return false;
    return true;
}

export function CoreRatingAddRating200ResponseFromJSON(json: any): CoreRatingAddRating200Response {
    return CoreRatingAddRating200ResponseFromJSONTyped(json, false);
}

export function CoreRatingAddRating200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreRatingAddRating200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Aggregate': json['aggregate'] == null ? undefined : json['aggregate'],
        'Count': json['count'] == null ? undefined : json['count'],
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
        'Success': json['success'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreRatingAddRating200ResponseToJSON(value?: CoreRatingAddRating200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'aggregate': value['Aggregate'],
        'count': value['Count'],
        'itemid': value['Itemid'],
        'success': value['Success'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

