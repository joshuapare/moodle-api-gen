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

export class ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner {
    /**
    * The id of the assessment.
    */
    'Assessmentid'?: number;
    /**
    * The grade for submission.
    */
    'Grade'?: number;
    /**
    * The grade for assessment.
    */
    'Gradinggrade'?: number;
    /**
    * The aggregated grade overrided.
    */
    'Gradinggradeover'?: number;
    /**
    * The id of the submission assessed.
    */
    'Submissionid'?: number;
    /**
    * The id of the user (0 when is configured to do not display names).
    */
    'Userid'?: number;
    /**
    * The weight of the assessment for aggregation.
    */
    'Weight'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Assessmentid",
            "baseName": "assessmentid",
            "type": "number"
        },
        {
            "name": "Grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "Gradinggrade",
            "baseName": "gradinggrade",
            "type": "number"
        },
        {
            "name": "Gradinggradeover",
            "baseName": "gradinggradeover",
            "type": "number"
        },
        {
            "name": "Submissionid",
            "baseName": "submissionid",
            "type": "number"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "Weight",
            "baseName": "weight",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.attributeTypeMap;
    }
}

