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
import type { ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner } from './ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner';
import {
    ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInnerFromJSON,
    ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInnerFromJSONTyped,
    ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInnerToJSON,
} from './ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner';

/**
 * Node structure
 * @export
 * @interface ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
 */
export interface ToolDataprivacyTreeExtraBranches200ResponseBranchesInner {
    /**
     * 
     * @type {Array<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner>}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    branches?: Array<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner>;
    /**
     * The node contextid
     * @type {number}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    contextid?: number;
    /**
     * The node contextlevel
     * @type {number}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    contextlevel?: number;
    /**
     * The contextid this node expands
     * @type {number}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    expandcontextid?: number;
    /**
     * Is it expanded
     * @type {number}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    expanded?: number;
    /**
     * What element is this node expanded to
     * @type {string}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    expandelement?: string;
    /**
     * The node text
     * @type {string}
     * @memberof ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
     */
    text?: string;
}

/**
 * Check if a given object implements the ToolDataprivacyTreeExtraBranches200ResponseBranchesInner interface.
 */
export function instanceOfToolDataprivacyTreeExtraBranches200ResponseBranchesInner(value: object): boolean {
    return true;
}

export function ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerFromJSON(json: any): ToolDataprivacyTreeExtraBranches200ResponseBranchesInner {
    return ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerFromJSONTyped(json, false);
}

export function ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyTreeExtraBranches200ResponseBranchesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'branches': json['branches'] == null ? undefined : ((json['branches'] as Array<any>).map(ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInnerFromJSON)),
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'expandcontextid': json['expandcontextid'] == null ? undefined : json['expandcontextid'],
        'expanded': json['expanded'] == null ? undefined : json['expanded'],
        'expandelement': json['expandelement'] == null ? undefined : json['expandelement'],
        'text': json['text'] == null ? undefined : json['text'],
    };
}

export function ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerToJSON(value?: ToolDataprivacyTreeExtraBranches200ResponseBranchesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'branches': value['branches'] == null ? undefined : ((value['branches'] as Array<any>).map(ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInnerToJSON)),
        'contextid': value['contextid'],
        'contextlevel': value['contextlevel'],
        'expandcontextid': value['expandcontextid'],
        'expanded': value['expanded'],
        'expandelement': value['expandelement'],
        'text': value['text'],
    };
}
