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
import type { CoreCompetencyGradeCompetency200ResponseActionuser } from './CoreCompetencyGradeCompetency200ResponseActionuser';
import {
    CoreCompetencyGradeCompetency200ResponseActionuserFromJSON,
    CoreCompetencyGradeCompetency200ResponseActionuserFromJSONTyped,
    CoreCompetencyGradeCompetency200ResponseActionuserToJSON,
} from './CoreCompetencyGradeCompetency200ResponseActionuser';
import type { CoreCompetencyReadPlan200ResponseCommentarea } from './CoreCompetencyReadPlan200ResponseCommentarea';
import {
    CoreCompetencyReadPlan200ResponseCommentareaFromJSON,
    CoreCompetencyReadPlan200ResponseCommentareaFromJSONTyped,
    CoreCompetencyReadPlan200ResponseCommentareaToJSON,
} from './CoreCompetencyReadPlan200ResponseCommentarea';
import type { ToolLpDataForCompetencySummary200Response } from './ToolLpDataForCompetencySummary200Response';
import {
    ToolLpDataForCompetencySummary200ResponseFromJSON,
    ToolLpDataForCompetencySummary200ResponseFromJSONTyped,
    ToolLpDataForCompetencySummary200ResponseToJSON,
} from './ToolLpDataForCompetencySummary200Response';
import type { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse } from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse';
import {
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSON,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSONTyped,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseToJSON,
} from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse';
import type { ToolLpDataForUserCompetencySummary200ResponseEvidenceInner } from './ToolLpDataForUserCompetencySummary200ResponseEvidenceInner';
import {
    ToolLpDataForUserCompetencySummary200ResponseEvidenceInnerFromJSON,
    ToolLpDataForUserCompetencySummary200ResponseEvidenceInnerFromJSONTyped,
    ToolLpDataForUserCompetencySummary200ResponseEvidenceInnerToJSON,
} from './ToolLpDataForUserCompetencySummary200ResponseEvidenceInner';
import type { ToolLpDataForUserCompetencySummary200ResponseUsercompetency } from './ToolLpDataForUserCompetencySummary200ResponseUsercompetency';
import {
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSON,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSONTyped,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyToJSON,
} from './ToolLpDataForUserCompetencySummary200ResponseUsercompetency';
import type { ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan } from './ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan';
import {
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplanFromJSON,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplanFromJSONTyped,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplanToJSON,
} from './ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan';

/**
 * 
 * @export
 * @interface ToolLpDataForUserCompetencySummary200Response
 */
export interface ToolLpDataForUserCompetencySummary200Response {
    /**
     * cangrade
     * @type {boolean}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    cangrade: boolean;
    /**
     * 
     * @type {CoreCompetencyReadPlan200ResponseCommentarea}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    commentarea?: CoreCompetencyReadPlan200ResponseCommentarea;
    /**
     * 
     * @type {ToolLpDataForCompetencySummary200Response}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    competency: ToolLpDataForCompetencySummary200Response;
    /**
     * 
     * @type {Array<ToolLpDataForUserCompetencySummary200ResponseEvidenceInner>}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    evidence: Array<ToolLpDataForUserCompetencySummary200ResponseEvidenceInner>;
    /**
     * showrelatedcompetencies
     * @type {boolean}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    showrelatedcompetencies: boolean;
    /**
     * 
     * @type {CoreCompetencyGradeCompetency200ResponseActionuser}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    user: CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
     * 
     * @type {ToolLpDataForUserCompetencySummary200ResponseUsercompetency}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    usercompetency?: ToolLpDataForUserCompetencySummary200ResponseUsercompetency;
    /**
     * 
     * @type {ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    usercompetencycourse?: ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse;
    /**
     * 
     * @type {ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan}
     * @memberof ToolLpDataForUserCompetencySummary200Response
     */
    usercompetencyplan?: ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan;
}

/**
 * Check if a given object implements the ToolLpDataForUserCompetencySummary200Response interface.
 */
export function instanceOfToolLpDataForUserCompetencySummary200Response(value: object): boolean {
    if (!('cangrade' in value)) return false;
    if (!('competency' in value)) return false;
    if (!('evidence' in value)) return false;
    if (!('showrelatedcompetencies' in value)) return false;
    if (!('user' in value)) return false;
    return true;
}

export function ToolLpDataForUserCompetencySummary200ResponseFromJSON(json: any): ToolLpDataForUserCompetencySummary200Response {
    return ToolLpDataForUserCompetencySummary200ResponseFromJSONTyped(json, false);
}

export function ToolLpDataForUserCompetencySummary200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForUserCompetencySummary200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'cangrade': json['cangrade'],
        'commentarea': json['commentarea'] == null ? undefined : CoreCompetencyReadPlan200ResponseCommentareaFromJSON(json['commentarea']),
        'competency': ToolLpDataForCompetencySummary200ResponseFromJSON(json['competency']),
        'evidence': ((json['evidence'] as Array<any>).map(ToolLpDataForUserCompetencySummary200ResponseEvidenceInnerFromJSON)),
        'showrelatedcompetencies': json['showrelatedcompetencies'],
        'user': CoreCompetencyGradeCompetency200ResponseActionuserFromJSON(json['user']),
        'usercompetency': json['usercompetency'] == null ? undefined : ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSON(json['usercompetency']),
        'usercompetencycourse': json['usercompetencycourse'] == null ? undefined : ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseFromJSON(json['usercompetencycourse']),
        'usercompetencyplan': json['usercompetencyplan'] == null ? undefined : ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplanFromJSON(json['usercompetencyplan']),
    };
}

export function ToolLpDataForUserCompetencySummary200ResponseToJSON(value?: ToolLpDataForUserCompetencySummary200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cangrade': value['cangrade'],
        'commentarea': CoreCompetencyReadPlan200ResponseCommentareaToJSON(value['commentarea']),
        'competency': ToolLpDataForCompetencySummary200ResponseToJSON(value['competency']),
        'evidence': ((value['evidence'] as Array<any>).map(ToolLpDataForUserCompetencySummary200ResponseEvidenceInnerToJSON)),
        'showrelatedcompetencies': value['showrelatedcompetencies'],
        'user': CoreCompetencyGradeCompetency200ResponseActionuserToJSON(value['user']),
        'usercompetency': ToolLpDataForUserCompetencySummary200ResponseUsercompetencyToJSON(value['usercompetency']),
        'usercompetencycourse': ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourseToJSON(value['usercompetencycourse']),
        'usercompetencyplan': ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplanToJSON(value['usercompetencyplan']),
    };
}
