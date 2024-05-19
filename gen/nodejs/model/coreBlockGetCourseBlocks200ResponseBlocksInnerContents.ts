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
import { CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner';

export class CoreBlockGetCourseBlocks200ResponseBlocksInnerContents {
    /**
    * Block contents.
    */
    'Content': string = 'null';
    /**
    * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Contentformat': number = null;
    'Files': Array<CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * Block footer.
    */
    'Footer': string = 'null';
    /**
    * Block title.
    */
    'Title': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "Contentformat",
            "baseName": "contentformat",
            "type": "number"
        },
        {
            "name": "Files",
            "baseName": "files",
            "type": "Array<CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "Footer",
            "baseName": "footer",
            "type": "string"
        },
        {
            "name": "Title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.attributeTypeMap;
    }
}

