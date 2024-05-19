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
import { ModWorkshopGetSubmissions200ResponseSubmissionsInner } from './modWorkshopGetSubmissions200ResponseSubmissionsInner';

export class ModWorkshopGetSubmissions200Response {
    'Submissions': Array<ModWorkshopGetSubmissions200ResponseSubmissionsInner>;
    /**
    * Total count of submissions.
    */
    'Totalcount': number = null;
    /**
    * Total size (bytes) of the files attached to all the                     submissions (even the ones not returned due to pagination).
    */
    'Totalfilesize': number = null;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Submissions",
            "baseName": "submissions",
            "type": "Array<ModWorkshopGetSubmissions200ResponseSubmissionsInner>"
        },
        {
            "name": "Totalcount",
            "baseName": "totalcount",
            "type": "number"
        },
        {
            "name": "Totalfilesize",
            "baseName": "totalfilesize",
            "type": "number"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopGetSubmissions200Response.attributeTypeMap;
    }
}

