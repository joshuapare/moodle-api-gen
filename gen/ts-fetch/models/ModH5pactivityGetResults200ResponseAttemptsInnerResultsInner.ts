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
import type { ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner } from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner';
import {
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSON,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSONTyped,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerToJSON,
} from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner';

/**
 * A single result statement tracking information
 * @export
 * @interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner {
    /**
     * Label used for user answers
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    answerlabel?: string;
    /**
     * ID of the H5P attempt
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    attemptid?: number;
    /**
     * Result completion
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    completion?: number;
    /**
     * Result extra content
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    content?: string;
    /**
     * Label used for correct answers
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    correctlabel?: string;
    /**
     * Result description
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    description?: string;
    /**
     * Result duration in seconds
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    duration?: number;
    /**
     * ID of the context
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    id?: number;
    /**
     * Interaction type
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    interactiontype?: string;
    /**
     * Result max score
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    maxscore?: number;
    /**
     * 
     * @type {Array<ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner>}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    options?: Array<ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner>;
    /**
     * Label used for result options
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    optionslabel?: string;
    /**
     * Result score value
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    rawscore?: number;
    /**
     * Subcontent identifier
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    subcontent?: string;
    /**
     * Result success
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    success?: number;
    /**
     * Result creation
     * @type {number}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    timecreated?: number;
    /**
     * If the result has valid track information
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
     */
    track?: boolean;
}

/**
 * Check if a given object implements the ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner interface.
 */
export function instanceOfModH5pactivityGetResults200ResponseAttemptsInnerResultsInner(value: object): boolean {
    return true;
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSON(json: any): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner {
    return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSONTyped(json, false);
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'answerlabel': json['answerlabel'] == null ? undefined : json['answerlabel'],
        'attemptid': json['attemptid'] == null ? undefined : json['attemptid'],
        'completion': json['completion'] == null ? undefined : json['completion'],
        'content': json['content'] == null ? undefined : json['content'],
        'correctlabel': json['correctlabel'] == null ? undefined : json['correctlabel'],
        'description': json['description'] == null ? undefined : json['description'],
        'duration': json['duration'] == null ? undefined : json['duration'],
        'id': json['id'] == null ? undefined : json['id'],
        'interactiontype': json['interactiontype'] == null ? undefined : json['interactiontype'],
        'maxscore': json['maxscore'] == null ? undefined : json['maxscore'],
        'options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSON)),
        'optionslabel': json['optionslabel'] == null ? undefined : json['optionslabel'],
        'rawscore': json['rawscore'] == null ? undefined : json['rawscore'],
        'subcontent': json['subcontent'] == null ? undefined : json['subcontent'],
        'success': json['success'] == null ? undefined : json['success'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'track': json['track'] == null ? undefined : json['track'],
    };
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerToJSON(value?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answerlabel': value['answerlabel'],
        'attemptid': value['attemptid'],
        'completion': value['completion'],
        'content': value['content'],
        'correctlabel': value['correctlabel'],
        'description': value['description'],
        'duration': value['duration'],
        'id': value['id'],
        'interactiontype': value['interactiontype'],
        'maxscore': value['maxscore'],
        'options': value['options'] == null ? undefined : ((value['options'] as Array<any>).map(ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerToJSON)),
        'optionslabel': value['optionslabel'],
        'rawscore': value['rawscore'],
        'subcontent': value['subcontent'],
        'success': value['success'],
        'timecreated': value['timecreated'],
        'track': value['track'],
    };
}

