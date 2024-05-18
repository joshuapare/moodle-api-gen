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

/**
* warning
*/
export class ModAssignGetAssignments200ResponseWarningsInner {
    /**
    * item can be \'course\' (errorcode 1 or 2) or \'module\' (errorcode 1)
    */
    'item'?: string = 'null';
    /**
    * When item is a course then itemid is a course id. When the item is a module then itemid is a module id
    */
    'itemid'?: number = null;
    /**
    * untranslated english message to explain the warning
    */
    'message'?: string;
    /**
    * errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions)
    */
    'warningcode'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "item",
            "baseName": "item",
            "type": "string"
        },
        {
            "name": "itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "warningcode",
            "baseName": "warningcode",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetAssignments200ResponseWarningsInner.attributeTypeMap;
    }
}
