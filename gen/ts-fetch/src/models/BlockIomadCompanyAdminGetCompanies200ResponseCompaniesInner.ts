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
/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
 */
export interface BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner {
    /**
     * Company location address
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Address?: string;
    /**
     * User default forum auto-subscribe
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Autosubscribe?: number;
    /**
     * Company location city
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    City?: string;
    /**
     * Compay code
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Code?: string;
    /**
     * Company contract is terminated when <> 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Companyterminated?: number;
    /**
     * Company location country
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Country?: string;
    /**
     * Company custom 1
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Custom1?: string;
    /**
     * Company custom 2
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Custom2?: string;
    /**
     * Company custom 3
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Custom3?: string;
    /**
     * Company custom css
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Customcss?: string;
    /**
     * Ecommerce is disabled when = 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Ecommerce?: number;
    /**
     * Company heading color
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Headingcolor?: string;
    /**
     * Company hostname
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Hostname?: string;
    /**
     * User default text editor
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Htmleditor?: number;
    /**
     * Companid ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Id?: number;
    /**
     * User default language
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Lang?: string;
    /**
     * Company ink color
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Linkcolor?: string;
    /**
     * User default digest type
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Maildigest?: number;
    /**
     * User default email display
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Maildisplay?: number;
    /**
     * User default email format
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Mailformat?: number;
    /**
     * Company main color
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Maincolor?: string;
    /**
     * Company maximum number of users
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Maxusers?: number;
    /**
     * Company long name
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Name?: string;
    /**
     * ID of parent company
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Parentid?: number;
    /**
     * Company location region
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Region?: string;
    /**
     * User default screen reader
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Screenreader?: number;
    /**
     * Compay short name
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Shortname?: string;
    /**
     * Number of seconds after termination date to suspend the company
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Suspendafter?: number;
    /**
     * Company is suspended when <> 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Suspended?: number;
    /**
     * Company theme
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Theme?: string;
    /**
     * User default timezone
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Timezone?: string;
    /**
     * User default forum tracking
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Trackforums?: number;
    /**
     * Contract termination date in unix timestamp
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
     */
    Validto?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerFromJSON(json: any): BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner {
    return BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Address': json['address'] == null ? undefined : json['address'],
        'Autosubscribe': json['autosubscribe'] == null ? undefined : json['autosubscribe'],
        'City': json['city'] == null ? undefined : json['city'],
        'Code': json['code'] == null ? undefined : json['code'],
        'Companyterminated': json['companyterminated'] == null ? undefined : json['companyterminated'],
        'Country': json['country'] == null ? undefined : json['country'],
        'Custom1': json['custom1'] == null ? undefined : json['custom1'],
        'Custom2': json['custom2'] == null ? undefined : json['custom2'],
        'Custom3': json['custom3'] == null ? undefined : json['custom3'],
        'Customcss': json['customcss'] == null ? undefined : json['customcss'],
        'Ecommerce': json['ecommerce'] == null ? undefined : json['ecommerce'],
        'Headingcolor': json['headingcolor'] == null ? undefined : json['headingcolor'],
        'Hostname': json['hostname'] == null ? undefined : json['hostname'],
        'Htmleditor': json['htmleditor'] == null ? undefined : json['htmleditor'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Linkcolor': json['linkcolor'] == null ? undefined : json['linkcolor'],
        'Maildigest': json['maildigest'] == null ? undefined : json['maildigest'],
        'Maildisplay': json['maildisplay'] == null ? undefined : json['maildisplay'],
        'Mailformat': json['mailformat'] == null ? undefined : json['mailformat'],
        'Maincolor': json['maincolor'] == null ? undefined : json['maincolor'],
        'Maxusers': json['maxusers'] == null ? undefined : json['maxusers'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Parentid': json['parentid'] == null ? undefined : json['parentid'],
        'Region': json['region'] == null ? undefined : json['region'],
        'Screenreader': json['screenreader'] == null ? undefined : json['screenreader'],
        'Shortname': json['shortname'] == null ? undefined : json['shortname'],
        'Suspendafter': json['suspendafter'] == null ? undefined : json['suspendafter'],
        'Suspended': json['suspended'] == null ? undefined : json['suspended'],
        'Theme': json['theme'] == null ? undefined : json['theme'],
        'Timezone': json['timezone'] == null ? undefined : json['timezone'],
        'Trackforums': json['trackforums'] == null ? undefined : json['trackforums'],
        'Validto': json['validto'] == null ? undefined : json['validto'],
    };
}

export function BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInnerToJSON(value?: BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'address': value['Address'],
        'autosubscribe': value['Autosubscribe'],
        'city': value['City'],
        'code': value['Code'],
        'companyterminated': value['Companyterminated'],
        'country': value['Country'],
        'custom1': value['Custom1'],
        'custom2': value['Custom2'],
        'custom3': value['Custom3'],
        'customcss': value['Customcss'],
        'ecommerce': value['Ecommerce'],
        'headingcolor': value['Headingcolor'],
        'hostname': value['Hostname'],
        'htmleditor': value['Htmleditor'],
        'id': value['Id'],
        'lang': value['Lang'],
        'linkcolor': value['Linkcolor'],
        'maildigest': value['Maildigest'],
        'maildisplay': value['Maildisplay'],
        'mailformat': value['Mailformat'],
        'maincolor': value['Maincolor'],
        'maxusers': value['Maxusers'],
        'name': value['Name'],
        'parentid': value['Parentid'],
        'region': value['Region'],
        'screenreader': value['Screenreader'],
        'shortname': value['Shortname'],
        'suspendafter': value['Suspendafter'],
        'suspended': value['Suspended'],
        'theme': value['Theme'],
        'timezone': value['Timezone'],
        'trackforums': value['Trackforums'],
        'validto': value['Validto'],
    };
}

