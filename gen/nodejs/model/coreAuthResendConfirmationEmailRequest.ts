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

export class CoreAuthResendConfirmationEmailRequest {
    /**
    * Plain text password.
    */
    'password': string = 'null';
    /**
    * Redirect the user to this site url after confirmation.
    */
    'redirect'?: string = '';
    /**
    * Username.
    */
    'username': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "redirect",
            "baseName": "redirect",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreAuthResendConfirmationEmailRequest.attributeTypeMap;
    }
}
