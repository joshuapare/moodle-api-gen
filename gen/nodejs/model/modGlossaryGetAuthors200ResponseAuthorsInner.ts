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

export class ModGlossaryGetAuthors200ResponseAuthorsInner {
    /**
    * The fullname
    */
    'fullname'?: string = 'null';
    /**
    * The user ID
    */
    'id'?: number;
    /**
    * The picture URL
    */
    'pictureurl'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "pictureurl",
            "baseName": "pictureurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryGetAuthors200ResponseAuthorsInner.attributeTypeMap;
    }
}

