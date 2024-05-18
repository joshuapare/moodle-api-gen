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
import { ModAssignSaveGradeRequestAdvancedgradingdata } from './modAssignSaveGradeRequestAdvancedgradingdata';
import { ModAssignSaveGradeRequestPlugindata } from './modAssignSaveGradeRequestPlugindata';

export class ModAssignSaveGradeRequest {
    /**
    * Allow another attempt if the attempt reopen method is manual
    */
    'addattempt': boolean = null;
    'advancedgradingdata'?: ModAssignSaveGradeRequestAdvancedgradingdata;
    /**
    * If true, this grade will be applied to all members of the group (for group assignments).
    */
    'applytoall': boolean = null;
    /**
    * The assignment id to operate on
    */
    'assignmentid': number;
    /**
    * The attempt number (-1 means latest attempt)
    */
    'attemptnumber': number = null;
    /**
    * The new grade for this user. Ignored if advanced grading used
    */
    'grade': number = null;
    'plugindata'?: ModAssignSaveGradeRequestPlugindata;
    /**
    * The student id to operate on
    */
    'userid': number = null;
    /**
    * The next marking workflow state
    */
    'workflowstate': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "addattempt",
            "baseName": "addattempt",
            "type": "boolean"
        },
        {
            "name": "advancedgradingdata",
            "baseName": "advancedgradingdata",
            "type": "ModAssignSaveGradeRequestAdvancedgradingdata"
        },
        {
            "name": "applytoall",
            "baseName": "applytoall",
            "type": "boolean"
        },
        {
            "name": "assignmentid",
            "baseName": "assignmentid",
            "type": "number"
        },
        {
            "name": "attemptnumber",
            "baseName": "attemptnumber",
            "type": "number"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "plugindata",
            "baseName": "plugindata",
            "type": "ModAssignSaveGradeRequestPlugindata"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "workflowstate",
            "baseName": "workflowstate",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignSaveGradeRequest.attributeTypeMap;
    }
}
