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
import { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner } from './modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner';
import { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner } from './modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner';

export class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
    'Editorfields'?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>;
    'Fileareas'?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>;
    /**
    * submission plugin name
    */
    'Name'?: string = 'null';
    /**
    * submission plugin type
    */
    'Type'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Editorfields",
            "baseName": "editorfields",
            "type": "Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>"
        },
        {
            "name": "Fileareas",
            "baseName": "fileareas",
            "type": "Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.attributeTypeMap;
    }
}

