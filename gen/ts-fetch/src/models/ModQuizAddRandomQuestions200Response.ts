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
 * @interface ModQuizAddRandomQuestions200Response
 */
export interface ModQuizAddRandomQuestions200Response {
    /**
     * Message
     * @type {string}
     * @memberof ModQuizAddRandomQuestions200Response
     */
    Message?: string;
}

/**
 * Check if a given object implements the ModQuizAddRandomQuestions200Response interface.
 */
export function instanceOfModQuizAddRandomQuestions200Response(value: object): boolean {
    return true;
}

export function ModQuizAddRandomQuestions200ResponseFromJSON(json: any): ModQuizAddRandomQuestions200Response {
    return ModQuizAddRandomQuestions200ResponseFromJSONTyped(json, false);
}

export function ModQuizAddRandomQuestions200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizAddRandomQuestions200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Message': json['message'] == null ? undefined : json['message'],
    };
}

export function ModQuizAddRandomQuestions200ResponseToJSON(value?: ModQuizAddRandomQuestions200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'message': value['Message'],
    };
}

