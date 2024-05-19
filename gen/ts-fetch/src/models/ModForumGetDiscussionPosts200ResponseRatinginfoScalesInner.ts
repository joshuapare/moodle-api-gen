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
import type { ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner } from './ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner';
import {
    ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInnerFromJSON,
    ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInnerFromJSONTyped,
    ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInnerToJSON,
} from './ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner';

/**
 * Scale information
 * @export
 * @interface ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
 */
export interface ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
    /**
     * Course id.
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Courseid?: number;
    /**
     * Scale id.
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Id?: number;
    /**
     * Whether is a numeric scale.
     * @type {boolean}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Isnumeric?: boolean;
    /**
     * 
     * @type {Array<ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner>}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Items?: Array<ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner>;
    /**
     * Max value for the scale.
     * @type {number}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Max?: number;
    /**
     * Scale name (when a real scale is used).
     * @type {string}
     * @memberof ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner
     */
    Name?: string;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner interface.
 */
export function instanceOfModForumGetDiscussionPosts200ResponseRatinginfoScalesInner(value: object): boolean {
    return true;
}

export function ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerFromJSON(json: any): ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
    return ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Isnumeric': json['isnumeric'] == null ? undefined : json['isnumeric'],
        'Items': json['items'] == null ? undefined : ((json['items'] as Array<any>).map(ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInnerFromJSON)),
        'Max': json['max'] == null ? undefined : json['max'],
        'Name': json['name'] == null ? undefined : json['name'],
    };
}

export function ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerToJSON(value?: ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'id': value['Id'],
        'isnumeric': value['Isnumeric'],
        'items': value['Items'] == null ? undefined : ((value['Items'] as Array<any>).map(ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInnerToJSON)),
        'max': value['Max'],
        'name': value['Name'],
    };
}

