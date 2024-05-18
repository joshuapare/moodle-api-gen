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

export class LocalIomadLearningpathGetusersRequest {
    /**
    * ID of Iomad Company
    */
    'companyid': number;
    /**
    * ID learning path
    */
    'pathid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "pathid",
            "baseName": "pathid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return LocalIomadLearningpathGetusersRequest.attributeTypeMap;
    }
}

