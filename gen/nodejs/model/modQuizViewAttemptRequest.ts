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

export class ModQuizViewAttemptRequest {
    /**
    * attempt id
    */
    'attemptid': number;
    /**
    * page number
    */
    'page': number;
    'preflightdata'?: Array<ModQuizGetAttemptDataRequestPreflightdataInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "attemptid",
            "baseName": "attemptid",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "preflightdata",
            "baseName": "preflightdata",
            "type": "Array<ModQuizGetAttemptDataRequestPreflightdataInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizViewAttemptRequest.attributeTypeMap;
    }
}

