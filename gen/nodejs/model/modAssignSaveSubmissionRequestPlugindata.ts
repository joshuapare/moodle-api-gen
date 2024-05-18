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
import { ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor } from './modAssignSaveSubmissionRequestPlugindataOnlinetextEditor';

export class ModAssignSaveSubmissionRequestPlugindata {
    /**
    * The id of a draft area containing files for this submission.
    */
    'filesFilemanager'?: number = null;
    'onlinetextEditor'?: ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "filesFilemanager",
            "baseName": "files_filemanager",
            "type": "number"
        },
        {
            "name": "onlinetextEditor",
            "baseName": "onlinetext_editor",
            "type": "ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignSaveSubmissionRequestPlugindata.attributeTypeMap;
    }
}
