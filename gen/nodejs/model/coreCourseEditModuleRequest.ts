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

export class CoreCourseEditModuleRequest {
    /**
    * action: hide, show, stealth, duplicate, delete, moveleft, moveright, group...
    */
    'action': string = 'null';
    /**
    * course module id
    */
    'id': number;
    /**
    * section to return to
    */
    'sectionreturn'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "sectionreturn",
            "baseName": "sectionreturn",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseEditModuleRequest.attributeTypeMap;
    }
}
