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

/**
 * The lesson pages
 * @export
 * @interface ModLessonGetPages200ResponsePagesInner
 */
export interface ModLessonGetPages200ResponsePagesInner {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLessonGetPages200ResponsePagesInner
     */
    answerids?: Array<object>;
    /**
     * The total number of files attached to the page
     * @type {number}
     * @memberof ModLessonGetPages200ResponsePagesInner
     */
    filescount?: number;
    /**
     * The total size of the files
     * @type {number}
     * @memberof ModLessonGetPages200ResponsePagesInner
     */
    filessizetotal?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLessonGetPages200ResponsePagesInner
     */
    jumps?: Array<object>;
    /**
     * 
     * @type {ModLessonGetPages200ResponsePagesInnerPage}
     * @memberof ModLessonGetPages200ResponsePagesInner
     */
    page?: ModLessonGetPages200ResponsePagesInnerPage;
}

/**
 * Check if a given object implements the ModLessonGetPages200ResponsePagesInner interface.
 */
export function instanceOfModLessonGetPages200ResponsePagesInner(value: object): boolean {
    return true;
}

export function ModLessonGetPages200ResponsePagesInnerFromJSON(json: any): ModLessonGetPages200ResponsePagesInner {
    return ModLessonGetPages200ResponsePagesInnerFromJSONTyped(json, false);
}

export function ModLessonGetPages200ResponsePagesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetPages200ResponsePagesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'answerids': json['answerids'] == null ? undefined : json['answerids'],
        'filescount': json['filescount'] == null ? undefined : json['filescount'],
        'filessizetotal': json['filessizetotal'] == null ? undefined : json['filessizetotal'],
        'jumps': json['jumps'] == null ? undefined : json['jumps'],
        'page': json['page'] == null ? undefined : ModLessonGetPages200ResponsePagesInnerPageFromJSON(json['page']),
    };
}

export function ModLessonGetPages200ResponsePagesInnerToJSON(value?: ModLessonGetPages200ResponsePagesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answerids': value['answerids'],
        'filescount': value['filescount'],
        'filessizetotal': value['filessizetotal'],
        'jumps': value['jumps'],
        'page': ModLessonGetPages200ResponsePagesInnerPageToJSON(value['page']),
    };
}

