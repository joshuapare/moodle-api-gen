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
import { ModLtiCreateToolType200ResponseState } from './modLtiCreateToolType200ResponseState';
import { ModLtiCreateToolType200ResponseUrls } from './modLtiCreateToolType200ResponseUrls';

export class ModLtiCreateToolType200Response {
    'capabilitygroups'?: Array<object>;
    /**
    * Client ID
    */
    'clientid': string = 'null';
    /**
    * Tool type course
    */
    'courseid'?: number = 0;
    /**
    * Deployment ID
    */
    'deploymentid': number = null;
    /**
    * Tool type description
    */
    'description': string = 'null';
    /**
    * Indicate if capabilitygroups is populated
    */
    'hascapabilitygroups': boolean = null;
    /**
    * Tool type id
    */
    'id': number = null;
    /**
    * The number of times this tool is being used
    */
    'instancecount': number = null;
    'instanceids'?: Array<object>;
    /**
    * Tool type name
    */
    'name': string = 'null';
    /**
    * Platform ID
    */
    'platformid': string = 'null';
    'state': ModLtiCreateToolType200ResponseState;
    'urls': ModLtiCreateToolType200ResponseUrls;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "capabilitygroups",
            "baseName": "capabilitygroups",
            "type": "Array<object>"
        },
        {
            "name": "clientid",
            "baseName": "clientid",
            "type": "string"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "deploymentid",
            "baseName": "deploymentid",
            "type": "number"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "hascapabilitygroups",
            "baseName": "hascapabilitygroups",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "instancecount",
            "baseName": "instancecount",
            "type": "number"
        },
        {
            "name": "instanceids",
            "baseName": "instanceids",
            "type": "Array<object>"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "platformid",
            "baseName": "platformid",
            "type": "string"
        },
        {
            "name": "state",
            "baseName": "state",
            "type": "ModLtiCreateToolType200ResponseState"
        },
        {
            "name": "urls",
            "baseName": "urls",
            "type": "ModLtiCreateToolType200ResponseUrls"
        }    ];

    static getAttributeTypeMap() {
        return ModLtiCreateToolType200Response.attributeTypeMap;
    }
}

