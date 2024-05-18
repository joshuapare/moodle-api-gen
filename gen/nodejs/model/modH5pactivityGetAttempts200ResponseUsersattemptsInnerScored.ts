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

export class ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored {
    'attempts': Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>;
    /**
    * Scored attempts title
    */
    'grademethod': string = 'null';
    /**
    * Scored attempts title
    */
    'title': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "attempts",
            "baseName": "attempts",
            "type": "Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>"
        },
        {
            "name": "grademethod",
            "baseName": "grademethod",
            "type": "string"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored.attributeTypeMap;
    }
}

