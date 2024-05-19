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

import { RequestFile } from './models';
import { CoreCompetencyGradeCompetency200ResponseActionuser } from './coreCompetencyGradeCompetency200ResponseActionuser';
import { CoreCompetencyReadPlan200ResponseCommentarea } from './coreCompetencyReadPlan200ResponseCommentarea';
import { ToolLpDataForCompetencySummary200Response } from './toolLpDataForCompetencySummary200Response';
import { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse } from './toolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse';
import { ToolLpDataForUserCompetencySummary200ResponseEvidenceInner } from './toolLpDataForUserCompetencySummary200ResponseEvidenceInner';
import { ToolLpDataForUserCompetencySummary200ResponseUsercompetency } from './toolLpDataForUserCompetencySummary200ResponseUsercompetency';
import { ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan } from './toolLpDataForUserCompetencySummary200ResponseUsercompetencyplan';

export class ToolLpDataForUserCompetencySummary200Response {
    /**
    * cangrade
    */
    'cangrade': boolean = null;
    'commentarea'?: CoreCompetencyReadPlan200ResponseCommentarea;
    'competency': ToolLpDataForCompetencySummary200Response;
    'evidence': Array<ToolLpDataForUserCompetencySummary200ResponseEvidenceInner>;
    /**
    * showrelatedcompetencies
    */
    'showrelatedcompetencies': boolean = null;
    'user': CoreCompetencyGradeCompetency200ResponseActionuser;
    'usercompetency'?: ToolLpDataForUserCompetencySummary200ResponseUsercompetency;
    'usercompetencycourse'?: ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse;
    'usercompetencyplan'?: ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cangrade",
            "baseName": "cangrade",
            "type": "boolean"
        },
        {
            "name": "commentarea",
            "baseName": "commentarea",
            "type": "CoreCompetencyReadPlan200ResponseCommentarea"
        },
        {
            "name": "competency",
            "baseName": "competency",
            "type": "ToolLpDataForCompetencySummary200Response"
        },
        {
            "name": "evidence",
            "baseName": "evidence",
            "type": "Array<ToolLpDataForUserCompetencySummary200ResponseEvidenceInner>"
        },
        {
            "name": "showrelatedcompetencies",
            "baseName": "showrelatedcompetencies",
            "type": "boolean"
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "CoreCompetencyGradeCompetency200ResponseActionuser"
        },
        {
            "name": "usercompetency",
            "baseName": "usercompetency",
            "type": "ToolLpDataForUserCompetencySummary200ResponseUsercompetency"
        },
        {
            "name": "usercompetencycourse",
            "baseName": "usercompetencycourse",
            "type": "ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse"
        },
        {
            "name": "usercompetencyplan",
            "baseName": "usercompetencyplan",
            "type": "ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForUserCompetencySummary200Response.attributeTypeMap;
    }
}

