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
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner } from './coreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner';

export class CoreGradingGetDefinitions200ResponseAreasInner {
    /**
    * active method
    */
    'activemethod'?: string = 'null';
    /**
    * area name
    */
    'areaname'?: string;
    /**
    * course module id
    */
    'cmid'?: number;
    /**
    * component name
    */
    'component'?: string = 'null';
    /**
    * context id
    */
    'contextid'?: number;
    'definitions'?: Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activemethod",
            "baseName": "activemethod",
            "type": "string"
        },
        {
            "name": "areaname",
            "baseName": "areaname",
            "type": "string"
        },
        {
            "name": "cmid",
            "baseName": "cmid",
            "type": "number"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "definitions",
            "baseName": "definitions",
            "type": "Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreGradingGetDefinitions200ResponseAreasInner.attributeTypeMap;
    }
}
