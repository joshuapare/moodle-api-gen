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
import { ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner } from './modForumGetDiscussionPost200ResponsePostAuthorGroupsInner';
import { ModForumGetDiscussionPost200ResponsePostAuthorUrls } from './modForumGetDiscussionPost200ResponsePostAuthorUrls';

export class ModForumGetDiscussionPost200ResponsePostAuthor {
    /**
    * fullname
    */
    'fullname'?: string;
    'groups'?: Array<ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner>;
    /**
    * id
    */
    'id'?: number;
    /**
    * isdeleted
    */
    'isdeleted'?: boolean;
    'urls': ModForumGetDiscussionPost200ResponsePostAuthorUrls;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "groups",
            "baseName": "groups",
            "type": "Array<ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner>"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "isdeleted",
            "baseName": "isdeleted",
            "type": "boolean"
        },
        {
            "name": "urls",
            "baseName": "urls",
            "type": "ModForumGetDiscussionPost200ResponsePostAuthorUrls"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetDiscussionPost200ResponsePostAuthor.attributeTypeMap;
    }
}
