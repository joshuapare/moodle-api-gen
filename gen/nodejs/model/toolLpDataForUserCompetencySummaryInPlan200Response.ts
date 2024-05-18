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
import { CoreCompetencyReadPlan200Response } from './coreCompetencyReadPlan200Response';
import { ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary } from './toolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary';

export class ToolLpDataForUserCompetencySummaryInPlan200Response {
    'plan': CoreCompetencyReadPlan200Response;
    'usercompetencysummary': ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "plan",
            "baseName": "plan",
            "type": "CoreCompetencyReadPlan200Response"
        },
        {
            "name": "usercompetencysummary",
            "baseName": "usercompetencysummary",
            "type": "ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForUserCompetencySummaryInPlan200Response.attributeTypeMap;
    }
}
