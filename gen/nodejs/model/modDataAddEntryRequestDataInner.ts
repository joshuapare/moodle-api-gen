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

export class ModDataAddEntryRequestDataInner {
    /**
    * The field id.
    */
    'fieldid'?: number = null;
    /**
    * The subfield name (if required).
    */
    'subfield'?: string = '';
    /**
    * The contents for the field always JSON encoded.
    */
    'value'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fieldid",
            "baseName": "fieldid",
            "type": "number"
        },
        {
            "name": "subfield",
            "baseName": "subfield",
            "type": "string"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModDataAddEntryRequestDataInner.attributeTypeMap;
    }
}
