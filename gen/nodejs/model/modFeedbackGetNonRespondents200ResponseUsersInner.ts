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

export class ModFeedbackGetNonRespondents200ResponseUsersInner {
    /**
    * Course id
    */
    'courseid'?: number;
    /**
    * User full name
    */
    'fullname'?: string;
    /**
    * If the user has started the attempt
    */
    'started'?: boolean = null;
    /**
    * The user id
    */
    'userid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "started",
            "baseName": "started",
            "type": "boolean"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetNonRespondents200ResponseUsersInner.attributeTypeMap;
    }
}
