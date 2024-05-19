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
 * @interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
 */
export interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse {
    /**
     * competencyid
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    competencyid: number;
    /**
     * courseid
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    courseid: number;
    /**
     * grade
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    grade: number;
    /**
     * gradename
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    gradename: string;
    /**
     * id
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    id: number;
    /**
     * proficiency
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    proficiency: boolean;
    /**
     * proficiencyname
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    proficiencyname: string;
    /**
     * timecreated
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    timecreated: number;
    /**
     * timemodified
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    timemodified: number;
    /**
     * userid
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    userid: number;
    /**
     * usermodified
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse
     */
    usermodified: number;
}

/**
 * Check if a given object implements the ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse interface.
 */
export function instanceOfReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse(value: object): boolean {
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

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourseFromJSON(json: any): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse {
    return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourseFromJSONTyped(json, false);
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse {
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

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourseToJSON(value?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse | null): any {
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

