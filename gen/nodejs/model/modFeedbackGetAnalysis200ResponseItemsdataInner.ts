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
import { ModFeedbackGetAnalysis200ResponseItemsdataInnerItem } from './modFeedbackGetAnalysis200ResponseItemsdataInnerItem';

export class ModFeedbackGetAnalysis200ResponseItemsdataInner {
    'data'?: Array<object>;
    'item'?: ModFeedbackGetAnalysis200ResponseItemsdataInnerItem;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<object>"
        },
        {
            "name": "item",
            "baseName": "item",
            "type": "ModFeedbackGetAnalysis200ResponseItemsdataInnerItem"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetAnalysis200ResponseItemsdataInner.attributeTypeMap;
    }
}
