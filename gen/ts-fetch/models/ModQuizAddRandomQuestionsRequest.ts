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
 * @interface ModQuizAddRandomQuestionsRequest
 */
export interface ModQuizAddRandomQuestionsRequest {
    /**
     * The page where random questions will be added to
     * @type {number}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    addonpage: number;
    /**
     * The cmid of the quiz
     * @type {number}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    cmid: number;
    /**
     * (Optional) The filter condition used when adding random questions from an existing category.
     *                     Not required if adding random questions from a new category.
     * @type {string}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    filtercondition?: string;
    /**
     * (Optional) The name of a new question category to create and use for the random questions.
     * @type {string}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    newcategory?: string;
    /**
     * (Optional) The parent of the new question category, if creating one.
     * @type {string}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    parentcategory?: string;
    /**
     * Number of random questions
     * @type {number}
     * @memberof ModQuizAddRandomQuestionsRequest
     */
    randomcount: number;
}

/**
 * Check if a given object implements the ModQuizAddRandomQuestionsRequest interface.
 */
export function instanceOfModQuizAddRandomQuestionsRequest(value: object): boolean {
    if (!('addonpage' in value)) return false;
    if (!('cmid' in value)) return false;
    if (!('randomcount' in value)) return false;
    return true;
}

export function ModQuizAddRandomQuestionsRequestFromJSON(json: any): ModQuizAddRandomQuestionsRequest {
    return ModQuizAddRandomQuestionsRequestFromJSONTyped(json, false);
}

export function ModQuizAddRandomQuestionsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizAddRandomQuestionsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'addonpage': json['addonpage'],
        'cmid': json['cmid'],
        'filtercondition': json['filtercondition'] == null ? undefined : json['filtercondition'],
        'newcategory': json['newcategory'] == null ? undefined : json['newcategory'],
        'parentcategory': json['parentcategory'] == null ? undefined : json['parentcategory'],
        'randomcount': json['randomcount'],
    };
}

export function ModQuizAddRandomQuestionsRequestToJSON(value?: ModQuizAddRandomQuestionsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'addonpage': value['addonpage'],
        'cmid': value['cmid'],
        'filtercondition': value['filtercondition'],
        'newcategory': value['newcategory'],
        'parentcategory': value['parentcategory'],
        'randomcount': value['randomcount'],
    };
}

