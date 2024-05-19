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
import { AuthEmailGetSignupSettings200ResponseProfilefieldsInner } from './authEmailGetSignupSettings200ResponseProfilefieldsInner';
import { AuthEmailGetSignupSettings200ResponseWarningsInner } from './authEmailGetSignupSettings200ResponseWarningsInner';

export class AuthEmailGetSignupSettings200Response {
    /**
    * Default country
    */
    'Country'?: string = 'null';
    /**
    * Default city
    */
    'Defaultcity'?: string = 'null';
    'Namefields': Array<object>;
    /**
    * Password policy
    */
    'Passwordpolicy'?: string = 'null';
    'Profilefields'?: Array<AuthEmailGetSignupSettings200ResponseProfilefieldsInner>;
    /**
    * Recaptcha challenge hash
    */
    'Recaptchachallengehash'?: string = 'null';
    /**
    * Recaptcha challenge noscript image
    */
    'Recaptchachallengeimage'?: string = 'null';
    /**
    * Recaptcha challenge js url
    */
    'Recaptchachallengejs'?: string = 'null';
    /**
    * Recaptcha public key
    */
    'Recaptchapublickey'?: string = 'null';
    /**
    * Site policy
    */
    'Sitepolicy'?: string = 'null';
    /**
    * Site policy handler
    */
    'Sitepolicyhandler'?: string = 'null';
    'Warnings'?: Array<AuthEmailGetSignupSettings200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Country",
            "baseName": "country",
            "type": "string"
        },
        {
            "name": "Defaultcity",
            "baseName": "defaultcity",
            "type": "string"
        },
        {
            "name": "Namefields",
            "baseName": "namefields",
            "type": "Array<object>"
        },
        {
            "name": "Passwordpolicy",
            "baseName": "passwordpolicy",
            "type": "string"
        },
        {
            "name": "Profilefields",
            "baseName": "profilefields",
            "type": "Array<AuthEmailGetSignupSettings200ResponseProfilefieldsInner>"
        },
        {
            "name": "Recaptchachallengehash",
            "baseName": "recaptchachallengehash",
            "type": "string"
        },
        {
            "name": "Recaptchachallengeimage",
            "baseName": "recaptchachallengeimage",
            "type": "string"
        },
        {
            "name": "Recaptchachallengejs",
            "baseName": "recaptchachallengejs",
            "type": "string"
        },
        {
            "name": "Recaptchapublickey",
            "baseName": "recaptchapublickey",
            "type": "string"
        },
        {
            "name": "Sitepolicy",
            "baseName": "sitepolicy",
            "type": "string"
        },
        {
            "name": "Sitepolicyhandler",
            "baseName": "sitepolicyhandler",
            "type": "string"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailGetSignupSettings200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return AuthEmailGetSignupSettings200Response.attributeTypeMap;
    }
}

