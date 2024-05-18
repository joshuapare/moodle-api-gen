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
import { CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails } from './coreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails';

/**
* Completions
*/
export class CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner {
    /**
    * Completion status (true/false)
    */
    'complete'?: boolean = null;
    'details'?: CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails;
    /**
    * Completion status (Yes/No) a % or number
    */
    'status'?: string = 'null';
    /**
    * Timestamp for criteria completetion
    */
    'timecompleted'?: number = null;
    /**
    * Completion criteria Title
    */
    'title'?: string = 'null';
    /**
    * Completion criteria type
    */
    'type'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "complete",
            "baseName": "complete",
            "type": "boolean"
        },
        {
            "name": "details",
            "baseName": "details",
            "type": "CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string"
        },
        {
            "name": "timecompleted",
            "baseName": "timecompleted",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.attributeTypeMap;
    }
}
