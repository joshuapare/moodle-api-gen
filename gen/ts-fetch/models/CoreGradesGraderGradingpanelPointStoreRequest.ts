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
 * @interface CoreGradesGraderGradingpanelPointStoreRequest
 */
export interface CoreGradesGraderGradingpanelPointStoreRequest {
    /**
     * The name of the component
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    component: string;
    /**
     * The ID of the context being graded
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    contextid: number;
    /**
     * The serialised form data representing the grade
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    formdata: string;
    /**
     * The ID of the user show
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    gradeduserid: number;
    /**
     * The grade item itemname being graded
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    itemname: string;
    /**
     * Wheteher to notify the user or not
     * @type {boolean}
     * @memberof CoreGradesGraderGradingpanelPointStoreRequest
     */
    notifyuser?: boolean;
}

/**
 * Check if a given object implements the CoreGradesGraderGradingpanelPointStoreRequest interface.
 */
export function instanceOfCoreGradesGraderGradingpanelPointStoreRequest(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('contextid' in value)) return false;
    if (!('formdata' in value)) return false;
    if (!('gradeduserid' in value)) return false;
    if (!('itemname' in value)) return false;
    return true;
}

export function CoreGradesGraderGradingpanelPointStoreRequestFromJSON(json: any): CoreGradesGraderGradingpanelPointStoreRequest {
    return CoreGradesGraderGradingpanelPointStoreRequestFromJSONTyped(json, false);
}

export function CoreGradesGraderGradingpanelPointStoreRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGraderGradingpanelPointStoreRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'],
        'contextid': json['contextid'],
        'formdata': json['formdata'],
        'gradeduserid': json['gradeduserid'],
        'itemname': json['itemname'],
        'notifyuser': json['notifyuser'] == null ? undefined : json['notifyuser'],
    };
}

export function CoreGradesGraderGradingpanelPointStoreRequestToJSON(value?: CoreGradesGraderGradingpanelPointStoreRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'contextid': value['contextid'],
        'formdata': value['formdata'],
        'gradeduserid': value['gradeduserid'],
        'itemname': value['itemname'],
        'notifyuser': value['notifyuser'],
    };
}
