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
import { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './modDataGetEntries200ResponseEntriesInnerTagsInner';

/**
* Pages
*/
export class ModWikiGetSubwikiPages200ResponsePagesInner {
    /**
    * Page contents.
    */
    'cachedcontent'?: string;
    /**
    * True if user can edit the page.
    */
    'caneditpage'?: boolean;
    /**
    * cachedcontent format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'contentformat'?: number;
    /**
    * Size of page contents in bytes (doesn\'t include size of attached files).
    */
    'contentsize'?: number = null;
    /**
    * True if it\'s the first page.
    */
    'firstpage'?: boolean = null;
    /**
    * Page ID.
    */
    'id'?: number;
    /**
    * Number of times the page has been viewed.
    */
    'pageviews'?: number = null;
    /**
    * 1 if readonly, 0 otherwise.
    */
    'readonly'?: number = null;
    /**
    * Page\'s subwiki ID.
    */
    'subwikiid'?: number;
    'tags'?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
    * Time of creation.
    */
    'timecreated'?: number = null;
    /**
    * Time of last modification.
    */
    'timemodified'?: number = null;
    /**
    * Time of last renderization.
    */
    'timerendered'?: number = null;
    /**
    * Page title.
    */
    'title'?: string;
    /**
    * ID of the user that last modified the page.
    */
    'userid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cachedcontent",
            "baseName": "cachedcontent",
            "type": "string"
        },
        {
            "name": "caneditpage",
            "baseName": "caneditpage",
            "type": "boolean"
        },
        {
            "name": "contentformat",
            "baseName": "contentformat",
            "type": "number"
        },
        {
            "name": "contentsize",
            "baseName": "contentsize",
            "type": "number"
        },
        {
            "name": "firstpage",
            "baseName": "firstpage",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "pageviews",
            "baseName": "pageviews",
            "type": "number"
        },
        {
            "name": "readonly",
            "baseName": "readonly",
            "type": "number"
        },
        {
            "name": "subwikiid",
            "baseName": "subwikiid",
            "type": "number"
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>"
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
            "name": "timerendered",
            "baseName": "timerendered",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModWikiGetSubwikiPages200ResponsePagesInner.attributeTypeMap;
    }
}
