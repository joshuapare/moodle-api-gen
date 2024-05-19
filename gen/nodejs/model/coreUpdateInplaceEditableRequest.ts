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

export class CoreUpdateInplaceEditableRequest {
    /**
    * component responsible for the update
    */
    'Component': string = 'null';
    /**
    * identifier of the updated item
    */
    'Itemid': string = 'null';
    /**
    * type of the updated item inside the component
    */
    'Itemtype': string = 'null';
    /**
    * new value
    */
    'Value': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "string"
        },
        {
            "name": "Itemtype",
            "baseName": "itemtype",
            "type": "string"
        },
        {
            "name": "Value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreUpdateInplaceEditableRequest.attributeTypeMap;
    }
}

