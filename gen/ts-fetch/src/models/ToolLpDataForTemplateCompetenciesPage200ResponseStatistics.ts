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
import type { CoreCompetencyReadUserEvidence200ResponseCompetenciesInner } from './CoreCompetencyReadUserEvidence200ResponseCompetenciesInner';
import {
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSON,
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSONTyped,
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerToJSON,
} from './CoreCompetencyReadUserEvidence200ResponseCompetenciesInner';

/**
 * 
 * @export
 * @interface ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
 */
export interface ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
    /**
     * competencycount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Competencycount: number;
    /**
     * completedplancount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Completedplancount: number;
    /**
     * completedplanpercentage
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Completedplanpercentage: number;
    /**
     * completedplanpercentageformatted
     * @type {string}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Completedplanpercentageformatted: string;
    /**
     * 
     * @type {Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Leastproficient: Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>;
    /**
     * leastproficientcount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Leastproficientcount: number;
    /**
     * linkedcompetencycount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Linkedcompetencycount: number;
    /**
     * linkedcompetencypercentage
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Linkedcompetencypercentage: number;
    /**
     * linkedcompetencypercentageformatted
     * @type {string}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Linkedcompetencypercentageformatted: string;
    /**
     * plancount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Plancount: number;
    /**
     * proficientusercompetencyplancount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Proficientusercompetencyplancount: number;
    /**
     * proficientusercompetencyplanpercentage
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Proficientusercompetencyplanpercentage: number;
    /**
     * proficientusercompetencyplanpercentageformatted
     * @type {string}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Proficientusercompetencyplanpercentageformatted: string;
    /**
     * unlinkedcompetencycount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Unlinkedcompetencycount: number;
    /**
     * usercompetencyplancount
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPage200ResponseStatistics
     */
    Usercompetencyplancount: number;
}

/**
 * Check if a given object implements the ToolLpDataForTemplateCompetenciesPage200ResponseStatistics interface.
 */
export function instanceOfToolLpDataForTemplateCompetenciesPage200ResponseStatistics(value: object): boolean {
    if (!('Competencycount' in value)) return false;
    if (!('Completedplancount' in value)) return false;
    if (!('Completedplanpercentage' in value)) return false;
    if (!('Completedplanpercentageformatted' in value)) return false;
    if (!('Leastproficient' in value)) return false;
    if (!('Leastproficientcount' in value)) return false;
    if (!('Linkedcompetencycount' in value)) return false;
    if (!('Linkedcompetencypercentage' in value)) return false;
    if (!('Linkedcompetencypercentageformatted' in value)) return false;
    if (!('Plancount' in value)) return false;
    if (!('Proficientusercompetencyplancount' in value)) return false;
    if (!('Proficientusercompetencyplanpercentage' in value)) return false;
    if (!('Proficientusercompetencyplanpercentageformatted' in value)) return false;
    if (!('Unlinkedcompetencycount' in value)) return false;
    if (!('Usercompetencyplancount' in value)) return false;
    return true;
}

export function ToolLpDataForTemplateCompetenciesPage200ResponseStatisticsFromJSON(json: any): ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
    return ToolLpDataForTemplateCompetenciesPage200ResponseStatisticsFromJSONTyped(json, false);
}

export function ToolLpDataForTemplateCompetenciesPage200ResponseStatisticsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
    if (json == null) {
        return json;
    }
    return {
        
        'Competencycount': json['competencycount'],
        'Completedplancount': json['completedplancount'],
        'Completedplanpercentage': json['completedplanpercentage'],
        'Completedplanpercentageformatted': json['completedplanpercentageformatted'],
        'Leastproficient': ((json['leastproficient'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSON)),
        'Leastproficientcount': json['leastproficientcount'],
        'Linkedcompetencycount': json['linkedcompetencycount'],
        'Linkedcompetencypercentage': json['linkedcompetencypercentage'],
        'Linkedcompetencypercentageformatted': json['linkedcompetencypercentageformatted'],
        'Plancount': json['plancount'],
        'Proficientusercompetencyplancount': json['proficientusercompetencyplancount'],
        'Proficientusercompetencyplanpercentage': json['proficientusercompetencyplanpercentage'],
        'Proficientusercompetencyplanpercentageformatted': json['proficientusercompetencyplanpercentageformatted'],
        'Unlinkedcompetencycount': json['unlinkedcompetencycount'],
        'Usercompetencyplancount': json['usercompetencyplancount'],
    };
}

export function ToolLpDataForTemplateCompetenciesPage200ResponseStatisticsToJSON(value?: ToolLpDataForTemplateCompetenciesPage200ResponseStatistics | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencycount': value['Competencycount'],
        'completedplancount': value['Completedplancount'],
        'completedplanpercentage': value['Completedplanpercentage'],
        'completedplanpercentageformatted': value['Completedplanpercentageformatted'],
        'leastproficient': ((value['Leastproficient'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerToJSON)),
        'leastproficientcount': value['Leastproficientcount'],
        'linkedcompetencycount': value['Linkedcompetencycount'],
        'linkedcompetencypercentage': value['Linkedcompetencypercentage'],
        'linkedcompetencypercentageformatted': value['Linkedcompetencypercentageformatted'],
        'plancount': value['Plancount'],
        'proficientusercompetencyplancount': value['Proficientusercompetencyplancount'],
        'proficientusercompetencyplanpercentage': value['Proficientusercompetencyplanpercentage'],
        'proficientusercompetencyplanpercentageformatted': value['Proficientusercompetencyplanpercentageformatted'],
        'unlinkedcompetencycount': value['Unlinkedcompetencycount'],
        'usercompetencyplancount': value['Usercompetencyplancount'],
    };
}

