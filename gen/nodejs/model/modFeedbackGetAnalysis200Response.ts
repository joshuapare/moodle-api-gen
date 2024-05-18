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
import { ModFeedbackGetAnalysis200ResponseItemsdataInner } from './modFeedbackGetAnalysis200ResponseItemsdataInner';

export class ModFeedbackGetAnalysis200Response {
    /**
    * Number of completed submissions.
    */
    'completedcount': number = null;
    /**
    * Number of items (questions).
    */
    'itemscount': number = null;
    'itemsdata': Array<ModFeedbackGetAnalysis200ResponseItemsdataInner>;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "completedcount",
            "baseName": "completedcount",
            "type": "number"
        },
        {
            "name": "itemscount",
            "baseName": "itemscount",
            "type": "number"
        },
        {
            "name": "itemsdata",
            "baseName": "itemsdata",
            "type": "Array<ModFeedbackGetAnalysis200ResponseItemsdataInner>"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetAnalysis200Response.attributeTypeMap;
    }
}
