/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner } from './ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner';
import {
    ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerFromJSON,
    ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerFromJSONTyped,
    ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerToJSON,
} from './ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner';
import type { ModForumGetDiscussionPost200ResponsePostAttachmentsInner } from './ModForumGetDiscussionPost200ResponsePostAttachmentsInner';
import {
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSON,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerToJSON,
} from './ModForumGetDiscussionPost200ResponsePostAttachmentsInner';
import type { ModForumGetDiscussionPost200ResponsePostAuthor } from './ModForumGetDiscussionPost200ResponsePostAuthor';
import {
    ModForumGetDiscussionPost200ResponsePostAuthorFromJSON,
    ModForumGetDiscussionPost200ResponsePostAuthorFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostAuthorToJSON,
} from './ModForumGetDiscussionPost200ResponsePostAuthor';
import type { ModForumGetDiscussionPost200ResponsePostCapabilities } from './ModForumGetDiscussionPost200ResponsePostCapabilities';
import {
    ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSON,
    ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostCapabilitiesToJSON,
} from './ModForumGetDiscussionPost200ResponsePostCapabilities';
import type { ModForumGetDiscussionPost200ResponsePostHtml } from './ModForumGetDiscussionPost200ResponsePostHtml';
import {
    ModForumGetDiscussionPost200ResponsePostHtmlFromJSON,
    ModForumGetDiscussionPost200ResponsePostHtmlFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostHtmlToJSON,
} from './ModForumGetDiscussionPost200ResponsePostHtml';
import type { ModForumGetDiscussionPost200ResponsePostTagsInner } from './ModForumGetDiscussionPost200ResponsePostTagsInner';
import {
    ModForumGetDiscussionPost200ResponsePostTagsInnerFromJSON,
    ModForumGetDiscussionPost200ResponsePostTagsInnerFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostTagsInnerToJSON,
} from './ModForumGetDiscussionPost200ResponsePostTagsInner';
import type { ModForumGetDiscussionPost200ResponsePostUrls } from './ModForumGetDiscussionPost200ResponsePostUrls';
import {
    ModForumGetDiscussionPost200ResponsePostUrlsFromJSON,
    ModForumGetDiscussionPost200ResponsePostUrlsFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostUrlsToJSON,
} from './ModForumGetDiscussionPost200ResponsePostUrls';

/**
 * 
 * @export
 * @interface ModForumGetDiscussionPosts200ResponsePostsInner
 */
export interface ModForumGetDiscussionPosts200ResponsePostsInner {
    /**
     * 
     * @type {Array<ModForumGetDiscussionPost200ResponsePostAttachmentsInner>}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    attachments?: Array<ModForumGetDiscussionPost200ResponsePostAttachmentsInner>;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostAuthor}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    author?: ModForumGetDiscussionPost200ResponsePostAuthor;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostCapabilities}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    capabilities?: ModForumGetDiscussionPost200ResponsePostCapabilities;
    /**
     * charcount
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    charcount?: number;
    /**
     * discussionid
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    discussionid?: number;
    /**
     * hasparent
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    hasparent?: boolean;
    /**
     * haswordcount
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    haswordcount?: boolean;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostHtml}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    html?: ModForumGetDiscussionPost200ResponsePostHtml;
    /**
     * id
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    id?: number;
    /**
     * isdeleted
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    isdeleted?: boolean;
    /**
     * isprivatereply
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    isprivatereply?: boolean;
    /**
     * message
     * @type {string}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    message?: string;
    /**
     * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    messageformat?: number;
    /**
     * 
     * @type {Array<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    messageinlinefiles?: Array<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>;
    /**
     * parentid
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    parentid?: number;
    /**
     * replysubject
     * @type {string}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    replysubject?: string;
    /**
     * subject
     * @type {string}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    subject?: string;
    /**
     * 
     * @type {Array<ModForumGetDiscussionPost200ResponsePostTagsInner>}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    tags?: Array<ModForumGetDiscussionPost200ResponsePostTagsInner>;
    /**
     * timecreated
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    timecreated?: number;
    /**
     * timemodified
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    timemodified?: number;
    /**
     * unread
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    unread?: boolean;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostUrls}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    urls?: ModForumGetDiscussionPost200ResponsePostUrls;
    /**
     * wordcount
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponsePostsInner
     */
    wordcount?: number;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPosts200ResponsePostsInner interface.
 */
export function instanceOfModForumGetDiscussionPosts200ResponsePostsInner(value: object): boolean {
    return true;
}

export function ModForumGetDiscussionPosts200ResponsePostsInnerFromJSON(json: any): ModForumGetDiscussionPosts200ResponsePostsInner {
    return ModForumGetDiscussionPosts200ResponsePostsInnerFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPosts200ResponsePostsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPosts200ResponsePostsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attachments': json['attachments'] == null ? undefined : ((json['attachments'] as Array<any>).map(ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSON)),
        'author': json['author'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostAuthorFromJSON(json['author']),
        'capabilities': json['capabilities'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostCapabilitiesFromJSON(json['capabilities']),
        'charcount': json['charcount'] == null ? undefined : json['charcount'],
        'discussionid': json['discussionid'] == null ? undefined : json['discussionid'],
        'hasparent': json['hasparent'] == null ? undefined : json['hasparent'],
        'haswordcount': json['haswordcount'] == null ? undefined : json['haswordcount'],
        'html': json['html'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostHtmlFromJSON(json['html']),
        'id': json['id'] == null ? undefined : json['id'],
        'isdeleted': json['isdeleted'] == null ? undefined : json['isdeleted'],
        'isprivatereply': json['isprivatereply'] == null ? undefined : json['isprivatereply'],
        'message': json['message'] == null ? undefined : json['message'],
        'messageformat': json['messageformat'] == null ? undefined : json['messageformat'],
        'messageinlinefiles': json['messageinlinefiles'] == null ? undefined : ((json['messageinlinefiles'] as Array<any>).map(ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerFromJSON)),
        'parentid': json['parentid'] == null ? undefined : json['parentid'],
        'replysubject': json['replysubject'] == null ? undefined : json['replysubject'],
        'subject': json['subject'] == null ? undefined : json['subject'],
        'tags': json['tags'] == null ? undefined : ((json['tags'] as Array<any>).map(ModForumGetDiscussionPost200ResponsePostTagsInnerFromJSON)),
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'unread': json['unread'] == null ? undefined : json['unread'],
        'urls': json['urls'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostUrlsFromJSON(json['urls']),
        'wordcount': json['wordcount'] == null ? undefined : json['wordcount'],
    };
}

export function ModForumGetDiscussionPosts200ResponsePostsInnerToJSON(value?: ModForumGetDiscussionPosts200ResponsePostsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attachments': value['attachments'] == null ? undefined : ((value['attachments'] as Array<any>).map(ModForumGetDiscussionPost200ResponsePostAttachmentsInnerToJSON)),
        'author': ModForumGetDiscussionPost200ResponsePostAuthorToJSON(value['author']),
        'capabilities': ModForumGetDiscussionPost200ResponsePostCapabilitiesToJSON(value['capabilities']),
        'charcount': value['charcount'],
        'discussionid': value['discussionid'],
        'hasparent': value['hasparent'],
        'haswordcount': value['haswordcount'],
        'html': ModForumGetDiscussionPost200ResponsePostHtmlToJSON(value['html']),
        'id': value['id'],
        'isdeleted': value['isdeleted'],
        'isprivatereply': value['isprivatereply'],
        'message': value['message'],
        'messageformat': value['messageformat'],
        'messageinlinefiles': value['messageinlinefiles'] == null ? undefined : ((value['messageinlinefiles'] as Array<any>).map(ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInnerToJSON)),
        'parentid': value['parentid'],
        'replysubject': value['replysubject'],
        'subject': value['subject'],
        'tags': value['tags'] == null ? undefined : ((value['tags'] as Array<any>).map(ModForumGetDiscussionPost200ResponsePostTagsInnerToJSON)),
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'unread': value['unread'],
        'urls': ModForumGetDiscussionPost200ResponsePostUrlsToJSON(value['urls']),
        'wordcount': value['wordcount'],
    };
}
