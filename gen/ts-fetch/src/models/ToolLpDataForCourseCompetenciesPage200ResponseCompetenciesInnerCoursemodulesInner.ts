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
 * @interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
 */
export interface ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner {
    /**
     * iconurl
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
     */
    Iconurl?: string;
    /**
     * id
     * @type {number}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
     */
    Id?: number;
    /**
     * name
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
     */
    Name?: string;
    /**
     * url
     * @type {string}
     * @memberof ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
     */
    Url?: string;
}

/**
 * Check if a given object implements the ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner interface.
 */
export function instanceOfToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner(value: object): boolean {
    return true;
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSON(json: any): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner {
    return ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSONTyped(json, false);
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Iconurl': json['iconurl'] == null ? undefined : json['iconurl'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Url': json['url'] == null ? undefined : json['url'],
    };
}

export function ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerToJSON(value?: ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'iconurl': value['Iconurl'],
        'id': value['Id'],
        'name': value['Name'],
        'url': value['Url'],
    };
}
