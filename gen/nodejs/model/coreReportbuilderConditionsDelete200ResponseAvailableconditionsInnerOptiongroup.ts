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
import { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner } from './coreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner';

export class CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup {
    /**
    * text
    */
    'text': string;
    'values': Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup.attributeTypeMap;
    }
}
