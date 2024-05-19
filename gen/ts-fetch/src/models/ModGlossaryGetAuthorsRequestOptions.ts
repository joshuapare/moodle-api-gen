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
 * @interface ModGlossaryGetAuthorsRequestOptions
 */
export interface ModGlossaryGetAuthorsRequestOptions {
    /**
     * When false, includes self even if all of their entries require approval. When true, also includes authors only having entries pending approval.
     * @type {boolean}
     * @memberof ModGlossaryGetAuthorsRequestOptions
     */
    Includenotapproved?: boolean;
}

/**
 * Check if a given object implements the ModGlossaryGetAuthorsRequestOptions interface.
 */
export function instanceOfModGlossaryGetAuthorsRequestOptions(value: object): boolean {
    return true;
}

export function ModGlossaryGetAuthorsRequestOptionsFromJSON(json: any): ModGlossaryGetAuthorsRequestOptions {
    return ModGlossaryGetAuthorsRequestOptionsFromJSONTyped(json, false);
}

export function ModGlossaryGetAuthorsRequestOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetAuthorsRequestOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'Includenotapproved': json['includenotapproved'] == null ? undefined : json['includenotapproved'],
    };
}

export function ModGlossaryGetAuthorsRequestOptionsToJSON(value?: ModGlossaryGetAuthorsRequestOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'includenotapproved': value['Includenotapproved'],
    };
}
