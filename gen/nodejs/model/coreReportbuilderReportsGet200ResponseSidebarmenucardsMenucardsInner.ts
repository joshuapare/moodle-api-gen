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
import { CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner } from './coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner';

export class CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner {
    'items'?: Array<CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner>;
    /**
    * key
    */
    'key'?: string;
    /**
    * name
    */
    'name'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner>"
        },
        {
            "name": "key",
            "baseName": "key",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner.attributeTypeMap;
    }
}
