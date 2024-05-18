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
import { CoreSearchGetTopResultsRequestFilters } from './coreSearchGetTopResultsRequestFilters';

export class CoreSearchGetTopResultsRequest {
    'filters'?: CoreSearchGetTopResultsRequestFilters;
    /**
    * the search query
    */
    'query': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "filters",
            "baseName": "filters",
            "type": "CoreSearchGetTopResultsRequestFilters"
        },
        {
            "name": "query",
            "baseName": "query",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreSearchGetTopResultsRequest.attributeTypeMap;
    }
}
