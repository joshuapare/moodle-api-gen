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

export class CoreAuthIsAgeDigitalConsentVerificationEnabled200Response {
    /**
    * True if digital consent verification is enabled,                     false otherwise.
    */
    'Status': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Status",
            "baseName": "status",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return CoreAuthIsAgeDigitalConsentVerificationEnabled200Response.attributeTypeMap;
    }
}

