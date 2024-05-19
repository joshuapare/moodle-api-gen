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
 * @interface ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
 */
export interface ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
    /**
     * 
     * @type {Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackattachmentfiles?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
     * The comment/feedback from the reviewer for the author.
     * @type {string}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackauthor?: string;
    /**
     * Are there some files attached to the feedbackauthor field?
     *                     Sets to 1 by file_postupdate_standard_filemanager().
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackauthorattachment?: number;
    /**
     * feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackauthorformat?: number;
    /**
     * 
     * @type {Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackcontentfiles?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
     * The comment/feedback from the teacher for the reviewer.
     *                     For example the reason why the grade for assessment was overridden
     * @type {string}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackreviewer?: string;
    /**
     * feedbackreviewer format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Feedbackreviewerformat?: number;
    /**
     * The aggregated grade for submission suggested by the reviewer.
     *                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Grade?: number;
    /**
     * The computed grade 0..100 for this assessment. If NULL then it has not been computed yet.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Gradinggrade?: number;
    /**
     * Grade for the assessment manually overridden by a teacher.
     *                     Grade is always from interval 0..100. If NULL then the grade is not overriden.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Gradinggradeover?: number;
    /**
     * The id of the user who has overridden the grade for submission.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Gradinggradeoverby?: number;
    /**
     * The primary key of the record.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Id?: number;
    /**
     * The id of the reviewer who makes this assessment
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Reviewerid?: number;
    /**
     * The id of the assessed submission
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Submissionid?: number;
    /**
     * If 0 then the assessment was allocated but the reviewer has not assessed yet.
     *                     If greater than 0 then the timestamp of when the reviewer assessed for the first time
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Timecreated?: number;
    /**
     * If 0 then the assessment was allocated but the reviewer has not assessed yet.
     *                     If greater than 0 then the timestamp of when the reviewer assessed for the last time
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Timemodified?: number;
    /**
     * The weight of the assessment for the purposes of aggregation
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
     */
    Weight?: number;
}

/**
 * Check if a given object implements the ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner interface.
 */
export function instanceOfModWorkshopGetReviewerAssessments200ResponseAssessmentsInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSON(json: any): ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
    return ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Feedbackattachmentfiles': json['feedbackattachmentfiles'] == null ? undefined : ((json['feedbackattachmentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON)),
        'Feedbackauthor': json['feedbackauthor'] == null ? undefined : json['feedbackauthor'],
        'Feedbackauthorattachment': json['feedbackauthorattachment'] == null ? undefined : json['feedbackauthorattachment'],
        'Feedbackauthorformat': json['feedbackauthorformat'] == null ? undefined : json['feedbackauthorformat'],
        'Feedbackcontentfiles': json['feedbackcontentfiles'] == null ? undefined : ((json['feedbackcontentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerFromJSON)),
        'Feedbackreviewer': json['feedbackreviewer'] == null ? undefined : json['feedbackreviewer'],
        'Feedbackreviewerformat': json['feedbackreviewerformat'] == null ? undefined : json['feedbackreviewerformat'],
        'Grade': json['grade'] == null ? undefined : json['grade'],
        'Gradinggrade': json['gradinggrade'] == null ? undefined : json['gradinggrade'],
        'Gradinggradeover': json['gradinggradeover'] == null ? undefined : json['gradinggradeover'],
        'Gradinggradeoverby': json['gradinggradeoverby'] == null ? undefined : json['gradinggradeoverby'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Reviewerid': json['reviewerid'] == null ? undefined : json['reviewerid'],
        'Submissionid': json['submissionid'] == null ? undefined : json['submissionid'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Weight': json['weight'] == null ? undefined : json['weight'],
    };
}

export function ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerToJSON(value?: ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedbackattachmentfiles': value['Feedbackattachmentfiles'] == null ? undefined : ((value['Feedbackattachmentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON)),
        'feedbackauthor': value['Feedbackauthor'],
        'feedbackauthorattachment': value['Feedbackauthorattachment'],
        'feedbackauthorformat': value['Feedbackauthorformat'],
        'feedbackcontentfiles': value['Feedbackcontentfiles'] == null ? undefined : ((value['Feedbackcontentfiles'] as Array<any>).map(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInnerToJSON)),
        'feedbackreviewer': value['Feedbackreviewer'],
        'feedbackreviewerformat': value['Feedbackreviewerformat'],
        'grade': value['Grade'],
        'gradinggrade': value['Gradinggrade'],
        'gradinggradeover': value['Gradinggradeover'],
        'gradinggradeoverby': value['Gradinggradeoverby'],
        'id': value['Id'],
        'reviewerid': value['Reviewerid'],
        'submissionid': value['Submissionid'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'weight': value['Weight'],
    };
}

