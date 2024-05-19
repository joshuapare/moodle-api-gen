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

export class ModQuizGetQuizAccessInformation200Response {
    'Accessrules': Array<object>;
    'Activerulenames': Array<object>;
    /**
    * Whether the user can do the quiz or not.
    */
    'Canattempt': boolean = null;
    /**
    * Whether the user can edit the quiz settings or not.
    */
    'Canmanage': boolean = null;
    /**
    * Whether the user can preview the quiz or not.
    */
    'Canpreview': boolean = null;
    /**
    * Whether the users can review their previous attempts                                                                 or not.
    */
    'Canreviewmyattempts': boolean = null;
    /**
    * Whether the user can view the quiz reports or not.
    */
    'Canviewreports': boolean = null;
    'Preventaccessreasons': Array<object>;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Accessrules",
            "baseName": "accessrules",
            "type": "Array<object>"
        },
        {
            "name": "Activerulenames",
            "baseName": "activerulenames",
            "type": "Array<object>"
        },
        {
            "name": "Canattempt",
            "baseName": "canattempt",
            "type": "boolean"
        },
        {
            "name": "Canmanage",
            "baseName": "canmanage",
            "type": "boolean"
        },
        {
            "name": "Canpreview",
            "baseName": "canpreview",
            "type": "boolean"
        },
        {
            "name": "Canreviewmyattempts",
            "baseName": "canreviewmyattempts",
            "type": "boolean"
        },
        {
            "name": "Canviewreports",
            "baseName": "canviewreports",
            "type": "boolean"
        },
        {
            "name": "Preventaccessreasons",
            "baseName": "preventaccessreasons",
            "type": "Array<object>"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetQuizAccessInformation200Response.attributeTypeMap;
    }
}

