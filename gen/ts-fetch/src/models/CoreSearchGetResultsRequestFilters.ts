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
 * @interface CoreSearchGetResultsRequestFilters
 */
export interface CoreSearchGetResultsRequestFilters {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Areaids?: Array<object>;
    /**
     * category to filter areas
     * @type {string}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Cat?: string;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Contextids?: Array<object>;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Courseids?: Array<object>;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Groupids?: Array<object>;
    /**
     * only results from my courses
     * @type {boolean}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Mycoursesonly?: boolean;
    /**
     * how to order
     * @type {string}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Order?: string;
    /**
     * docs modified before this date
     * @type {number}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Timeend?: number;
    /**
     * docs modified after this date
     * @type {number}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Timestart?: number;
    /**
     * result title
     * @type {string}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Title?: string;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreSearchGetResultsRequestFilters
     */
    Userids?: Array<object>;
}

/**
 * Check if a given object implements the CoreSearchGetResultsRequestFilters interface.
 */
export function instanceOfCoreSearchGetResultsRequestFilters(value: object): boolean {
    return true;
}

export function CoreSearchGetResultsRequestFiltersFromJSON(json: any): CoreSearchGetResultsRequestFilters {
    return CoreSearchGetResultsRequestFiltersFromJSONTyped(json, false);
}

export function CoreSearchGetResultsRequestFiltersFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreSearchGetResultsRequestFilters {
    if (json == null) {
        return json;
    }
    return {
        
        'Areaids': json['areaids'] == null ? undefined : json['areaids'],
        'Cat': json['cat'] == null ? undefined : json['cat'],
        'Contextids': json['contextids'] == null ? undefined : json['contextids'],
        'Courseids': json['courseids'] == null ? undefined : json['courseids'],
        'Groupids': json['groupids'] == null ? undefined : json['groupids'],
        'Mycoursesonly': json['mycoursesonly'] == null ? undefined : json['mycoursesonly'],
        'Order': json['order'] == null ? undefined : json['order'],
        'Timeend': json['timeend'] == null ? undefined : json['timeend'],
        'Timestart': json['timestart'] == null ? undefined : json['timestart'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Userids': json['userids'] == null ? undefined : json['userids'],
    };
}

export function CoreSearchGetResultsRequestFiltersToJSON(value?: CoreSearchGetResultsRequestFilters | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'areaids': value['Areaids'],
        'cat': value['Cat'],
        'contextids': value['Contextids'],
        'courseids': value['Courseids'],
        'groupids': value['Groupids'],
        'mycoursesonly': value['Mycoursesonly'],
        'order': value['Order'],
        'timeend': value['Timeend'],
        'timestart': value['Timestart'],
        'title': value['Title'],
        'userids': value['Userids'],
    };
}

