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
 * @interface ToolLpDataForTemplateCompetenciesPageRequest
 */
export interface ToolLpDataForTemplateCompetenciesPageRequest {
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof ToolLpDataForTemplateCompetenciesPageRequest
     */
    pagecontext: CoreCohortSearchCohortsRequestContext;
    /**
     * The template id
     * @type {number}
     * @memberof ToolLpDataForTemplateCompetenciesPageRequest
     */
    templateid: number;
}

/**
 * Check if a given object implements the ToolLpDataForTemplateCompetenciesPageRequest interface.
 */
export function instanceOfToolLpDataForTemplateCompetenciesPageRequest(value: object): boolean {
    if (!('pagecontext' in value)) return false;
    if (!('templateid' in value)) return false;
    return true;
}

export function ToolLpDataForTemplateCompetenciesPageRequestFromJSON(json: any): ToolLpDataForTemplateCompetenciesPageRequest {
    return ToolLpDataForTemplateCompetenciesPageRequestFromJSONTyped(json, false);
}

export function ToolLpDataForTemplateCompetenciesPageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForTemplateCompetenciesPageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'pagecontext': CoreCohortSearchCohortsRequestContextFromJSON(json['pagecontext']),
        'templateid': json['templateid'],
    };
}

export function ToolLpDataForTemplateCompetenciesPageRequestToJSON(value?: ToolLpDataForTemplateCompetenciesPageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pagecontext': CoreCohortSearchCohortsRequestContextToJSON(value['pagecontext']),
        'templateid': value['templateid'],
    };
}

