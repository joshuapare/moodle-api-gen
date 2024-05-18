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
 * @interface CoreCourseAddContentItemToUserFavourites200Response
 */
export interface CoreCourseAddContentItemToUserFavourites200Response {
    /**
     * The archetype of the module exposing the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    archetype: string;
    /**
     * The name of the component exposing the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    componentname: string;
    /**
     * Has the user favourited the content item
     * @type {boolean}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    favourite: boolean;
    /**
     * Html description / help for the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    help: string;
    /**
     * Html containing the icon for the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    icon: string;
    /**
     * The id of the content item
     * @type {number}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    id: number;
    /**
     * If this item was pulled from the old callback and has no item id.
     * @type {boolean}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    legacyitem: boolean;
    /**
     * The link to the content item creation page
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    link: string;
    /**
     * Name of the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    name: string;
    /**
     * The purpose of the component exposing the content item
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    purpose: string;
    /**
     * Has this item been recommended
     * @type {boolean}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    recommended: boolean;
    /**
     * The string title of the content item, human readable
     * @type {string}
     * @memberof CoreCourseAddContentItemToUserFavourites200Response
     */
    title: string;
}

/**
 * Check if a given object implements the CoreCourseAddContentItemToUserFavourites200Response interface.
 */
export function instanceOfCoreCourseAddContentItemToUserFavourites200Response(value: object): boolean {
    if (!('archetype' in value)) return false;
    if (!('componentname' in value)) return false;
    if (!('favourite' in value)) return false;
    if (!('help' in value)) return false;
    if (!('icon' in value)) return false;
    if (!('id' in value)) return false;
    if (!('legacyitem' in value)) return false;
    if (!('link' in value)) return false;
    if (!('name' in value)) return false;
    if (!('purpose' in value)) return false;
    if (!('recommended' in value)) return false;
    if (!('title' in value)) return false;
    return true;
}

export function CoreCourseAddContentItemToUserFavourites200ResponseFromJSON(json: any): CoreCourseAddContentItemToUserFavourites200Response {
    return CoreCourseAddContentItemToUserFavourites200ResponseFromJSONTyped(json, false);
}

export function CoreCourseAddContentItemToUserFavourites200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseAddContentItemToUserFavourites200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'archetype': json['archetype'],
        'componentname': json['componentname'],
        'favourite': json['favourite'],
        'help': json['help'],
        'icon': json['icon'],
        'id': json['id'],
        'legacyitem': json['legacyitem'],
        'link': json['link'],
        'name': json['name'],
        'purpose': json['purpose'],
        'recommended': json['recommended'],
        'title': json['title'],
    };
}

export function CoreCourseAddContentItemToUserFavourites200ResponseToJSON(value?: CoreCourseAddContentItemToUserFavourites200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'archetype': value['archetype'],
        'componentname': value['componentname'],
        'favourite': value['favourite'],
        'help': value['help'],
        'icon': value['icon'],
        'id': value['id'],
        'legacyitem': value['legacyitem'],
        'link': value['link'],
        'name': value['name'],
        'purpose': value['purpose'],
        'recommended': value['recommended'],
        'title': value['title'],
    };
}
