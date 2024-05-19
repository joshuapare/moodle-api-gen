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
    Attachment?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Attachments?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Can the user star the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Canfavourite?: boolean;
    /**
     * Can the user lock the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Canlock?: boolean;
    /**
     * Can the user reply to the discussion
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Canreply?: boolean;
    /**
     * Creation time
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Created?: number;
    /**
     * Discussion id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Discussion?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Groupid?: number;
    /**
     * Post id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Id?: number;
    /**
     * Is the discussion locked
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Locked?: boolean;
    /**
     * Mailed?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Mailed?: number;
    /**
     * Mail now?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Mailnow?: number;
    /**
     * The post message
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Message?: string;
    /**
     * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Messageformat?: number;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Messageinlinefiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Can we trust?
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Messagetrust?: number;
    /**
     * Time modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Modified?: number;
    /**
     * Discussion name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Name?: string;
    /**
     * The number of replies in the discussion
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Numreplies?: number;
    /**
     * The number of unread discussions.
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Numunread?: number;
    /**
     * Parent id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Parent?: number;
    /**
     * Is the discussion pinned
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Pinned?: boolean;
    /**
     * Is the discussion starred
     * @type {boolean}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Starred?: boolean;
    /**
     * The post subject
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Subject?: string;
    /**
     * Time discussion ends
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Timeend?: number;
    /**
     * Time modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Timemodified?: number;
    /**
     * Time discussion can start
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Timestart?: number;
    /**
     * The post message total score
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Totalscore?: number;
    /**
     * Post author full name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Userfullname?: string;
    /**
     * User who started the discussion id
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Userid?: number;
    /**
     * The id of the user who last modified
     * @type {number}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Usermodified?: number;
    /**
     * Post modifier full name
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Usermodifiedfullname?: string;
    /**
     * Post modifier picture.
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Usermodifiedpictureurl?: string;
    /**
     * Post author picture.
     * @type {string}
     * @memberof ModForumGetForumDiscussions200ResponseDiscussionsInner
     */
    Userpictureurl?: string;
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
        
        'Attachment': json['attachment'] == null ? undefined : json['attachment'],
        'Attachments': json['attachments'] == null ? undefined : ((json['attachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Canfavourite': json['canfavourite'] == null ? undefined : json['canfavourite'],
        'Canlock': json['canlock'] == null ? undefined : json['canlock'],
        'Canreply': json['canreply'] == null ? undefined : json['canreply'],
        'Created': json['created'] == null ? undefined : json['created'],
        'Discussion': json['discussion'] == null ? undefined : json['discussion'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Locked': json['locked'] == null ? undefined : json['locked'],
        'Mailed': json['mailed'] == null ? undefined : json['mailed'],
        'Mailnow': json['mailnow'] == null ? undefined : json['mailnow'],
        'Message': json['message'] == null ? undefined : json['message'],
        'Messageformat': json['messageformat'] == null ? undefined : json['messageformat'],
        'Messageinlinefiles': json['messageinlinefiles'] == null ? undefined : ((json['messageinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Messagetrust': json['messagetrust'] == null ? undefined : json['messagetrust'],
        'Modified': json['modified'] == null ? undefined : json['modified'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Numreplies': json['numreplies'] == null ? undefined : json['numreplies'],
        'Numunread': json['numunread'] == null ? undefined : json['numunread'],
        'Parent': json['parent'] == null ? undefined : json['parent'],
        'Pinned': json['pinned'] == null ? undefined : json['pinned'],
        'Starred': json['starred'] == null ? undefined : json['starred'],
        'Subject': json['subject'] == null ? undefined : json['subject'],
        'Timeend': json['timeend'] == null ? undefined : json['timeend'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Timestart': json['timestart'] == null ? undefined : json['timestart'],
        'Totalscore': json['totalscore'] == null ? undefined : json['totalscore'],
        'Userfullname': json['userfullname'] == null ? undefined : json['userfullname'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
        'Usermodifiedfullname': json['usermodifiedfullname'] == null ? undefined : json['usermodifiedfullname'],
        'Usermodifiedpictureurl': json['usermodifiedpictureurl'] == null ? undefined : json['usermodifiedpictureurl'],
        'Userpictureurl': json['userpictureurl'] == null ? undefined : json['userpictureurl'],
    };
}

export function ModForumGetForumDiscussions200ResponseDiscussionsInnerToJSON(value?: ModForumGetForumDiscussions200ResponseDiscussionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attachment': value['Attachment'],
        'attachments': value['Attachments'] == null ? undefined : ((value['Attachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'canfavourite': value['Canfavourite'],
        'canlock': value['Canlock'],
        'canreply': value['Canreply'],
        'created': value['Created'],
        'discussion': value['Discussion'],
        'groupid': value['Groupid'],
        'id': value['Id'],
        'locked': value['Locked'],
        'mailed': value['Mailed'],
        'mailnow': value['Mailnow'],
        'message': value['Message'],
        'messageformat': value['Messageformat'],
        'messageinlinefiles': value['Messageinlinefiles'] == null ? undefined : ((value['Messageinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'messagetrust': value['Messagetrust'],
        'modified': value['Modified'],
        'name': value['Name'],
        'numreplies': value['Numreplies'],
        'numunread': value['Numunread'],
        'parent': value['Parent'],
        'pinned': value['Pinned'],
        'starred': value['Starred'],
        'subject': value['Subject'],
        'timeend': value['Timeend'],
        'timemodified': value['Timemodified'],
        'timestart': value['Timestart'],
        'totalscore': value['Totalscore'],
        'userfullname': value['Userfullname'],
        'userid': value['Userid'],
        'usermodified': value['Usermodified'],
        'usermodifiedfullname': value['Usermodifiedfullname'],
        'usermodifiedpictureurl': value['Usermodifiedpictureurl'],
        'userpictureurl': value['Userpictureurl'],
    };
}
