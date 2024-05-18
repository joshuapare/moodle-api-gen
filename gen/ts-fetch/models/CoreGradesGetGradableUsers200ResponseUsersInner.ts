/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner } from './CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner';
import {
    CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInnerFromJSON,
    CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInnerFromJSONTyped,
    CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInnerToJSON,
} from './CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner';
import type { CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner } from './CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner';
import {
    CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInnerFromJSON,
    CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInnerFromJSONTyped,
    CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInnerToJSON,
} from './CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner';

/**
 * 
 * @export
 * @interface CoreGradesGetGradableUsers200ResponseUsersInner
 */
export interface CoreGradesGetGradableUsers200ResponseUsersInner {
    /**
     * Postal address
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    address?: string;
    /**
     * Auth plugins include manual, ldap, etc
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    auth?: string;
    /**
     * Calendar type such as "gregorian", must exist on server
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    calendartype?: string;
    /**
     * Home city of the user
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    city?: string;
    /**
     * Active user: 1 if confirmed, 0 otherwise
     * @type {boolean}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    confirmed?: boolean;
    /**
     * Home country code of the user, such as AU or CZ
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    country?: string;
    /**
     * 
     * @type {Array<CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner>}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    customfields?: Array<CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner>;
    /**
     * department
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    department?: string;
    /**
     * User profile description
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    description?: string;
    /**
     * int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    descriptionformat?: number;
    /**
     * An email address - allow email as root@localhost
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    email?: string;
    /**
     * first access to the site (0 if never)
     * @type {number}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    firstaccess?: number;
    /**
     * The first name(s) of the user
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    firstname?: string;
    /**
     * The fullname of the user
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    fullname?: string;
    /**
     * ID of the user
     * @type {number}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    id?: number;
    /**
     * An arbitrary ID code number perhaps from the institution
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    idnumber?: string;
    /**
     * institution
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    institution?: string;
    /**
     * user interests (separated by commas)
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    interests?: string;
    /**
     * Language code such as "en", must exist on server
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    lang?: string;
    /**
     * last access to the site (0 if never)
     * @type {number}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    lastaccess?: number;
    /**
     * The family name of the user
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    lastname?: string;
    /**
     * Mail format code is 0 for plain text, 1 for HTML etc
     * @type {number}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    mailformat?: number;
    /**
     * Phone 1
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    phone1?: string;
    /**
     * Phone 2
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    phone2?: string;
    /**
     * 
     * @type {Array<CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner>}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    preferences?: Array<CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner>;
    /**
     * User image profile URL - big version
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    profileimageurl?: string;
    /**
     * User image profile URL - small version
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    profileimageurlsmall?: string;
    /**
     * Suspend user account, either false to enable user login or true to disable it
     * @type {boolean}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    suspended?: boolean;
    /**
     * Theme name such as "standard", must exist on server
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    theme?: string;
    /**
     * Timezone code such as Australia/Perth, or 99 for default
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    timezone?: string;
    /**
     * The username
     * @type {string}
     * @memberof CoreGradesGetGradableUsers200ResponseUsersInner
     */
    username?: string;
}

/**
 * Check if a given object implements the CoreGradesGetGradableUsers200ResponseUsersInner interface.
 */
export function instanceOfCoreGradesGetGradableUsers200ResponseUsersInner(value: object): boolean {
    return true;
}

export function CoreGradesGetGradableUsers200ResponseUsersInnerFromJSON(json: any): CoreGradesGetGradableUsers200ResponseUsersInner {
    return CoreGradesGetGradableUsers200ResponseUsersInnerFromJSONTyped(json, false);
}

export function CoreGradesGetGradableUsers200ResponseUsersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGetGradableUsers200ResponseUsersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'address': json['address'] == null ? undefined : json['address'],
        'auth': json['auth'] == null ? undefined : json['auth'],
        'calendartype': json['calendartype'] == null ? undefined : json['calendartype'],
        'city': json['city'] == null ? undefined : json['city'],
        'confirmed': json['confirmed'] == null ? undefined : json['confirmed'],
        'country': json['country'] == null ? undefined : json['country'],
        'customfields': json['customfields'] == null ? undefined : ((json['customfields'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInnerFromJSON)),
        'department': json['department'] == null ? undefined : json['department'],
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'email': json['email'] == null ? undefined : json['email'],
        'firstaccess': json['firstaccess'] == null ? undefined : json['firstaccess'],
        'firstname': json['firstname'] == null ? undefined : json['firstname'],
        'fullname': json['fullname'] == null ? undefined : json['fullname'],
        'id': json['id'] == null ? undefined : json['id'],
        'idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'institution': json['institution'] == null ? undefined : json['institution'],
        'interests': json['interests'] == null ? undefined : json['interests'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'lastaccess': json['lastaccess'] == null ? undefined : json['lastaccess'],
        'lastname': json['lastname'] == null ? undefined : json['lastname'],
        'mailformat': json['mailformat'] == null ? undefined : json['mailformat'],
        'phone1': json['phone1'] == null ? undefined : json['phone1'],
        'phone2': json['phone2'] == null ? undefined : json['phone2'],
        'preferences': json['preferences'] == null ? undefined : ((json['preferences'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInnerFromJSON)),
        'profileimageurl': json['profileimageurl'] == null ? undefined : json['profileimageurl'],
        'profileimageurlsmall': json['profileimageurlsmall'] == null ? undefined : json['profileimageurlsmall'],
        'suspended': json['suspended'] == null ? undefined : json['suspended'],
        'theme': json['theme'] == null ? undefined : json['theme'],
        'timezone': json['timezone'] == null ? undefined : json['timezone'],
        'username': json['username'] == null ? undefined : json['username'],
    };
}

export function CoreGradesGetGradableUsers200ResponseUsersInnerToJSON(value?: CoreGradesGetGradableUsers200ResponseUsersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'address': value['address'],
        'auth': value['auth'],
        'calendartype': value['calendartype'],
        'city': value['city'],
        'confirmed': value['confirmed'],
        'country': value['country'],
        'customfields': value['customfields'] == null ? undefined : ((value['customfields'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInnerToJSON)),
        'department': value['department'],
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'email': value['email'],
        'firstaccess': value['firstaccess'],
        'firstname': value['firstname'],
        'fullname': value['fullname'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'institution': value['institution'],
        'interests': value['interests'],
        'lang': value['lang'],
        'lastaccess': value['lastaccess'],
        'lastname': value['lastname'],
        'mailformat': value['mailformat'],
        'phone1': value['phone1'],
        'phone2': value['phone2'],
        'preferences': value['preferences'] == null ? undefined : ((value['preferences'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInnerToJSON)),
        'profileimageurl': value['profileimageurl'],
        'profileimageurlsmall': value['profileimageurlsmall'],
        'suspended': value['suspended'],
        'theme': value['theme'],
        'timezone': value['timezone'],
        'username': value['username'],
    };
}
