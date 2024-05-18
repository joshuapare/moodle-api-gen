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

export class CoreMessageGetMemberInfoRequest {
    /**
    * include contact requests in response
    */
    'includecontactrequests'?: boolean = false;
    /**
    * include privacy info in response
    */
    'includeprivacyinfo'?: boolean = false;
    /**
    * id of the user
    */
    'referenceuserid': number = null;
    'userids': Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "includecontactrequests",
            "baseName": "includecontactrequests",
            "type": "boolean"
        },
        {
            "name": "includeprivacyinfo",
            "baseName": "includeprivacyinfo",
            "type": "boolean"
        },
        {
            "name": "referenceuserid",
            "baseName": "referenceuserid",
            "type": "number"
        },
        {
            "name": "userids",
            "baseName": "userids",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetMemberInfoRequest.attributeTypeMap;
    }
}
