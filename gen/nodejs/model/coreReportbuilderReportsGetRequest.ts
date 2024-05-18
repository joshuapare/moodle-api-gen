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

export class CoreReportbuilderReportsGetRequest {
    /**
    * Whether editing mode is enabled
    */
    'editmode'?: boolean = 0;
    /**
    * Page size
    */
    'pagesize'?: number = 0;
    /**
    * Report ID
    */
    'reportid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "editmode",
            "baseName": "editmode",
            "type": "boolean"
        },
        {
            "name": "pagesize",
            "baseName": "pagesize",
            "type": "number"
        },
        {
            "name": "reportid",
            "baseName": "reportid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderReportsGetRequest.attributeTypeMap;
    }
}
