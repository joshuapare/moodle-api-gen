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

export class CoreBlogViewEntriesRequestFiltersInner {
    /**
    * The expected keys (value format) are:                                 tag      PARAM_NOTAGS blog tag                                 tagid    PARAM_INT    blog tag id                                 userid   PARAM_INT    blog author (userid)                                 cmid     PARAM_INT    course module id                                 entryid  PARAM_INT    entry id                                 groupid  PARAM_INT    group id                                 courseid PARAM_INT    course id                                 search   PARAM_RAW    search term                                 
    */
    'Name'?: string = 'null';
    /**
    * The value of the filter.
    */
    'Value'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Value",
            "baseName": "value",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreBlogViewEntriesRequestFiltersInner.attributeTypeMap;
    }
}

