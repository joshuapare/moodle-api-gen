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
import { ModDataGetEntries200ResponseEntriesInnerTagsInner } from './mod-data-get-entries200-response-entries-inner-tags-inner';


/**
 * Pages
 */
export interface ModWikiGetSubwikiPages200ResponsePagesInner { 
    /**
     * Page contents.
     */
    Cachedcontent?: string;
    /**
     * True if user can edit the page.
     */
    Caneditpage?: boolean;
    /**
     * cachedcontent format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Contentformat?: number;
    /**
     * Size of page contents in bytes (doesn\'t include size of attached files).
     */
    Contentsize?: number;
    /**
     * True if it\'s the first page.
     */
    Firstpage?: boolean;
    /**
     * Page ID.
     */
    Id?: number;
    /**
     * Number of times the page has been viewed.
     */
    Pageviews?: number;
    /**
     * 1 if readonly, 0 otherwise.
     */
    Readonly?: number;
    /**
     * Page\'s subwiki ID.
     */
    Subwikiid?: number;
    Tags?: Array<ModDataGetEntries200ResponseEntriesInnerTagsInner>;
    /**
     * Time of creation.
     */
    Timecreated?: number;
    /**
     * Time of last modification.
     */
    Timemodified?: number;
    /**
     * Time of last renderization.
     */
    Timerendered?: number;
    /**
     * Page title.
     */
    Title?: string;
    /**
     * ID of the user that last modified the page.
     */
    Userid?: number;
}

