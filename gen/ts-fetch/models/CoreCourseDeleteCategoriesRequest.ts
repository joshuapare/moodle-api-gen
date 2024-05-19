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
import type { CoreCourseDeleteCategoriesRequestCategoriesInner } from './CoreCourseDeleteCategoriesRequestCategoriesInner';
import {
    CoreCourseDeleteCategoriesRequestCategoriesInnerFromJSON,
    CoreCourseDeleteCategoriesRequestCategoriesInnerFromJSONTyped,
    CoreCourseDeleteCategoriesRequestCategoriesInnerToJSON,
} from './CoreCourseDeleteCategoriesRequestCategoriesInner';

/**
 * 
 * @export
 * @interface CoreCourseDeleteCategoriesRequest
 */
export interface CoreCourseDeleteCategoriesRequest {
    /**
     * 
     * @type {Array<CoreCourseDeleteCategoriesRequestCategoriesInner>}
     * @memberof CoreCourseDeleteCategoriesRequest
     */
    categories: Array<CoreCourseDeleteCategoriesRequestCategoriesInner>;
}

/**
 * Check if a given object implements the CoreCourseDeleteCategoriesRequest interface.
 */
export function instanceOfCoreCourseDeleteCategoriesRequest(value: object): boolean {
    if (!('categories' in value)) return false;
    return true;
}

export function CoreCourseDeleteCategoriesRequestFromJSON(json: any): CoreCourseDeleteCategoriesRequest {
    return CoreCourseDeleteCategoriesRequestFromJSONTyped(json, false);
}

export function CoreCourseDeleteCategoriesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseDeleteCategoriesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'categories': ((json['categories'] as Array<any>).map(CoreCourseDeleteCategoriesRequestCategoriesInnerFromJSON)),
    };
}

export function CoreCourseDeleteCategoriesRequestToJSON(value?: CoreCourseDeleteCategoriesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categories': ((value['categories'] as Array<any>).map(CoreCourseDeleteCategoriesRequestCategoriesInnerToJSON)),
    };
}

