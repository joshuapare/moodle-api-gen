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
 * @interface LocalIomadLearningpathCopypathRequest
 */
export interface LocalIomadLearningpathCopypathRequest {
    /**
     * ID of Iomad Learning Path
     * @type {number}
     * @memberof LocalIomadLearningpathCopypathRequest
     */
    pathid: number;
}

/**
 * Check if a given object implements the LocalIomadLearningpathCopypathRequest interface.
 */
export function instanceOfLocalIomadLearningpathCopypathRequest(value: object): boolean {
    if (!('pathid' in value)) return false;
    return true;
}

export function LocalIomadLearningpathCopypathRequestFromJSON(json: any): LocalIomadLearningpathCopypathRequest {
    return LocalIomadLearningpathCopypathRequestFromJSONTyped(json, false);
}

export function LocalIomadLearningpathCopypathRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocalIomadLearningpathCopypathRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'pathid': json['pathid'],
    };
}

export function LocalIomadLearningpathCopypathRequestToJSON(value?: LocalIomadLearningpathCopypathRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pathid': value['pathid'],
    };
}
