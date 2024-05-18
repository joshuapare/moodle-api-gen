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

export class ModDataGetDataAccessInformation200Response {
    /**
    * Whether the user can add entries or not.
    */
    'canaddentry': boolean = null;
    /**
    * Whether the user can approve entries or not.
    */
    'canapprove': boolean = null;
    /**
    * Whether the user can manage entries or not.
    */
    'canmanageentries': boolean = null;
    /**
    * The number of entries left to complete the activity.
    */
    'entrieslefttoadd': number = null;
    /**
    * The number of entries left to view other users entries.
    */
    'entrieslefttoview': number = null;
    /**
    * User current group id (calculated)
    */
    'groupid': number = null;
    /**
    * Whether the database is in read mode only.
    */
    'inreadonlyperiod': boolean = null;
    /**
    * The number of entries the current user added.
    */
    'numentries': number = null;
    /**
    * Whether the database is available or not by time restrictions.
    */
    'timeavailable': boolean = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "canaddentry",
            "baseName": "canaddentry",
            "type": "boolean"
        },
        {
            "name": "canapprove",
            "baseName": "canapprove",
            "type": "boolean"
        },
        {
            "name": "canmanageentries",
            "baseName": "canmanageentries",
            "type": "boolean"
        },
        {
            "name": "entrieslefttoadd",
            "baseName": "entrieslefttoadd",
            "type": "number"
        },
        {
            "name": "entrieslefttoview",
            "baseName": "entrieslefttoview",
            "type": "number"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "inreadonlyperiod",
            "baseName": "inreadonlyperiod",
            "type": "boolean"
        },
        {
            "name": "numentries",
            "baseName": "numentries",
            "type": "number"
        },
        {
            "name": "timeavailable",
            "baseName": "timeavailable",
            "type": "boolean"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModDataGetDataAccessInformation200Response.attributeTypeMap;
    }
}
