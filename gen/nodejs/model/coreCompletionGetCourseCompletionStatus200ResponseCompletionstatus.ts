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
import { CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner } from './coreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner';

export class CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus {
    /**
    * aggregation method 1 means all, 2 means any
    */
    'aggregation': number = null;
    /**
    * true if the course is complete, false otherwise
    */
    'completed': boolean = null;
    'completions': Array<CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "aggregation",
            "baseName": "aggregation",
            "type": "number"
        },
        {
            "name": "completed",
            "baseName": "completed",
            "type": "boolean"
        },
        {
            "name": "completions",
            "baseName": "completions",
            "type": "Array<CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.attributeTypeMap;
    }
}
