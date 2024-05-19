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

export class ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner {
    /**
    * iconurl
    */
    'Iconurl'?: string;
    /**
    * id
    */
    'Id'?: number;
    /**
    * name
    */
    'Name'?: string;
    /**
    * url
    */
    'Url'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Iconurl",
            "baseName": "iconurl",
            "type": "string"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner.attributeTypeMap;
    }
}

