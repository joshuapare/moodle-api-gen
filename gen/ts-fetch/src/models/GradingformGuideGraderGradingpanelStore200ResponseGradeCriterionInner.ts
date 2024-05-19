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
 * @interface GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
 */
export interface GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
    /**
     * The description of the criterion
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Description?: string;
    /**
     * The description of the criterion for markers
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Descriptionmarkers?: string;
    /**
     * The id of the criterion
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Id?: number;
    /**
     * The maximum score for this criterion
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Maxscore?: number;
    /**
     * The name of the criterion
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Name?: string;
    /**
     * Any remarks for this criterion for the user being assessed
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Remark?: string;
    /**
     * The current score for user being assessed
     * @type {number}
     * @memberof GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
     */
    Score?: number;
}

/**
 * Check if a given object implements the GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner interface.
 */
export function instanceOfGradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner(value: object): boolean {
    return true;
}

export function GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerFromJSON(json: any): GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
    return GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerFromJSONTyped(json, false);
}

export function GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionmarkers': json['descriptionmarkers'] == null ? undefined : json['descriptionmarkers'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Maxscore': json['maxscore'] == null ? undefined : json['maxscore'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Remark': json['remark'] == null ? undefined : json['remark'],
        'Score': json['score'] == null ? undefined : json['score'],
    };
}

export function GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInnerToJSON(value?: GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'descriptionmarkers': value['Descriptionmarkers'],
        'id': value['Id'],
        'maxscore': value['Maxscore'],
        'name': value['Name'],
        'remark': value['Remark'],
        'score': value['Score'],
    };
}
