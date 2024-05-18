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
import { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner } from './coreReportbuilderConditionsDelete200ResponseAvailableconditionsInner';

export class CoreReportbuilderConditionsDelete200Response {
    /**
    * activeconditionsform
    */
    'activeconditionsform': string;
    'availableconditions': Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>;
    /**
    * hasactiveconditions
    */
    'hasactiveconditions': boolean;
    /**
    * hasavailableconditions
    */
    'hasavailableconditions': boolean;
    /**
    * helpicon
    */
    'helpicon': string;
    /**
    * javascript
    */
    'javascript'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activeconditionsform",
            "baseName": "activeconditionsform",
            "type": "string"
        },
        {
            "name": "availableconditions",
            "baseName": "availableconditions",
            "type": "Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>"
        },
        {
            "name": "hasactiveconditions",
            "baseName": "hasactiveconditions",
            "type": "boolean"
        },
        {
            "name": "hasavailableconditions",
            "baseName": "hasavailableconditions",
            "type": "boolean"
        },
        {
            "name": "helpicon",
            "baseName": "helpicon",
            "type": "string"
        },
        {
            "name": "javascript",
            "baseName": "javascript",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderConditionsDelete200Response.attributeTypeMap;
    }
}

