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
 * @interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
 */
export interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse {
    /**
     * competencyid
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    competencyid: number;
    /**
     * courseid
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    courseid: number;
    /**
     * grade
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    grade: number;
    /**
     * gradename
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    gradename: string;
    /**
     * id
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    id: number;
    /**
     * proficiency
     * @type {boolean}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    proficiency: boolean;
    /**
     * proficiencyname
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    proficiencyname: string;
    /**
     * timecreated
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    timecreated: number;
    /**
     * timemodified
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    timemodified: number;
    /**
     * userid
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    userid: number;
    /**
     * usermodified
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse
     */
    usermodified: number;
}

/**
 * Check if a given object implements the ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse interface.
 */
export function instanceOfToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse(value: object): boolean {
    if (!('competencyid' in value)) return false;
    if (!('courseid' in value)) return false;
    if (!('grade' in value)) return false;
    if (!('gradename' in value)) return false;
    if (!('id' in value)) return false;
    if (!('proficiency' in value)) return false;
    if (!('proficiencyname' in value)) return false;
    if (!('timecreated' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('userid' in value)) return false;
    if (!('usermodified' in value)) return false;
    return true;
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSON(json: any): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse {
    return ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSONTyped(json, false);
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyid': json['competencyid'],
        'courseid': json['courseid'],
        'grade': json['grade'],
        'gradename': json['gradename'],
        'id': json['id'],
        'proficiency': json['proficiency'],
        'proficiencyname': json['proficiencyname'],
        'timecreated': json['timecreated'],
        'timemodified': json['timemodified'],
        'userid': json['userid'],
        'usermodified': json['usermodified'],
    };
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseToJSON(value?: ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyid': value['competencyid'],
        'courseid': value['courseid'],
        'grade': value['grade'],
        'gradename': value['gradename'],
        'id': value['id'],
        'proficiency': value['proficiency'],
        'proficiencyname': value['proficiencyname'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'userid': value['userid'],
        'usermodified': value['usermodified'],
    };
}

