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
import { ModGlossaryGetEntriesByAuthorRequestOptions } from './modGlossaryGetEntriesByAuthorRequestOptions';

export class ModGlossaryGetEntriesByLetterRequest {
    /**
    * Start returning records from here
    */
    'From'?: number = 0;
    /**
    * Glossary entry ID
    */
    'Id': number;
    /**
    * A letter, or either keywords: \'ALL\' or \'SPECIAL\'.
    */
    'Letter': string = 'null';
    /**
    * Number of records to return
    */
    'Limit'?: number = 20;
    'Options'?: ModGlossaryGetEntriesByAuthorRequestOptions;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "From",
            "baseName": "from",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Letter",
            "baseName": "letter",
            "type": "string"
        },
        {
            "name": "Limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "Options",
            "baseName": "options",
            "type": "ModGlossaryGetEntriesByAuthorRequestOptions"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryGetEntriesByLetterRequest.attributeTypeMap;
    }
}

