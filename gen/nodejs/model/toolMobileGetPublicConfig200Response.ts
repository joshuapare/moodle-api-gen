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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { ToolMobileGetPublicConfig200ResponseIdentityprovidersInner } from './toolMobileGetPublicConfig200ResponseIdentityprovidersInner';

export class ToolMobileGetPublicConfig200Response {
    /**
    * Whether age digital consent verification                     is enabled.
    */
    'agedigitalconsentverification'?: boolean = null;
    /**
    * Authentication instructions.
    */
    'authinstructions': string = 'null';
    /**
    * Whether log in via email is enabled.
    */
    'authloginviaemail': number = null;
    /**
    * Whether auth none is enabled.
    */
    'authnoneenabled': number = null;
    /**
    * Whether to detect default language                     from browser setting.
    */
    'autolang'?: number = null;
    /**
    * The site compact logo URL
    */
    'compactlogourl'?: string = 'null';
    /**
    * Default site country
    */
    'country'?: string = 'null';
    /**
    * Whether the Mobile service is enabled.
    */
    'enablemobilewebservice': number = null;
    /**
    * Whether Web Services are enabled.
    */
    'enablewebservices': number = null;
    /**
    * Forgotten password URL.
    */
    'forgottenpasswordurl': string = 'null';
    /**
    * Whether guest login is enabled.
    */
    'guestlogin': number = null;
    /**
    * Site https URL (if httpslogin is enabled).
    */
    'httpswwwroot': string = 'null';
    'identityproviders'?: Array<ToolMobileGetPublicConfig200ResponseIdentityprovidersInner>;
    /**
    * Default language for the site.
    */
    'lang'?: string = 'null';
    /**
    * Languages on language menu.
    */
    'langlist'?: string = 'null';
    /**
    * Whether the language menu should be displayed.
    */
    'langmenu'?: number = null;
    /**
    * SSO login launch URL.
    */
    'launchurl'?: string = 'null';
    /**
    * Sitewide locale.
    */
    'locale'?: string = 'null';
    /**
    * The site logo URL
    */
    'logourl'?: string = 'null';
    /**
    * Whether site maintenance is enabled.
    */
    'maintenanceenabled': number = null;
    /**
    * Maintenance message.
    */
    'maintenancemessage': string = 'null';
    /**
    * Mobile custom CSS theme
    */
    'mobilecssurl'?: string;
    /**
    * Authentication method for user registration.
    */
    'registerauth': string = 'null';
    /**
    * Values: 0 for No, 1 for Yes, 2 for optional.
    */
    'rememberusername': number = null;
    /**
    * Site name.
    */
    'sitename': string = 'null';
    /**
    * Determines who has access to contact site support.
    */
    'supportavailability'?: number = null;
    /**
    * Site support contact email                     (only if age verification is enabled).
    */
    'supportemail'?: string = 'null';
    /**
    * Site support contact name                     (only if age verification is enabled).
    */
    'supportname'?: string = 'null';
    /**
    * Site support page link.
    */
    'supportpage'?: string = 'null';
    /**
    * Android app\'s unique identifier.
    */
    'toolMobileAndroidappid'?: string = 'null';
    /**
    * Disabled features in the app
    */
    'toolMobileDisabledfeatures'?: string = 'null';
    /**
    * iOS app\'s unique identifier.
    */
    'toolMobileIosappid'?: string = 'null';
    /**
    * Minimum required version to access.
    */
    'toolMobileMinimumversion'?: string = 'null';
    /**
    * QR login configuration.
    */
    'toolMobileQrcodetype'?: number = null;
    /**
    * App download page.
    */
    'toolMobileSetuplink'?: string = 'null';
    /**
    * The type of login. 1 for app, 2 for browser, 3 for embedded.
    */
    'typeoflogin': number = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
    /**
    * Site URL.
    */
    'wwwroot': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "agedigitalconsentverification",
            "baseName": "agedigitalconsentverification",
            "type": "boolean"
        },
        {
            "name": "authinstructions",
            "baseName": "authinstructions",
            "type": "string"
        },
        {
            "name": "authloginviaemail",
            "baseName": "authloginviaemail",
            "type": "number"
        },
        {
            "name": "authnoneenabled",
            "baseName": "authnoneenabled",
            "type": "number"
        },
        {
            "name": "autolang",
            "baseName": "autolang",
            "type": "number"
        },
        {
            "name": "compactlogourl",
            "baseName": "compactlogourl",
            "type": "string"
        },
        {
            "name": "country",
            "baseName": "country",
            "type": "string"
        },
        {
            "name": "enablemobilewebservice",
            "baseName": "enablemobilewebservice",
            "type": "number"
        },
        {
            "name": "enablewebservices",
            "baseName": "enablewebservices",
            "type": "number"
        },
        {
            "name": "forgottenpasswordurl",
            "baseName": "forgottenpasswordurl",
            "type": "string"
        },
        {
            "name": "guestlogin",
            "baseName": "guestlogin",
            "type": "number"
        },
        {
            "name": "httpswwwroot",
            "baseName": "httpswwwroot",
            "type": "string"
        },
        {
            "name": "identityproviders",
            "baseName": "identityproviders",
            "type": "Array<ToolMobileGetPublicConfig200ResponseIdentityprovidersInner>"
        },
        {
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "langlist",
            "baseName": "langlist",
            "type": "string"
        },
        {
            "name": "langmenu",
            "baseName": "langmenu",
            "type": "number"
        },
        {
            "name": "launchurl",
            "baseName": "launchurl",
            "type": "string"
        },
        {
            "name": "locale",
            "baseName": "locale",
            "type": "string"
        },
        {
            "name": "logourl",
            "baseName": "logourl",
            "type": "string"
        },
        {
            "name": "maintenanceenabled",
            "baseName": "maintenanceenabled",
            "type": "number"
        },
        {
            "name": "maintenancemessage",
            "baseName": "maintenancemessage",
            "type": "string"
        },
        {
            "name": "mobilecssurl",
            "baseName": "mobilecssurl",
            "type": "string"
        },
        {
            "name": "registerauth",
            "baseName": "registerauth",
            "type": "string"
        },
        {
            "name": "rememberusername",
            "baseName": "rememberusername",
            "type": "number"
        },
        {
            "name": "sitename",
            "baseName": "sitename",
            "type": "string"
        },
        {
            "name": "supportavailability",
            "baseName": "supportavailability",
            "type": "number"
        },
        {
            "name": "supportemail",
            "baseName": "supportemail",
            "type": "string"
        },
        {
            "name": "supportname",
            "baseName": "supportname",
            "type": "string"
        },
        {
            "name": "supportpage",
            "baseName": "supportpage",
            "type": "string"
        },
        {
            "name": "toolMobileAndroidappid",
            "baseName": "tool_mobile_androidappid",
            "type": "string"
        },
        {
            "name": "toolMobileDisabledfeatures",
            "baseName": "tool_mobile_disabledfeatures",
            "type": "string"
        },
        {
            "name": "toolMobileIosappid",
            "baseName": "tool_mobile_iosappid",
            "type": "string"
        },
        {
            "name": "toolMobileMinimumversion",
            "baseName": "tool_mobile_minimumversion",
            "type": "string"
        },
        {
            "name": "toolMobileQrcodetype",
            "baseName": "tool_mobile_qrcodetype",
            "type": "number"
        },
        {
            "name": "toolMobileSetuplink",
            "baseName": "tool_mobile_setuplink",
            "type": "string"
        },
        {
            "name": "typeoflogin",
            "baseName": "typeoflogin",
            "type": "number"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        },
        {
            "name": "wwwroot",
            "baseName": "wwwroot",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolMobileGetPublicConfig200Response.attributeTypeMap;
    }
}

