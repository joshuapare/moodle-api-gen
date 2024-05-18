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
 * Choices
 * @export
 * @interface ModChoiceGetChoicesByCourses200ResponseChoicesInner
 */
export interface ModChoiceGetChoicesByCourses200ResponseChoicesInner {
    /**
     * Allow multiple choices
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    allowmultiple?: boolean;
    /**
     * Allow update
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    allowupdate?: boolean;
    /**
     * Completion on user submission
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    completionsubmit?: boolean;
    /**
     * Course id
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    coursemodule?: number;
    /**
     * Display mode (vertical, horizontal)
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    display?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    groupmode?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    id?: number;
    /**
     * Include inactive users
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    includeinactive?: boolean;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    introformat?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    lang?: string;
    /**
     * Limit unswers
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    limitanswers?: boolean;
    /**
     * Activity name
     * @type {string}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    name?: string;
    /**
     * If choice is published
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    publish?: boolean;
    /**
     * Course section id
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    section?: number;
    /**
     * Show available spaces
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    showavailable?: boolean;
    /**
     * Show preview before timeopen
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    showpreview?: boolean;
    /**
     * 0 never, 1 after answer, 2 after close, 3 always
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    showresults?: number;
    /**
     * Show users who not answered yet
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    showunanswered?: boolean;
    /**
     * Date of closing validity
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    timeclose?: number;
    /**
     * Time of last modification
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    timemodified?: number;
    /**
     * Date of opening validity
     * @type {number}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    timeopen?: number;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModChoiceGetChoicesByCourses200ResponseChoicesInner
     */
    visible?: boolean;
}

/**
 * Check if a given object implements the ModChoiceGetChoicesByCourses200ResponseChoicesInner interface.
 */
export function instanceOfModChoiceGetChoicesByCourses200ResponseChoicesInner(value: object): boolean {
    return true;
}

export function ModChoiceGetChoicesByCourses200ResponseChoicesInnerFromJSON(json: any): ModChoiceGetChoicesByCourses200ResponseChoicesInner {
    return ModChoiceGetChoicesByCourses200ResponseChoicesInnerFromJSONTyped(json, false);
}

export function ModChoiceGetChoicesByCourses200ResponseChoicesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceGetChoicesByCourses200ResponseChoicesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'allowmultiple': json['allowmultiple'] == null ? undefined : json['allowmultiple'],
        'allowupdate': json['allowupdate'] == null ? undefined : json['allowupdate'],
        'completionsubmit': json['completionsubmit'] == null ? undefined : json['completionsubmit'],
        'course': json['course'] == null ? undefined : json['course'],
        'coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'display': json['display'] == null ? undefined : json['display'],
        'groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'id': json['id'] == null ? undefined : json['id'],
        'includeinactive': json['includeinactive'] == null ? undefined : json['includeinactive'],
        'intro': json['intro'] == null ? undefined : json['intro'],
        'introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'introformat': json['introformat'] == null ? undefined : json['introformat'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'limitanswers': json['limitanswers'] == null ? undefined : json['limitanswers'],
        'name': json['name'] == null ? undefined : json['name'],
        'publish': json['publish'] == null ? undefined : json['publish'],
        'section': json['section'] == null ? undefined : json['section'],
        'showavailable': json['showavailable'] == null ? undefined : json['showavailable'],
        'showpreview': json['showpreview'] == null ? undefined : json['showpreview'],
        'showresults': json['showresults'] == null ? undefined : json['showresults'],
        'showunanswered': json['showunanswered'] == null ? undefined : json['showunanswered'],
        'timeclose': json['timeclose'] == null ? undefined : json['timeclose'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timeopen': json['timeopen'] == null ? undefined : json['timeopen'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModChoiceGetChoicesByCourses200ResponseChoicesInnerToJSON(value?: ModChoiceGetChoicesByCourses200ResponseChoicesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowmultiple': value['allowmultiple'],
        'allowupdate': value['allowupdate'],
        'completionsubmit': value['completionsubmit'],
        'course': value['course'],
        'coursemodule': value['coursemodule'],
        'display': value['display'],
        'groupingid': value['groupingid'],
        'groupmode': value['groupmode'],
        'id': value['id'],
        'includeinactive': value['includeinactive'],
        'intro': value['intro'],
        'introfiles': value['introfiles'] == null ? undefined : ((value['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['introformat'],
        'lang': value['lang'],
        'limitanswers': value['limitanswers'],
        'name': value['name'],
        'publish': value['publish'],
        'section': value['section'],
        'showavailable': value['showavailable'],
        'showpreview': value['showpreview'],
        'showresults': value['showresults'],
        'showunanswered': value['showunanswered'],
        'timeclose': value['timeclose'],
        'timemodified': value['timemodified'],
        'timeopen': value['timeopen'],
        'visible': value['visible'],
    };
}

