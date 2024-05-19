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
 * @interface ToolLpDataForCourseCompetenciesPage200ResponseStatistics
 */
export interface ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
    /**
     * canbegradedincourse
     * @type {boolean}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Canbegradedincourse: boolean;
    /**
     * canmanagecoursecompetencies
     * @type {boolean}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Canmanagecoursecompetencies: boolean;
    /**
     * competencycount
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Competencycount: number;
    /**
     * 
     * @type {Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Leastproficient: Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>;
    /**
     * leastproficientcount
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Leastproficientcount: number;
    /**
     * proficientcompetencycount
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Proficientcompetencycount: number;
    /**
     * proficientcompetencypercentage
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Proficientcompetencypercentage: number;
    /**
     * proficientcompetencypercentageformatted
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseStatistics
     */
    Proficientcompetencypercentageformatted: string;
}

/**
 * Check if a given object implements the ToolLpDataForCourseCompetenciesPage200ResponseStatistics interface.
 */
export function instanceOfToolLpDataForCourseCompetenciesPage200ResponseStatistics(value: object): boolean {
    if (!('Canbegradedincourse' in value)) return false;
    if (!('Canmanagecoursecompetencies' in value)) return false;
    if (!('Competencycount' in value)) return false;
    if (!('Leastproficient' in value)) return false;
    if (!('Leastproficientcount' in value)) return false;
    if (!('Proficientcompetencycount' in value)) return false;
    if (!('Proficientcompetencypercentage' in value)) return false;
    if (!('Proficientcompetencypercentageformatted' in value)) return false;
    return true;
}

export function ToolLpDataForCourseCompetenciesPage200ResponseStatisticsFromJSON(json: any): ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
    return ToolLpDataForCourseCompetenciesPage200ResponseStatisticsFromJSONTyped(json, false);
}

export function ToolLpDataForCourseCompetenciesPage200ResponseStatisticsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
    if (json == null) {
        return json;
    }
    return {
        
        'Canbegradedincourse': json['canbegradedincourse'],
        'Canmanagecoursecompetencies': json['canmanagecoursecompetencies'],
        'Competencycount': json['competencycount'],
        'Leastproficient': ((json['leastproficient'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSON)),
        'Leastproficientcount': json['leastproficientcount'],
        'Proficientcompetencycount': json['proficientcompetencycount'],
        'Proficientcompetencypercentage': json['proficientcompetencypercentage'],
        'Proficientcompetencypercentageformatted': json['proficientcompetencypercentageformatted'],
    };
}

export function ToolLpDataForCourseCompetenciesPage200ResponseStatisticsToJSON(value?: ToolLpDataForCourseCompetenciesPage200ResponseStatistics | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canbegradedincourse': value['Canbegradedincourse'],
        'canmanagecoursecompetencies': value['Canmanagecoursecompetencies'],
        'competencycount': value['Competencycount'],
        'leastproficient': ((value['Leastproficient'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerToJSON)),
        'leastproficientcount': value['Leastproficientcount'],
        'proficientcompetencycount': value['Proficientcompetencycount'],
        'proficientcompetencypercentage': value['Proficientcompetencypercentage'],
        'proficientcompetencypercentageformatted': value['Proficientcompetencypercentageformatted'],
    };
}
