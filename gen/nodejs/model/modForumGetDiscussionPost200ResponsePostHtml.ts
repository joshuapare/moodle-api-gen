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

export class ModForumGetDiscussionPost200ResponsePostHtml {
    /**
    * The HTML source to view the author details
    */
    'Authorsubheading'?: string;
    /**
    * The HTML source to rate the post
    */
    'Rating'?: string;
    /**
    * The HTML source to view the list of tags
    */
    'Taglist'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Authorsubheading",
            "baseName": "authorsubheading",
            "type": "string"
        },
        {
            "name": "Rating",
            "baseName": "rating",
            "type": "string"
        },
        {
            "name": "Taglist",
            "baseName": "taglist",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetDiscussionPost200ResponsePostHtml.attributeTypeMap;
    }
}

