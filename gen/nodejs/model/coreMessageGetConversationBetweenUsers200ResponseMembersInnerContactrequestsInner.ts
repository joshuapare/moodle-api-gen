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

export class CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
    /**
    * The id of the contact request
    */
    'id'?: number;
    /**
    * The id of the user confirming the request
    */
    'requesteduserid'?: number;
    /**
    * The timecreated timestamp for the contact request
    */
    'timecreated'?: number;
    /**
    * The id of the user who created the contact request
    */
    'userid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "requesteduserid",
            "baseName": "requesteduserid",
            "type": "number"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.attributeTypeMap;
    }
}

