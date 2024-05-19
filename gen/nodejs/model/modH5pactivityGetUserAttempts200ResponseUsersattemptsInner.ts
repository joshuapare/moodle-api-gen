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
import { ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner } from './modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner';
import { ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored } from './modH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored';

export class ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner {
    'Attempts'?: Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>;
    'Scored'?: ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored;
    /**
    * The user id
    */
    'Userid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attempts",
            "baseName": "attempts",
            "type": "Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>"
        },
        {
            "name": "Scored",
            "baseName": "scored",
            "type": "ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.attributeTypeMap;
    }
}

