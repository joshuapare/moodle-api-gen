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
import type { ModLessonGetPages200ResponsePagesInnerPage } from './ModLessonGetPages200ResponsePagesInnerPage';
import {
    ModLessonGetPages200ResponsePagesInnerPageFromJSON,
    ModLessonGetPages200ResponsePagesInnerPageFromJSONTyped,
    ModLessonGetPages200ResponsePagesInnerPageToJSON,
} from './ModLessonGetPages200ResponsePagesInnerPage';
import type { ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata } from './ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata';
import {
    ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSON,
    ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSONTyped,
    ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataToJSON,
} from './ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata';

/**
 * 
 * @export
 * @interface ModLessonGetUserAttempt200ResponseAnswerpagesInner
 */
export interface ModLessonGetUserAttempt200ResponseAnswerpagesInner {
    /**
     * 
     * @type {ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    answerdata?: ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata;
    /**
     * Page contents.
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    contents?: string;
    /**
     * If is required to apply a grayout.
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    grayout?: number;
    /**
     * 
     * @type {ModLessonGetPages200ResponsePagesInnerPage}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    page?: ModLessonGetPages200ResponsePagesInnerPage;
    /**
     * Identifies the page type of this page.
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    qtype?: string;
    /**
     * Page title.
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInner
     */
    title?: string;
}

/**
 * Check if a given object implements the ModLessonGetUserAttempt200ResponseAnswerpagesInner interface.
 */
export function instanceOfModLessonGetUserAttempt200ResponseAnswerpagesInner(value: object): boolean {
    return true;
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerFromJSON(json: any): ModLessonGetUserAttempt200ResponseAnswerpagesInner {
    return ModLessonGetUserAttempt200ResponseAnswerpagesInnerFromJSONTyped(json, false);
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttempt200ResponseAnswerpagesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'answerdata': json['answerdata'] == null ? undefined : ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSON(json['answerdata']),
        'contents': json['contents'] == null ? undefined : json['contents'],
        'grayout': json['grayout'] == null ? undefined : json['grayout'],
        'page': json['page'] == null ? undefined : ModLessonGetPages200ResponsePagesInnerPageFromJSON(json['page']),
        'qtype': json['qtype'] == null ? undefined : json['qtype'],
        'title': json['title'] == null ? undefined : json['title'],
    };
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerToJSON(value?: ModLessonGetUserAttempt200ResponseAnswerpagesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answerdata': ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataToJSON(value['answerdata']),
        'contents': value['contents'],
        'grayout': value['grayout'],
        'page': ModLessonGetPages200ResponsePagesInnerPageToJSON(value['page']),
        'qtype': value['qtype'],
        'title': value['title'],
    };
}
