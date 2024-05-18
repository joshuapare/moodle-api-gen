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

export class CoreMessageMessageSearchUsersRequest {
    /**
    * Limit from
    */
    'limitfrom'?: number = 0;
    /**
    * Limit number
    */
    'limitnum'?: number = 0;
    /**
    * The string being searched
    */
    'search': string;
    /**
    * The id of the user who is performing the search
    */
    'userid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "limitfrom",
            "baseName": "limitfrom",
            "type": "number"
        },
        {
            "name": "limitnum",
            "baseName": "limitnum",
            "type": "number"
        },
        {
            "name": "search",
            "baseName": "search",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageMessageSearchUsersRequest.attributeTypeMap;
    }
}
