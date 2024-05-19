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
import { CoreMessageGetConversationCounts200ResponseTypes } from './coreMessageGetConversationCounts200ResponseTypes';

export class CoreMessageGetConversationCounts200Response {
    /**
    * Total number of favourite conversations
    */
    'Favourites': number = null;
    'Types': CoreMessageGetConversationCounts200ResponseTypes;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Favourites",
            "baseName": "favourites",
            "type": "number"
        },
        {
            "name": "Types",
            "baseName": "types",
            "type": "CoreMessageGetConversationCounts200ResponseTypes"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetConversationCounts200Response.attributeTypeMap;
    }
}

