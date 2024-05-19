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
import type { CoreCohortSearchCohortsRequestContext } from './CoreCohortSearchCohortsRequestContext';
import {
    CoreCohortSearchCohortsRequestContextFromJSON,
    CoreCohortSearchCohortsRequestContextFromJSONTyped,
    CoreCohortSearchCohortsRequestContextToJSON,
} from './CoreCohortSearchCohortsRequestContext';

/**
 * 
 * @export
 * @interface ToolLpDataForCompetencyFrameworksManagePageRequest
 */
export interface ToolLpDataForCompetencyFrameworksManagePageRequest {
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof ToolLpDataForCompetencyFrameworksManagePageRequest
     */
    Pagecontext: CoreCohortSearchCohortsRequestContext;
}

/**
 * Check if a given object implements the ToolLpDataForCompetencyFrameworksManagePageRequest interface.
 */
export function instanceOfToolLpDataForCompetencyFrameworksManagePageRequest(value: object): boolean {
    if (!('Pagecontext' in value)) return false;
    return true;
}

export function ToolLpDataForCompetencyFrameworksManagePageRequestFromJSON(json: any): ToolLpDataForCompetencyFrameworksManagePageRequest {
    return ToolLpDataForCompetencyFrameworksManagePageRequestFromJSONTyped(json, false);
}

export function ToolLpDataForCompetencyFrameworksManagePageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCompetencyFrameworksManagePageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Pagecontext': CoreCohortSearchCohortsRequestContextFromJSON(json['pagecontext']),
    };
}

export function ToolLpDataForCompetencyFrameworksManagePageRequestToJSON(value?: ToolLpDataForCompetencyFrameworksManagePageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pagecontext': CoreCohortSearchCohortsRequestContextToJSON(value['Pagecontext']),
    };
}

