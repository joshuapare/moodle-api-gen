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

export class CoreCourseCreateCategoriesRequestCategoriesInner {
    /**
    * the new category description
    */
    'description'?: string = 'null';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * the new category idnumber
    */
    'idnumber'?: string = 'null';
    /**
    * new category name
    */
    'name'?: string = 'null';
    /**
    * the parent category id inside which the new category will be created                                          - set to 0 for a root category
    */
    'parent'?: number = 0;
    /**
    * the new category theme. This option must be enabled on moodle
    */
    'theme'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "theme",
            "baseName": "theme",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseCreateCategoriesRequestCategoriesInner.attributeTypeMap;
    }
}
