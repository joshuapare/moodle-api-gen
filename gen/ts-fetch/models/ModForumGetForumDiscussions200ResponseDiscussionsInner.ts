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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';

/**
 * post
 * @export
 * @interface ModForumGetForumDiscussions200ResponseDiscussionsInner
 */
export interface ModForumGetForumDiscussions200ResponseDiscussionsInner {
    /**
     * Has attachments?
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    attachment?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    attachments?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Can the user star the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    canfavourite?: boolean;
    /**
     * Can the user lock the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    canlock?: boolean;
    /**
     * Can the user reply to the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    canreply?: boolean;
    /**
     * Creation time
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    created?: number;
    /**
     * Discussion id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    discussion?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    groupid?: number;
    /**
     * Post id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    id?: number;
    /**
     * Is the discussion locked
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    locked?: boolean;
    /**
     * Mailed?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    mailed?: number;
    /**
     * Mail now?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    mailnow?: number;
    /**
     * The post message
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    message?: string;
    /**
     * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    messageformat?: number;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    messageinlinefiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Can we trust?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    messagetrust?: number;
    /**
     * Time modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    modified?: number;
    /**
     * Discussion name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    name?: string;
    /**
     * The number of replies in the discussion
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    numreplies?: number;
    /**
     * The number of unread discussions.
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    numunread?: number;
    /**
     * Parent id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    parent?: number;
    /**
     * Is the discussion pinned
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    pinned?: boolean;
    /**
     * Is the discussion starred
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    starred?: boolean;
    /**
     * The post subject
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    subject?: string;
    /**
     * Time discussion ends
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    timeend?: number;
    /**
     * Time modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    timemodified?: number;
    /**
     * Time discussion can start
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    timestart?: number;
    /**
     * The post message total score
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    totalscore?: number;
    /**
     * Post author full name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    userfullname?: string;
    /**
     * User who started the discussion id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    userid?: number;
    /**
     * The id of the user who last modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    usermodified?: number;
    /**
     * Post modifier full name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    usermodifiedfullname?: string;
    /**
     * Post modifier picture.
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    usermodifiedpictureurl?: string;
    /**
     * Post author picture.
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    userpictureurl?: string;
}

/**
 * Check if a given object implements the ModForumGetForumDiscussions200ResponseDiscussionsInner interface.
 */
export function instanceOfModForumGetForumDiscussions200ResponseDiscussionsInner(value: object): boolean {
    return true;
}

export function ModForumGetForumDiscussions200ResponseDiscussionsInnerFromJSON(json: any): ModForumGetForumDiscussions200ResponseDiscussionsInner {
    return ModForumGetForumDiscussions200ResponseDiscussionsInnerFromJSONTyped(json, false);
}

export function ModForumGetForumDiscussions200ResponseDiscussionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetForumDiscussions200ResponseDiscussionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attachment': json['attachment'] == null ? undefined : json['attachment'],
        'attachments': json['attachments'] == null ? undefined : ((json['attachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'canfavourite': json['canfavourite'] == null ? undefined : json['canfavourite'],
        'canlock': json['canlock'] == null ? undefined : json['canlock'],
        'canreply': json['canreply'] == null ? undefined : json['canreply'],
        'created': json['created'] == null ? undefined : json['created'],
        'discussion': json['discussion'] == null ? undefined : json['discussion'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'id': json['id'] == null ? undefined : json['id'],
        'locked': json['locked'] == null ? undefined : json['locked'],
        'mailed': json['mailed'] == null ? undefined : json['mailed'],
        'mailnow': json['mailnow'] == null ? undefined : json['mailnow'],
        'message': json['message'] == null ? undefined : json['message'],
        'messageformat': json['messageformat'] == null ? undefined : json['messageformat'],
        'messageinlinefiles': json['messageinlinefiles'] == null ? undefined : ((json['messageinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'messagetrust': json['messagetrust'] == null ? undefined : json['messagetrust'],
        'modified': json['modified'] == null ? undefined : json['modified'],
        'name': json['name'] == null ? undefined : json['name'],
        'numreplies': json['numreplies'] == null ? undefined : json['numreplies'],
        'numunread': json['numunread'] == null ? undefined : json['numunread'],
        'parent': json['parent'] == null ? undefined : json['parent'],
        'pinned': json['pinned'] == null ? undefined : json['pinned'],
        'starred': json['starred'] == null ? undefined : json['starred'],
        'subject': json['subject'] == null ? undefined : json['subject'],
        'timeend': json['timeend'] == null ? undefined : json['timeend'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timestart': json['timestart'] == null ? undefined : json['timestart'],
        'totalscore': json['totalscore'] == null ? undefined : json['totalscore'],
        'userfullname': json['userfullname'] == null ? undefined : json['userfullname'],
        'userid': json['userid'] == null ? undefined : json['userid'],
        'usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
        'usermodifiedfullname': json['usermodifiedfullname'] == null ? undefined : json['usermodifiedfullname'],
        'usermodifiedpictureurl': json['usermodifiedpictureurl'] == null ? undefined : json['usermodifiedpictureurl'],
        'userpictureurl': json['userpictureurl'] == null ? undefined : json['userpictureurl'],
    };
}

export function ModForumGetForumDiscussions200ResponseDiscussionsInnerToJSON(value?: ModForumGetForumDiscussions200ResponseDiscussionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attachment': value['attachment'],
        'attachments': value['attachments'] == null ? undefined : ((value['attachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'canfavourite': value['canfavourite'],
        'canlock': value['canlock'],
        'canreply': value['canreply'],
        'created': value['created'],
        'discussion': value['discussion'],
        'groupid': value['groupid'],
        'id': value['id'],
        'locked': value['locked'],
        'mailed': value['mailed'],
        'mailnow': value['mailnow'],
        'message': value['message'],
        'messageformat': value['messageformat'],
        'messageinlinefiles': value['messageinlinefiles'] == null ? undefined : ((value['messageinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'messagetrust': value['messagetrust'],
        'modified': value['modified'],
        'name': value['name'],
        'numreplies': value['numreplies'],
        'numunread': value['numunread'],
        'parent': value['parent'],
        'pinned': value['pinned'],
        'starred': value['starred'],
        'subject': value['subject'],
        'timeend': value['timeend'],
        'timemodified': value['timemodified'],
        'timestart': value['timestart'],
        'totalscore': value['totalscore'],
        'userfullname': value['userfullname'],
        'userid': value['userid'],
        'usermodified': value['usermodified'],
        'usermodifiedfullname': value['usermodifiedfullname'],
        'usermodifiedpictureurl': value['usermodifiedpictureurl'],
        'userpictureurl': value['userpictureurl'],
    };
}

