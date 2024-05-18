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
import { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './modDataGetEntries200ResponseEntriesInnerTagsInner';

export class ModGlossaryGetEntryById200ResponseEntry {
    /**
    * Whether the entry was approved
    */
    'approved': boolean;
    /**
    * Whether or not the entry has attachments
    */
    'attachment': boolean;
    'attachments'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * When true, the matching is case sensitive
    */
    'casesensitive': boolean;
    /**
    * The concept
    */
    'concept': string;
    /**
    * The definition
    */
    'definition': string;
    /**
    * definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'definitionformat': number;
    'definitioninlinefiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * The definition trust flag
    */
    'definitiontrust': boolean;
    /**
    * When true, the matching is done on full words only
    */
    'fullmatch': boolean;
    /**
    * The glossary ID
    */
    'glossaryid': number;
    /**
    * The entry ID
    */
    'id': number;
    /**
    * The source glossary ID
    */
    'sourceglossaryid': number;
    'tags'?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
    * The entry was created by a teacher, or equivalent.
    */
    'teacherentry': boolean;
    /**
    * Time created
    */
    'timecreated': number;
    /**
    * Time modified
    */
    'timemodified': number;
    /**
    * Whether the concept should be automatically linked
    */
    'usedynalink': boolean;
    /**
    * Author full name
    */
    'userfullname': string;
    /**
    * Author ID
    */
    'userid': number;
    /**
    * Author picture
    */
    'userpictureurl': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "approved",
            "baseName": "approved",
            "type": "boolean"
        },
        {
            "name": "attachment",
            "baseName": "attachment",
            "type": "boolean"
        },
        {
            "name": "attachments",
            "baseName": "attachments",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "casesensitive",
            "baseName": "casesensitive",
            "type": "boolean"
        },
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
            "name": "definitioninlinefiles",
            "baseName": "definitioninlinefiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "definitiontrust",
            "baseName": "definitiontrust",
            "type": "boolean"
        },
        {
            "name": "fullmatch",
            "baseName": "fullmatch",
            "type": "boolean"
        },
        {
            "name": "glossaryid",
            "baseName": "glossaryid",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "sourceglossaryid",
            "baseName": "sourceglossaryid",
            "type": "number"
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>"
        },
        {
            "name": "teacherentry",
            "baseName": "teacherentry",
            "type": "boolean"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "usedynalink",
            "baseName": "usedynalink",
            "type": "boolean"
        },
        {
            "name": "userfullname",
            "baseName": "userfullname",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "userpictureurl",
            "baseName": "userpictureurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryGetEntryById200ResponseEntry.attributeTypeMap;
    }
}

