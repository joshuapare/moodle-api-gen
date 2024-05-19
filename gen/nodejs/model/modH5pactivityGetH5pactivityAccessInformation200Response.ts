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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';

export class ModH5pactivityGetH5pactivityAccessInformation200Response {
    /**
    * Whether the user has the capability mod/h5pactivity:addinstance allowed.
    */
    'Canaddinstance'?: boolean = null;
    /**
    * Whether the user has the capability mod/h5pactivity:reviewattempts allowed.
    */
    'Canreviewattempts'?: boolean = null;
    /**
    * Whether the user has the capability mod/h5pactivity:submit allowed.
    */
    'Cansubmit'?: boolean = null;
    /**
    * Whether the user has the capability mod/h5pactivity:view allowed.
    */
    'Canview'?: boolean = null;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canaddinstance",
            "baseName": "canaddinstance",
            "type": "boolean"
        },
        {
            "name": "Canreviewattempts",
            "baseName": "canreviewattempts",
            "type": "boolean"
        },
        {
            "name": "Cansubmit",
            "baseName": "cansubmit",
            "type": "boolean"
        },
        {
            "name": "Canview",
            "baseName": "canview",
            "type": "boolean"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModH5pactivityGetH5pactivityAccessInformation200Response.attributeTypeMap;
    }
}

