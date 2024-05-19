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
import { CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner } from './coreReportbuilderRetrieveSystemReport200ResponseDataRowsInner';

export class CoreReportbuilderRetrieveSystemReport200ResponseData {
    'headers': Array<object>;
    'rows': Array<CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner>;
    /**
    * totalrowcount
    */
    'totalrowcount': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "headers",
            "baseName": "headers",
            "type": "Array<object>"
        },
        {
            "name": "rows",
            "baseName": "rows",
            "type": "Array<CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner>"
        },
        {
            "name": "totalrowcount",
            "baseName": "totalrowcount",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderRetrieveSystemReport200ResponseData.attributeTypeMap;
    }
}

