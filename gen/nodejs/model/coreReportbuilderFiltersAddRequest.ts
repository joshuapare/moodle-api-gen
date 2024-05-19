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

export class CoreReportbuilderFiltersAddRequest {
    /**
    * Report ID
    */
    'Reportid': number;
    /**
    * Unique identifier of the filter
    */
    'Uniqueidentifier': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Reportid",
            "baseName": "reportid",
            "type": "number"
        },
        {
            "name": "Uniqueidentifier",
            "baseName": "uniqueidentifier",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderFiltersAddRequest.attributeTypeMap;
    }
}

