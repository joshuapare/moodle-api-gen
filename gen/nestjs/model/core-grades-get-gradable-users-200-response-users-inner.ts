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
import { CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner } from './core-grades-get-gradable-users200-response-users-inner-preferences-inner';
import { CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner } from './core-grades-get-gradable-users200-response-users-inner-customfields-inner';


export interface CoreGradesGetGradableUsers200ResponseUsersInner { 
    /**
     * Postal address
     */
    Address?: string;
    /**
     * Auth plugins include manual, ldap, etc
     */
    Auth?: string;
    /**
     * Calendar type such as \"gregorian\", must exist on server
     */
    Calendartype?: string;
    /**
     * Home city of the user
     */
    City?: string;
    /**
     * Active user: 1 if confirmed, 0 otherwise
     */
    Confirmed?: boolean;
    /**
     * Home country code of the user, such as AU or CZ
     */
    Country?: string;
    Customfields?: Array<CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner>;
    /**
     * department
     */
    Department?: string;
    /**
     * User profile description
     */
    Description?: string;
    /**
     * int format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Descriptionformat?: number;
    /**
     * An email address - allow email as root@localhost
     */
    Email?: string;
    /**
     * first access to the site (0 if never)
     */
    Firstaccess?: number;
    /**
     * The first name(s) of the user
     */
    Firstname?: string;
    /**
     * The fullname of the user
     */
    Fullname?: string;
    /**
     * ID of the user
     */
    Id?: number;
    /**
     * An arbitrary ID code number perhaps from the institution
     */
    Idnumber?: string;
    /**
     * institution
     */
    Institution?: string;
    /**
     * user interests (separated by commas)
     */
    Interests?: string;
    /**
     * Language code such as \"en\", must exist on server
     */
    Lang?: string;
    /**
     * last access to the site (0 if never)
     */
    Lastaccess?: number;
    /**
     * The family name of the user
     */
    Lastname?: string;
    /**
     * Mail format code is 0 for plain text, 1 for HTML etc
     */
    Mailformat?: number;
    /**
     * Phone 1
     */
    Phone1?: string;
    /**
     * Phone 2
     */
    Phone2?: string;
    Preferences?: Array<CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner>;
    /**
     * User image profile URL - big version
     */
    Profileimageurl?: string;
    /**
     * User image profile URL - small version
     */
    Profileimageurlsmall?: string;
    /**
     * Suspend user account, either false to enable user login or true to disable it
     */
    Suspended?: boolean;
    /**
     * Theme name such as \"standard\", must exist on server
     */
    Theme?: string;
    /**
     * Timezone code such as Australia/Perth, or 99 for default
     */
    Timezone?: string;
    /**
     * The username
     */
    Username?: string;
}
