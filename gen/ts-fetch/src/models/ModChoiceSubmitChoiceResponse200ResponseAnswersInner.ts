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
 * Answers
 * @export
 * @interface ModChoiceSubmitChoiceResponse200ResponseAnswersInner
 */
export interface ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
    /**
     * choiceid
     * @type {number}
     * @memberof ModChoiceSubmitChoiceResponse200ResponseAnswersInner
     */
    Choiceid?: number;
    /**
     * answer id
     * @type {number}
     * @memberof ModChoiceSubmitChoiceResponse200ResponseAnswersInner
     */
    Id?: number;
    /**
     * optionid
     * @type {number}
     * @memberof ModChoiceSubmitChoiceResponse200ResponseAnswersInner
     */
    Optionid?: number;
    /**
     * time of last modification
     * @type {number}
     * @memberof ModChoiceSubmitChoiceResponse200ResponseAnswersInner
     */
    Timemodified?: number;
    /**
     * user id
     * @type {number}
     * @memberof ModChoiceSubmitChoiceResponse200ResponseAnswersInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModChoiceSubmitChoiceResponse200ResponseAnswersInner interface.
 */
export function instanceOfModChoiceSubmitChoiceResponse200ResponseAnswersInner(value: object): boolean {
    return true;
}

export function ModChoiceSubmitChoiceResponse200ResponseAnswersInnerFromJSON(json: any): ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
    return ModChoiceSubmitChoiceResponse200ResponseAnswersInnerFromJSONTyped(json, false);
}

export function ModChoiceSubmitChoiceResponse200ResponseAnswersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceSubmitChoiceResponse200ResponseAnswersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Choiceid': json['choiceid'] == null ? undefined : json['choiceid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Optionid': json['optionid'] == null ? undefined : json['optionid'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModChoiceSubmitChoiceResponse200ResponseAnswersInnerToJSON(value?: ModChoiceSubmitChoiceResponse200ResponseAnswersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'choiceid': value['Choiceid'],
        'id': value['Id'],
        'optionid': value['Optionid'],
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

