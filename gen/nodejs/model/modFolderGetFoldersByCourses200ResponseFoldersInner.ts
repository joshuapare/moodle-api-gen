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

export class ModFolderGetFoldersByCourses200ResponseFoldersInner {
    /**
    * Course id
    */
    'Course'?: number;
    /**
    * Course module id
    */
    'Coursemodule'?: number;
    /**
    * Display type of folder contents on a separate page or inline
    */
    'Display'?: number = null;
    /**
    * Whether file download is forced
    */
    'Forcedownload'?: number = null;
    /**
    * Group id
    */
    'Groupingid'?: number;
    /**
    * Group mode
    */
    'Groupmode'?: number;
    /**
    * Activity instance id
    */
    'Id'?: number;
    /**
    * Activity introduction
    */
    'Intro'?: string;
    'Introfiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Introformat'?: number;
    /**
    * Forced activity language
    */
    'Lang'?: string;
    /**
    * Activity name
    */
    'Name'?: string;
    /**
    * Incremented when after each file changes, to avoid cache
    */
    'Revision'?: number = null;
    /**
    * Course section id
    */
    'Section'?: number;
    /**
    * Whether to show the download folder button
    */
    'Showdownloadfolder'?: number = null;
    /**
    * 1 = expanded, 0 = collapsed for sub-folders
    */
    'Showexpanded'?: number = null;
    /**
    * Last time the folder was modified
    */
    'Timemodified'?: number = null;
    /**
    * Visible
    */
    'Visible'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "Coursemodule",
            "baseName": "coursemodule",
            "type": "number"
        },
        {
            "name": "Display",
            "baseName": "display",
            "type": "number"
        },
        {
            "name": "Forcedownload",
            "baseName": "forcedownload",
            "type": "number"
        },
        {
            "name": "Groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "Groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Intro",
            "baseName": "intro",
            "type": "string"
        },
        {
            "name": "Introfiles",
            "baseName": "introfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "Introformat",
            "baseName": "introformat",
            "type": "number"
        },
        {
            "name": "Lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Revision",
            "baseName": "revision",
            "type": "number"
        },
        {
            "name": "Section",
            "baseName": "section",
            "type": "number"
        },
        {
            "name": "Showdownloadfolder",
            "baseName": "showdownloadfolder",
            "type": "number"
        },
        {
            "name": "Showexpanded",
            "baseName": "showexpanded",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Visible",
            "baseName": "visible",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModFolderGetFoldersByCourses200ResponseFoldersInner.attributeTypeMap;
    }
}

