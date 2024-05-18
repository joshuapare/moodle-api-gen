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
import { ModLtiGetToolLaunchData200ResponseParametersInner } from './modLtiGetToolLaunchData200ResponseParametersInner';

export class ModLtiGetToolLaunchData200Response {
    /**
    * Endpoint URL
    */
    'endpoint': string = 'null';
    'parameters': Array<ModLtiGetToolLaunchData200ResponseParametersInner>;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "endpoint",
            "baseName": "endpoint",
            "type": "string"
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<ModLtiGetToolLaunchData200ResponseParametersInner>"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModLtiGetToolLaunchData200Response.attributeTypeMap;
    }
}

