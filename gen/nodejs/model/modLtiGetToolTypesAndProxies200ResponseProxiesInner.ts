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

export class ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    /**
    * Tool proxy capabilities offered
    */
    'Capabilityoffered'?: string;
    /**
    * Tool proxy globally unique identifier
    */
    'Guid'?: string;
    /**
    * Tool proxy id
    */
    'Id'?: number;
    /**
    * Tool proxy name
    */
    'Name'?: string;
    /**
    * Tool proxy registration URL
    */
    'Regurl'?: string;
    /**
    * Tool proxy shared secret
    */
    'Secret'?: string;
    /**
    * Tool proxy services offered
    */
    'Serviceoffered'?: string;
    /**
    * Tool proxy state
    */
    'State'?: number;
    /**
    * Tool proxy time created
    */
    'Timecreated'?: number;
    /**
    * Tool proxy modified
    */
    'Timemodified'?: number;
    /**
    * Tool proxy
    */
    'Toolproxy'?: string;
    /**
    * Tool proxy consumer code
    */
    'Vendorcode'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Capabilityoffered",
            "baseName": "capabilityoffered",
            "type": "string"
        },
        {
            "name": "Guid",
            "baseName": "guid",
            "type": "string"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Regurl",
            "baseName": "regurl",
            "type": "string"
        },
        {
            "name": "Secret",
            "baseName": "secret",
            "type": "string"
        },
        {
            "name": "Serviceoffered",
            "baseName": "serviceoffered",
            "type": "string"
        },
        {
            "name": "State",
            "baseName": "state",
            "type": "number"
        },
        {
            "name": "Timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Toolproxy",
            "baseName": "toolproxy",
            "type": "string"
        },
        {
            "name": "Vendorcode",
            "baseName": "vendorcode",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModLtiGetToolTypesAndProxies200ResponseProxiesInner.attributeTypeMap;
    }
}

