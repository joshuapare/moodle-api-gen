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
    Capabilityoffered?: string;
    /**
     * Tool proxy globally unique identifier
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Guid?: string;
    /**
     * Tool proxy id
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Id?: number;
    /**
     * Tool proxy name
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Name?: string;
    /**
     * Tool proxy registration URL
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Regurl?: string;
    /**
     * Tool proxy shared secret
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Secret?: string;
    /**
     * Tool proxy services offered
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Serviceoffered?: string;
    /**
     * Tool proxy state
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    State?: number;
    /**
     * Tool proxy time created
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Timecreated?: number;
    /**
     * Tool proxy modified
     * @type {number}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Timemodified?: number;
    /**
     * Tool proxy
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Toolproxy?: string;
    /**
     * Tool proxy consumer code
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseProxiesInner
     */
    Vendorcode?: string;
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
        
        'Capabilityoffered': json['capabilityoffered'] == null ? undefined : json['capabilityoffered'],
        'Guid': json['guid'] == null ? undefined : json['guid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Regurl': json['regurl'] == null ? undefined : json['regurl'],
        'Secret': json['secret'] == null ? undefined : json['secret'],
        'Serviceoffered': json['serviceoffered'] == null ? undefined : json['serviceoffered'],
        'State': json['state'] == null ? undefined : json['state'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Toolproxy': json['toolproxy'] == null ? undefined : json['toolproxy'],
        'Vendorcode': json['vendorcode'] == null ? undefined : json['vendorcode'],
    };
}

export function ModLtiGetToolTypesAndProxies200ResponseProxiesInnerToJSON(value?: ModLtiGetToolTypesAndProxies200ResponseProxiesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capabilityoffered': value['Capabilityoffered'],
        'guid': value['Guid'],
        'id': value['Id'],
        'name': value['Name'],
        'regurl': value['Regurl'],
        'secret': value['Secret'],
        'serviceoffered': value['Serviceoffered'],
        'state': value['State'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'toolproxy': value['Toolproxy'],
        'vendorcode': value['Vendorcode'],
    };
}
