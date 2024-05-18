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
 * @interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer {
    /**
     * Option text value
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    answer?: string;
    /**
     * If has to be displayed as a checked option
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    checked?: boolean;
    /**
     * If has to be displayed as correct
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    correct?: boolean;
    /**
     * If has to be displayed as failed
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    fail?: boolean;
    /**
     * If has to be displayed as incorrect
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    incorrect?: boolean;
    /**
     * If has to be displayed as passed
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    pass?: boolean;
    /**
     * If has to be displayed as simple text
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    text?: boolean;
    /**
     * If has to be displayed as a unchecked option
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
     */
    unchecked?: boolean;
}

/**
 * Check if a given object implements the ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer interface.
 */
export function instanceOfModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer(value: object): boolean {
    return true;
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSON(json: any): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer {
    return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSONTyped(json, false);
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer {
    if (json == null) {
        return json;
    }
    return {
        
        'answer': json['answer'] == null ? undefined : json['answer'],
        'checked': json['checked'] == null ? undefined : json['checked'],
        'correct': json['correct'] == null ? undefined : json['correct'],
        'fail': json['fail'] == null ? undefined : json['fail'],
        'incorrect': json['incorrect'] == null ? undefined : json['incorrect'],
        'pass': json['pass'] == null ? undefined : json['pass'],
        'text': json['text'] == null ? undefined : json['text'],
        'unchecked': json['unchecked'] == null ? undefined : json['unchecked'],
    };
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerToJSON(value?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answer': value['answer'],
        'checked': value['checked'],
        'correct': value['correct'],
        'fail': value['fail'],
        'incorrect': value['incorrect'],
        'pass': value['pass'],
        'text': value['text'],
        'unchecked': value['unchecked'],
    };
}
