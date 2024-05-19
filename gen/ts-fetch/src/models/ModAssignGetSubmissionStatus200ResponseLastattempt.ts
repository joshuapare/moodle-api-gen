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
import type { ModAssignGetSubmissionStatus200ResponseLastattemptSubmission } from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmission';
import {
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionFromJSON,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionToJSON,
} from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmission';
import type { ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission } from './ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission';
import {
    ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmissionFromJSON,
    ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmissionFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmissionToJSON,
} from './ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission';

/**
 * 
 * @export
 * @interface ModAssignGetSubmissionStatus200ResponseLastattempt
 */
export interface ModAssignGetSubmissionStatus200ResponseLastattempt {
    /**
     * Whether blind marking is enabled.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Blindmarking: boolean;
    /**
     * Whether the user can edit the current submission.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Canedit: boolean;
    /**
     * Whether the owner of the submission can edit it.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Caneditowner: boolean;
    /**
     * Whether the user can submit.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Cansubmit: boolean;
    /**
     * Extension due date.
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Extensionduedate: number;
    /**
     * Whether the submission is graded.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Graded: boolean;
    /**
     * Grading status.
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Gradingstatus: string;
    /**
     * Whether new submissions are locked.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Locked: boolean;
    /**
     * 
     * @type {ModAssignGetSubmissionStatus200ResponseLastattemptSubmission}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Submission?: ModAssignGetSubmissionStatus200ResponseLastattemptSubmission;
    /**
     * The submission group id (for group submissions only).
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Submissiongroup?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Submissiongroupmemberswhoneedtosubmit?: Array<object>;
    /**
     * Whether submissions are enabled or not.
     * @type {boolean}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Submissionsenabled: boolean;
    /**
     * 
     * @type {ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Teamsubmission?: ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission;
    /**
     * Time limit for submission.
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Timelimit?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModAssignGetSubmissionStatus200ResponseLastattempt
     */
    Usergroups: Array<object>;
}

/**
 * Check if a given object implements the ModAssignGetSubmissionStatus200ResponseLastattempt interface.
 */
export function instanceOfModAssignGetSubmissionStatus200ResponseLastattempt(value: object): boolean {
    if (!('Blindmarking' in value)) return false;
    if (!('Canedit' in value)) return false;
    if (!('Caneditowner' in value)) return false;
    if (!('Cansubmit' in value)) return false;
    if (!('Extensionduedate' in value)) return false;
    if (!('Graded' in value)) return false;
    if (!('Gradingstatus' in value)) return false;
    if (!('Locked' in value)) return false;
    if (!('Submissionsenabled' in value)) return false;
    if (!('Usergroups' in value)) return false;
    return true;
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptFromJSON(json: any): ModAssignGetSubmissionStatus200ResponseLastattempt {
    return ModAssignGetSubmissionStatus200ResponseLastattemptFromJSONTyped(json, false);
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissionStatus200ResponseLastattempt {
    if (json == null) {
        return json;
    }
    return {
        
        'Blindmarking': json['blindmarking'],
        'Canedit': json['canedit'],
        'Caneditowner': json['caneditowner'],
        'Cansubmit': json['cansubmit'],
        'Extensionduedate': json['extensionduedate'],
        'Graded': json['graded'],
        'Gradingstatus': json['gradingstatus'],
        'Locked': json['locked'],
        'Submission': json['submission'] == null ? undefined : ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionFromJSON(json['submission']),
        'Submissiongroup': json['submissiongroup'] == null ? undefined : json['submissiongroup'],
        'Submissiongroupmemberswhoneedtosubmit': json['submissiongroupmemberswhoneedtosubmit'] == null ? undefined : json['submissiongroupmemberswhoneedtosubmit'],
        'Submissionsenabled': json['submissionsenabled'],
        'Teamsubmission': json['teamsubmission'] == null ? undefined : ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmissionFromJSON(json['teamsubmission']),
        'Timelimit': json['timelimit'] == null ? undefined : json['timelimit'],
        'Usergroups': json['usergroups'],
    };
}

export function ModAssignGetSubmissionStatus200ResponseLastattemptToJSON(value?: ModAssignGetSubmissionStatus200ResponseLastattempt | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'blindmarking': value['Blindmarking'],
        'canedit': value['Canedit'],
        'caneditowner': value['Caneditowner'],
        'cansubmit': value['Cansubmit'],
        'extensionduedate': value['Extensionduedate'],
        'graded': value['Graded'],
        'gradingstatus': value['Gradingstatus'],
        'locked': value['Locked'],
        'submission': ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionToJSON(value['Submission']),
        'submissiongroup': value['Submissiongroup'],
        'submissiongroupmemberswhoneedtosubmit': value['Submissiongroupmemberswhoneedtosubmit'],
        'submissionsenabled': value['Submissionsenabled'],
        'teamsubmission': ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmissionToJSON(value['Teamsubmission']),
        'timelimit': value['Timelimit'],
        'usergroups': value['Usergroups'],
    };
}

