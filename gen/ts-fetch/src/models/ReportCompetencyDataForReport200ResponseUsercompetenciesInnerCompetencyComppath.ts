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
import type { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner } from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner';
import {
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInnerFromJSON,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInnerFromJSONTyped,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInnerToJSON,
} from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner';
import type { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework } from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework';
import {
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSON,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSONTyped,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkToJSON,
} from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework';

/**
 * 
 * @export
 * @interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
 */
export interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath {
    /**
     * 
     * @type {Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner>}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    Ancestors: Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner>;
    /**
     * 
     * @type {ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    Framework: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework;
    /**
     * pagecontextid
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    Pagecontextid: number;
    /**
     * pluginbaseurl
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    Pluginbaseurl: string;
    /**
     * showlinks
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
     */
    Showlinks: boolean;
}

/**
 * Check if a given object implements the ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath interface.
 */
export function instanceOfReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath(value: object): boolean {
    if (!('Ancestors' in value)) return false;
    if (!('Framework' in value)) return false;
    if (!('Pagecontextid' in value)) return false;
    if (!('Pluginbaseurl' in value)) return false;
    if (!('Showlinks' in value)) return false;
    return true;
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSON(json: any): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath {
    return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSONTyped(json, false);
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath {
    if (json == null) {
        return json;
    }
    return {
        
        'Ancestors': ((json['ancestors'] as Array<any>).map(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInnerFromJSON)),
        'Framework': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkFromJSON(json['framework']),
        'Pagecontextid': json['pagecontextid'],
        'Pluginbaseurl': json['pluginbaseurl'],
        'Showlinks': json['showlinks'],
    };
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathToJSON(value?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ancestors': ((value['Ancestors'] as Array<any>).map(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInnerToJSON)),
        'framework': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFrameworkToJSON(value['Framework']),
        'pagecontextid': value['Pagecontextid'],
        'pluginbaseurl': value['Pluginbaseurl'],
        'showlinks': value['Showlinks'],
    };
}
