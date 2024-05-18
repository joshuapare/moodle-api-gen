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

export class ModQuizGetAttemptAccessInformation200Response {
    /**
    * When the attempt must be submitted (determined by rules).
    */
    'endtime'?: number = null;
    /**
    * Whether there is no way the user will ever be allowed to attempt.
    */
    'isfinished': boolean = null;
    /**
    * whether a check is required before the user                                                                     starts/continues his attempt.
    */
    'ispreflightcheckrequired'?: boolean = null;
    'preventnewattemptreasons': Array<object>;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endtime",
            "baseName": "endtime",
            "type": "number"
        },
        {
            "name": "isfinished",
            "baseName": "isfinished",
            "type": "boolean"
        },
        {
            "name": "ispreflightcheckrequired",
            "baseName": "ispreflightcheckrequired",
            "type": "boolean"
        },
        {
            "name": "preventnewattemptreasons",
            "baseName": "preventnewattemptreasons",
            "type": "Array<object>"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetAttemptAccessInformation200Response.attributeTypeMap;
    }
}
