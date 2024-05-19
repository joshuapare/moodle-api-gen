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
 * @interface GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner
 */
export interface GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner {
    /**
     * The comment value
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner
     */
    Description?: string;
    /**
     * Comment id
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner
     */
    Id?: number;
    /**
     * The sortorder of this comment
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner
     */
    Sortorder?: number;
}

/**
 * Check if a given object implements the GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner interface.
 */
export function instanceOfGradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner(value: object): boolean {
    return true;
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInnerFromJSON(json: any): GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner {
    return GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInnerFromJSONTyped(json, false);
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInnerToJSON(value?: GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'id': value['Id'],
        'sortorder': value['Sortorder'],
    };
}

