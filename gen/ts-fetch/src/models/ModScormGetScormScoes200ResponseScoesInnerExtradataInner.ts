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
 * @interface ModScormGetScormScoes200ResponseScoesInnerExtradataInner
 */
export interface ModScormGetScormScoes200ResponseScoesInnerExtradataInner {
    /**
     * element name
     * @type {string}
     * @memberof ModScormGetScormScoes200ResponseScoesInnerExtradataInner
     */
    Element?: string;
    /**
     * element value
     * @type {string}
     * @memberof ModScormGetScormScoes200ResponseScoesInnerExtradataInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModScormGetScormScoes200ResponseScoesInnerExtradataInner interface.
 */
export function instanceOfModScormGetScormScoes200ResponseScoesInnerExtradataInner(value: object): boolean {
    return true;
}

export function ModScormGetScormScoes200ResponseScoesInnerExtradataInnerFromJSON(json: any): ModScormGetScormScoes200ResponseScoesInnerExtradataInner {
    return ModScormGetScormScoes200ResponseScoesInnerExtradataInnerFromJSONTyped(json, false);
}

export function ModScormGetScormScoes200ResponseScoesInnerExtradataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormScoes200ResponseScoesInnerExtradataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Element': json['element'] == null ? undefined : json['element'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModScormGetScormScoes200ResponseScoesInnerExtradataInnerToJSON(value?: ModScormGetScormScoes200ResponseScoesInnerExtradataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'element': value['Element'],
        'value': value['Value'],
    };
}

