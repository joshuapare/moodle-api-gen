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
* post
*/
export class ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner {
    /**
    * Has attachments?
    */
    'Attachment'?: string;
    'Attachments'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * Can the user lock the discussion
    */
    'Canlock'?: boolean;
    /**
    * Can the user reply to the discussion
    */
    'Canreply'?: boolean;
    /**
    * Creation time
    */
    'Created'?: number;
    /**
    * Discussion id
    */
    'Discussion'?: number;
    /**
    * Group id
    */
    'Groupid'?: number;
    /**
    * Post id
    */
    'Id'?: number;
    /**
    * Is the discussion locked
    */
    'Locked'?: boolean;
    /**
    * Mailed?
    */
    'Mailed'?: number;
    /**
    * Mail now?
    */
    'Mailnow'?: number;
    /**
    * The post message
    */
    'Message'?: string;
    /**
    * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Messageformat'?: number;
    'Messageinlinefiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * Can we trust?
    */
    'Messagetrust'?: number;
    /**
    * Time modified
    */
    'Modified'?: number;
    /**
    * Discussion name
    */
    'Name'?: string;
    /**
    * The number of replies in the discussion
    */
    'Numreplies'?: number;
    /**
    * The number of unread discussions.
    */
    'Numunread'?: number;
    /**
    * Parent id
    */
    'Parent'?: number;
    /**
    * Is the discussion pinned
    */
    'Pinned'?: boolean;
    /**
    * The post subject
    */
    'Subject'?: string;
    /**
    * Time discussion ends
    */
    'Timeend'?: number;
    /**
    * Time modified
    */
    'Timemodified'?: number;
    /**
    * Time discussion can start
    */
    'Timestart'?: number;
    /**
    * The post message total score
    */
    'Totalscore'?: number;
    /**
    * Post author full name
    */
    'Userfullname'?: string;
    /**
    * User who started the discussion id
    */
    'Userid'?: number;
    /**
    * The id of the user who last modified
    */
    'Usermodified'?: number;
    /**
    * Post modifier full name
    */
    'Usermodifiedfullname'?: string;
    /**
    * Post modifier picture.
    */
    'Usermodifiedpictureurl'?: string;
    /**
    * Post author picture.
    */
    'Userpictureurl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attachment",
            "baseName": "attachment",
            "type": "string"
        },
        {
            "name": "Attachments",
            "baseName": "attachments",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "Canlock",
            "baseName": "canlock",
            "type": "boolean"
        },
        {
            "name": "Canreply",
            "baseName": "canreply",
            "type": "boolean"
        },
        {
            "name": "Created",
            "baseName": "created",
            "type": "number"
        },
        {
            "name": "Discussion",
            "baseName": "discussion",
            "type": "number"
        },
        {
            "name": "Groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Locked",
            "baseName": "locked",
            "type": "boolean"
        },
        {
            "name": "Mailed",
            "baseName": "mailed",
            "type": "number"
        },
        {
            "name": "Mailnow",
            "baseName": "mailnow",
            "type": "number"
        },
        {
            "name": "Message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "Messageformat",
            "baseName": "messageformat",
            "type": "number"
        },
        {
            "name": "Messageinlinefiles",
            "baseName": "messageinlinefiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "Messagetrust",
            "baseName": "messagetrust",
            "type": "number"
        },
        {
            "name": "Modified",
            "baseName": "modified",
            "type": "number"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Numreplies",
            "baseName": "numreplies",
            "type": "number"
        },
        {
            "name": "Numunread",
            "baseName": "numunread",
            "type": "number"
        },
        {
            "name": "Parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "Pinned",
            "baseName": "pinned",
            "type": "boolean"
        },
        {
            "name": "Subject",
            "baseName": "subject",
            "type": "string"
        },
        {
            "name": "Timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "Totalscore",
            "baseName": "totalscore",
            "type": "number"
        },
        {
            "name": "Userfullname",
            "baseName": "userfullname",
            "type": "string"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        },
        {
            "name": "Usermodifiedfullname",
            "baseName": "usermodifiedfullname",
            "type": "string"
        },
        {
            "name": "Usermodifiedpictureurl",
            "baseName": "usermodifiedpictureurl",
            "type": "string"
        },
        {
            "name": "Userpictureurl",
            "baseName": "userpictureurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.attributeTypeMap;
    }
}

