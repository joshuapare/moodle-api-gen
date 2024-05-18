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

export class ModFeedbackGetResponsesAnalysisRequest {
    /**
    * Course where user completes the feedback (for site feedbacks only).
    */
    'courseid'?: number = 0;
    /**
    * Feedback instance id
    */
    'feedbackid': number;
    /**
    * Group id, 0 means that the function will determine the user group
    */
    'groupid'?: number = 0;
    /**
    * The page of records to return.
    */
    'page'?: number = 0;
    /**
    * The number of records to return per page
    */
    'perpage'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "feedbackid",
            "baseName": "feedbackid",
            "type": "number"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "perpage",
            "baseName": "perpage",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetResponsesAnalysisRequest.attributeTypeMap;
    }
}
