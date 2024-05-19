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
import { ModGlossaryUpdateEntryRequestOptionsInner } from './modGlossaryUpdateEntryRequestOptionsInner';

export class ModGlossaryUpdateEntryRequest {
    /**
    * Glossary concept
    */
    'concept': string;
    /**
    * Glossary concept definition
    */
    'definition': string;
    /**
    * definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'definitionformat': number;
    /**
    * Glossary entry id to update
    */
    'entryid': number;
    'options'?: Array<ModGlossaryUpdateEntryRequestOptionsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "concept",
            "baseName": "concept",
            "type": "string"
        },
        {
            "name": "definition",
            "baseName": "definition",
            "type": "string"
        },
        {
            "name": "definitionformat",
            "baseName": "definitionformat",
            "type": "number"
        },
        {
            "name": "entryid",
            "baseName": "entryid",
            "type": "number"
        },
        {
            "name": "options",
            "baseName": "options",
            "type": "Array<ModGlossaryUpdateEntryRequestOptionsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryUpdateEntryRequest.attributeTypeMap;
    }
}

