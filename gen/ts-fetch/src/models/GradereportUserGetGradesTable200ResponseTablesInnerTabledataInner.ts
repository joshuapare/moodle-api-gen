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
import type { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage } from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage';
import {
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverageFromJSON,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverageFromJSONTyped,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverageToJSON,
} from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage';
import type { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal } from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal';
import {
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSONTyped,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON,
} from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal';
import type { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname } from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname';
import {
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemnameFromJSON,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemnameFromJSONTyped,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemnameToJSON,
} from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname';
import type { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader } from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader';
import {
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeaderFromJSON,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeaderFromJSONTyped,
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeaderToJSON,
} from './GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader';

/**
 * table
 * @export
 * @interface GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
 */
export interface GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Average?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Contributiontocoursetotal?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Feedback?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Grade?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Itemname?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Leader?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Lettergrade?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {Array<object>}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Parentcategories?: Array<object>;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Percentage?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Range?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Rank?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    /**
     * 
     * @type {GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
     */
    Weight?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
}

/**
 * Check if a given object implements the GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner interface.
 */
export function instanceOfGradereportUserGetGradesTable200ResponseTablesInnerTabledataInner(value: object): boolean {
    return true;
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerFromJSON(json: any): GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {
    return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerFromJSONTyped(json, false);
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Average': json['average'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverageFromJSON(json['average']),
        'Contributiontocoursetotal': json['contributiontocoursetotal'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['contributiontocoursetotal']),
        'Feedback': json['feedback'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['feedback']),
        'Grade': json['grade'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['grade']),
        'Itemname': json['itemname'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemnameFromJSON(json['itemname']),
        'Leader': json['leader'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeaderFromJSON(json['leader']),
        'Lettergrade': json['lettergrade'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['lettergrade']),
        'Parentcategories': json['parentcategories'] == null ? undefined : json['parentcategories'],
        'Percentage': json['percentage'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['percentage']),
        'Range': json['range'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['range']),
        'Rank': json['rank'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['rank']),
        'Weight': json['weight'] == null ? undefined : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json['weight']),
    };
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerToJSON(value?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'average': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverageToJSON(value['Average']),
        'contributiontocoursetotal': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Contributiontocoursetotal']),
        'feedback': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Feedback']),
        'grade': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Grade']),
        'itemname': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemnameToJSON(value['Itemname']),
        'leader': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeaderToJSON(value['Leader']),
        'lettergrade': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Lettergrade']),
        'parentcategories': value['Parentcategories'],
        'percentage': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Percentage']),
        'range': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Range']),
        'rank': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Rank']),
        'weight': GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value['Weight']),
    };
}
