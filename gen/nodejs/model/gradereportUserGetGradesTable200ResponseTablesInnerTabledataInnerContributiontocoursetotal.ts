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

export class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {
    /**
    * class
    */
    '_class': string;
    /**
    * cell content
    */
    'content': string;
    /**
    * headers
    */
    'headers': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "_class",
            "baseName": "class",
            "type": "string"
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "headers",
            "baseName": "headers",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.attributeTypeMap;
    }
}

