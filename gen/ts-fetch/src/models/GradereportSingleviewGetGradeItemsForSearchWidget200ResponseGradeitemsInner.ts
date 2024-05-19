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
 * @interface GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner
 */
export interface GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner {
    /**
     * ID of the grade item
     * @type {number}
     * @memberof GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner
     */
    Id?: number;
    /**
     * The full name of the grade item
     * @type {string}
     * @memberof GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner
     */
    Name?: string;
}

/**
 * Check if a given object implements the GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner interface.
 */
export function instanceOfGradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner(value: object): boolean {
    return true;
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSON(json: any): GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner {
    return GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSONTyped(json, false);
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
    };
}

export function GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInnerToJSON(value?: GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'name': value['Name'],
    };
}
