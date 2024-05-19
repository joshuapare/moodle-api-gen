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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import type { ModLessonGetPageData200ResponseAnswersInner } from './ModLessonGetPageData200ResponseAnswersInner';
import {
    ModLessonGetPageData200ResponseAnswersInnerFromJSON,
    ModLessonGetPageData200ResponseAnswersInnerFromJSONTyped,
    ModLessonGetPageData200ResponseAnswersInnerToJSON,
} from './ModLessonGetPageData200ResponseAnswersInner';
import type { ModLessonGetPageData200ResponseMessagesInner } from './ModLessonGetPageData200ResponseMessagesInner';
import {
    ModLessonGetPageData200ResponseMessagesInnerFromJSON,
    ModLessonGetPageData200ResponseMessagesInnerFromJSONTyped,
    ModLessonGetPageData200ResponseMessagesInnerToJSON,
} from './ModLessonGetPageData200ResponseMessagesInner';
import type { ModLessonGetPageData200ResponsePage } from './ModLessonGetPageData200ResponsePage';
import {
    ModLessonGetPageData200ResponsePageFromJSON,
    ModLessonGetPageData200ResponsePageFromJSONTyped,
    ModLessonGetPageData200ResponsePageToJSON,
} from './ModLessonGetPageData200ResponsePage';

/**
 * 
 * @export
 * @interface ModLessonGetPageData200Response
 */
export interface ModLessonGetPageData200Response {
    /**
     * 
     * @type {Array<ModLessonGetPageData200ResponseAnswersInner>}
     * @memberof ModLessonGetPageData200Response
     */
    Answers: Array<ModLessonGetPageData200ResponseAnswersInner>;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModLessonGetPageData200Response
     */
    Contentfiles: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Whether we should display the menu or not in this page.
     * @type {boolean}
     * @memberof ModLessonGetPageData200Response
     */
    Displaymenu: boolean;
    /**
     * 
     * @type {Array<ModLessonGetPageData200ResponseMessagesInner>}
     * @memberof ModLessonGetPageData200Response
     */
    Messages: Array<ModLessonGetPageData200ResponseMessagesInner>;
    /**
     * New page id (if a jump was made)
     * @type {number}
     * @memberof ModLessonGetPageData200Response
     */
    Newpageid: number;
    /**
     * The ongoing score message
     * @type {string}
     * @memberof ModLessonGetPageData200Response
     */
    Ongoingscore: string;
    /**
     * 
     * @type {ModLessonGetPageData200ResponsePage}
     * @memberof ModLessonGetPageData200Response
     */
    Page?: ModLessonGetPageData200ResponsePage;
    /**
     * Page html content
     * @type {string}
     * @memberof ModLessonGetPageData200Response
     */
    Pagecontent?: string;
    /**
     * Progress percentage in the lesson
     * @type {number}
     * @memberof ModLessonGetPageData200Response
     */
    Progress: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModLessonGetPageData200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModLessonGetPageData200Response interface.
 */
export function instanceOfModLessonGetPageData200Response(value: object): boolean {
    if (!('Answers' in value)) return false;
    if (!('Contentfiles' in value)) return false;
    if (!('Displaymenu' in value)) return false;
    if (!('Messages' in value)) return false;
    if (!('Newpageid' in value)) return false;
    if (!('Ongoingscore' in value)) return false;
    if (!('Progress' in value)) return false;
    return true;
}

export function ModLessonGetPageData200ResponseFromJSON(json: any): ModLessonGetPageData200Response {
    return ModLessonGetPageData200ResponseFromJSONTyped(json, false);
}

export function ModLessonGetPageData200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetPageData200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Answers': ((json['answers'] as Array<any>).map(ModLessonGetPageData200ResponseAnswersInnerFromJSON)),
        'Contentfiles': ((json['contentfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Displaymenu': json['displaymenu'],
        'Messages': ((json['messages'] as Array<any>).map(ModLessonGetPageData200ResponseMessagesInnerFromJSON)),
        'Newpageid': json['newpageid'],
        'Ongoingscore': json['ongoingscore'],
        'Page': json['page'] == null ? undefined : ModLessonGetPageData200ResponsePageFromJSON(json['page']),
        'Pagecontent': json['pagecontent'] == null ? undefined : json['pagecontent'],
        'Progress': json['progress'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModLessonGetPageData200ResponseToJSON(value?: ModLessonGetPageData200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answers': ((value['Answers'] as Array<any>).map(ModLessonGetPageData200ResponseAnswersInnerToJSON)),
        'contentfiles': ((value['Contentfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'displaymenu': value['Displaymenu'],
        'messages': ((value['Messages'] as Array<any>).map(ModLessonGetPageData200ResponseMessagesInnerToJSON)),
        'newpageid': value['Newpageid'],
        'ongoingscore': value['Ongoingscore'],
        'page': ModLessonGetPageData200ResponsePageToJSON(value['Page']),
        'pagecontent': value['Pagecontent'],
        'progress': value['Progress'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

