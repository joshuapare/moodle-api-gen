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
import type { ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml } from './ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml';
import {
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSON,
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSONTyped,
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtmlToJSON,
} from './ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml';
import type { ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls } from './ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls';
import {
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSON,
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSONTyped,
    ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrlsToJSON,
} from './ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls';

/**
 * 
 * @export
 * @interface ModForumAddDiscussionPost200ResponsePostAttachmentsInner
 */
export interface ModForumAddDiscussionPost200ResponsePostAttachmentsInner {
    /**
     * author
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Author?: string;
    /**
     * component
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Component?: string;
    /**
     * contextid
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Contextid?: number;
    /**
     * filearea
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filearea?: string;
    /**
     * filename
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filename?: string;
    /**
     * filenameshort
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filenameshort?: string;
    /**
     * filepath
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filepath?: string;
    /**
     * filesize
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filesize?: number;
    /**
     * filesizeformatted
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Filesizeformatted?: string;
    /**
     * 
     * @type {ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Html?: ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml;
    /**
     * icon
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Icon?: string;
    /**
     * isdir
     * @type {boolean}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Isdir?: boolean;
    /**
     * isimage
     * @type {boolean}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Isimage?: boolean;
    /**
     * itemid
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Itemid?: number;
    /**
     * license
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    License?: string;
    /**
     * timecreated
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Timecreated?: number;
    /**
     * timecreatedformatted
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Timecreatedformatted?: string;
    /**
     * timemodified
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Timemodified?: number;
    /**
     * timemodifiedformatted
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Timemodifiedformatted?: string;
    /**
     * url
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Url?: string;
    /**
     * 
     * @type {ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls}
     * @memberof ModForumAddDiscussionPost200ResponsePostAttachmentsInner
     */
    Urls?: ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostAttachmentsInner interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostAttachmentsInner(value: object): boolean {
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostAttachmentsInnerFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostAttachmentsInner {
    return ModForumAddDiscussionPost200ResponsePostAttachmentsInnerFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostAttachmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostAttachmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Author': json['author'] == null ? undefined : json['author'],
        'Component': json['component'] == null ? undefined : json['component'],
        'Contextid': json['contextid'] == null ? undefined : json['contextid'],
        'Filearea': json['filearea'] == null ? undefined : json['filearea'],
        'Filename': json['filename'] == null ? undefined : json['filename'],
        'Filenameshort': json['filenameshort'] == null ? undefined : json['filenameshort'],
        'Filepath': json['filepath'] == null ? undefined : json['filepath'],
        'Filesize': json['filesize'] == null ? undefined : json['filesize'],
        'Filesizeformatted': json['filesizeformatted'] == null ? undefined : json['filesizeformatted'],
        'Html': json['html'] == null ? undefined : ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSON(json['html']),
        'Icon': json['icon'] == null ? undefined : json['icon'],
        'Isdir': json['isdir'] == null ? undefined : json['isdir'],
        'Isimage': json['isimage'] == null ? undefined : json['isimage'],
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
        'License': json['license'] == null ? undefined : json['license'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timecreatedformatted': json['timecreatedformatted'] == null ? undefined : json['timecreatedformatted'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Timemodifiedformatted': json['timemodifiedformatted'] == null ? undefined : json['timemodifiedformatted'],
        'Url': json['url'] == null ? undefined : json['url'],
        'Urls': json['urls'] == null ? undefined : ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSON(json['urls']),
    };
}

export function ModForumAddDiscussionPost200ResponsePostAttachmentsInnerToJSON(value?: ModForumAddDiscussionPost200ResponsePostAttachmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'author': value['Author'],
        'component': value['Component'],
        'contextid': value['Contextid'],
        'filearea': value['Filearea'],
        'filename': value['Filename'],
        'filenameshort': value['Filenameshort'],
        'filepath': value['Filepath'],
        'filesize': value['Filesize'],
        'filesizeformatted': value['Filesizeformatted'],
        'html': ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtmlToJSON(value['Html']),
        'icon': value['Icon'],
        'isdir': value['Isdir'],
        'isimage': value['Isimage'],
        'itemid': value['Itemid'],
        'license': value['License'],
        'timecreated': value['Timecreated'],
        'timecreatedformatted': value['Timecreatedformatted'],
        'timemodified': value['Timemodified'],
        'timemodifiedformatted': value['Timemodifiedformatted'],
        'url': value['Url'],
        'urls': ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrlsToJSON(value['Urls']),
    };
}
