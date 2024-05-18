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
import { ModAssignGetSubmissionStatus200ResponseFeedbackGrade } from './modAssignGetSubmissionStatus200ResponseFeedbackGrade';
import { ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner } from './modAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner';
import { ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission } from './modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission';

export class ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner {
    /**
    * Attempt number.
    */
    'attemptnumber'?: number = null;
    'feedbackplugins'?: Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>;
    'grade'?: ModAssignGetSubmissionStatus200ResponseFeedbackGrade;
    'submission'?: ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "attemptnumber",
            "baseName": "attemptnumber",
            "type": "number"
        },
        {
            "name": "feedbackplugins",
            "baseName": "feedbackplugins",
            "type": "Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "ModAssignGetSubmissionStatus200ResponseFeedbackGrade"
        },
        {
            "name": "submission",
            "baseName": "submission",
            "type": "ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.attributeTypeMap;
    }
}
