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
 * @interface ModScormGetScormUserData200ResponseDataInnerDefaultdataInner
 */
export interface ModScormGetScormUserData200ResponseDataInnerDefaultdataInner {
    /**
     * element name
     * @type {string}
     * @memberof ModScormGetScormUserData200ResponseDataInnerDefaultdataInner
     */
    element?: string;
    /**
     * element value
     * @type {string}
     * @memberof ModScormGetScormUserData200ResponseDataInnerDefaultdataInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModScormGetScormUserData200ResponseDataInnerDefaultdataInner interface.
 */
export function instanceOfModScormGetScormUserData200ResponseDataInnerDefaultdataInner(value: object): boolean {
    return true;
}

export function ModScormGetScormUserData200ResponseDataInnerDefaultdataInnerFromJSON(json: any): ModScormGetScormUserData200ResponseDataInnerDefaultdataInner {
    return ModScormGetScormUserData200ResponseDataInnerDefaultdataInnerFromJSONTyped(json, false);
}

export function ModScormGetScormUserData200ResponseDataInnerDefaultdataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormUserData200ResponseDataInnerDefaultdataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'element': json['element'] == null ? undefined : json['element'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModScormGetScormUserData200ResponseDataInnerDefaultdataInnerToJSON(value?: ModScormGetScormUserData200ResponseDataInnerDefaultdataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'element': value['element'],
        'value': value['value'],
    };
}

