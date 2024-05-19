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

export class ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    /**
    * Attempt time ended.
    */
    'end'?: number = null;
    /**
    * Attempt grade.
    */
    'grade'?: number = null;
    /**
    * Attempt last time continued.
    */
    'timeend'?: number = null;
    /**
    * Attempt time started.
    */
    'timestart'?: number = null;
    /**
    * Attempt number.
    */
    '_try'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "end",
            "baseName": "end",
            "type": "number"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "_try",
            "baseName": "try",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.attributeTypeMap;
    }
}

