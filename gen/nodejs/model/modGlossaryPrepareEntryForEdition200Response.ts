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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { ModGlossaryPrepareEntryForEdition200ResponseAreasInner } from './modGlossaryPrepareEntryForEdition200ResponseAreasInner';

export class ModGlossaryPrepareEntryForEdition200Response {
    'aliases': Array<object>;
    'areas': Array<ModGlossaryPrepareEntryForEdition200ResponseAreasInner>;
    /**
    * Draft item id for the file manager.
    */
    'attachmentsid': number = null;
    'categories': Array<object>;
    /**
    * Draft item id for the text editor.
    */
    'inlineattachmentsid': number = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "aliases",
            "baseName": "aliases",
            "type": "Array<object>"
        },
        {
            "name": "areas",
            "baseName": "areas",
            "type": "Array<ModGlossaryPrepareEntryForEdition200ResponseAreasInner>"
        },
        {
            "name": "attachmentsid",
            "baseName": "attachmentsid",
            "type": "number"
        },
        {
            "name": "categories",
            "baseName": "categories",
            "type": "Array<object>"
        },
        {
            "name": "inlineattachmentsid",
            "baseName": "inlineattachmentsid",
            "type": "number"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryPrepareEntryForEdition200Response.attributeTypeMap;
    }
}

