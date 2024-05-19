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

export class CoreSearchViewResultsRequestFilters {
    'Areaids'?: Array<object>;
    'Courseids'?: Array<object>;
    /**
    * docs modified before this date
    */
    'Timeend'?: number = 0;
    /**
    * docs modified after this date
    */
    'Timestart'?: number = 0;
    /**
    * result title
    */
    'Title'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Areaids",
            "baseName": "areaids",
            "type": "Array<object>"
        },
        {
            "name": "Courseids",
            "baseName": "courseids",
            "type": "Array<object>"
        },
        {
            "name": "Timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "Timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "Title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreSearchViewResultsRequestFilters.attributeTypeMap;
    }
}

