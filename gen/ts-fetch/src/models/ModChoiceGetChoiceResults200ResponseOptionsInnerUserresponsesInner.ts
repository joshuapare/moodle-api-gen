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
 * User responses
 * @export
 * @interface ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
 */
export interface ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner {
    /**
     * answer id
     * @type {number}
     * @memberof ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
     */
    Answerid?: number;
    /**
     * user full name
     * @type {string}
     * @memberof ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
     */
    Fullname?: string;
    /**
     * profile user image url
     * @type {string}
     * @memberof ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
     */
    Profileimageurl?: string;
    /**
     * time of modification
     * @type {number}
     * @memberof ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
     */
    Timemodified?: number;
    /**
     * user id
     * @type {number}
     * @memberof ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner interface.
 */
export function instanceOfModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner(value: object): boolean {
    return true;
}

export function ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInnerFromJSON(json: any): ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner {
    return ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInnerFromJSONTyped(json, false);
}

export function ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Answerid': json['answerid'] == null ? undefined : json['answerid'],
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Profileimageurl': json['profileimageurl'] == null ? undefined : json['profileimageurl'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInnerToJSON(value?: ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answerid': value['Answerid'],
        'fullname': value['Fullname'],
        'profileimageurl': value['Profileimageurl'],
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

