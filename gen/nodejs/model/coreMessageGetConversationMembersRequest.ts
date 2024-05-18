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

export class CoreMessageGetConversationMembersRequest {
    /**
    * The id of the conversation
    */
    'conversationid': number;
    /**
    * Do we want to include contact requests?
    */
    'includecontactrequests'?: boolean = false;
    /**
    * Do we want to include privacy info?
    */
    'includeprivacyinfo'?: boolean = false;
    /**
    * Limit from
    */
    'limitfrom'?: number = 0;
    /**
    * Limit number
    */
    'limitnum'?: number = 0;
    /**
    * The id of the user we are performing this action on behalf of
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
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetConversationMembersRequest.attributeTypeMap;
    }
}
