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
 * @interface ModGlossaryGetEntriesByAuthorRequestOptions
 */
export interface ModGlossaryGetEntriesByAuthorRequestOptions {
    /**
     * When false, includes the non-approved entries created by the user. When true, also includes the ones that the user has the permission to approve.
     * @type {boolean}
     * @memberof ModGlossaryGetEntriesByAuthorRequestOptions
     */
    Includenotapproved?: boolean;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByAuthorRequestOptions interface.
 */
export function instanceOfModGlossaryGetEntriesByAuthorRequestOptions(value: object): boolean {
    return true;
}

export function ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json: any): ModGlossaryGetEntriesByAuthorRequestOptions {
    return ModGlossaryGetEntriesByAuthorRequestOptionsFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesByAuthorRequestOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesByAuthorRequestOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'Includenotapproved': json['includenotapproved'] == null ? undefined : json['includenotapproved'],
    };
}

export function ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value?: ModGlossaryGetEntriesByAuthorRequestOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'includenotapproved': value['Includenotapproved'],
    };
}

