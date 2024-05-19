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
import type { ModDataSearchEntriesRequestAdvsearchInner } from './ModDataSearchEntriesRequestAdvsearchInner';
import {
    ModDataSearchEntriesRequestAdvsearchInnerFromJSON,
    ModDataSearchEntriesRequestAdvsearchInnerFromJSONTyped,
    ModDataSearchEntriesRequestAdvsearchInnerToJSON,
} from './ModDataSearchEntriesRequestAdvsearchInner';

/**
 * 
 * @export
 * @interface ModDataSearchEntriesRequest
 */
export interface ModDataSearchEntriesRequest {
    /**
     * 
     * @type {Array<ModDataSearchEntriesRequestAdvsearchInner>}
     * @memberof ModDataSearchEntriesRequest
     */
    Advsearch?: Array<ModDataSearchEntriesRequestAdvsearchInner>;
    /**
     * data instance id
     * @type {number}
     * @memberof ModDataSearchEntriesRequest
     */
    Databaseid: number;
    /**
     * Group id, 0 means that the function will determine the user group
     * @type {number}
     * @memberof ModDataSearchEntriesRequest
     */
    Groupid?: number;
    /**
     * The direction of the sorting: 'ASC' or 'DESC'.
     *                                                 Empty for using the default database setting.
     * @type {string}
     * @memberof ModDataSearchEntriesRequest
     */
    Order?: string;
    /**
     * The page of records to return.
     * @type {number}
     * @memberof ModDataSearchEntriesRequest
     */
    Page?: number;
    /**
     * The number of records to return per page
     * @type {number}
     * @memberof ModDataSearchEntriesRequest
     */
    Perpage?: number;
    /**
     * Whether to return contents or not.
     * @type {boolean}
     * @memberof ModDataSearchEntriesRequest
     */
    Returncontents?: boolean;
    /**
     * search string (empty when using advanced)
     * @type {string}
     * @memberof ModDataSearchEntriesRequest
     */
    Search?: string;
    /**
     * Sort the records by this field id, reserved ids are:
     *                                                 0: timeadded
     *                                                 -1: firstname
     *                                                 -2: lastname
     *                                                 -3: approved
     *                                                 -4: timemodified.
     *                                                 Empty for using the default database setting.
     * @type {number}
     * @memberof ModDataSearchEntriesRequest
     */
    Sort?: number;
}

/**
 * Check if a given object implements the ModDataSearchEntriesRequest interface.
 */
export function instanceOfModDataSearchEntriesRequest(value: object): boolean {
    if (!('Databaseid' in value)) return false;
    return true;
}

export function ModDataSearchEntriesRequestFromJSON(json: any): ModDataSearchEntriesRequest {
    return ModDataSearchEntriesRequestFromJSONTyped(json, false);
}

export function ModDataSearchEntriesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataSearchEntriesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Advsearch': json['advsearch'] == null ? undefined : ((json['advsearch'] as Array<any>).map(ModDataSearchEntriesRequestAdvsearchInnerFromJSON)),
        'Databaseid': json['databaseid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Order': json['order'] == null ? undefined : json['order'],
        'Page': json['page'] == null ? undefined : json['page'],
        'Perpage': json['perpage'] == null ? undefined : json['perpage'],
        'Returncontents': json['returncontents'] == null ? undefined : json['returncontents'],
        'Search': json['search'] == null ? undefined : json['search'],
        'Sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function ModDataSearchEntriesRequestToJSON(value?: ModDataSearchEntriesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'advsearch': value['Advsearch'] == null ? undefined : ((value['Advsearch'] as Array<any>).map(ModDataSearchEntriesRequestAdvsearchInnerToJSON)),
        'databaseid': value['Databaseid'],
        'groupid': value['Groupid'],
        'order': value['Order'],
        'page': value['Page'],
        'perpage': value['Perpage'],
        'returncontents': value['Returncontents'],
        'search': value['Search'],
        'sort': value['Sort'],
    };
}
