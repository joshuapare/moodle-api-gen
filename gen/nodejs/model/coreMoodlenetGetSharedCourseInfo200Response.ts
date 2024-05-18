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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';

export class CoreMoodlenetGetSharedCourseInfo200Response {
    /**
    * MoodleNet issuer id
    */
    'issuerid': number;
    /**
    * Course short name
    */
    'name': string = 'null';
    /**
    * MoodleNet server
    */
    'server': string;
    /**
    * status: true if success
    */
    'status': boolean;
    /**
    * Support page URL
    */
    'supportpageurl': string;
    /**
    * Course type
    */
    'type': string = 'null';
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "issuerid",
            "baseName": "issuerid",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "server",
            "baseName": "server",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "boolean"
        },
        {
            "name": "supportpageurl",
            "baseName": "supportpageurl",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreMoodlenetGetSharedCourseInfo200Response.attributeTypeMap;
    }
}
