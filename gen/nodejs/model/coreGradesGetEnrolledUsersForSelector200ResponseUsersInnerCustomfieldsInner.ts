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

export class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner {
    /**
    * The value of the custom field for display
    */
    'displayvalue'?: string = 'null';
    /**
    * The name of the custom field
    */
    'name'?: string;
    /**
    * The shortname of the custom field - to be able to build the field class in the code
    */
    'shortname'?: string;
    /**
    * The type of the custom field - text field, checkbox...
    */
    'type'?: string;
    /**
    * The value of the custom field (as stored in the database)
    */
    'value'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "displayvalue",
            "baseName": "displayvalue",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "shortname",
            "baseName": "shortname",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.attributeTypeMap;
    }
}
