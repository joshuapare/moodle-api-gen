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
import { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';

export class ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
    /**
    * File area name
    */
    'area'?: string;
    'files'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "files",
            "baseName": "files",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.attributeTypeMap;
    }
}

