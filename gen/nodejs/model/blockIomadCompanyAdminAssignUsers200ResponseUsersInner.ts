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

export class BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {
    /**
    * Company ID
    */
    'Companyid'?: number = null;
    /**
    * Failure message
    */
    'Message'?: string = 'null';
    /**
    * Success or failure
    */
    'Result'?: boolean = null;
    /**
    * Department ID
    */
    'Userid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "Message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "Result",
            "baseName": "result",
            "type": "boolean"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.attributeTypeMap;
    }
}

