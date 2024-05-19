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

export class ModForumSetSubscriptionStateRequest {
    /**
    * The discussion to subscribe or unsubscribe
    */
    'Discussionid': number = null;
    /**
    * Forum that the discussion is in
    */
    'Forumid': number;
    /**
    * The target state
    */
    'Targetstate': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Discussionid",
            "baseName": "discussionid",
            "type": "number"
        },
        {
            "name": "Forumid",
            "baseName": "forumid",
            "type": "number"
        },
        {
            "name": "Targetstate",
            "baseName": "targetstate",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModForumSetSubscriptionStateRequest.attributeTypeMap;
    }
}

