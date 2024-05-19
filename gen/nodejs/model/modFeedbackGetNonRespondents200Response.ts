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
import { ModFeedbackGetNonRespondents200ResponseUsersInner } from './modFeedbackGetNonRespondents200ResponseUsersInner';

export class ModFeedbackGetNonRespondents200Response {
    /**
    * Total number of non respondents
    */
    'Total': number = null;
    'Users': Array<ModFeedbackGetNonRespondents200ResponseUsersInner>;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Total",
            "baseName": "total",
            "type": "number"
        },
        {
            "name": "Users",
            "baseName": "users",
            "type": "Array<ModFeedbackGetNonRespondents200ResponseUsersInner>"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetNonRespondents200Response.attributeTypeMap;
    }
}

