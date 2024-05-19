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

export class ModFeedbackGetUnfinishedResponses200ResponseResponsesInner {
    /**
    * Reference to the feedback_completedtmp table.
    */
    'completed'?: number = null;
    /**
    * The course id this record belongs to.
    */
    'courseId'?: number;
    /**
    * The record id.
    */
    'id'?: number;
    /**
    * The item id that was responded.
    */
    'item'?: number;
    /**
    * Old field - not used anymore.
    */
    'tmpCompleted'?: number;
    /**
    * The response value.
    */
    'value'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "completed",
            "baseName": "completed",
            "type": "number"
        },
        {
            "name": "courseId",
            "baseName": "course_id",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "item",
            "baseName": "item",
            "type": "number"
        },
        {
            "name": "tmpCompleted",
            "baseName": "tmp_completed",
            "type": "number"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.attributeTypeMap;
    }
}

