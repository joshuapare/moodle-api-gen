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

export class ModForumGetDiscussionPostsRequest {
    /**
    * The ID of the discussion from which to fetch posts.
    */
    'Discussionid': number = null;
    /**
    * Whether inline attachments should be included or not
    */
    'Includeinlineattachments'?: boolean = false;
    /**
    * Sort by this element: id, created or modified
    */
    'Sortby'?: string = 'created';
    /**
    * Sort direction: ASC or DESC
    */
    'Sortdirection'?: string = 'DESC';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Discussionid",
            "baseName": "discussionid",
            "type": "number"
        },
        {
            "name": "Includeinlineattachments",
            "baseName": "includeinlineattachments",
            "type": "boolean"
        },
        {
            "name": "Sortby",
            "baseName": "sortby",
            "type": "string"
        },
        {
            "name": "Sortdirection",
            "baseName": "sortdirection",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetDiscussionPostsRequest.attributeTypeMap;
    }
}

