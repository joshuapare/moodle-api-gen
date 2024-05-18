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
import type { CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner } from './CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';
import {
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON,
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSONTyped,
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON,
} from './CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';

/**
 * 
 * @export
 * @interface ModWorkshopGetSubmissions200ResponseSubmissionsInner
 */
export interface ModWorkshopGetSubmissions200ResponseSubmissionsInner {
    /**
     * Used by File API file_postupdate_standard_filemanager.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    attachment?: number;
    /**
     * 
     * @type {Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    attachmentfiles?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
     * The author of the submission.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    authorid?: number;
    /**
     * Submission text.
     * @type {string}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    content?: string;
    /**
     * 
     * @type {Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    contentfiles?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
     * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    contentformat?: number;
    /**
     * The trust mode of the data.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    contenttrust?: number;
    /**
     * Is this submission an example from teacher.
     * @type {boolean}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    example?: boolean;
    /**
     * Teacher comment/feedback for the author of the submission, for example describing the reasons
     *                     for the grade overriding.
     * @type {string}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    feedbackauthor?: string;
    /**
     * feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    feedbackauthorformat?: number;
    /**
     * Aggregated grade for the submission. The grade is a decimal number from interval 0..100.
     *                     If NULL then the grade for submission has not been aggregated yet.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    grade?: number;
    /**
     * Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.
     *                     If NULL then the grade is not overriden.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    gradeover?: number;
    /**
     * The id of the user who has overridden the grade for submission.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    gradeoverby?: number;
    /**
     * The primary key of the record.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    id?: number;
    /**
     * Has this submission been submitted after the deadline or during the assessment phase?
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    late?: number;
    /**
     * Shall the submission be available to other when the workshop is closed.
     * @type {boolean}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    published?: boolean;
    /**
     * Timestamp when the work was submitted for the first time.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    timecreated?: number;
    /**
     * The timestamp when grade or gradeover was recently modified.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    timegraded?: number;
    /**
     * Timestamp when the submission has been updated.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    timemodified?: number;
    /**
     * The submission title.
     * @type {string}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    title?: string;
    /**
     * The id of the workshop instance.
     * @type {number}
     * @memberof ModWorkshopGetSubmissions200ResponseSubmissionsInner
     */
    workshopid?: number;
}

/**
 * Check if a given object implements the ModWorkshopGetSubmissions200ResponseSubmissionsInner interface.
 */
export function instanceOfModWorkshopGetSubmissions200ResponseSubmissionsInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetSubmissions200ResponseSubmissionsInnerFromJSON(json: any): ModWorkshopGetSubmissions200ResponseSubmissionsInner {
    return ModWorkshopGetSubmissions200ResponseSubmissionsInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetSubmissions200ResponseSubmissionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetSubmissions200ResponseSubmissionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attachment': json['attachment'] == null ? undefined : json['attachment'],
        'attachmentfiles': json['attachmentfiles'] == null ? undefined : ((json['attachmentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON)),
        'authorid': json['authorid'] == null ? undefined : json['authorid'],
        'content': json['content'] == null ? undefined : json['content'],
        'contentfiles': json['contentfiles'] == null ? undefined : ((json['contentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON)),
        'contentformat': json['contentformat'] == null ? undefined : json['contentformat'],
        'contenttrust': json['contenttrust'] == null ? undefined : json['contenttrust'],
        'example': json['example'] == null ? undefined : json['example'],
        'feedbackauthor': json['feedbackauthor'] == null ? undefined : json['feedbackauthor'],
        'feedbackauthorformat': json['feedbackauthorformat'] == null ? undefined : json['feedbackauthorformat'],
        'grade': json['grade'] == null ? undefined : json['grade'],
        'gradeover': json['gradeover'] == null ? undefined : json['gradeover'],
        'gradeoverby': json['gradeoverby'] == null ? undefined : json['gradeoverby'],
        'id': json['id'] == null ? undefined : json['id'],
        'late': json['late'] == null ? undefined : json['late'],
        'published': json['published'] == null ? undefined : json['published'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timegraded': json['timegraded'] == null ? undefined : json['timegraded'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'title': json['title'] == null ? undefined : json['title'],
        'workshopid': json['workshopid'] == null ? undefined : json['workshopid'],
    };
}

export function ModWorkshopGetSubmissions200ResponseSubmissionsInnerToJSON(value?: ModWorkshopGetSubmissions200ResponseSubmissionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attachment': value['attachment'],
        'attachmentfiles': value['attachmentfiles'] == null ? undefined : ((value['attachmentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON)),
        'authorid': value['authorid'],
        'content': value['content'],
        'contentfiles': value['contentfiles'] == null ? undefined : ((value['contentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON)),
        'contentformat': value['contentformat'],
        'contenttrust': value['contenttrust'],
        'example': value['example'],
        'feedbackauthor': value['feedbackauthor'],
        'feedbackauthorformat': value['feedbackauthorformat'],
        'grade': value['grade'],
        'gradeover': value['gradeover'],
        'gradeoverby': value['gradeoverby'],
        'id': value['id'],
        'late': value['late'],
        'published': value['published'],
        'timecreated': value['timecreated'],
        'timegraded': value['timegraded'],
        'timemodified': value['timemodified'],
        'title': value['title'],
        'workshopid': value['workshopid'],
    };
}
