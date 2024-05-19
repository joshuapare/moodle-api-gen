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

export class BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner {
    /**
    * the company id
    */
    'companyid'?: number = 0;
    /**
    * Show all of the shared courses availabe to the company
    */
    'shared'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "shared",
            "baseName": "shared",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.attributeTypeMap;
    }
}

