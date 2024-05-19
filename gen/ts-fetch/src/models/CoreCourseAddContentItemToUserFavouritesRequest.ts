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
 * @interface CoreCourseAddContentItemToUserFavouritesRequest
 */
export interface CoreCourseAddContentItemToUserFavouritesRequest {
    /**
     * frankenstyle name of the component to which the content item belongs
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavouritesRequest
     */
    Componentname: string;
    /**
     * id of the content item
     * @type {number}
     * @memberof CoreCourseAddContentItemToUserFavouritesRequest
     */
    Contentitemid: number;
}

/**
 * Check if a given object implements the CoreCourseAddContentItemToUserFavouritesRequest interface.
 */
export function instanceOfCoreCourseAddContentItemToUserFavouritesRequest(value: object): boolean {
    if (!('Componentname' in value)) return false;
    if (!('Contentitemid' in value)) return false;
    return true;
}

export function CoreCourseAddContentItemToUserFavouritesRequestFromJSON(json: any): CoreCourseAddContentItemToUserFavouritesRequest {
    return CoreCourseAddContentItemToUserFavouritesRequestFromJSONTyped(json, false);
}

export function CoreCourseAddContentItemToUserFavouritesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseAddContentItemToUserFavouritesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Componentname': json['componentname'],
        'Contentitemid': json['contentitemid'],
    };
}

export function CoreCourseAddContentItemToUserFavouritesRequestToJSON(value?: CoreCourseAddContentItemToUserFavouritesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'componentname': value['Componentname'],
        'contentitemid': value['Contentitemid'],
    };
}

