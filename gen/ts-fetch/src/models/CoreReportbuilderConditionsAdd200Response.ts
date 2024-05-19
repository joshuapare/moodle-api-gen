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
import type { CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner } from './CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner';
import {
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSON,
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSONTyped,
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerToJSON,
} from './CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsAdd200Response
 */
export interface CoreReportbuilderConditionsAdd200Response {
    /**
     * activeconditionsform
     * @type {string}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Activeconditionsform: string;
    /**
     * 
     * @type {Array<CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner>}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Availableconditions: Array<CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner>;
    /**
     * hasactiveconditions
     * @type {boolean}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Hasactiveconditions: boolean;
    /**
     * hasavailableconditions
     * @type {boolean}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Hasavailableconditions: boolean;
    /**
     * helpicon
     * @type {string}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Helpicon: string;
    /**
     * javascript
     * @type {string}
     * @memberof CoreReportbuilderConditionsAdd200Response
     */
    Javascript?: string;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsAdd200Response interface.
 */
export function instanceOfCoreReportbuilderConditionsAdd200Response(value: object): boolean {
    if (!('Activeconditionsform' in value)) return false;
    if (!('Availableconditions' in value)) return false;
    if (!('Hasactiveconditions' in value)) return false;
    if (!('Hasavailableconditions' in value)) return false;
    if (!('Helpicon' in value)) return false;
    return true;
}

export function CoreReportbuilderConditionsAdd200ResponseFromJSON(json: any): CoreReportbuilderConditionsAdd200Response {
    return CoreReportbuilderConditionsAdd200ResponseFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsAdd200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsAdd200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Activeconditionsform': json['activeconditionsform'],
        'Availableconditions': ((json['availableconditions'] as Array<any>).map(CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSON)),
        'Hasactiveconditions': json['hasactiveconditions'],
        'Hasavailableconditions': json['hasavailableconditions'],
        'Helpicon': json['helpicon'],
        'Javascript': json['javascript'] == null ? undefined : json['javascript'],
    };
}

export function CoreReportbuilderConditionsAdd200ResponseToJSON(value?: CoreReportbuilderConditionsAdd200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activeconditionsform': value['Activeconditionsform'],
        'availableconditions': ((value['Availableconditions'] as Array<any>).map(CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerToJSON)),
        'hasactiveconditions': value['Hasactiveconditions'],
        'hasavailableconditions': value['Hasavailableconditions'],
        'helpicon': value['Helpicon'],
        'javascript': value['Javascript'],
    };
}

