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
 * @interface ModDataGetDataAccessInformation200Response
 */
export interface ModDataGetDataAccessInformation200Response {
    /**
     * Whether the user can add entries or not.
     * @type {boolean}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Canaddentry: boolean;
    /**
     * Whether the user can approve entries or not.
     * @type {boolean}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Canapprove: boolean;
    /**
     * Whether the user can manage entries or not.
     * @type {boolean}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Canmanageentries: boolean;
    /**
     * The number of entries left to complete the activity.
     * @type {number}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Entrieslefttoadd: number;
    /**
     * The number of entries left to view other users entries.
     * @type {number}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Entrieslefttoview: number;
    /**
     * User current group id (calculated)
     * @type {number}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Groupid: number;
    /**
     * Whether the database is in read mode only.
     * @type {boolean}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Inreadonlyperiod: boolean;
    /**
     * The number of entries the current user added.
     * @type {number}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Numentries: number;
    /**
     * Whether the database is available or not by time restrictions.
     * @type {boolean}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Timeavailable: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModDataGetDataAccessInformation200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModDataGetDataAccessInformation200Response interface.
 */
export function instanceOfModDataGetDataAccessInformation200Response(value: object): boolean {
    if (!('Canaddentry' in value)) return false;
    if (!('Canapprove' in value)) return false;
    if (!('Canmanageentries' in value)) return false;
    if (!('Entrieslefttoadd' in value)) return false;
    if (!('Entrieslefttoview' in value)) return false;
    if (!('Groupid' in value)) return false;
    if (!('Inreadonlyperiod' in value)) return false;
    if (!('Numentries' in value)) return false;
    if (!('Timeavailable' in value)) return false;
    return true;
}

export function ModDataGetDataAccessInformation200ResponseFromJSON(json: any): ModDataGetDataAccessInformation200Response {
    return ModDataGetDataAccessInformation200ResponseFromJSONTyped(json, false);
}

export function ModDataGetDataAccessInformation200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataGetDataAccessInformation200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Canaddentry': json['canaddentry'],
        'Canapprove': json['canapprove'],
        'Canmanageentries': json['canmanageentries'],
        'Entrieslefttoadd': json['entrieslefttoadd'],
        'Entrieslefttoview': json['entrieslefttoview'],
        'Groupid': json['groupid'],
        'Inreadonlyperiod': json['inreadonlyperiod'],
        'Numentries': json['numentries'],
        'Timeavailable': json['timeavailable'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModDataGetDataAccessInformation200ResponseToJSON(value?: ModDataGetDataAccessInformation200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canaddentry': value['Canaddentry'],
        'canapprove': value['Canapprove'],
        'canmanageentries': value['Canmanageentries'],
        'entrieslefttoadd': value['Entrieslefttoadd'],
        'entrieslefttoview': value['Entrieslefttoview'],
        'groupid': value['Groupid'],
        'inreadonlyperiod': value['Inreadonlyperiod'],
        'numentries': value['Numentries'],
        'timeavailable': value['Timeavailable'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

