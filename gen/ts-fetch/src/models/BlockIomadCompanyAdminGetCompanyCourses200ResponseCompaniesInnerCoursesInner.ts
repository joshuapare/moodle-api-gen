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
import type { BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner } from './BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner';
import {
    BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInnerFromJSON,
    BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInnerFromJSONTyped,
    BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInnerToJSON,
} from './BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner';

/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
 */
export interface BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
    /**
     * 
     * @type {Array<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner>}
     * @memberof BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
     */
    Customfields?: Array<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner>;
    /**
     * Course full name
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
     */
    Fullname?: string;
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner
     */
    Id?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerFromJSON(json: any): BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
    return BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Customfields': json['customfields'] == null ? undefined : ((json['customfields'] as Array<any>).map(BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInnerFromJSON)),
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Id': json['id'] == null ? undefined : json['id'],
    };
}

export function BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerToJSON(value?: BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'customfields': value['Customfields'] == null ? undefined : ((value['Customfields'] as Array<any>).map(BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInnerToJSON)),
        'fullname': value['Fullname'],
        'id': value['Id'],
    };
}
