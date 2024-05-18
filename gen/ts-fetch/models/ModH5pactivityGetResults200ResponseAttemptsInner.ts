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
import type { ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner } from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner';
import {
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSON,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSONTyped,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerToJSON,
} from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner';

/**
 * The attempt general information
 * @export
 * @interface ModH5pactivityGetResults200ResponseAttemptsInner
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInner {
    /**
     * Attempt number
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    attempt?: number;
    /**
     * Attempt completion
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    completion?: number;
    /**
     * Attempt duration in seconds
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    duration?: number;
    /**
     * ID of the H5P activity
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    h5pactivityid?: number;
    /**
     * ID of the context
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    id?: number;
    /**
     * Attempt max score
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    maxscore?: number;
    /**
     * Attempt score value
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    rawscore?: number;
    /**
     * 
     * @type {Array<ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner>}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    results?: Array<ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner>;
    /**
     * Attempt scaled
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    scaled?: number;
    /**
     * Attempt success
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    success?: number;
    /**
     * Attempt creation
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    timecreated?: number;
    /**
     * Attempt modified
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    timemodified?: number;
    /**
     * ID of the user
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModH5pactivityGetResults200ResponseAttemptsInner interface.
 */
export function instanceOfModH5pactivityGetResults200ResponseAttemptsInner(value: object): boolean {
    return true;
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerFromJSON(json: any): ModH5pactivityGetResults200ResponseAttemptsInner {
    return ModH5pactivityGetResults200ResponseAttemptsInnerFromJSONTyped(json, false);
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetResults200ResponseAttemptsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attempt': json['attempt'] == null ? undefined : json['attempt'],
        'completion': json['completion'] == null ? undefined : json['completion'],
        'duration': json['duration'] == null ? undefined : json['duration'],
        'h5pactivityid': json['h5pactivityid'] == null ? undefined : json['h5pactivityid'],
        'id': json['id'] == null ? undefined : json['id'],
        'maxscore': json['maxscore'] == null ? undefined : json['maxscore'],
        'rawscore': json['rawscore'] == null ? undefined : json['rawscore'],
        'results': json['results'] == null ? undefined : ((json['results'] as Array<any>).map(ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSON)),
        'scaled': json['scaled'] == null ? undefined : json['scaled'],
        'success': json['success'] == null ? undefined : json['success'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerToJSON(value?: ModH5pactivityGetResults200ResponseAttemptsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempt': value['attempt'],
        'completion': value['completion'],
        'duration': value['duration'],
        'h5pactivityid': value['h5pactivityid'],
        'id': value['id'],
        'maxscore': value['maxscore'],
        'rawscore': value['rawscore'],
        'results': value['results'] == null ? undefined : ((value['results'] as Array<any>).map(ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerToJSON)),
        'scaled': value['scaled'],
        'success': value['success'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'userid': value['userid'],
    };
}
