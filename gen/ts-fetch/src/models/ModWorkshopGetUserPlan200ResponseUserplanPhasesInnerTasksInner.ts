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
 * @interface ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
 */
export interface ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner {
    /**
     * Task code.
     * @type {string}
     * @memberof ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
     */
    Code?: string;
    /**
     * Completion information (maybe empty, maybe a boolean or generic info.
     * @type {string}
     * @memberof ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
     */
    Completed?: string;
    /**
     * Task details.
     * @type {string}
     * @memberof ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
     */
    Details?: string;
    /**
     * Link to task.
     * @type {string}
     * @memberof ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
     */
    Link?: string;
    /**
     * Task title.
     * @type {string}
     * @memberof ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner
     */
    Title?: string;
}

/**
 * Check if a given object implements the ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner interface.
 */
export function instanceOfModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInnerFromJSON(json: any): ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner {
    return ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Code': json['code'] == null ? undefined : json['code'],
        'Completed': json['completed'] == null ? undefined : json['completed'],
        'Details': json['details'] == null ? undefined : json['details'],
        'Link': json['link'] == null ? undefined : json['link'],
        'Title': json['title'] == null ? undefined : json['title'],
    };
}

export function ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInnerToJSON(value?: ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['Code'],
        'completed': value['Completed'],
        'details': value['Details'],
        'link': value['Link'],
        'title': value['Title'],
    };
}
