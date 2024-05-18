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
 * @interface CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
 */
export interface CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner {
    /**
     * Group image URL
     * @type {string}
     * @memberof CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
     */
    groupimageurl?: string;
    /**
     * An ID for the group
     * @type {string}
     * @memberof CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
     */
    id?: string;
    /**
     * The full name of the group
     * @type {string}
     * @memberof CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
     */
    name?: string;
}

/**
 * Check if a given object implements the CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner interface.
 */
export function instanceOfCoreGradesGetGroupsForSearchWidget200ResponseGroupsInner(value: object): boolean {
    return true;
}

export function CoreGradesGetGroupsForSearchWidget200ResponseGroupsInnerFromJSON(json: any): CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner {
    return CoreGradesGetGroupsForSearchWidget200ResponseGroupsInnerFromJSONTyped(json, false);
}

export function CoreGradesGetGroupsForSearchWidget200ResponseGroupsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'groupimageurl': json['groupimageurl'] == null ? undefined : json['groupimageurl'],
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
    };
}

export function CoreGradesGetGroupsForSearchWidget200ResponseGroupsInnerToJSON(value?: CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'groupimageurl': value['groupimageurl'],
        'id': value['id'],
        'name': value['name'],
    };
}
