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

export class ModForumGetForumDiscussionsPaginatedRequest {
    /**
    * forum instance id
    */
    'forumid': number;
    /**
    * current page
    */
    'page'?: number = -1;
    /**
    * items per page
    */
    'perpage'?: number = 0;
    /**
    * sort by this element: id, timemodified, timestart or timeend
    */
    'sortby'?: string = 'timemodified';
    /**
    * sort direction: ASC or DESC
    */
    'sortdirection'?: string = 'DESC';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "forumid",
            "baseName": "forumid",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "perpage",
            "baseName": "perpage",
            "type": "number"
        },
        {
            "name": "sortby",
            "baseName": "sortby",
            "type": "string"
        },
        {
            "name": "sortdirection",
            "baseName": "sortdirection",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetForumDiscussionsPaginatedRequest.attributeTypeMap;
    }
}

