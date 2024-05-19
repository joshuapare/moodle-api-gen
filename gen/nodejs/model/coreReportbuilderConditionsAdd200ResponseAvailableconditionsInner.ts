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
import { CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup } from './coreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup';

export class CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner {
    'Optiongroup'?: CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Optiongroup",
            "baseName": "optiongroup",
            "type": "CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner.attributeTypeMap;
    }
}

