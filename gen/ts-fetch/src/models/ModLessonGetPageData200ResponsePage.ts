/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ModLessonGetPageData200ResponsePage
 */
export interface ModLessonGetPageData200ResponsePage {
    /**
     * The contents of this page
     * @type {string}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Contents?: string;
    /**
     * contents format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Contentsformat?: number;
    /**
     * Used to record page specific display selections
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Display: number;
    /**
     * Toggles display in the left menu block
     * @type {boolean}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Displayinmenublock: boolean;
    /**
     * The id of this lesson page
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Id: number;
    /**
     * Used to record page specific layout selections
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Layout: number;
    /**
     * The id of the lesson this page belongs to
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Lessonid: number;
    /**
     * The id of the next page in the page sequence
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Nextpageid: number;
    /**
     * The id of the page before this one
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Prevpageid: number;
    /**
     * Used to record page type specific options
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Qoption: number;
    /**
     * Identifies the page type of this page
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Qtype: number;
    /**
     * Timestamp for when the page was created
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Timecreated: number;
    /**
     * Timestamp for when the page was last modified
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Timemodified: number;
    /**
     * The title of this page
     * @type {string}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Title?: string;
    /**
     * The type of the page [question | structure]
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Type: number;
    /**
     * The unique identifier for the page type
     * @type {number}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Typeid: number;
    /**
     * The string that describes this page type
     * @type {string}
     * @memberof ModLessonGetPageData200ResponsePage
     */
    Typestring: string;
}

/**
 * Check if a given object implements the ModLessonGetPageData200ResponsePage interface.
 */
export function instanceOfModLessonGetPageData200ResponsePage(value: object): boolean {
    if (!('Display' in value)) return false;
    if (!('Displayinmenublock' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Layout' in value)) return false;
    if (!('Lessonid' in value)) return false;
    if (!('Nextpageid' in value)) return false;
    if (!('Prevpageid' in value)) return false;
    if (!('Qoption' in value)) return false;
    if (!('Qtype' in value)) return false;
    if (!('Timecreated' in value)) return false;
    if (!('Timemodified' in value)) return false;
    if (!('Type' in value)) return false;
    if (!('Typeid' in value)) return false;
    if (!('Typestring' in value)) return false;
    return true;
}

export function ModLessonGetPageData200ResponsePageFromJSON(json: any): ModLessonGetPageData200ResponsePage {
    return ModLessonGetPageData200ResponsePageFromJSONTyped(json, false);
}

export function ModLessonGetPageData200ResponsePageFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetPageData200ResponsePage {
    if (json == null) {
        return json;
    }
    return {
        
        'Contents': json['contents'] == null ? undefined : json['contents'],
        'Contentsformat': json['contentsformat'] == null ? undefined : json['contentsformat'],
        'Display': json['display'],
        'Displayinmenublock': json['displayinmenublock'],
        'Id': json['id'],
        'Layout': json['layout'],
        'Lessonid': json['lessonid'],
        'Nextpageid': json['nextpageid'],
        'Prevpageid': json['prevpageid'],
        'Qoption': json['qoption'],
        'Qtype': json['qtype'],
        'Timecreated': json['timecreated'],
        'Timemodified': json['timemodified'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Type': json['type'],
        'Typeid': json['typeid'],
        'Typestring': json['typestring'],
    };
}

export function ModLessonGetPageData200ResponsePageToJSON(value?: ModLessonGetPageData200ResponsePage | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contents': value['Contents'],
        'contentsformat': value['Contentsformat'],
        'display': value['Display'],
        'displayinmenublock': value['Displayinmenublock'],
        'id': value['Id'],
        'layout': value['Layout'],
        'lessonid': value['Lessonid'],
        'nextpageid': value['Nextpageid'],
        'prevpageid': value['Prevpageid'],
        'qoption': value['Qoption'],
        'qtype': value['Qtype'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'title': value['Title'],
        'type': value['Type'],
        'typeid': value['Typeid'],
        'typestring': value['Typestring'],
    };
}
