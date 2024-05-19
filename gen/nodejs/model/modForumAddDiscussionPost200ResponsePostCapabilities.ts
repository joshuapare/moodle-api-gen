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

export class ModForumAddDiscussionPost200ResponsePostCapabilities {
    /**
    * Whether the user can post a private reply
    */
    'Canreplyprivately': boolean = null;
    /**
    * Whether the user can control the read status of the post
    */
    'Controlreadstatus': boolean = null;
    /**
    * Whether the user can delete the post
    */
    'Delete': boolean = null;
    /**
    * Whether the user can edit the post
    */
    'Edit': boolean = null;
    /**
    * Whether the user can export the post
    */
    'Export': boolean = null;
    /**
    * Whether the user can reply to the post
    */
    'Reply': boolean = null;
    /**
    * Whether the user can self enrol into the course
    */
    'Selfenrol': boolean = null;
    /**
    * Whether the user can split the post
    */
    'Split': boolean = null;
    /**
    * Whether the user can view the post
    */
    'View': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canreplyprivately",
            "baseName": "canreplyprivately",
            "type": "boolean"
        },
        {
            "name": "Controlreadstatus",
            "baseName": "controlreadstatus",
            "type": "boolean"
        },
        {
            "name": "Delete",
            "baseName": "delete",
            "type": "boolean"
        },
        {
            "name": "Edit",
            "baseName": "edit",
            "type": "boolean"
        },
        {
            "name": "Export",
            "baseName": "export",
            "type": "boolean"
        },
        {
            "name": "Reply",
            "baseName": "reply",
            "type": "boolean"
        },
        {
            "name": "Selfenrol",
            "baseName": "selfenrol",
            "type": "boolean"
        },
        {
            "name": "Split",
            "baseName": "split",
            "type": "boolean"
        },
        {
            "name": "View",
            "baseName": "view",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModForumAddDiscussionPost200ResponsePostCapabilities.attributeTypeMap;
    }
}

