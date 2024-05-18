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

export class ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls {
    /**
    * Access Token URL
    */
    'accesstoken': string;
    /**
    * Authorisation Request URL
    */
    'authrequest': string;
    /**
    * Tool type edit URL
    */
    'course'?: string;
    /**
    * Tool type edit URL
    */
    'edit': string;
    /**
    * Tool type icon URL
    */
    'icon': string;
    /**
    * Public Keyset URL
    */
    'publickeyset': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accesstoken",
            "baseName": "accesstoken",
            "type": "string"
        },
        {
            "name": "authrequest",
            "baseName": "authrequest",
            "type": "string"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "string"
        },
        {
            "name": "edit",
            "baseName": "edit",
            "type": "string"
        },
        {
            "name": "icon",
            "baseName": "icon",
            "type": "string"
        },
        {
            "name": "publickeyset",
            "baseName": "publickeyset",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.attributeTypeMap;
    }
}
