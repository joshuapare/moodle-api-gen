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
 * @interface CoreOutputLoadTemplateWithDependencies200ResponseStringsInner
 */
export interface CoreOutputLoadTemplateWithDependencies200ResponseStringsInner {
    /**
     * component containing the resource
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependencies200ResponseStringsInner
     */
    component?: string;
    /**
     * name of the resource
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependencies200ResponseStringsInner
     */
    name?: string;
    /**
     * resource value
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependencies200ResponseStringsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the CoreOutputLoadTemplateWithDependencies200ResponseStringsInner interface.
 */
export function instanceOfCoreOutputLoadTemplateWithDependencies200ResponseStringsInner(value: object): boolean {
    return true;
}

export function CoreOutputLoadTemplateWithDependencies200ResponseStringsInnerFromJSON(json: any): CoreOutputLoadTemplateWithDependencies200ResponseStringsInner {
    return CoreOutputLoadTemplateWithDependencies200ResponseStringsInnerFromJSONTyped(json, false);
}

export function CoreOutputLoadTemplateWithDependencies200ResponseStringsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreOutputLoadTemplateWithDependencies200ResponseStringsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'] == null ? undefined : json['component'],
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreOutputLoadTemplateWithDependencies200ResponseStringsInnerToJSON(value?: CoreOutputLoadTemplateWithDependencies200ResponseStringsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'name': value['name'],
        'value': value['value'],
    };
}
