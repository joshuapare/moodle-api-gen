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
 * @interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
 */
export interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework {
    /**
     * first
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
     */
    First: boolean;
    /**
     * id
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
     */
    Id: number;
    /**
     * last
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
     */
    Last: boolean;
    /**
     * name
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
     */
    Name: string;
    /**
     * position
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
     */
    Position: number;
}

/**
 * Check if a given object implements the ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework interface.
 */
export function instanceOfReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework(value: object): boolean {
    if (!('First' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Last' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Position' in value)) return false;
    return true;
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSON(json: any): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework {
    return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSONTyped(json, false);
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework {
    if (json == null) {
        return json;
    }
    return {
        
        'First': json['first'],
        'Id': json['id'],
        'Last': json['last'],
        'Name': json['name'],
        'Position': json['position'],
    };
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkToJSON(value?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'first': value['First'],
        'id': value['Id'],
        'last': value['Last'],
        'name': value['Name'],
        'position': value['Position'],
    };
}
