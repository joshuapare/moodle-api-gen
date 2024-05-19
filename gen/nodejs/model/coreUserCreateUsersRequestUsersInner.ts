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
import { CoreUserCreateUsersRequestUsersInnerCustomfieldsInner } from './coreUserCreateUsersRequestUsersInnerCustomfieldsInner';
import { CoreUserCreateUsersRequestUsersInnerPreferencesInner } from './coreUserCreateUsersRequestUsersInnerPreferencesInner';

export class CoreUserCreateUsersRequestUsersInner {
    /**
    * Postal address
    */
    'address'?: string;
    /**
    * The alternate name of the user
    */
    'alternatename'?: string = 'null';
    /**
    * Auth plugins include manual, ldap, etc
    */
    'auth'?: string = 'manual';
    /**
    * Calendar type such as \"gregorian\", must exist on server
    */
    'calendartype'?: string = 'gregorian';
    /**
    * Home city of the user
    */
    'city'?: string;
    /**
    * Home country code of the user, such as AU or CZ
    */
    'country'?: string;
    /**
    * True if password should be created and mailed to user.
    */
    'createpassword'?: boolean = null;
    'customfields'?: Array<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner>;
    /**
    * department
    */
    'department'?: string;
    /**
    * User profile description, no HTML
    */
    'description'?: string = 'null';
    /**
    * A valid and unique email address
    */
    'email'?: string;
    /**
    * The first name(s) of the user
    */
    'firstname'?: string;
    /**
    * The first name(s) phonetically of the user
    */
    'firstnamephonetic'?: string = 'null';
    /**
    * An arbitrary ID code number perhaps from the institution
    */
    'idnumber'?: string = '';
    /**
    * institution
    */
    'institution'?: string;
    /**
    * User interests (separated by commas)
    */
    'interests'?: string = 'null';
    /**
    * Language code such as \"en\", must exist on server
    */
    'lang'?: string = 'en';
    /**
    * The family name of the user
    */
    'lastname'?: string;
    /**
    * The family name phonetically of the user
    */
    'lastnamephonetic'?: string = 'null';
    /**
    * Email visibility
    */
    'maildisplay'?: number = null;
    /**
    * Mail format code is 0 for plain text, 1 for HTML etc
    */
    'mailformat'?: number;
    /**
    * The middle name of the user
    */
    'middlename'?: string = 'null';
    /**
    * Plain text password consisting of any characters
    */
    'password'?: string = 'null';
    /**
    * Phone 1
    */
    'phone1'?: string;
    /**
    * Phone 2
    */
    'phone2'?: string;
    'preferences'?: Array<CoreUserCreateUsersRequestUsersInnerPreferencesInner>;
    /**
    * Theme name such as \"standard\", must exist on server
    */
    'theme'?: string;
    /**
    * Timezone code such as Australia/Perth, or 99 for default
    */
    'timezone'?: string;
    /**
    * Username policy is defined in Moodle security config.
    */
    'username'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "address",
            "baseName": "address",
            "type": "string"
        },
        {
            "name": "alternatename",
            "baseName": "alternatename",
            "type": "string"
        },
        {
            "name": "auth",
            "baseName": "auth",
            "type": "string"
        },
        {
            "name": "calendartype",
            "baseName": "calendartype",
            "type": "string"
        },
        {
            "name": "city",
            "baseName": "city",
            "type": "string"
        },
        {
            "name": "country",
            "baseName": "country",
            "type": "string"
        },
        {
            "name": "createpassword",
            "baseName": "createpassword",
            "type": "boolean"
        },
        {
            "name": "customfields",
            "baseName": "customfields",
            "type": "Array<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner>"
        },
        {
            "name": "department",
            "baseName": "department",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
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
            "name": "firstnamephonetic",
            "baseName": "firstnamephonetic",
            "type": "string"
        },
        {
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "institution",
            "baseName": "institution",
            "type": "string"
        },
        {
            "name": "interests",
            "baseName": "interests",
            "type": "string"
        },
        {
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "lastname",
            "baseName": "lastname",
            "type": "string"
        },
        {
            "name": "lastnamephonetic",
            "baseName": "lastnamephonetic",
            "type": "string"
        },
        {
            "name": "maildisplay",
            "baseName": "maildisplay",
            "type": "number"
        },
        {
            "name": "mailformat",
            "baseName": "mailformat",
            "type": "number"
        },
        {
            "name": "middlename",
            "baseName": "middlename",
            "type": "string"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "phone1",
            "baseName": "phone1",
            "type": "string"
        },
        {
            "name": "phone2",
            "baseName": "phone2",
            "type": "string"
        },
        {
            "name": "preferences",
            "baseName": "preferences",
            "type": "Array<CoreUserCreateUsersRequestUsersInnerPreferencesInner>"
        },
        {
            "name": "theme",
            "baseName": "theme",
            "type": "string"
        },
        {
            "name": "timezone",
            "baseName": "timezone",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreUserCreateUsersRequestUsersInner.attributeTypeMap;
    }
}

