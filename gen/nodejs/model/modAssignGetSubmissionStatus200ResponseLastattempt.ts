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

import { RequestFile } from './models';
import { ModAssignGetSubmissionStatus200ResponseLastattemptSubmission } from './modAssignGetSubmissionStatus200ResponseLastattemptSubmission';
import { ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission } from './modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission';

export class ModAssignGetSubmissionStatus200ResponseLastattempt {
    /**
    * Whether blind marking is enabled.
    */
    'Blindmarking': boolean = null;
    /**
    * Whether the user can edit the current submission.
    */
    'Canedit': boolean = null;
    /**
    * Whether the owner of the submission can edit it.
    */
    'Caneditowner': boolean = null;
    /**
    * Whether the user can submit.
    */
    'Cansubmit': boolean = null;
    /**
    * Extension due date.
    */
    'Extensionduedate': number = null;
    /**
    * Whether the submission is graded.
    */
    'Graded': boolean = null;
    /**
    * Grading status.
    */
    'Gradingstatus': string = 'null';
    /**
    * Whether new submissions are locked.
    */
    'Locked': boolean = null;
    'Submission'?: ModAssignGetSubmissionStatus200ResponseLastattemptSubmission;
    /**
    * The submission group id (for group submissions only).
    */
    'Submissiongroup'?: number = null;
    'Submissiongroupmemberswhoneedtosubmit'?: Array<object>;
    /**
    * Whether submissions are enabled or not.
    */
    'Submissionsenabled': boolean;
    'Teamsubmission'?: ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission;
    /**
    * Time limit for submission.
    */
    'Timelimit'?: number = null;
    'Usergroups': Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Blindmarking",
            "baseName": "blindmarking",
            "type": "boolean"
        },
        {
            "name": "Canedit",
            "baseName": "canedit",
            "type": "boolean"
        },
        {
            "name": "Caneditowner",
            "baseName": "caneditowner",
            "type": "boolean"
        },
        {
            "name": "Cansubmit",
            "baseName": "cansubmit",
            "type": "boolean"
        },
        {
            "name": "Extensionduedate",
            "baseName": "extensionduedate",
            "type": "number"
        },
        {
            "name": "Graded",
            "baseName": "graded",
            "type": "boolean"
        },
        {
            "name": "Gradingstatus",
            "baseName": "gradingstatus",
            "type": "string"
        },
        {
            "name": "Locked",
            "baseName": "locked",
            "type": "boolean"
        },
        {
            "name": "Submission",
            "baseName": "submission",
            "type": "ModAssignGetSubmissionStatus200ResponseLastattemptSubmission"
        },
        {
            "name": "Submissiongroup",
            "baseName": "submissiongroup",
            "type": "number"
        },
        {
            "name": "Submissiongroupmemberswhoneedtosubmit",
            "baseName": "submissiongroupmemberswhoneedtosubmit",
            "type": "Array<object>"
        },
        {
            "name": "Submissionsenabled",
            "baseName": "submissionsenabled",
            "type": "boolean"
        },
        {
            "name": "Teamsubmission",
            "baseName": "teamsubmission",
            "type": "ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission"
        },
        {
            "name": "Timelimit",
            "baseName": "timelimit",
            "type": "number"
        },
        {
            "name": "Usergroups",
            "baseName": "usergroups",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetSubmissionStatus200ResponseLastattempt.attributeTypeMap;
    }
}

