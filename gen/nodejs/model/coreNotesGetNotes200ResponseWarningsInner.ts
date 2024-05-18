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
export class CoreNotesGetNotes200ResponseWarningsInner {
    /**
    * item is always \'note\'
    */
    'item'?: string = 'null';
    /**
    * When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist
    */
    'itemid'?: number = null;
    /**
    * untranslated english message to explain the warning
    */
    'message'?: string;
    /**
    * errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist)
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
        return CoreNotesGetNotes200ResponseWarningsInner.attributeTypeMap;
    }
}

