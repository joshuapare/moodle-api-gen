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
 * @interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
    /**
     * Option text value
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Answer?: string;
    /**
     * If has to be displayed as a checked option
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Checked?: boolean;
    /**
     * If has to be displayed as correct
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Correct?: boolean;
    /**
     * If has to be displayed as failed
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Fail?: boolean;
    /**
     * If has to be displayed as incorrect
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Incorrect?: boolean;
    /**
     * If has to be displayed as passed
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Pass?: boolean;
    /**
     * If has to be displayed as simple text
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Text?: boolean;
    /**
     * If has to be displayed as a unchecked option
     * @type {boolean}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
     */
    Unchecked?: boolean;
}

/**
 * Check if a given object implements the ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer interface.
 */
export function instanceOfModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer(value: object): boolean {
    return true;
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSON(json: any): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
    return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSONTyped(json, false);
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
    if (json == null) {
        return json;
    }
    return {
        
        'Answer': json['answer'] == null ? undefined : json['answer'],
        'Checked': json['checked'] == null ? undefined : json['checked'],
        'Correct': json['correct'] == null ? undefined : json['correct'],
        'Fail': json['fail'] == null ? undefined : json['fail'],
        'Incorrect': json['incorrect'] == null ? undefined : json['incorrect'],
        'Pass': json['pass'] == null ? undefined : json['pass'],
        'Text': json['text'] == null ? undefined : json['text'],
        'Unchecked': json['unchecked'] == null ? undefined : json['unchecked'],
    };
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerToJSON(value?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answer': value['Answer'],
        'checked': value['Checked'],
        'correct': value['Correct'],
        'fail': value['Fail'],
        'incorrect': value['Incorrect'],
        'pass': value['Pass'],
        'text': value['Text'],
        'unchecked': value['Unchecked'],
    };
}

