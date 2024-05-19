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
import type { ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner } from './ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner';
import {
    ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInnerFromJSON,
    ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInnerFromJSONTyped,
    ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInnerToJSON,
} from './ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner';

/**
 * assignment information object
 * @export
 * @interface ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
 */
export interface ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner {
    /**
     * Description of activity
     * @type {string}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Activity?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Activityattachments?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * activity format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Activityformat?: number;
    /**
     * allow submissions from date
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Allowsubmissionsfromdate?: number;
    /**
     * method used to control opening new attempts
     * @type {string}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Attemptreopenmethod?: string;
    /**
     * if enabled, hide identities until reveal identities actioned
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Blindmarking?: number;
    /**
     * course module id
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Cmid?: number;
    /**
     * if enabled, set activity as complete following submission
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Completionsubmit?: number;
    /**
     * 
     * @type {Array<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner>}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Configs?: Array<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner>;
    /**
     * course id
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Course?: number;
    /**
     * date after which submission is not accepted without an extension
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Cutoffdate?: number;
    /**
     * assignment due date
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Duedate?: number;
    /**
     * grade type
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Grade?: number;
    /**
     * the expected date for marking the submissions
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Gradingduedate?: number;
    /**
     * If enabled, hide grader to student
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Hidegrader?: number;
    /**
     * assignment id
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Id?: number;
    /**
     * assignment intro, not allways returned because it deppends on the activity configuration
     * @type {string}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Introattachments?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Introformat?: number;
    /**
     * enable marking allocation
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Markingallocation?: number;
    /**
     * enable marking workflow
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Markingworkflow?: number;
    /**
     * maximum number of attempts allowed
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Maxattempts?: number;
    /**
     * assignment name
     * @type {string}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Name?: string;
    /**
     * no submissions
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Nosubmissions?: number;
    /**
     * Prevent submission not in group
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Preventsubmissionnotingroup?: number;
    /**
     * if enabled, all team members must submit
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Requireallteammemberssubmit?: number;
    /**
     * student must accept submission statement
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Requiresubmissionstatement?: number;
    /**
     * show identities for a blind marking assignment
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Revealidentities?: number;
    /**
     * send notifications
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Sendlatenotifications?: number;
    /**
     * send notifications
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Sendnotifications?: number;
    /**
     * send student notifications (default)
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Sendstudentnotifications?: number;
    /**
     * Flag to only show files during submission
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Submissionattachments?: number;
    /**
     * submissions drafts
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Submissiondrafts?: number;
    /**
     * Submission statement formatted.
     * @type {string}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Submissionstatement?: string;
    /**
     * submissionstatement format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Submissionstatementformat?: number;
    /**
     * if enabled, students submit as a team
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Teamsubmission?: number;
    /**
     * the grouping id for the team submission groups
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Teamsubmissiongroupingid?: number;
    /**
     * Time limit to complete assigment
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Timelimit?: number;
    /**
     * last time assignment was modified
     * @type {number}
     * @memberof ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
     */
    Timemodified?: number;
}

/**
 * Check if a given object implements the ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner interface.
 */
export function instanceOfModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(value: object): boolean {
    return true;
}

export function ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerFromJSON(json: any): ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner {
    return ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerFromJSONTyped(json, false);
}

export function ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Activity': json['activity'] == null ? undefined : json['activity'],
        'Activityattachments': json['activityattachments'] == null ? undefined : ((json['activityattachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Activityformat': json['activityformat'] == null ? undefined : json['activityformat'],
        'Allowsubmissionsfromdate': json['allowsubmissionsfromdate'] == null ? undefined : json['allowsubmissionsfromdate'],
        'Attemptreopenmethod': json['attemptreopenmethod'] == null ? undefined : json['attemptreopenmethod'],
        'Blindmarking': json['blindmarking'] == null ? undefined : json['blindmarking'],
        'Cmid': json['cmid'] == null ? undefined : json['cmid'],
        'Completionsubmit': json['completionsubmit'] == null ? undefined : json['completionsubmit'],
        'Configs': json['configs'] == null ? undefined : ((json['configs'] as Array<any>).map(ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInnerFromJSON)),
        'Course': json['course'] == null ? undefined : json['course'],
        'Cutoffdate': json['cutoffdate'] == null ? undefined : json['cutoffdate'],
        'Duedate': json['duedate'] == null ? undefined : json['duedate'],
        'Grade': json['grade'] == null ? undefined : json['grade'],
        'Gradingduedate': json['gradingduedate'] == null ? undefined : json['gradingduedate'],
        'Hidegrader': json['hidegrader'] == null ? undefined : json['hidegrader'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Intro': json['intro'] == null ? undefined : json['intro'],
        'Introattachments': json['introattachments'] == null ? undefined : ((json['introattachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Introformat': json['introformat'] == null ? undefined : json['introformat'],
        'Markingallocation': json['markingallocation'] == null ? undefined : json['markingallocation'],
        'Markingworkflow': json['markingworkflow'] == null ? undefined : json['markingworkflow'],
        'Maxattempts': json['maxattempts'] == null ? undefined : json['maxattempts'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Nosubmissions': json['nosubmissions'] == null ? undefined : json['nosubmissions'],
        'Preventsubmissionnotingroup': json['preventsubmissionnotingroup'] == null ? undefined : json['preventsubmissionnotingroup'],
        'Requireallteammemberssubmit': json['requireallteammemberssubmit'] == null ? undefined : json['requireallteammemberssubmit'],
        'Requiresubmissionstatement': json['requiresubmissionstatement'] == null ? undefined : json['requiresubmissionstatement'],
        'Revealidentities': json['revealidentities'] == null ? undefined : json['revealidentities'],
        'Sendlatenotifications': json['sendlatenotifications'] == null ? undefined : json['sendlatenotifications'],
        'Sendnotifications': json['sendnotifications'] == null ? undefined : json['sendnotifications'],
        'Sendstudentnotifications': json['sendstudentnotifications'] == null ? undefined : json['sendstudentnotifications'],
        'Submissionattachments': json['submissionattachments'] == null ? undefined : json['submissionattachments'],
        'Submissiondrafts': json['submissiondrafts'] == null ? undefined : json['submissiondrafts'],
        'Submissionstatement': json['submissionstatement'] == null ? undefined : json['submissionstatement'],
        'Submissionstatementformat': json['submissionstatementformat'] == null ? undefined : json['submissionstatementformat'],
        'Teamsubmission': json['teamsubmission'] == null ? undefined : json['teamsubmission'],
        'Teamsubmissiongroupingid': json['teamsubmissiongroupingid'] == null ? undefined : json['teamsubmissiongroupingid'],
        'Timelimit': json['timelimit'] == null ? undefined : json['timelimit'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
    };
}

export function ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerToJSON(value?: ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activity': value['Activity'],
        'activityattachments': value['Activityattachments'] == null ? undefined : ((value['Activityattachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'activityformat': value['Activityformat'],
        'allowsubmissionsfromdate': value['Allowsubmissionsfromdate'],
        'attemptreopenmethod': value['Attemptreopenmethod'],
        'blindmarking': value['Blindmarking'],
        'cmid': value['Cmid'],
        'completionsubmit': value['Completionsubmit'],
        'configs': value['Configs'] == null ? undefined : ((value['Configs'] as Array<any>).map(ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInnerToJSON)),
        'course': value['Course'],
        'cutoffdate': value['Cutoffdate'],
        'duedate': value['Duedate'],
        'grade': value['Grade'],
        'gradingduedate': value['Gradingduedate'],
        'hidegrader': value['Hidegrader'],
        'id': value['Id'],
        'intro': value['Intro'],
        'introattachments': value['Introattachments'] == null ? undefined : ((value['Introattachments'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introfiles': value['Introfiles'] == null ? undefined : ((value['Introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['Introformat'],
        'markingallocation': value['Markingallocation'],
        'markingworkflow': value['Markingworkflow'],
        'maxattempts': value['Maxattempts'],
        'name': value['Name'],
        'nosubmissions': value['Nosubmissions'],
        'preventsubmissionnotingroup': value['Preventsubmissionnotingroup'],
        'requireallteammemberssubmit': value['Requireallteammemberssubmit'],
        'requiresubmissionstatement': value['Requiresubmissionstatement'],
        'revealidentities': value['Revealidentities'],
        'sendlatenotifications': value['Sendlatenotifications'],
        'sendnotifications': value['Sendnotifications'],
        'sendstudentnotifications': value['Sendstudentnotifications'],
        'submissionattachments': value['Submissionattachments'],
        'submissiondrafts': value['Submissiondrafts'],
        'submissionstatement': value['Submissionstatement'],
        'submissionstatementformat': value['Submissionstatementformat'],
        'teamsubmission': value['Teamsubmission'],
        'teamsubmissiongroupingid': value['Teamsubmissiongroupingid'],
        'timelimit': value['Timelimit'],
        'timemodified': value['Timemodified'],
    };
}
