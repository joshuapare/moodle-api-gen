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
import { CoreCourseGetCategoriesRequestCriteriaInner } from './coreCourseGetCategoriesRequestCriteriaInner';

export class CoreCourseGetCategoriesRequest {
    /**
    * return the sub categories infos                                           (1 - default) otherwise only the category info (0)
    */
    'Addsubcategories'?: boolean = 1;
    'Criteria'?: Array<CoreCourseGetCategoriesRequestCriteriaInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Addsubcategories",
            "baseName": "addsubcategories",
            "type": "boolean"
        },
        {
            "name": "Criteria",
            "baseName": "criteria",
            "type": "Array<CoreCourseGetCategoriesRequestCriteriaInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetCategoriesRequest.attributeTypeMap;
    }
}

