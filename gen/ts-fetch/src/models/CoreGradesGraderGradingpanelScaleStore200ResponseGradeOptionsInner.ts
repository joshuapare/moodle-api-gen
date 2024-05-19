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
 * @interface CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner
 */
export interface CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner {
    /**
     * Whether this item is currently selected
     * @type {boolean}
     * @memberof CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner
     */
    Selected?: boolean;
    /**
     * The description fo the option
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner
     */
    Title?: string;
    /**
     * The grade value
     * @type {number}
     * @memberof CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner
     */
    Value?: number;
}

/**
 * Check if a given object implements the CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner interface.
 */
export function instanceOfCoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner(value: object): boolean {
    return true;
}

export function CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInnerFromJSON(json: any): CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner {
    return CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInnerFromJSONTyped(json, false);
}

export function CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Selected': json['selected'] == null ? undefined : json['selected'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInnerToJSON(value?: CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'selected': value['Selected'],
        'title': value['Title'],
        'value': value['Value'],
    };
}
