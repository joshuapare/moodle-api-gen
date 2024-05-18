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
import { ModLessonProcessPageRequestDataInner } from './modLessonProcessPageRequestDataInner';

export class ModLessonProcessPageRequest {
    'data': Array<ModLessonProcessPageRequestDataInner>;
    /**
    * lesson instance id
    */
    'lessonid': number;
    /**
    * the page id
    */
    'pageid': number;
    /**
    * optional password (the lesson may be protected)
    */
    'password'?: string = '';
    /**
    * if we want to review just after finishing (1 hour margin)
    */
    'review'?: boolean = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<ModLessonProcessPageRequestDataInner>"
        },
        {
            "name": "lessonid",
            "baseName": "lessonid",
            "type": "number"
        },
        {
            "name": "pageid",
            "baseName": "pageid",
            "type": "number"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "review",
            "baseName": "review",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonProcessPageRequest.attributeTypeMap;
    }
}
