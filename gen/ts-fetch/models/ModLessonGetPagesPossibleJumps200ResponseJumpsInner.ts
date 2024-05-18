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
 * Jump for a page answer
 * @export
 * @interface ModLessonGetPagesPossibleJumps200ResponseJumpsInner
 */
export interface ModLessonGetPagesPossibleJumps200ResponseJumpsInner {
    /**
     * The answer id
     * @type {number}
     * @memberof ModLessonGetPagesPossibleJumps200ResponseJumpsInner
     */
    answerid?: number;
    /**
     * The real page id (or EOL) to jump
     * @type {number}
     * @memberof ModLessonGetPagesPossibleJumps200ResponseJumpsInner
     */
    calculatedjump?: number;
    /**
     * The jump (page id or type of jump)
     * @type {number}
     * @memberof ModLessonGetPagesPossibleJumps200ResponseJumpsInner
     */
    jumpto?: number;
    /**
     * The page id
     * @type {number}
     * @memberof ModLessonGetPagesPossibleJumps200ResponseJumpsInner
     */
    pageid?: number;
}

/**
 * Check if a given object implements the ModLessonGetPagesPossibleJumps200ResponseJumpsInner interface.
 */
export function instanceOfModLessonGetPagesPossibleJumps200ResponseJumpsInner(value: object): boolean {
    return true;
}

export function ModLessonGetPagesPossibleJumps200ResponseJumpsInnerFromJSON(json: any): ModLessonGetPagesPossibleJumps200ResponseJumpsInner {
    return ModLessonGetPagesPossibleJumps200ResponseJumpsInnerFromJSONTyped(json, false);
}

export function ModLessonGetPagesPossibleJumps200ResponseJumpsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetPagesPossibleJumps200ResponseJumpsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'answerid': json['answerid'] == null ? undefined : json['answerid'],
        'calculatedjump': json['calculatedjump'] == null ? undefined : json['calculatedjump'],
        'jumpto': json['jumpto'] == null ? undefined : json['jumpto'],
        'pageid': json['pageid'] == null ? undefined : json['pageid'],
    };
}

export function ModLessonGetPagesPossibleJumps200ResponseJumpsInnerToJSON(value?: ModLessonGetPagesPossibleJumps200ResponseJumpsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answerid': value['answerid'],
        'calculatedjump': value['calculatedjump'],
        'jumpto': value['jumpto'],
        'pageid': value['pageid'],
    };
}
