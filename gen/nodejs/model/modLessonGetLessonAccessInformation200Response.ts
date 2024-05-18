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
import { ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner } from './modLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner';

export class ModLessonGetLessonAccessInformation200Response {
    /**
    * The number of attempts done by the user.
    */
    'attemptscount': number = null;
    /**
    * Whether the user can grade the lesson or not.
    */
    'cangrade': boolean = null;
    /**
    * Whether the user can manage the lesson or not.
    */
    'canmanage': boolean = null;
    /**
    * Whether the user can view the lesson reports or not.
    */
    'canviewreports': boolean = null;
    /**
    * The lesson first page id.
    */
    'firstpageid': number = null;
    /**
    * The last page seen id.
    */
    'lastpageseen': number = null;
    /**
    * Whether the user left during a timed session.
    */
    'leftduringtimedsession': boolean = null;
    'preventaccessreasons': Array<ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner>;
    /**
    * Whether the lesson is in review mode for the current user.
    */
    'reviewmode': boolean = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "attemptscount",
            "baseName": "attemptscount",
            "type": "number"
        },
        {
            "name": "cangrade",
            "baseName": "cangrade",
            "type": "boolean"
        },
        {
            "name": "canmanage",
            "baseName": "canmanage",
            "type": "boolean"
        },
        {
            "name": "canviewreports",
            "baseName": "canviewreports",
            "type": "boolean"
        },
        {
            "name": "firstpageid",
            "baseName": "firstpageid",
            "type": "number"
        },
        {
            "name": "lastpageseen",
            "baseName": "lastpageseen",
            "type": "number"
        },
        {
            "name": "leftduringtimedsession",
            "baseName": "leftduringtimedsession",
            "type": "boolean"
        },
        {
            "name": "preventaccessreasons",
            "baseName": "preventaccessreasons",
            "type": "Array<ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner>"
        },
        {
            "name": "reviewmode",
            "baseName": "reviewmode",
            "type": "boolean"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetLessonAccessInformation200Response.attributeTypeMap;
    }
}

