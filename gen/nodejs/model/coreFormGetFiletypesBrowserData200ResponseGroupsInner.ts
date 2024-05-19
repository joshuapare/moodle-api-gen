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
import { CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner } from './coreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner';

export class CoreFormGetFiletypesBrowserData200ResponseGroupsInner {
    /**
    * Should the group start as expanded or collapsed
    */
    'Expanded'?: boolean = null;
    /**
    * The list of file extensions associated with the group
    */
    'Ext'?: string = 'null';
    /**
    * The file type group identifier
    */
    'Key'?: string = 'null';
    /**
    * The file type group name
    */
    'Name'?: string = 'null';
    /**
    * Can it be marked as selected
    */
    'Selectable'?: boolean = null;
    /**
    * Should it be marked as selected
    */
    'Selected'?: boolean = null;
    'Types'?: Array<CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Expanded",
            "baseName": "expanded",
            "type": "boolean"
        },
        {
            "name": "Ext",
            "baseName": "ext",
            "type": "string"
        },
        {
            "name": "Key",
            "baseName": "key",
            "type": "string"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Selectable",
            "baseName": "selectable",
            "type": "boolean"
        },
        {
            "name": "Selected",
            "baseName": "selected",
            "type": "boolean"
        },
        {
            "name": "Types",
            "baseName": "types",
            "type": "Array<CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreFormGetFiletypesBrowserData200ResponseGroupsInner.attributeTypeMap;
    }
}

