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
import { ModQuizGetAttemptDataRequestPreflightdataInner } from './modQuizGetAttemptDataRequestPreflightdataInner';

export class ModQuizSaveAttemptRequest {
    /**
    * attempt id
    */
    'Attemptid': number;
    'Data': Array<ModQuizGetAttemptDataRequestPreflightdataInner>;
    'Preflightdata'?: Array<ModQuizGetAttemptDataRequestPreflightdataInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attemptid",
            "baseName": "attemptid",
            "type": "number"
        },
        {
            "name": "Data",
            "baseName": "data",
            "type": "Array<ModQuizGetAttemptDataRequestPreflightdataInner>"
        },
        {
            "name": "Preflightdata",
            "baseName": "preflightdata",
            "type": "Array<ModQuizGetAttemptDataRequestPreflightdataInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizSaveAttemptRequest.attributeTypeMap;
    }
}

