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

export class CoreXapiDeleteStatesRequest {
    /**
    * xAPI activity ID IRI
    */
    'activityId': string;
    /**
    * The xAPI agent json
    */
    'agent': string;
    /**
    * Component name
    */
    'component': string;
    /**
    * The xAPI registration UUID
    */
    'registration'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activityId",
            "baseName": "activityId",
            "type": "string"
        },
        {
            "name": "agent",
            "baseName": "agent",
            "type": "string"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "registration",
            "baseName": "registration",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreXapiDeleteStatesRequest.attributeTypeMap;
    }
}

