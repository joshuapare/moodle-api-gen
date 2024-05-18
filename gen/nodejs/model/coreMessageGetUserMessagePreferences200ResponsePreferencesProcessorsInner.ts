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

export class CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    /**
    * Context id
    */
    'contextid'?: number = null;
    /**
    * Display name
    */
    'displayname'?: string;
    /**
    * Whether has settings
    */
    'hassettings'?: boolean = null;
    /**
    * Processor name
    */
    'name'?: string;
    /**
    * Whether is configured by the user
    */
    'userconfigured'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "displayname",
            "baseName": "displayname",
            "type": "string"
        },
        {
            "name": "hassettings",
            "baseName": "hassettings",
            "type": "boolean"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "userconfigured",
            "baseName": "userconfigured",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner.attributeTypeMap;
    }
}

