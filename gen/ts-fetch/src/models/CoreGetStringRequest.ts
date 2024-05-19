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
import type { CoreGetStringRequestStringparamsInner } from './CoreGetStringRequestStringparamsInner';
import {
    CoreGetStringRequestStringparamsInnerFromJSON,
    CoreGetStringRequestStringparamsInnerFromJSONTyped,
    CoreGetStringRequestStringparamsInnerToJSON,
} from './CoreGetStringRequestStringparamsInner';

/**
 * 
 * @export
 * @interface CoreGetStringRequest
 */
export interface CoreGetStringRequest {
    /**
     * component
     * @type {string}
     * @memberof CoreGetStringRequest
     */
    Component?: string;
    /**
     * lang
     * @type {string}
     * @memberof CoreGetStringRequest
     */
    Lang?: string;
    /**
     * string identifier
     * @type {string}
     * @memberof CoreGetStringRequest
     */
    Stringid: string;
    /**
     * 
     * @type {Array<CoreGetStringRequestStringparamsInner>}
     * @memberof CoreGetStringRequest
     */
    Stringparams?: Array<CoreGetStringRequestStringparamsInner>;
}

/**
 * Check if a given object implements the CoreGetStringRequest interface.
 */
export function instanceOfCoreGetStringRequest(value: object): boolean {
    if (!('Stringid' in value)) return false;
    return true;
}

export function CoreGetStringRequestFromJSON(json: any): CoreGetStringRequest {
    return CoreGetStringRequestFromJSONTyped(json, false);
}

export function CoreGetStringRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGetStringRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'] == null ? undefined : json['component'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Stringid': json['stringid'],
        'Stringparams': json['stringparams'] == null ? undefined : ((json['stringparams'] as Array<any>).map(CoreGetStringRequestStringparamsInnerFromJSON)),
    };
}

export function CoreGetStringRequestToJSON(value?: CoreGetStringRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'lang': value['Lang'],
        'stringid': value['Stringid'],
        'stringparams': value['Stringparams'] == null ? undefined : ((value['Stringparams'] as Array<any>).map(CoreGetStringRequestStringparamsInnerToJSON)),
    };
}
