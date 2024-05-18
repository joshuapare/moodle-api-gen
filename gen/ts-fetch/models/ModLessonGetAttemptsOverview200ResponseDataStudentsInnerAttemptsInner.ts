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
 * @interface ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
 */
export interface ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    /**
     * Attempt time ended.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
     */
    end?: number;
    /**
     * Attempt grade.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
     */
    grade?: number;
    /**
     * Attempt last time continued.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
     */
    timeend?: number;
    /**
     * Attempt time started.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
     */
    timestart?: number;
    /**
     * Attempt number.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner
     */
    _try?: number;
}

/**
 * Check if a given object implements the ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner interface.
 */
export function instanceOfModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner(value: object): boolean {
    return true;
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSON(json: any): ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    return ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSONTyped(json, false);
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'end': json['end'] == null ? undefined : json['end'],
        'grade': json['grade'] == null ? undefined : json['grade'],
        'timeend': json['timeend'] == null ? undefined : json['timeend'],
        'timestart': json['timestart'] == null ? undefined : json['timestart'],
        '_try': json['try'] == null ? undefined : json['try'],
    };
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerToJSON(value?: ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'end': value['end'],
        'grade': value['grade'],
        'timeend': value['timeend'],
        'timestart': value['timestart'],
        'try': value['_try'],
    };
}
