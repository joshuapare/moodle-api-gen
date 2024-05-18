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

/**
 * 
 * @export
 * @interface ModQuizGetQuizFeedbackForGrade200Response
 */
export interface ModQuizGetQuizFeedbackForGrade200Response {
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModQuizGetQuizFeedbackForGrade200Response
     */
    feedbackinlinefiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * the comment that corresponds to this grade (empty for none)
     * @type {string}
     * @memberof ModQuizGetQuizFeedbackForGrade200Response
     */
    feedbacktext: string;
    /**
     * feedbacktext format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModQuizGetQuizFeedbackForGrade200Response
     */
    feedbacktextformat?: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModQuizGetQuizFeedbackForGrade200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModQuizGetQuizFeedbackForGrade200Response interface.
 */
export function instanceOfModQuizGetQuizFeedbackForGrade200Response(value: object): boolean {
    if (!('feedbacktext' in value)) return false;
    return true;
}

export function ModQuizGetQuizFeedbackForGrade200ResponseFromJSON(json: any): ModQuizGetQuizFeedbackForGrade200Response {
    return ModQuizGetQuizFeedbackForGrade200ResponseFromJSONTyped(json, false);
}

export function ModQuizGetQuizFeedbackForGrade200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetQuizFeedbackForGrade200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'feedbackinlinefiles': json['feedbackinlinefiles'] == null ? undefined : ((json['feedbackinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'feedbacktext': json['feedbacktext'],
        'feedbacktextformat': json['feedbacktextformat'] == null ? undefined : json['feedbacktextformat'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModQuizGetQuizFeedbackForGrade200ResponseToJSON(value?: ModQuizGetQuizFeedbackForGrade200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedbackinlinefiles': value['feedbackinlinefiles'] == null ? undefined : ((value['feedbackinlinefiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'feedbacktext': value['feedbacktext'],
        'feedbacktextformat': value['feedbacktextformat'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
