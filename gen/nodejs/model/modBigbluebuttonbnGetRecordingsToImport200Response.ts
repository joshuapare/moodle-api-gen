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
import { ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata } from './modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata';

export class ModBigbluebuttonbnGetRecordingsToImport200Response {
    /**
    * Whether the fetch was successful
    */
    'Status': boolean;
    'Tabledata'?: ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Status",
            "baseName": "status",
            "type": "boolean"
        },
        {
            "name": "Tabledata",
            "baseName": "tabledata",
            "type": "ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModBigbluebuttonbnGetRecordingsToImport200Response.attributeTypeMap;
    }
}

