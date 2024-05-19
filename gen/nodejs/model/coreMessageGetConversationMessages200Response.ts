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
import { CoreMessageGetConversationBetweenUsers200ResponseMembersInner } from './coreMessageGetConversationBetweenUsers200ResponseMembersInner';
import { CoreMessageGetConversationBetweenUsers200ResponseMessagesInner } from './coreMessageGetConversationBetweenUsers200ResponseMessagesInner';

export class CoreMessageGetConversationMessages200Response {
    /**
    * The conversation id
    */
    'Id': number;
    'Members': Array<CoreMessageGetConversationBetweenUsers200ResponseMembersInner>;
    'Messages': Array<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Members",
            "baseName": "members",
            "type": "Array<CoreMessageGetConversationBetweenUsers200ResponseMembersInner>"
        },
        {
            "name": "Messages",
            "baseName": "messages",
            "type": "Array<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetConversationMessages200Response.attributeTypeMap;
    }
}

