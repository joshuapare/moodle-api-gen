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
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner } from './coreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner';
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner } from './coreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner';

export class CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide {
    'guideComments'?: Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner>;
    'guideCriteria'?: Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "guideComments",
            "baseName": "guide_comments",
            "type": "Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner>"
        },
        {
            "name": "guideCriteria",
            "baseName": "guide_criteria",
            "type": "Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide.attributeTypeMap;
    }
}

