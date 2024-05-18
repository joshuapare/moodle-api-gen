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
import { ModForumPrepareDraftAreaForPostRequestFilestokeepInner } from './modForumPrepareDraftAreaForPostRequestFilestokeepInner';

export class ModForumPrepareDraftAreaForPostRequest {
    /**
    * Area to prepare: attachment or post.
    */
    'area': string = 'null';
    /**
    * The draft item id to use. 0 to generate one.
    */
    'draftitemid'?: number = 0;
    'filestokeep'?: Array<ModForumPrepareDraftAreaForPostRequestFilestokeepInner>;
    /**
    * Post to prepare the draft area for.
    */
    'postid': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "draftitemid",
            "baseName": "draftitemid",
            "type": "number"
        },
        {
            "name": "filestokeep",
            "baseName": "filestokeep",
            "type": "Array<ModForumPrepareDraftAreaForPostRequestFilestokeepInner>"
        },
        {
            "name": "postid",
            "baseName": "postid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModForumPrepareDraftAreaForPostRequest.attributeTypeMap;
    }
}
