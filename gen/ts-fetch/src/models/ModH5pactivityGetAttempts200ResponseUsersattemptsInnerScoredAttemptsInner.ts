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
 * @interface ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
 */
export interface ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner {
    /**
     * Attempt number
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Attempt?: number;
    /**
     * Attempt completion
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Completion?: number;
    /**
     * Attempt duration in seconds
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Duration?: number;
    /**
     * ID of the H5P activity
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    H5pactivityid?: number;
    /**
     * ID of the context
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Id?: number;
    /**
     * Attempt max score
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Maxscore?: number;
    /**
     * Attempt score value
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Rawscore?: number;
    /**
     * Attempt scaled
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Scaled?: number;
    /**
     * Attempt success
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Success?: number;
    /**
     * Attempt creation
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Timecreated?: number;
    /**
     * Attempt modified
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Timemodified?: number;
    /**
     * ID of the user
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner interface.
 */
export function instanceOfModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner(value: object): boolean {
    return true;
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSON(json: any): ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner {
    return ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSONTyped(json, false);
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Attempt': json['attempt'] == null ? undefined : json['attempt'],
        'Completion': json['completion'] == null ? undefined : json['completion'],
        'Duration': json['duration'] == null ? undefined : json['duration'],
        'H5pactivityid': json['h5pactivityid'] == null ? undefined : json['h5pactivityid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Maxscore': json['maxscore'] == null ? undefined : json['maxscore'],
        'Rawscore': json['rawscore'] == null ? undefined : json['rawscore'],
        'Scaled': json['scaled'] == null ? undefined : json['scaled'],
        'Success': json['success'] == null ? undefined : json['success'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerToJSON(value?: ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempt': value['Attempt'],
        'completion': value['Completion'],
        'duration': value['Duration'],
        'h5pactivityid': value['H5pactivityid'],
        'id': value['Id'],
        'maxscore': value['Maxscore'],
        'rawscore': value['Rawscore'],
        'scaled': value['Scaled'],
        'success': value['Success'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

