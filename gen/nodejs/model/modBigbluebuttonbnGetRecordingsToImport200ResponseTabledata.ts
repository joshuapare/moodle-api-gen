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
import { ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner } from './modBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner';

export class ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {
    'activity': string;
    'columns': Array<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner>;
    'data': string;
    'locale': string;
    'pingInterval': number;
    'profileFeatures': Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activity",
            "baseName": "activity",
            "type": "string"
        },
        {
            "name": "columns",
            "baseName": "columns",
            "type": "Array<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner>"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "string"
        },
        {
            "name": "locale",
            "baseName": "locale",
            "type": "string"
        },
        {
            "name": "pingInterval",
            "baseName": "ping_interval",
            "type": "number"
        },
        {
            "name": "profileFeatures",
            "baseName": "profile_features",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.attributeTypeMap;
    }
}
