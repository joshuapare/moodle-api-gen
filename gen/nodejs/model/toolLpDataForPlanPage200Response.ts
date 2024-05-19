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
import { ToolLpDataForPlanPage200ResponseCompetenciesInner } from './toolLpDataForPlanPage200ResponseCompetenciesInner';

export class ToolLpDataForPlanPage200Response {
    'competencies': Array<ToolLpDataForPlanPage200ResponseCompetenciesInner>;
    /**
    * Count of competencies
    */
    'competencycount': number = null;
    /**
    * Context ID.
    */
    'contextid': number = null;
    'plan': CoreCompetencyReadPlan200Response;
    /**
    * Plugin base URL.
    */
    'pluginbaseurl': string = 'null';
    /**
    * Count of proficientcompetencies
    */
    'proficientcompetencycount': number = null;
    /**
    * Percentage of competencies proficient
    */
    'proficientcompetencypercentage': number = null;
    /**
    * Displayable percentage
    */
    'proficientcompetencypercentageformatted': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "competencies",
            "baseName": "competencies",
            "type": "Array<ToolLpDataForPlanPage200ResponseCompetenciesInner>"
        },
        {
            "name": "competencycount",
            "baseName": "competencycount",
            "type": "number"
        },
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "plan",
            "baseName": "plan",
            "type": "CoreCompetencyReadPlan200Response"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "proficientcompetencycount",
            "baseName": "proficientcompetencycount",
            "type": "number"
        },
        {
            "name": "proficientcompetencypercentage",
            "baseName": "proficientcompetencypercentage",
            "type": "number"
        },
        {
            "name": "proficientcompetencypercentageformatted",
            "baseName": "proficientcompetencypercentageformatted",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForPlanPage200Response.attributeTypeMap;
    }
}

