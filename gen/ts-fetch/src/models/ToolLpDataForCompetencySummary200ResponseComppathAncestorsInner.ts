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
 * @interface ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
 */
export interface ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner {
    /**
     * first
     * @type {boolean}
     * @memberof ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
     */
    First?: boolean;
    /**
     * id
     * @type {number}
     * @memberof ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
     */
    Id?: number;
    /**
     * last
     * @type {boolean}
     * @memberof ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
     */
    Last?: boolean;
    /**
     * name
     * @type {string}
     * @memberof ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
     */
    Name?: string;
    /**
     * position
     * @type {number}
     * @memberof ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner
     */
    Position?: number;
}

/**
 * Check if a given object implements the ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner interface.
 */
export function instanceOfToolLpDataForCompetencySummary200ResponseComppathAncestorsInner(value: object): boolean {
    return true;
}

export function ToolLpDataForCompetencySummary200ResponseComppathAncestorsInnerFromJSON(json: any): ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner {
    return ToolLpDataForCompetencySummary200ResponseComppathAncestorsInnerFromJSONTyped(json, false);
}

export function ToolLpDataForCompetencySummary200ResponseComppathAncestorsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'First': json['first'] == null ? undefined : json['first'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Last': json['last'] == null ? undefined : json['last'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Position': json['position'] == null ? undefined : json['position'],
    };
}

export function ToolLpDataForCompetencySummary200ResponseComppathAncestorsInnerToJSON(value?: ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'first': value['First'],
        'id': value['Id'],
        'last': value['Last'],
        'name': value['Name'],
        'position': value['Position'],
    };
}

