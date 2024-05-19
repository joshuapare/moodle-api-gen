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
import { CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner } from './coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';

export class ModDataGetEntry200ResponseEntryContentsInner {
    /**
    * Contents.
    */
    'Content'?: string;
    /**
    * Contents.
    */
    'Content1'?: string;
    /**
    * Contents.
    */
    'Content2'?: string;
    /**
    * Contents.
    */
    'Content3'?: string;
    /**
    * Contents.
    */
    'Content4'?: string;
    /**
    * The field type of the content.
    */
    'Fieldid'?: number = 0;
    'Files'?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
    * Content id.
    */
    'Id'?: number;
    /**
    * The record this content belongs to.
    */
    'Recordid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "Content1",
            "baseName": "content1",
            "type": "string"
        },
        {
            "name": "Content2",
            "baseName": "content2",
            "type": "string"
        },
        {
            "name": "Content3",
            "baseName": "content3",
            "type": "string"
        },
        {
            "name": "Content4",
            "baseName": "content4",
            "type": "string"
        },
        {
            "name": "Fieldid",
            "baseName": "fieldid",
            "type": "number"
        },
        {
            "name": "Files",
            "baseName": "files",
            "type": "Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Recordid",
            "baseName": "recordid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModDataGetEntry200ResponseEntryContentsInner.attributeTypeMap;
    }
}

