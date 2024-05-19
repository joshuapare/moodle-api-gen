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
 * @interface CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
 */
export interface CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
    /**
     * Whether this item is currently selected
     * @type {boolean}
     * @memberof CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
     */
    Selected?: boolean;
    /**
     * The description fo the option
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
     */
    Title?: string;
    /**
     * The grade value
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
     */
    Value?: number;
}

/**
 * Check if a given object implements the CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner interface.
 */
export function instanceOfCoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner(value: object): boolean {
    return true;
}

export function CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInnerFromJSON(json: any): CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
    return CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInnerFromJSONTyped(json, false);
}

export function CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Selected': json['selected'] == null ? undefined : json['selected'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInnerToJSON(value?: CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'selected': value['Selected'],
        'title': value['Title'],
        'value': value['Value'],
    };
}

