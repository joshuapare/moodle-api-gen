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

/**
 * 
 * @export
 * @interface ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored
 */
export interface ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored {
    /**
     * 
     * @type {Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored
     */
    Attempts: Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>;
    /**
     * Scored attempts title
     * @type {string}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored
     */
    Grademethod: string;
    /**
     * Scored attempts title
     * @type {string}
     * @memberof ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored
     */
    Title: string;
}

/**
 * Check if a given object implements the ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored interface.
 */
export function instanceOfModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored(value: object): boolean {
    if (!('Attempts' in value)) return false;
    if (!('Grademethod' in value)) return false;
    if (!('Title' in value)) return false;
    return true;
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredFromJSON(json: any): ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored {
    return ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredFromJSONTyped(json, false);
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored {
    if (json == null) {
        return json;
    }
    return {
        
        'Attempts': ((json['attempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerFromJSON)),
        'Grademethod': json['grademethod'],
        'Title': json['title'],
    };
}

export function ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredToJSON(value?: ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempts': ((value['Attempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInnerToJSON)),
        'grademethod': value['Grademethod'],
        'title': value['Title'],
    };
}
