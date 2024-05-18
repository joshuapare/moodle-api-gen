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
 * @interface CoreGradesGraderGradingpanelScaleFetchRequest
 */
export interface CoreGradesGraderGradingpanelScaleFetchRequest {
    /**
     * The name of the component
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelScaleFetchRequest
     */
    component: string;
    /**
     * The ID of the context being graded
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelScaleFetchRequest
     */
    contextid: number;
    /**
     * The ID of the user show
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelScaleFetchRequest
     */
    gradeduserid: number;
    /**
     * The grade item itemname being graded
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelScaleFetchRequest
     */
    itemname: string;
}

/**
 * Check if a given object implements the CoreGradesGraderGradingpanelScaleFetchRequest interface.
 */
export function instanceOfCoreGradesGraderGradingpanelScaleFetchRequest(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('contextid' in value)) return false;
    if (!('gradeduserid' in value)) return false;
    if (!('itemname' in value)) return false;
    return true;
}

export function CoreGradesGraderGradingpanelScaleFetchRequestFromJSON(json: any): CoreGradesGraderGradingpanelScaleFetchRequest {
    return CoreGradesGraderGradingpanelScaleFetchRequestFromJSONTyped(json, false);
}

export function CoreGradesGraderGradingpanelScaleFetchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGraderGradingpanelScaleFetchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'],
        'contextid': json['contextid'],
        'gradeduserid': json['gradeduserid'],
        'itemname': json['itemname'],
    };
}

export function CoreGradesGraderGradingpanelScaleFetchRequestToJSON(value?: CoreGradesGraderGradingpanelScaleFetchRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'contextid': value['contextid'],
        'gradeduserid': value['gradeduserid'],
        'itemname': value['itemname'],
    };
}
