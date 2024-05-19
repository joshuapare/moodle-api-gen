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
import type { ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner } from './ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner';
import {
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSON,
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSONTyped,
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerToJSON,
} from './ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner';
import type { ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored } from './ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored';
import {
    ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScoredFromJSON,
    ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScoredFromJSONTyped,
    ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScoredToJSON,
} from './ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored';

/**
 * 
 * @export
 * @interface ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner
 */
export interface ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner {
    /**
     * 
     * @type {Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>}
     * @memberof ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner
     */
    attempts?: Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>;
    /**
     * 
     * @type {ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored}
     * @memberof ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner
     */
    scored?: ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored;
    /**
     * The user id
     * @type {number}
     * @memberof ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner interface.
 */
export function instanceOfModH5pactivityGetUserAttempts200ResponseUsersattemptsInner(value: object): boolean {
    return true;
}

export function ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerFromJSON(json: any): ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner {
    return ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerFromJSONTyped(json, false);
}

export function ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attempts': json['attempts'] == null ? undefined : ((json['attempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSON)),
        'scored': json['scored'] == null ? undefined : ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScoredFromJSON(json['scored']),
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerToJSON(value?: ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempts': value['attempts'] == null ? undefined : ((value['attempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerToJSON)),
        'scored': ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScoredToJSON(value['scored']),
        'userid': value['userid'],
    };
}

