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
import { ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor } from './modAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor';

export class ModAssignSaveGradeRequestPlugindata {
    'assignfeedbackcommentsEditor'?: ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor;
    /**
    * The id of a draft area containing files for this feedback.
    */
    'filesFilemanager'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assignfeedbackcommentsEditor",
            "baseName": "assignfeedbackcomments_editor",
            "type": "ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor"
        },
        {
            "name": "filesFilemanager",
            "baseName": "files_filemanager",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignSaveGradeRequestPlugindata.attributeTypeMap;
    }
}

