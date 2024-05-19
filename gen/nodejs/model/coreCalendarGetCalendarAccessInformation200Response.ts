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

export class CoreCalendarGetCalendarAccessInformation200Response {
    /**
    * Whether the user can manage entries.
    */
    'canmanageentries': boolean = null;
    /**
    * Whether the user can manage group entries.
    */
    'canmanagegroupentries': boolean = null;
    /**
    * Whether the user can manage its own entries.
    */
    'canmanageownentries': boolean = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "canmanageentries",
            "baseName": "canmanageentries",
            "type": "boolean"
        },
        {
            "name": "canmanagegroupentries",
            "baseName": "canmanagegroupentries",
            "type": "boolean"
        },
        {
            "name": "canmanageownentries",
            "baseName": "canmanageownentries",
            "type": "boolean"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarAccessInformation200Response.attributeTypeMap;
    }
}

