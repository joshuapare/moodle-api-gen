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

export class CoreMessageGetConversationRequest {
    /**
    * The id of the conversation to fetch
    */
    'conversationid': number = null;
    /**
    * Include contact requests in the members
    */
    'includecontactrequests': boolean = null;
    /**
    * Include privacy info in the members
    */
    'includeprivacyinfo': boolean = null;
    /**
    * Limit for number of members
    */
    'memberlimit'?: number = 0;
    /**
    * Offset for member list
    */
    'memberoffset'?: number = 0;
    /**
    * Limit for number of messages
    */
    'messagelimit'?: number = 100;
    /**
    * Offset for messages list
    */
    'messageoffset'?: number = 0;
    /**
    * Order messages by newest first
    */
    'newestmessagesfirst'?: boolean = true;
    /**
    * The id of the user who we are viewing conversations for
    */
    'userid': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "conversationid",
            "baseName": "conversationid",
            "type": "number"
        },
        {
            "name": "includecontactrequests",
            "baseName": "includecontactrequests",
            "type": "boolean"
        },
        {
            "name": "includeprivacyinfo",
            "baseName": "includeprivacyinfo",
            "type": "boolean"
        },
        {
            "name": "memberlimit",
            "baseName": "memberlimit",
            "type": "number"
        },
        {
            "name": "memberoffset",
            "baseName": "memberoffset",
            "type": "number"
        },
        {
            "name": "messagelimit",
            "baseName": "messagelimit",
            "type": "number"
        },
        {
            "name": "messageoffset",
            "baseName": "messageoffset",
            "type": "number"
        },
        {
            "name": "newestmessagesfirst",
            "baseName": "newestmessagesfirst",
            "type": "boolean"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetConversationRequest.attributeTypeMap;
    }
}
