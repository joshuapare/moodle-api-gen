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
 * @interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
 */
export interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency {
    /**
     * competencyid
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    competencyid: number;
    /**
     * courseid
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    courseid: number;
    /**
     * id
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    id: number;
    /**
     * ruleoutcome
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    ruleoutcome: number;
    /**
     * sortorder
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    sortorder: number;
    /**
     * timecreated
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    timecreated: number;
    /**
     * timemodified
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    timemodified: number;
    /**
     * usermodified
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency
     */
    usermodified: number;
}

/**
 * Check if a given object implements the ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency interface.
 */
export function instanceOfToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency(value: object): boolean {
    if (!('competencyid' in value)) return false;
    if (!('courseid' in value)) return false;
    if (!('id' in value)) return false;
    if (!('ruleoutcome' in value)) return false;
    if (!('sortorder' in value)) return false;
    if (!('timecreated' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('usermodified' in value)) return false;
    return true;
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetencyFromJSON(json: any): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency {
    return ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetencyFromJSONTyped(json, false);
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyid': json['competencyid'],
        'courseid': json['courseid'],
        'id': json['id'],
        'ruleoutcome': json['ruleoutcome'],
        'sortorder': json['sortorder'],
        'timecreated': json['timecreated'],
        'timemodified': json['timemodified'],
        'usermodified': json['usermodified'],
    };
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetencyToJSON(value?: ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyid': value['competencyid'],
        'courseid': value['courseid'],
        'id': value['id'],
        'ruleoutcome': value['ruleoutcome'],
        'sortorder': value['sortorder'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'usermodified': value['usermodified'],
    };
}
