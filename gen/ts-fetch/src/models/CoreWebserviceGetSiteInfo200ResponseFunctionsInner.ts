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
 * functions that are available
 * @export
 * @interface CoreWebserviceGetSiteInfo200ResponseFunctionsInner
 */
export interface CoreWebserviceGetSiteInfo200ResponseFunctionsInner {
    /**
     * function name
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200ResponseFunctionsInner
     */
    Name?: string;
    /**
     * The version number of the component to which the function belongs
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200ResponseFunctionsInner
     */
    Version?: string;
}

/**
 * Check if a given object implements the CoreWebserviceGetSiteInfo200ResponseFunctionsInner interface.
 */
export function instanceOfCoreWebserviceGetSiteInfo200ResponseFunctionsInner(value: object): boolean {
    return true;
}

export function CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSON(json: any): CoreWebserviceGetSiteInfo200ResponseFunctionsInner {
    return CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSONTyped(json, false);
}

export function CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreWebserviceGetSiteInfo200ResponseFunctionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Version': json['version'] == null ? undefined : json['version'],
    };
}

export function CoreWebserviceGetSiteInfo200ResponseFunctionsInnerToJSON(value?: CoreWebserviceGetSiteInfo200ResponseFunctionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'version': value['Version'],
    };
}

