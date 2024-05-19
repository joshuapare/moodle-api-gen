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
/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
 */
export interface BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner {
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    courseid?: number;
    /**
     * Course licensed
     * @type {boolean}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    licensed?: boolean;
    /**
     * Course warning email notify period
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    notifyperiod?: number;
    /**
     * Course shared value
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    shared?: number;
    /**
     * Course training valid for in days
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    validlength?: number;
    /**
     * Course days to warn if not completed in
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    warncompletion?: number;
    /**
     * Course days to warn before training expires
     * @type {number}
     * @memberof BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner
     */
    warnexpire?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminUpdateCoursesRequestCoursesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerFromJSON(json: any): BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner {
    return BlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
        'licensed': json['licensed'] == null ? undefined : json['licensed'],
        'notifyperiod': json['notifyperiod'] == null ? undefined : json['notifyperiod'],
        'shared': json['shared'] == null ? undefined : json['shared'],
        'validlength': json['validlength'] == null ? undefined : json['validlength'],
        'warncompletion': json['warncompletion'] == null ? undefined : json['warncompletion'],
        'warnexpire': json['warnexpire'] == null ? undefined : json['warnexpire'],
    };
}

export function BlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerToJSON(value?: BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
        'licensed': value['licensed'],
        'notifyperiod': value['notifyperiod'],
        'shared': value['shared'],
        'validlength': value['validlength'],
        'warncompletion': value['warncompletion'],
        'warnexpire': value['warnexpire'],
    };
}

