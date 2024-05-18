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
import type { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner } from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner';
import {
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSON,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSONTyped,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerToJSON,
} from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsDelete200Response
 */
export interface CoreReportbuilderConditionsDelete200Response {
    /**
     * activeconditionsform
     * @type {string}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    activeconditionsform: string;
    /**
     * 
     * @type {Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    availableconditions: Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>;
    /**
     * hasactiveconditions
     * @type {boolean}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    hasactiveconditions: boolean;
    /**
     * hasavailableconditions
     * @type {boolean}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    hasavailableconditions: boolean;
    /**
     * helpicon
     * @type {string}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    helpicon: string;
    /**
     * javascript
     * @type {string}
     * @memberof CoreReportbuilderConditionsDelete200Response
     */
    javascript?: string;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsDelete200Response interface.
 */
export function instanceOfCoreReportbuilderConditionsDelete200Response(value: object): boolean {
    if (!('activeconditionsform' in value)) return false;
    if (!('availableconditions' in value)) return false;
    if (!('hasactiveconditions' in value)) return false;
    if (!('hasavailableconditions' in value)) return false;
    if (!('helpicon' in value)) return false;
    return true;
}

export function CoreReportbuilderConditionsDelete200ResponseFromJSON(json: any): CoreReportbuilderConditionsDelete200Response {
    return CoreReportbuilderConditionsDelete200ResponseFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsDelete200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsDelete200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'activeconditionsform': json['activeconditionsform'],
        'availableconditions': ((json['availableconditions'] as Array<any>).map(CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSON)),
        'hasactiveconditions': json['hasactiveconditions'],
        'hasavailableconditions': json['hasavailableconditions'],
        'helpicon': json['helpicon'],
        'javascript': json['javascript'] == null ? undefined : json['javascript'],
    };
}

export function CoreReportbuilderConditionsDelete200ResponseToJSON(value?: CoreReportbuilderConditionsDelete200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activeconditionsform': value['activeconditionsform'],
        'availableconditions': ((value['availableconditions'] as Array<any>).map(CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerToJSON)),
        'hasactiveconditions': value['hasactiveconditions'],
        'hasavailableconditions': value['hasavailableconditions'],
        'helpicon': value['helpicon'],
        'javascript': value['javascript'],
    };
}
