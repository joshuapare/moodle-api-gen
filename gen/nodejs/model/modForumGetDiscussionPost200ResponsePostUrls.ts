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

export class ModForumGetDiscussionPost200ResponsePostUrls {
    /**
    * The URL used to delete the post
    */
    '_delete'?: string;
    /**
    * discuss
    */
    'discuss'?: string;
    /**
    * The URL used to edit the post
    */
    'edit'?: string;
    /**
    * The URL used to export the post
    */
    '_export'?: string;
    /**
    * The URL used to mark the post as read
    */
    'markasread'?: string;
    /**
    * The URL used to mark the post as unread
    */
    'markasunread'?: string;
    /**
    * The URL used to reply to the post
    */
    'reply'?: string;
    /**
    * The URL used to split the discussion with the selected post being the first post in the new discussion
    */
    'split'?: string;
    /**
    * The URL used to view the post
    */
    'view'?: string;
    /**
    * The URL used to view the post in isolation
    */
    'viewisolated'?: string;
    /**
    * The URL used to view the parent of the post
    */
    'viewparent'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "_delete",
            "baseName": "delete",
            "type": "string"
        },
        {
            "name": "discuss",
            "baseName": "discuss",
            "type": "string"
        },
        {
            "name": "edit",
            "baseName": "edit",
            "type": "string"
        },
        {
            "name": "_export",
            "baseName": "export",
            "type": "string"
        },
        {
            "name": "markasread",
            "baseName": "markasread",
            "type": "string"
        },
        {
            "name": "markasunread",
            "baseName": "markasunread",
            "type": "string"
        },
        {
            "name": "reply",
            "baseName": "reply",
            "type": "string"
        },
        {
            "name": "split",
            "baseName": "split",
            "type": "string"
        },
        {
            "name": "view",
            "baseName": "view",
            "type": "string"
        },
        {
            "name": "viewisolated",
            "baseName": "viewisolated",
            "type": "string"
        },
        {
            "name": "viewparent",
            "baseName": "viewparent",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetDiscussionPost200ResponsePostUrls.attributeTypeMap;
    }
}
