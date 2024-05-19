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

export class ToolDataprivacySetContextDefaultsRequest {
    /**
    * The plugin name of the activity
    */
    'Activity'?: string;
    /**
    * The default category for the given context level
    */
    'Category': number = null;
    /**
    * The context level
    */
    'Contextlevel': number = null;
    /**
    * Whether to override existing instances with the defaults
    */
    'Override'?: boolean = false;
    /**
    * The default purpose for the given context level
    */
    'Purpose': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Activity",
            "baseName": "activity",
            "type": "string"
        },
        {
            "name": "Category",
            "baseName": "category",
            "type": "number"
        },
        {
            "name": "Contextlevel",
            "baseName": "contextlevel",
            "type": "number"
        },
        {
            "name": "Override",
            "baseName": "override",
            "type": "boolean"
        },
        {
            "name": "Purpose",
            "baseName": "purpose",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolDataprivacySetContextDefaultsRequest.attributeTypeMap;
    }
}

