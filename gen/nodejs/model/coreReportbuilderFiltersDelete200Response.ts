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
import { CoreReportbuilderFiltersDelete200ResponseActivefiltersInner } from './coreReportbuilderFiltersDelete200ResponseActivefiltersInner';

export class CoreReportbuilderFiltersDelete200Response {
    'activefilters': Array<CoreReportbuilderFiltersDelete200ResponseActivefiltersInner>;
    'availablefilters': Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>;
    /**
    * hasactivefilters
    */
    'hasactivefilters': boolean;
    /**
    * hasavailablefilters
    */
    'hasavailablefilters': boolean;
    /**
    * helpicon
    */
    'helpicon': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activefilters",
            "baseName": "activefilters",
            "type": "Array<CoreReportbuilderFiltersDelete200ResponseActivefiltersInner>"
        },
        {
            "name": "availablefilters",
            "baseName": "availablefilters",
            "type": "Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>"
        },
        {
            "name": "hasactivefilters",
            "baseName": "hasactivefilters",
            "type": "boolean"
        },
        {
            "name": "hasavailablefilters",
            "baseName": "hasavailablefilters",
            "type": "boolean"
        },
        {
            "name": "helpicon",
            "baseName": "helpicon",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderFiltersDelete200Response.attributeTypeMap;
    }
}
