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
import type { BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner } from './BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner';
import {
    BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSON,
    BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSONTyped,
    BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerToJSON,
} from './BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner';

/**
 * one or many licenses
 * @export
 * @interface BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
 */
export interface BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {
    /**
     * Number of license slots
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    allocation?: number;
    /**
     * Clear license assignments on expire - 0 = no, 1 = yes
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    clearonexpire?: number;
    /**
     * Company id
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    companyid?: number;
    /**
     * 
     * @type {Array<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    courses?: Array<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>;
    /**
     * License cut off date (int = timestamp)
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    cutoffdate?: number;
    /**
     * License expiry date (int = timestamp)
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    expirydate?: number;
    /**
     * Instant access - 0 = no, 1 = yes
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    instant?: number;
    /**
     * License name
     * @type {string}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    name?: string;
    /**
     * Parent license id
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    parentid?: number;
    /**
     * Program pf courses 0 = no, 1 = yes
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    program?: number;
    /**
     * License reference
     * @type {string}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    reference?: string;
    /**
     * Date from which the liucense is available (int = timestamp) 
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    startdate?: number;
    /**
     * License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    type?: number;
    /**
     * Number how often the lic can be allocated
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    used?: number;
    /**
     * Course access length (days)
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
     */
    validlength?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminCreateLicensesRequestLicensesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminCreateLicensesRequestLicensesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerFromJSON(json: any): BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {
    return BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'allocation': json['allocation'] == null ? undefined : json['allocation'],
        'clearonexpire': json['clearonexpire'] == null ? undefined : json['clearonexpire'],
        'companyid': json['companyid'] == null ? undefined : json['companyid'],
        'courses': json['courses'] == null ? undefined : ((json['courses'] as Array<any>).map(BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSON)),
        'cutoffdate': json['cutoffdate'] == null ? undefined : json['cutoffdate'],
        'expirydate': json['expirydate'] == null ? undefined : json['expirydate'],
        'instant': json['instant'] == null ? undefined : json['instant'],
        'name': json['name'] == null ? undefined : json['name'],
        'parentid': json['parentid'] == null ? undefined : json['parentid'],
        'program': json['program'] == null ? undefined : json['program'],
        'reference': json['reference'] == null ? undefined : json['reference'],
        'startdate': json['startdate'] == null ? undefined : json['startdate'],
        'type': json['type'] == null ? undefined : json['type'],
        'used': json['used'] == null ? undefined : json['used'],
        'validlength': json['validlength'] == null ? undefined : json['validlength'],
    };
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerToJSON(value?: BlockIomadCompanyAdminCreateLicensesRequestLicensesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allocation': value['allocation'],
        'clearonexpire': value['clearonexpire'],
        'companyid': value['companyid'],
        'courses': value['courses'] == null ? undefined : ((value['courses'] as Array<any>).map(BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerToJSON)),
        'cutoffdate': value['cutoffdate'],
        'expirydate': value['expirydate'],
        'instant': value['instant'],
        'name': value['name'],
        'parentid': value['parentid'],
        'program': value['program'],
        'reference': value['reference'],
        'startdate': value['startdate'],
        'type': value['type'],
        'used': value['used'],
        'validlength': value['validlength'],
    };
}
