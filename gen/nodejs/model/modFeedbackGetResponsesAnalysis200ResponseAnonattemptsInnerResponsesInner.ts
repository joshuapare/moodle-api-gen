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

export class ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner {
    /**
    * Response id
    */
    'id'?: number = null;
    /**
    * Response name
    */
    'name'?: string = 'null';
    /**
    * Response ready for output
    */
    'printval'?: string = 'null';
    /**
    * Response raw value
    */
    'rawval'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "printval",
            "baseName": "printval",
            "type": "string"
        },
        {
            "name": "rawval",
            "baseName": "rawval",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner.attributeTypeMap;
    }
}
