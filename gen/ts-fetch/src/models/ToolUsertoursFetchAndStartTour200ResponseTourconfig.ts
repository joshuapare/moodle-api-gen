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
import type { ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner } from './ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner';
import {
    ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInnerFromJSON,
    ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInnerFromJSONTyped,
    ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInnerToJSON,
} from './ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner';

/**
 * 
 * @export
 * @interface ToolUsertoursFetchAndStartTour200ResponseTourconfig
 */
export interface ToolUsertoursFetchAndStartTour200ResponseTourconfig {
    /**
     * display step number
     * @type {boolean}
     * @memberof ToolUsertoursFetchAndStartTour200ResponseTourconfig
     */
    Displaystepnumbers: boolean;
    /**
     * Label of the end tour button
     * @type {string}
     * @memberof ToolUsertoursFetchAndStartTour200ResponseTourconfig
     */
    Endtourlabel: string;
    /**
     * Tour Name
     * @type {string}
     * @memberof ToolUsertoursFetchAndStartTour200ResponseTourconfig
     */
    Name: string;
    /**
     * 
     * @type {Array<ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner>}
     * @memberof ToolUsertoursFetchAndStartTour200ResponseTourconfig
     */
    Steps: Array<ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner>;
}

/**
 * Check if a given object implements the ToolUsertoursFetchAndStartTour200ResponseTourconfig interface.
 */
export function instanceOfToolUsertoursFetchAndStartTour200ResponseTourconfig(value: object): boolean {
    if (!('Displaystepnumbers' in value)) return false;
    if (!('Endtourlabel' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Steps' in value)) return false;
    return true;
}

export function ToolUsertoursFetchAndStartTour200ResponseTourconfigFromJSON(json: any): ToolUsertoursFetchAndStartTour200ResponseTourconfig {
    return ToolUsertoursFetchAndStartTour200ResponseTourconfigFromJSONTyped(json, false);
}

export function ToolUsertoursFetchAndStartTour200ResponseTourconfigFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolUsertoursFetchAndStartTour200ResponseTourconfig {
    if (json == null) {
        return json;
    }
    return {
        
        'Displaystepnumbers': json['displaystepnumbers'],
        'Endtourlabel': json['endtourlabel'],
        'Name': json['name'],
        'Steps': ((json['steps'] as Array<any>).map(ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInnerFromJSON)),
    };
}

export function ToolUsertoursFetchAndStartTour200ResponseTourconfigToJSON(value?: ToolUsertoursFetchAndStartTour200ResponseTourconfig | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'displaystepnumbers': value['Displaystepnumbers'],
        'endtourlabel': value['Endtourlabel'],
        'name': value['Name'],
        'steps': ((value['Steps'] as Array<any>).map(ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInnerToJSON)),
    };
}
