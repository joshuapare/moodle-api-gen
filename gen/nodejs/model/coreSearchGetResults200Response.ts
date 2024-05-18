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
import { CoreSearchGetResults200ResponseResultsInner } from './coreSearchGetResults200ResponseResultsInner';

export class CoreSearchGetResults200Response {
    'results': Array<CoreSearchGetResults200ResponseResultsInner>;
    /**
    * Total number of results
    */
    'totalcount': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "results",
            "baseName": "results",
            "type": "Array<CoreSearchGetResults200ResponseResultsInner>"
        },
        {
            "name": "totalcount",
            "baseName": "totalcount",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreSearchGetResults200Response.attributeTypeMap;
    }
}
