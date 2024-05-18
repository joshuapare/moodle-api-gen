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

export class ModForumSetPinState200ResponseTimes {
    /**
    * end
    */
    'end': number = null;
    /**
    * locked
    */
    'locked': number = null;
    /**
    * modified
    */
    'modified': number = null;
    /**
    * start
    */
    'start': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "end",
            "baseName": "end",
            "type": "number"
        },
        {
            "name": "locked",
            "baseName": "locked",
            "type": "number"
        },
        {
            "name": "modified",
            "baseName": "modified",
            "type": "number"
        },
        {
            "name": "start",
            "baseName": "start",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModForumSetPinState200ResponseTimes.attributeTypeMap;
    }
}
