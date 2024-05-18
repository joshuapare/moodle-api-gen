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

export class EnrolLicenseGetInstanceInfo200Response {
    /**
    * id of course
    */
    'courseid': number;
    /**
    * password required for enrolment
    */
    'enrolpassword'?: string = 'null';
    /**
    * id of course enrolment instance
    */
    'id': number = null;
    /**
    * name of enrolment plugin
    */
    'name': string = 'null';
    /**
    * status of enrolment plugin
    */
    'status': string = 'null';
    /**
    * type of enrolment plugin
    */
    'type': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "enrolpassword",
            "baseName": "enrolpassword",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return EnrolLicenseGetInstanceInfo200Response.attributeTypeMap;
    }
}

