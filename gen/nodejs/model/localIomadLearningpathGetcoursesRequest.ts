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

export class LocalIomadLearningpathGetcoursesRequest {
    /**
    * ID of Iomad Learning Path group (0 = return all)
    */
    'groupid'?: number = 0;
    /**
    * ID of Iomad Learning Path
    */
    'pathid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "pathid",
            "baseName": "pathid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return LocalIomadLearningpathGetcoursesRequest.attributeTypeMap;
    }
}

