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
 * @interface BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
 */
export interface BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner {
    /**
     * Company location address
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    address?: string;
    /**
     * User default forum auto-subscribe
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    autosubscribe?: number;
    /**
     * Company location city
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    city?: string;
    /**
     * Compay code
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    code?: string;
    /**
     * Company contract is terminated when <> 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    companyterminated?: number;
    /**
     * Company location country
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    country?: string;
    /**
     * Company custom 1
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    custom1?: string;
    /**
     * Company custom 2
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    custom2?: string;
    /**
     * Company custom 3
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    custom3?: string;
    /**
     * Company custom css
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    customcss?: string;
    /**
     * Ecommerce is disabled when = 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    ecommerce?: number;
    /**
     * Company heading color
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    headingcolor?: string;
    /**
     * Company hostname
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    hostname?: string;
    /**
     * User default text editor
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    htmleditor?: number;
    /**
     * Company id number
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    id?: number;
    /**
     * User default language
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    lang?: string;
    /**
     * Company ink color
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    linkcolor?: string;
    /**
     * User default digest type
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    maildigest?: number;
    /**
     * User default email display
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    maildisplay?: number;
    /**
     * User default email format
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    mailformat?: number;
    /**
     * Company main color
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    maincolor?: string;
    /**
     * Company maximum number of users
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    maxusers?: number;
    /**
     * Company long name
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    name?: string;
    /**
     * ID of parent company
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    parentid?: number;
    /**
     * Company location postcode
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    postcode?: string;
    /**
     * Company location region
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    region?: string;
    /**
     * User default screen reader
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    screenreader?: number;
    /**
     * Compay short name
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    shortname?: string;
    /**
     * Number of seconds after termination date to suspend the company
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    suspendafter?: number;
    /**
     * Company is suspended when <> 0
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    suspended?: number;
    /**
     * Company theme
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    theme?: string;
    /**
     * User default timezone
     * @type {string}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    timezone?: string;
    /**
     * User default forum tracking
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    trackforums?: number;
    /**
     * Contract termination date in unix timestamp
     * @type {number}
     * @memberof BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner
     */
    validto?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminEditCompaniesRequestCompaniesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerFromJSON(json: any): BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner {
    return BlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'address': json['address'] == null ? undefined : json['address'],
        'autosubscribe': json['autosubscribe'] == null ? undefined : json['autosubscribe'],
        'city': json['city'] == null ? undefined : json['city'],
        'code': json['code'] == null ? undefined : json['code'],
        'companyterminated': json['companyterminated'] == null ? undefined : json['companyterminated'],
        'country': json['country'] == null ? undefined : json['country'],
        'custom1': json['custom1'] == null ? undefined : json['custom1'],
        'custom2': json['custom2'] == null ? undefined : json['custom2'],
        'custom3': json['custom3'] == null ? undefined : json['custom3'],
        'customcss': json['customcss'] == null ? undefined : json['customcss'],
        'ecommerce': json['ecommerce'] == null ? undefined : json['ecommerce'],
        'headingcolor': json['headingcolor'] == null ? undefined : json['headingcolor'],
        'hostname': json['hostname'] == null ? undefined : json['hostname'],
        'htmleditor': json['htmleditor'] == null ? undefined : json['htmleditor'],
        'id': json['id'] == null ? undefined : json['id'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'linkcolor': json['linkcolor'] == null ? undefined : json['linkcolor'],
        'maildigest': json['maildigest'] == null ? undefined : json['maildigest'],
        'maildisplay': json['maildisplay'] == null ? undefined : json['maildisplay'],
        'mailformat': json['mailformat'] == null ? undefined : json['mailformat'],
        'maincolor': json['maincolor'] == null ? undefined : json['maincolor'],
        'maxusers': json['maxusers'] == null ? undefined : json['maxusers'],
        'name': json['name'] == null ? undefined : json['name'],
        'parentid': json['parentid'] == null ? undefined : json['parentid'],
        'postcode': json['postcode'] == null ? undefined : json['postcode'],
        'region': json['region'] == null ? undefined : json['region'],
        'screenreader': json['screenreader'] == null ? undefined : json['screenreader'],
        'shortname': json['shortname'] == null ? undefined : json['shortname'],
        'suspendafter': json['suspendafter'] == null ? undefined : json['suspendafter'],
        'suspended': json['suspended'] == null ? undefined : json['suspended'],
        'theme': json['theme'] == null ? undefined : json['theme'],
        'timezone': json['timezone'] == null ? undefined : json['timezone'],
        'trackforums': json['trackforums'] == null ? undefined : json['trackforums'],
        'validto': json['validto'] == null ? undefined : json['validto'],
    };
}

export function BlockIomadCompanyAdminEditCompaniesRequestCompaniesInnerToJSON(value?: BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'address': value['address'],
        'autosubscribe': value['autosubscribe'],
        'city': value['city'],
        'code': value['code'],
        'companyterminated': value['companyterminated'],
        'country': value['country'],
        'custom1': value['custom1'],
        'custom2': value['custom2'],
        'custom3': value['custom3'],
        'customcss': value['customcss'],
        'ecommerce': value['ecommerce'],
        'headingcolor': value['headingcolor'],
        'hostname': value['hostname'],
        'htmleditor': value['htmleditor'],
        'id': value['id'],
        'lang': value['lang'],
        'linkcolor': value['linkcolor'],
        'maildigest': value['maildigest'],
        'maildisplay': value['maildisplay'],
        'mailformat': value['mailformat'],
        'maincolor': value['maincolor'],
        'maxusers': value['maxusers'],
        'name': value['name'],
        'parentid': value['parentid'],
        'postcode': value['postcode'],
        'region': value['region'],
        'screenreader': value['screenreader'],
        'shortname': value['shortname'],
        'suspendafter': value['suspendafter'],
        'suspended': value['suspended'],
        'theme': value['theme'],
        'timezone': value['timezone'],
        'trackforums': value['trackforums'],
        'validto': value['validto'],
    };
}
