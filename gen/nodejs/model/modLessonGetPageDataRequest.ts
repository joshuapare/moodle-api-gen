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

export class ModLessonGetPageDataRequest {
    /**
    * lesson instance id
    */
    'lessonid': number;
    /**
    * the page id
    */
    'pageid': number = null;
    /**
    * optional password (the lesson may be protected)
    */
    'password'?: string = '';
    /**
    * if we must return the complete page contents once rendered
    */
    'returncontents'?: boolean = false;
    /**
    * if we want to review just after finishing (1 hour margin)
    */
    'review'?: boolean = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
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
            "name": "returncontents",
            "baseName": "returncontents",
            "type": "boolean"
        },
        {
            "name": "review",
            "baseName": "review",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetPageDataRequest.attributeTypeMap;
    }
}
