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

export class ModWorkshopEvaluateAssessmentRequest {
    /**
    * Assessment id.
    */
    'assessmentid': number = null;
    /**
    * The feedback format for text.
    */
    'feedbackformat'?: number = 0;
    /**
    * The feedback for the reviewer.
    */
    'feedbacktext'?: string = '';
    /**
    * The new grading grade.
    */
    'gradinggradeover'?: string = '';
    /**
    * The new weight for the assessment.
    */
    'weight'?: number = 1;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assessmentid",
            "baseName": "assessmentid",
            "type": "number"
        },
        {
            "name": "feedbackformat",
            "baseName": "feedbackformat",
            "type": "number"
        },
        {
            "name": "feedbacktext",
            "baseName": "feedbacktext",
            "type": "string"
        },
        {
            "name": "gradinggradeover",
            "baseName": "gradinggradeover",
            "type": "string"
        },
        {
            "name": "weight",
            "baseName": "weight",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopEvaluateAssessmentRequest.attributeTypeMap;
    }
}

