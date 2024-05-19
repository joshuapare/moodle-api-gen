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
import type { CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue } from './CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue';
import {
    CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalueFromJSON,
    CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalueFromJSONTyped,
    CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalueToJSON,
} from './CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue';

/**
 * 
 * @export
 * @interface CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
 */
export interface CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {
    /**
     * Rule name
     * @type {string}
     * @memberof CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
     */
    Rulename?: string;
    /**
     * 
     * @type {CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue}
     * @memberof CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
     */
    Rulevalue?: CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue;
}

/**
 * Check if a given object implements the CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner interface.
 */
export function instanceOfCoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner(value: object): boolean {
    return true;
}

export function CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerFromJSON(json: any): CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {
    return CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerFromJSONTyped(json, false);
}

export function CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Rulename': json['rulename'] == null ? undefined : json['rulename'],
        'Rulevalue': json['rulevalue'] == null ? undefined : CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalueFromJSON(json['rulevalue']),
    };
}

export function CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerToJSON(value?: CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'rulename': value['Rulename'],
        'rulevalue': CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalueToJSON(value['Rulevalue']),
    };
}

