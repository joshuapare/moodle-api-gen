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
 * @interface ModChoiceGetChoiceOptions200ResponseOptionsInner
 */
export interface ModChoiceGetChoiceOptions200ResponseOptionsInner {
    /**
     * we already answered
     * @type {boolean}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Checked?: boolean;
    /**
     * number of answers
     * @type {number}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Countanswers?: number;
    /**
     * option disabled
     * @type {boolean}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Disabled?: boolean;
    /**
     * true for orizontal, otherwise vertical
     * @type {boolean}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Displaylayout?: boolean;
    /**
     * option id
     * @type {number}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Id?: number;
    /**
     * maximum number of answers
     * @type {number}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Maxanswers?: number;
    /**
     * text of the choice
     * @type {string}
     * @memberof ModChoiceGetChoiceOptions200ResponseOptionsInner
     */
    Text?: string;
}

/**
 * Check if a given object implements the ModChoiceGetChoiceOptions200ResponseOptionsInner interface.
 */
export function instanceOfModChoiceGetChoiceOptions200ResponseOptionsInner(value: object): boolean {
    return true;
}

export function ModChoiceGetChoiceOptions200ResponseOptionsInnerFromJSON(json: any): ModChoiceGetChoiceOptions200ResponseOptionsInner {
    return ModChoiceGetChoiceOptions200ResponseOptionsInnerFromJSONTyped(json, false);
}

export function ModChoiceGetChoiceOptions200ResponseOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceGetChoiceOptions200ResponseOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Checked': json['checked'] == null ? undefined : json['checked'],
        'Countanswers': json['countanswers'] == null ? undefined : json['countanswers'],
        'Disabled': json['disabled'] == null ? undefined : json['disabled'],
        'Displaylayout': json['displaylayout'] == null ? undefined : json['displaylayout'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Maxanswers': json['maxanswers'] == null ? undefined : json['maxanswers'],
        'Text': json['text'] == null ? undefined : json['text'],
    };
}

export function ModChoiceGetChoiceOptions200ResponseOptionsInnerToJSON(value?: ModChoiceGetChoiceOptions200ResponseOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'checked': value['Checked'],
        'countanswers': value['Countanswers'],
        'disabled': value['Disabled'],
        'displaylayout': value['Displaylayout'],
        'id': value['Id'],
        'maxanswers': value['Maxanswers'],
        'text': value['Text'],
    };
}
