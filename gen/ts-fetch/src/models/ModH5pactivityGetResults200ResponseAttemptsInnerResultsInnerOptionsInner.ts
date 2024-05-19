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
import type { ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer } from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer';
import {
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSON,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSONTyped,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerToJSON,
} from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer';
import type { ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer } from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer';
import {
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSON,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSONTyped,
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerToJSON,
} from './ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer';

/**
 * 
 * @export
 * @interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner {
    /**
     * 
     * @type {ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
     */
    Correctanswer?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer;
    /**
     * Option description
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
     */
    Description?: string;
    /**
     * Option string identifier
     * @type {string}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
     */
    Id?: string;
    /**
     * 
     * @type {ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer}
     * @memberof ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
     */
    Useranswer?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer;
}

/**
 * Check if a given object implements the ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner interface.
 */
export function instanceOfModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner(value: object): boolean {
    return true;
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSON(json: any): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner {
    return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSONTyped(json, false);
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Correctanswer': json['correctanswer'] == null ? undefined : ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerFromJSON(json['correctanswer']),
        'Description': json['description'] == null ? undefined : json['description'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Useranswer': json['useranswer'] == null ? undefined : ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerFromJSON(json['useranswer']),
    };
}

export function ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerToJSON(value?: ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'correctanswer': ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswerToJSON(value['Correctanswer']),
        'description': value['Description'],
        'id': value['Id'],
        'useranswer': ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswerToJSON(value['Useranswer']),
    };
}
