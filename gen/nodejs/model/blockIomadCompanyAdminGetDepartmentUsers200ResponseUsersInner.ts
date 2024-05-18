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

export class BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner {
    /**
    * Company ID
    */
    'companyid'?: number;
    /**
    * Department ID
    */
    'departmentid'?: number;
    /**
    * User email address
    */
    'email'?: string = 'null';
    /**
    * User firstname
    */
    'firstname'?: string = 'null';
    /**
    * User ID
    */
    'id'?: number;
    /**
    * User lastname
    */
    'lastname'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "departmentid",
            "baseName": "departmentid",
            "type": "number"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "firstname",
            "baseName": "firstname",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "lastname",
            "baseName": "lastname",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.attributeTypeMap;
    }
}
