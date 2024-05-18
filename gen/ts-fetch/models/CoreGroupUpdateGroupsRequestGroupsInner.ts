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
import type { CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner } from './CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';
import {
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSON,
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSONTyped,
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerToJSON,
} from './CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';

/**
 * 
 * @export
 * @interface CoreGroupUpdateGroupsRequestGroupsInner
 */
export interface CoreGroupUpdateGroupsRequestGroupsInner {
    /**
     * 
     * @type {Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    customfields?: Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
     * group description text
     * @type {string}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    descriptionformat?: number;
    /**
     * group enrol secret phrase
     * @type {string}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    enrolmentkey?: string;
    /**
     * ID of the group
     * @type {number}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    id?: number;
    /**
     * id number
     * @type {string}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    idnumber?: string;
    /**
     * multilang compatible name, course unique
     * @type {string}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    name?: string;
    /**
     * activity participation enabled? Only for "all" and "members" visibility
     * @type {boolean}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    participation?: boolean;
    /**
     * group visibility mode. 0 = Visible to all. 1 = Visible to members. 2 = See own membership. 3 = Membership is hidden.
     * @type {string}
     * @memberof CoreGroupUpdateGroupsRequestGroupsInner
     */
    visibility?: string;
}

/**
 * Check if a given object implements the CoreGroupUpdateGroupsRequestGroupsInner interface.
 */
export function instanceOfCoreGroupUpdateGroupsRequestGroupsInner(value: object): boolean {
    return true;
}

export function CoreGroupUpdateGroupsRequestGroupsInnerFromJSON(json: any): CoreGroupUpdateGroupsRequestGroupsInner {
    return CoreGroupUpdateGroupsRequestGroupsInnerFromJSONTyped(json, false);
}

export function CoreGroupUpdateGroupsRequestGroupsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGroupUpdateGroupsRequestGroupsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'customfields': json['customfields'] == null ? undefined : ((json['customfields'] as Array<any>).map(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSON)),
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'enrolmentkey': json['enrolmentkey'] == null ? undefined : json['enrolmentkey'],
        'id': json['id'] == null ? undefined : json['id'],
        'idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'name': json['name'] == null ? undefined : json['name'],
        'participation': json['participation'] == null ? undefined : json['participation'],
        'visibility': json['visibility'] == null ? undefined : json['visibility'],
    };
}

export function CoreGroupUpdateGroupsRequestGroupsInnerToJSON(value?: CoreGroupUpdateGroupsRequestGroupsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'customfields': value['customfields'] == null ? undefined : ((value['customfields'] as Array<any>).map(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerToJSON)),
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'enrolmentkey': value['enrolmentkey'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'name': value['name'],
        'participation': value['participation'],
        'visibility': value['visibility'],
    };
}

