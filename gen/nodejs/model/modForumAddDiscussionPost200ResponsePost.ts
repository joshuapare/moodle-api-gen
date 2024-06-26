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
import { ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner } from './modFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner';
import { ModForumAddDiscussionPost200ResponsePostAttachmentsInner } from './modForumAddDiscussionPost200ResponsePostAttachmentsInner';
import { ModForumAddDiscussionPost200ResponsePostAuthor } from './modForumAddDiscussionPost200ResponsePostAuthor';
import { ModForumAddDiscussionPost200ResponsePostCapabilities } from './modForumAddDiscussionPost200ResponsePostCapabilities';
import { ModForumAddDiscussionPost200ResponsePostHtml } from './modForumAddDiscussionPost200ResponsePostHtml';
import { ModForumAddDiscussionPost200ResponsePostTagsInner } from './modForumAddDiscussionPost200ResponsePostTagsInner';
import { ModForumAddDiscussionPost200ResponsePostUrls } from './modForumAddDiscussionPost200ResponsePostUrls';

export class ModForumAddDiscussionPost200ResponsePost {
    'Attachments': Array<ModForumAddDiscussionPost200ResponsePostAttachmentsInner>;
    'Author': ModForumAddDiscussionPost200ResponsePostAuthor;
    'Capabilities': ModForumAddDiscussionPost200ResponsePostCapabilities;
    /**
    * charcount
    */
    'Charcount'?: number = null;
    /**
    * discussionid
    */
    'Discussionid': number = null;
    /**
    * hasparent
    */
    'Hasparent': boolean = null;
    /**
    * haswordcount
    */
    'Haswordcount': boolean = null;
    'Html'?: ModForumAddDiscussionPost200ResponsePostHtml;
    /**
    * id
    */
    'Id': number;
    /**
    * isdeleted
    */
    'Isdeleted': boolean = null;
    /**
    * isprivatereply
    */
    'Isprivatereply': boolean = null;
    /**
    * message
    */
    'Message': string = 'null';
    /**
    * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Messageformat': number = null;
    'Messageinlinefiles'?: Array<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>;
    /**
    * parentid
    */
    'Parentid'?: number = null;
    /**
    * replysubject
    */
    'Replysubject': string = 'null';
    /**
    * subject
    */
    'Subject': string = 'null';
    'Tags'?: Array<ModForumAddDiscussionPost200ResponsePostTagsInner>;
    /**
    * timecreated
    */
    'Timecreated': number = null;
    /**
    * timemodified
    */
    'Timemodified': number = null;
    /**
    * unread
    */
    'Unread'?: boolean = null;
    'Urls'?: ModForumAddDiscussionPost200ResponsePostUrls;
    /**
    * wordcount
    */
    'Wordcount'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attachments",
            "baseName": "attachments",
            "type": "Array<ModForumAddDiscussionPost200ResponsePostAttachmentsInner>"
        },
        {
            "name": "Author",
            "baseName": "author",
            "type": "ModForumAddDiscussionPost200ResponsePostAuthor"
        },
        {
            "name": "Capabilities",
            "baseName": "capabilities",
            "type": "ModForumAddDiscussionPost200ResponsePostCapabilities"
        },
        {
            "name": "Charcount",
            "baseName": "charcount",
            "type": "number"
        },
        {
            "name": "Discussionid",
            "baseName": "discussionid",
            "type": "number"
        },
        {
            "name": "Hasparent",
            "baseName": "hasparent",
            "type": "boolean"
        },
        {
            "name": "Haswordcount",
            "baseName": "haswordcount",
            "type": "boolean"
        },
        {
            "name": "Html",
            "baseName": "html",
            "type": "ModForumAddDiscussionPost200ResponsePostHtml"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Isdeleted",
            "baseName": "isdeleted",
            "type": "boolean"
        },
        {
            "name": "Isprivatereply",
            "baseName": "isprivatereply",
            "type": "boolean"
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
            "type": "Array<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>"
        },
        {
            "name": "Parentid",
            "baseName": "parentid",
            "type": "number"
        },
        {
            "name": "Replysubject",
            "baseName": "replysubject",
            "type": "string"
        },
        {
            "name": "Subject",
            "baseName": "subject",
            "type": "string"
        },
        {
            "name": "Tags",
            "baseName": "tags",
            "type": "Array<ModForumAddDiscussionPost200ResponsePostTagsInner>"
        },
        {
            "name": "Timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Unread",
            "baseName": "unread",
            "type": "boolean"
        },
        {
            "name": "Urls",
            "baseName": "urls",
            "type": "ModForumAddDiscussionPost200ResponsePostUrls"
        },
        {
            "name": "Wordcount",
            "baseName": "wordcount",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModForumAddDiscussionPost200ResponsePost.attributeTypeMap;
    }
}

