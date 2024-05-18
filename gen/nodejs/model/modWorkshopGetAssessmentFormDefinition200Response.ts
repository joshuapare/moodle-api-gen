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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import { ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner } from './modWorkshopGetAssessmentFormDefinition200ResponseCurrentInner';
import { ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner } from './modWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner';
import { ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner } from './modWorkshopGetAssessmentFormDefinition200ResponseFieldsInner';
import { ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner } from './modWorkshopGetAssessmentFormDefinition200ResponseOptionsInner';

export class ModWorkshopGetAssessmentFormDefinition200Response {
    'current': Array<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner>;
    'descriptionfiles': Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    'dimensionsinfo': Array<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner>;
    /**
    * The number of dimenssions used by the form.
    */
    'dimenssionscount': number = null;
    'fields': Array<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner>;
    'options': Array<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner>;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "current",
            "baseName": "current",
            "type": "Array<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner>"
        },
        {
            "name": "descriptionfiles",
            "baseName": "descriptionfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "dimensionsinfo",
            "baseName": "dimensionsinfo",
            "type": "Array<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner>"
        },
        {
            "name": "dimenssionscount",
            "baseName": "dimenssionscount",
            "type": "number"
        },
        {
            "name": "fields",
            "baseName": "fields",
            "type": "Array<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner>"
        },
        {
            "name": "options",
            "baseName": "options",
            "type": "Array<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner>"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopGetAssessmentFormDefinition200Response.attributeTypeMap;
    }
}

