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

export class ModFeedbackGetAnalysisRequest {
    /**
    * Course where user completes the feedback (for site feedbacks only).
    */
    'Courseid'?: number = 0;
    /**
    * Feedback instance id
    */
    'Feedbackid': number = null;
    /**
    * Group id, 0 means that the function will determine the user group
    */
    'Groupid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "Feedbackid",
            "baseName": "feedbackid",
            "type": "number"
        },
        {
            "name": "Groupid",
            "baseName": "groupid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetAnalysisRequest.attributeTypeMap;
    }
}

