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
 * Rating
 * @export
 * @interface CoreRatingGetItemRatings200ResponseRatingsInner
 */
export interface CoreRatingGetItemRatings200ResponseRatingsInner {
    /**
     * rating id
     * @type {number}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    id?: number;
    /**
     * rating on scale
     * @type {string}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    rating?: string;
    /**
     * time modified (timestamp)
     * @type {number}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    timemodified?: number;
    /**
     * user fullname
     * @type {string}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    userfullname?: string;
    /**
     * user id
     * @type {number}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    userid?: number;
    /**
     * URL user picture
     * @type {string}
     * @memberof CoreRatingGetItemRatings200ResponseRatingsInner
     */
    userpictureurl?: string;
}

/**
 * Check if a given object implements the CoreRatingGetItemRatings200ResponseRatingsInner interface.
 */
export function instanceOfCoreRatingGetItemRatings200ResponseRatingsInner(value: object): boolean {
    return true;
}

export function CoreRatingGetItemRatings200ResponseRatingsInnerFromJSON(json: any): CoreRatingGetItemRatings200ResponseRatingsInner {
    return CoreRatingGetItemRatings200ResponseRatingsInnerFromJSONTyped(json, false);
}

export function CoreRatingGetItemRatings200ResponseRatingsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreRatingGetItemRatings200ResponseRatingsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'rating': json['rating'] == null ? undefined : json['rating'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'userfullname': json['userfullname'] == null ? undefined : json['userfullname'],
        'userid': json['userid'] == null ? undefined : json['userid'],
        'userpictureurl': json['userpictureurl'] == null ? undefined : json['userpictureurl'],
    };
}

export function CoreRatingGetItemRatings200ResponseRatingsInnerToJSON(value?: CoreRatingGetItemRatings200ResponseRatingsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'rating': value['rating'],
        'timemodified': value['timemodified'],
        'userfullname': value['userfullname'],
        'userid': value['userid'],
        'userpictureurl': value['userpictureurl'],
    };
}
