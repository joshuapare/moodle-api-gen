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

/**
* functions that are available
*/
export class CoreWebserviceGetSiteInfo200ResponseFunctionsInner {
    /**
    * function name
    */
    'Name'?: string = 'null';
    /**
    * The version number of the component to which the function belongs
    */
    'Version'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Version",
            "baseName": "version",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreWebserviceGetSiteInfo200ResponseFunctionsInner.attributeTypeMap;
    }
}

