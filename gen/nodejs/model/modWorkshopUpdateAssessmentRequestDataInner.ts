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

export class ModWorkshopUpdateAssessmentRequestDataInner {
    /**
    * The assessment data (use WS get_assessment_form_definition for obtaining the data to sent).                                 Apart from that data, you can optionally send:                                 feedbackauthor (str); the feedback for the submission author                                 feedbackauthorformat (int); the format of the feedbackauthor                                 feedbackauthorinlineattachmentsid (int); the draft file area for the editor attachments                                 feedbackauthorattachmentsid (int); the draft file area id for the feedback attachments
    */
    'Name'?: string = 'null';
    /**
    * The value of the option.
    */
    'Value'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopUpdateAssessmentRequestDataInner.attributeTypeMap;
    }
}

