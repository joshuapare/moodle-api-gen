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

export class CoreUserGetUsersRequestCriteriaInner {
    /**
    * the user column to search, expected keys (value format) are:                                 \"id\" (int) matching user id,                                 \"lastname\" (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \"firstname\" (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \"idnumber\" (string) matching user idnumber,                                 \"username\" (string) matching user username,                                 \"email\" (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \"auth\" (string) matching user auth plugin
    */
    'Key'?: string = 'null';
    /**
    * the value to search
    */
    'Value'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Key",
            "baseName": "key",
            "type": "string"
        },
        {
            "name": "Value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreUserGetUsersRequestCriteriaInner.attributeTypeMap;
    }
}

