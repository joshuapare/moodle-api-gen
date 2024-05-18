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

export class ModChoiceGetChoiceOptions200ResponseOptionsInner {
    /**
    * we already answered
    */
    'checked'?: boolean = null;
    /**
    * number of answers
    */
    'countanswers'?: number = null;
    /**
    * option disabled
    */
    'disabled'?: boolean = null;
    /**
    * true for orizontal, otherwise vertical
    */
    'displaylayout'?: boolean = null;
    /**
    * option id
    */
    'id'?: number = null;
    /**
    * maximum number of answers
    */
    'maxanswers'?: number = null;
    /**
    * text of the choice
    */
    'text'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "checked",
            "baseName": "checked",
            "type": "boolean"
        },
        {
            "name": "countanswers",
            "baseName": "countanswers",
            "type": "number"
        },
        {
            "name": "disabled",
            "baseName": "disabled",
            "type": "boolean"
        },
        {
            "name": "displaylayout",
            "baseName": "displaylayout",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "maxanswers",
            "baseName": "maxanswers",
            "type": "number"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModChoiceGetChoiceOptions200ResponseOptionsInner.attributeTypeMap;
    }
}
