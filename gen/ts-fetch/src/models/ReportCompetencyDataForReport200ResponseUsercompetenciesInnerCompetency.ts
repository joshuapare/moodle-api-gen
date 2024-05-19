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
import type { CoreCompetencyCreateCompetency200Response } from './CoreCompetencyCreateCompetency200Response';
import {
    CoreCompetencyCreateCompetency200ResponseFromJSON,
    CoreCompetencyCreateCompetency200ResponseFromJSONTyped,
    CoreCompetencyCreateCompetency200ResponseToJSON,
} from './CoreCompetencyCreateCompetency200Response';
import type { CoreCompetencyDuplicateCompetencyFramework200Response } from './CoreCompetencyDuplicateCompetencyFramework200Response';
import {
    CoreCompetencyDuplicateCompetencyFramework200ResponseFromJSON,
    CoreCompetencyDuplicateCompetencyFramework200ResponseFromJSONTyped,
    CoreCompetencyDuplicateCompetencyFramework200ResponseToJSON,
} from './CoreCompetencyDuplicateCompetencyFramework200Response';
import type { CoreCompetencyReadUserEvidence200ResponseCompetenciesInner } from './CoreCompetencyReadUserEvidence200ResponseCompetenciesInner';
import {
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSON,
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSONTyped,
    CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerToJSON,
} from './CoreCompetencyReadUserEvidence200ResponseCompetenciesInner';
import type { CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner } from './CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner';
import {
    CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerFromJSON,
    CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerFromJSONTyped,
    CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerToJSON,
} from './CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner';
import type { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath } from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath';
import {
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSON,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSONTyped,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathToJSON,
} from './ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath';

/**
 * 
 * @export
 * @interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
 */
export interface ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency {
    /**
     * 
     * @type {CoreCompetencyCreateCompetency200Response}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Competency: CoreCompetencyCreateCompetency200Response;
    /**
     * 
     * @type {ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Comppath: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath;
    /**
     * 
     * @type {CoreCompetencyDuplicateCompetencyFramework200Response}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Framework: CoreCompetencyDuplicateCompetencyFramework200Response;
    /**
     * hascourses
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Hascourses: boolean;
    /**
     * hasrelatedcompetencies
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Hasrelatedcompetencies: boolean;
    /**
     * 
     * @type {Array<CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Linkedcourses: Array<CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>;
    /**
     * pluginbaseurl
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Pluginbaseurl: string;
    /**
     * 
     * @type {Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Relatedcompetencies: Array<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>;
    /**
     * scaleconfiguration
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Scaleconfiguration: string;
    /**
     * scaleid
     * @type {number}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Scaleid: number;
    /**
     * taxonomyterm
     * @type {string}
     * @memberof ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
     */
    Taxonomyterm: string;
}

/**
 * Check if a given object implements the ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency interface.
 */
export function instanceOfReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency(value: object): boolean {
    if (!('Competency' in value)) return false;
    if (!('Comppath' in value)) return false;
    if (!('Framework' in value)) return false;
    if (!('Hascourses' in value)) return false;
    if (!('Hasrelatedcompetencies' in value)) return false;
    if (!('Linkedcourses' in value)) return false;
    if (!('Pluginbaseurl' in value)) return false;
    if (!('Relatedcompetencies' in value)) return false;
    if (!('Scaleconfiguration' in value)) return false;
    if (!('Scaleid' in value)) return false;
    if (!('Taxonomyterm' in value)) return false;
    return true;
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyFromJSON(json: any): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency {
    return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyFromJSONTyped(json, false);
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency {
    if (json == null) {
        return json;
    }
    return {
        
        'Competency': CoreCompetencyCreateCompetency200ResponseFromJSON(json['competency']),
        'Comppath': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFromJSON(json['comppath']),
        'Framework': CoreCompetencyDuplicateCompetencyFramework200ResponseFromJSON(json['framework']),
        'Hascourses': json['hascourses'],
        'Hasrelatedcompetencies': json['hasrelatedcompetencies'],
        'Linkedcourses': ((json['linkedcourses'] as Array<any>).map(CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerFromJSON)),
        'Pluginbaseurl': json['pluginbaseurl'],
        'Relatedcompetencies': ((json['relatedcompetencies'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerFromJSON)),
        'Scaleconfiguration': json['scaleconfiguration'],
        'Scaleid': json['scaleid'],
        'Taxonomyterm': json['taxonomyterm'],
    };
}

export function ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyToJSON(value?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competency': CoreCompetencyCreateCompetency200ResponseToJSON(value['Competency']),
        'comppath': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathToJSON(value['Comppath']),
        'framework': CoreCompetencyDuplicateCompetencyFramework200ResponseToJSON(value['Framework']),
        'hascourses': value['Hascourses'],
        'hasrelatedcompetencies': value['Hasrelatedcompetencies'],
        'linkedcourses': ((value['Linkedcourses'] as Array<any>).map(CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInnerToJSON)),
        'pluginbaseurl': value['Pluginbaseurl'],
        'relatedcompetencies': ((value['Relatedcompetencies'] as Array<any>).map(CoreCompetencyReadUserEvidence200ResponseCompetenciesInnerToJSON)),
        'scaleconfiguration': value['Scaleconfiguration'],
        'scaleid': value['Scaleid'],
        'taxonomyterm': value['Taxonomyterm'],
    };
}

