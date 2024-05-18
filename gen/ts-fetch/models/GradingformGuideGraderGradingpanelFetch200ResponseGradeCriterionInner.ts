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
 * @interface GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
 */
export interface GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner {
    /**
     * The description of the criterion
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    description?: string;
    /**
     * The description of the criterion for markers
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    descriptionmarkers?: string;
    /**
     * The id of the criterion
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    id?: number;
    /**
     * The maximum score for this criterion
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    maxscore?: number;
    /**
     * The name of the criterion
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    name?: string;
    /**
     * Any remarks for this criterion for the user being assessed
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    remark?: string;
    /**
     * The current score for user being assessed
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner
     */
    score?: number;
}

/**
 * Check if a given object implements the GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner interface.
 */
export function instanceOfGradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner(value: object): boolean {
    return true;
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInnerFromJSON(json: any): GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner {
    return GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInnerFromJSONTyped(json, false);
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionmarkers': json['descriptionmarkers'] == null ? undefined : json['descriptionmarkers'],
        'id': json['id'] == null ? undefined : json['id'],
        'maxscore': json['maxscore'] == null ? undefined : json['maxscore'],
        'name': json['name'] == null ? undefined : json['name'],
        'remark': json['remark'] == null ? undefined : json['remark'],
        'score': json['score'] == null ? undefined : json['score'],
    };
}

export function GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInnerToJSON(value?: GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'descriptionmarkers': value['descriptionmarkers'],
        'id': value['id'],
        'maxscore': value['maxscore'],
        'name': value['name'],
        'remark': value['remark'],
        'score': value['score'],
    };
}

