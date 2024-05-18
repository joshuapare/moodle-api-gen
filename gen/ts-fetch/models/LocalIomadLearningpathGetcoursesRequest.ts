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
 * @interface LocalIomadLearningpathGetcoursesRequest
 */
export interface LocalIomadLearningpathGetcoursesRequest {
    /**
     * ID of Iomad Learning Path group (0 = return all)
     * @type {number}
     * @memberof LocalIomadLearningpathGetcoursesRequest
     */
    groupid?: number;
    /**
     * ID of Iomad Learning Path
     * @type {number}
     * @memberof LocalIomadLearningpathGetcoursesRequest
     */
    pathid: number;
}

/**
 * Check if a given object implements the LocalIomadLearningpathGetcoursesRequest interface.
 */
export function instanceOfLocalIomadLearningpathGetcoursesRequest(value: object): boolean {
    if (!('pathid' in value)) return false;
    return true;
}

export function LocalIomadLearningpathGetcoursesRequestFromJSON(json: any): LocalIomadLearningpathGetcoursesRequest {
    return LocalIomadLearningpathGetcoursesRequestFromJSONTyped(json, false);
}

export function LocalIomadLearningpathGetcoursesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocalIomadLearningpathGetcoursesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'pathid': json['pathid'],
    };
}

export function LocalIomadLearningpathGetcoursesRequestToJSON(value?: LocalIomadLearningpathGetcoursesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'groupid': value['groupid'],
        'pathid': value['pathid'],
    };
}
