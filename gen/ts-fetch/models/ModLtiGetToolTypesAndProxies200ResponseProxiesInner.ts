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
 * @interface ModLtiGetToolTypesAndProxies200ResponseProxiesInner
 */
export interface ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    /**
     * Tool proxy capabilities offered
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    capabilityoffered?: string;
    /**
     * Tool proxy globally unique identifier
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    guid?: string;
    /**
     * Tool proxy id
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    id?: number;
    /**
     * Tool proxy name
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    name?: string;
    /**
     * Tool proxy registration URL
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    regurl?: string;
    /**
     * Tool proxy shared secret
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    secret?: string;
    /**
     * Tool proxy services offered
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    serviceoffered?: string;
    /**
     * Tool proxy state
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    state?: number;
    /**
     * Tool proxy time created
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    timecreated?: number;
    /**
     * Tool proxy modified
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    timemodified?: number;
    /**
     * Tool proxy
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    toolproxy?: string;
    /**
     * Tool proxy consumer code
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    vendorcode?: string;
}

/**
 * Check if a given object implements the ModLtiGetToolTypesAndProxies200ResponseProxiesInner interface.
 */
export function instanceOfModLtiGetToolTypesAndProxies200ResponseProxiesInner(value: object): boolean {
    return true;
}

export function ModLtiGetToolTypesAndProxies200ResponseProxiesInnerFromJSON(json: any): ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    return ModLtiGetToolTypesAndProxies200ResponseProxiesInnerFromJSONTyped(json, false);
}

export function ModLtiGetToolTypesAndProxies200ResponseProxiesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'capabilityoffered': json['capabilityoffered'] == null ? undefined : json['capabilityoffered'],
        'guid': json['guid'] == null ? undefined : json['guid'],
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'regurl': json['regurl'] == null ? undefined : json['regurl'],
        'secret': json['secret'] == null ? undefined : json['secret'],
        'serviceoffered': json['serviceoffered'] == null ? undefined : json['serviceoffered'],
        'state': json['state'] == null ? undefined : json['state'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'toolproxy': json['toolproxy'] == null ? undefined : json['toolproxy'],
        'vendorcode': json['vendorcode'] == null ? undefined : json['vendorcode'],
    };
}

export function ModLtiGetToolTypesAndProxies200ResponseProxiesInnerToJSON(value?: ModLtiGetToolTypesAndProxies200ResponseProxiesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capabilityoffered': value['capabilityoffered'],
        'guid': value['guid'],
        'id': value['id'],
        'name': value['name'],
        'regurl': value['regurl'],
        'secret': value['secret'],
        'serviceoffered': value['serviceoffered'],
        'state': value['state'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'toolproxy': value['toolproxy'],
        'vendorcode': value['vendorcode'],
    };
}
