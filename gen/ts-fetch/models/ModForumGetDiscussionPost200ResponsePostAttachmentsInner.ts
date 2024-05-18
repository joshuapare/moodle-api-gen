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
import type { ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml } from './ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml';
import {
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSON,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtmlToJSON,
} from './ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml';
import type { ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls } from './ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls';
import {
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSON,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSONTyped,
    ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsToJSON,
} from './ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls';

/**
 * 
 * @export
 * @interface ModForumGetDiscussionPost200ResponsePostAttachmentsInner
 */
export interface ModForumGetDiscussionPost200ResponsePostAttachmentsInner {
    /**
     * author
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    author?: string;
    /**
     * component
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    component?: string;
    /**
     * contextid
     * @type {number}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    contextid?: number;
    /**
     * filearea
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filearea?: string;
    /**
     * filename
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filename?: string;
    /**
     * filenameshort
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filenameshort?: string;
    /**
     * filepath
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filepath?: string;
    /**
     * filesize
     * @type {number}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filesize?: number;
    /**
     * filesizeformatted
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    filesizeformatted?: string;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    html?: ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml;
    /**
     * icon
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    icon?: string;
    /**
     * isdir
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    isdir?: boolean;
    /**
     * isimage
     * @type {boolean}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    isimage?: boolean;
    /**
     * itemid
     * @type {number}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    itemid?: number;
    /**
     * license
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    license?: string;
    /**
     * timecreated
     * @type {number}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    timecreated?: number;
    /**
     * timecreatedformatted
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    timecreatedformatted?: string;
    /**
     * timemodified
     * @type {number}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    timemodified?: number;
    /**
     * timemodifiedformatted
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    timemodifiedformatted?: string;
    /**
     * url
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    url?: string;
    /**
     * 
     * @type {ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls}
     * @memberof ModForumGetDiscussionPost200ResponsePostAttachmentsInner
     */
    urls?: ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPost200ResponsePostAttachmentsInner interface.
 */
export function instanceOfModForumGetDiscussionPost200ResponsePostAttachmentsInner(value: object): boolean {
    return true;
}

export function ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSON(json: any): ModForumGetDiscussionPost200ResponsePostAttachmentsInner {
    return ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPost200ResponsePostAttachmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPost200ResponsePostAttachmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'author': json['author'] == null ? undefined : json['author'],
        'component': json['component'] == null ? undefined : json['component'],
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'filearea': json['filearea'] == null ? undefined : json['filearea'],
        'filename': json['filename'] == null ? undefined : json['filename'],
        'filenameshort': json['filenameshort'] == null ? undefined : json['filenameshort'],
        'filepath': json['filepath'] == null ? undefined : json['filepath'],
        'filesize': json['filesize'] == null ? undefined : json['filesize'],
        'filesizeformatted': json['filesizeformatted'] == null ? undefined : json['filesizeformatted'],
        'html': json['html'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtmlFromJSON(json['html']),
        'icon': json['icon'] == null ? undefined : json['icon'],
        'isdir': json['isdir'] == null ? undefined : json['isdir'],
        'isimage': json['isimage'] == null ? undefined : json['isimage'],
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'license': json['license'] == null ? undefined : json['license'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timecreatedformatted': json['timecreatedformatted'] == null ? undefined : json['timecreatedformatted'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timemodifiedformatted': json['timemodifiedformatted'] == null ? undefined : json['timemodifiedformatted'],
        'url': json['url'] == null ? undefined : json['url'],
        'urls': json['urls'] == null ? undefined : ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsFromJSON(json['urls']),
    };
}

export function ModForumGetDiscussionPost200ResponsePostAttachmentsInnerToJSON(value?: ModForumGetDiscussionPost200ResponsePostAttachmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'author': value['author'],
        'component': value['component'],
        'contextid': value['contextid'],
        'filearea': value['filearea'],
        'filename': value['filename'],
        'filenameshort': value['filenameshort'],
        'filepath': value['filepath'],
        'filesize': value['filesize'],
        'filesizeformatted': value['filesizeformatted'],
        'html': ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtmlToJSON(value['html']),
        'icon': value['icon'],
        'isdir': value['isdir'],
        'isimage': value['isimage'],
        'itemid': value['itemid'],
        'license': value['license'],
        'timecreated': value['timecreated'],
        'timecreatedformatted': value['timecreatedformatted'],
        'timemodified': value['timemodified'],
        'timemodifiedformatted': value['timemodifiedformatted'],
        'url': value['url'],
        'urls': ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrlsToJSON(value['urls']),
    };
}
