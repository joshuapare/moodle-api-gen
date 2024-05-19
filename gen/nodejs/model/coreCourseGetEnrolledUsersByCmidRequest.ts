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

export class CoreCourseGetEnrolledUsersByCmidRequest {
    /**
    * id of the course module
    */
    'cmid': number = null;
    /**
    * id of the group
    */
    'groupid'?: number = 0;
    /**
    * whether to return only active users or all.
    */
    'onlyactive'?: boolean = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cmid",
            "baseName": "cmid",
            "type": "number"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "onlyactive",
            "baseName": "onlyactive",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetEnrolledUsersByCmidRequest.attributeTypeMap;
    }
}

