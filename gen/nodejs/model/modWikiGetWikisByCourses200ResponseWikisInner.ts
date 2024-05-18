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

/**
* Wikis
*/
export class ModWikiGetWikisByCourses200ResponseWikisInner {
    /**
    * True if user can create pages.
    */
    'cancreatepages'?: boolean = null;
    /**
    * Course id
    */
    'course'?: number;
    /**
    * Course module id
    */
    'coursemodule'?: number;
    /**
    * Wiki\'s default format (html, creole, nwiki).
    */
    'defaultformat'?: string = 'null';
    /**
    * Edit begin.
    */
    'editbegin'?: number = null;
    /**
    * Edit end.
    */
    'editend'?: number = null;
    /**
    * First page title.
    */
    'firstpagetitle'?: string = 'null';
    /**
    * 1 if format is forced, 0 otherwise.
    */
    'forceformat'?: number = null;
    /**
    * Group id
    */
    'groupingid'?: number;
    /**
    * Group mode
    */
    'groupmode'?: number;
    /**
    * Activity instance id
    */
    'id'?: number;
    /**
    * Activity introduction
    */
    'intro'?: string;
    'introfiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'introformat'?: number;
    /**
    * Forced activity language
    */
    'lang'?: string;
    /**
    * Activity name
    */
    'name'?: string;
    /**
    * Course section id
    */
    'section'?: number;
    /**
    * Time of creation.
    */
    'timecreated'?: number;
    /**
    * Time of last modification.
    */
    'timemodified'?: number;
    /**
    * Visible
    */
    'visible'?: boolean;
    /**
    * Wiki mode (individual, collaborative).
    */
    'wikimode'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cancreatepages",
            "baseName": "cancreatepages",
            "type": "boolean"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "coursemodule",
            "baseName": "coursemodule",
            "type": "number"
        },
        {
            "name": "defaultformat",
            "baseName": "defaultformat",
            "type": "string"
        },
        {
            "name": "editbegin",
            "baseName": "editbegin",
            "type": "number"
        },
        {
            "name": "editend",
            "baseName": "editend",
            "type": "number"
        },
        {
            "name": "firstpagetitle",
            "baseName": "firstpagetitle",
            "type": "string"
        },
        {
            "name": "forceformat",
            "baseName": "forceformat",
            "type": "number"
        },
        {
            "name": "groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "intro",
            "baseName": "intro",
            "type": "string"
        },
        {
            "name": "introfiles",
            "baseName": "introfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "introformat",
            "baseName": "introformat",
            "type": "number"
        },
        {
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "section",
            "baseName": "section",
            "type": "number"
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
            "name": "visible",
            "baseName": "visible",
            "type": "boolean"
        },
        {
            "name": "wikimode",
            "baseName": "wikimode",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModWikiGetWikisByCourses200ResponseWikisInner.attributeTypeMap;
    }
}

