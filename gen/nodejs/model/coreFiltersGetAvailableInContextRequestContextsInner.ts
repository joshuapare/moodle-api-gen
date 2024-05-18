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

export class CoreFiltersGetAvailableInContextRequestContextsInner {
    /**
    * The context level where the filters are:                                 (coursecat, course, module)
    */
    'contextlevel'?: string = 'null';
    /**
    * The instance id of item associated with the context.
    */
    'instanceid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contextlevel",
            "baseName": "contextlevel",
            "type": "string"
        },
        {
            "name": "instanceid",
            "baseName": "instanceid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreFiltersGetAvailableInContextRequestContextsInner.attributeTypeMap;
    }
}

