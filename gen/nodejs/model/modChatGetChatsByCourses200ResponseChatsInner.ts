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
import { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';

/**
* Chats
*/
export class ModChatGetChatsByCourses200ResponseChatsInner {
    /**
    * chat method (sockets, ajax, header_js)
    */
    'chatmethod'?: string = 'null';
    /**
    * chat time
    */
    'chattime'?: number = null;
    /**
    * Course id
    */
    'course'?: number;
    /**
    * Course module id
    */
    'coursemodule'?: number;
    /**
    * Group id
    */
    'groupingid'?: number;
    /**
    * Group mode
    */
    'groupmode'?: number;
    /**
    * Activity instance id
    */
    'id'?: number;
    /**
    * Activity introduction
    */
    'intro'?: string;
    'introfiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'introformat'?: number;
    /**
    * keep days
    */
    'keepdays'?: number = null;
    /**
    * Forced activity language
    */
    'lang'?: string;
    /**
    * Activity name
    */
    'name'?: string;
    /**
    * schedule type
    */
    'schedule'?: number = null;
    /**
    * Course section id
    */
    'section'?: number;
    /**
    * student logs visible to everyone
    */
    'studentlogs'?: number = null;
    /**
    * time of last modification
    */
    'timemodified'?: number = null;
    /**
    * Visible
    */
    'visible'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "chatmethod",
            "baseName": "chatmethod",
            "type": "string"
        },
        {
            "name": "chattime",
            "baseName": "chattime",
            "type": "number"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "coursemodule",
            "baseName": "coursemodule",
            "type": "number"
        },
        {
            "name": "groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "intro",
            "baseName": "intro",
            "type": "string"
        },
        {
            "name": "introfiles",
            "baseName": "introfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "introformat",
            "baseName": "introformat",
            "type": "number"
        },
        {
            "name": "keepdays",
            "baseName": "keepdays",
            "type": "number"
        },
        {
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "schedule",
            "baseName": "schedule",
            "type": "number"
        },
        {
            "name": "section",
            "baseName": "section",
            "type": "number"
        },
        {
            "name": "studentlogs",
            "baseName": "studentlogs",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModChatGetChatsByCourses200ResponseChatsInner.attributeTypeMap;
    }
}

