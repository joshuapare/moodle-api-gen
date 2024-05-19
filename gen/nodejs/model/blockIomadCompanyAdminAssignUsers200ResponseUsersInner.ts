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
    'companyid'?: number = null;
    /**
    * Failure message
    */
    'message'?: string = 'null';
    /**
    * Success or failure
    */
    'result'?: boolean = null;
    /**
    * Department ID
    */
    'userid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "result",
            "baseName": "result",
            "type": "boolean"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.attributeTypeMap;
    }
}

