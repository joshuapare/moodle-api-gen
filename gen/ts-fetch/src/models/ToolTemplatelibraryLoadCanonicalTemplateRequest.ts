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
 * @interface ToolTemplatelibraryLoadCanonicalTemplateRequest
 */
export interface ToolTemplatelibraryLoadCanonicalTemplateRequest {
    /**
     * component containing the template
     * @type {string}
     * @memberof ToolTemplatelibraryLoadCanonicalTemplateRequest
     */
    Component: string;
    /**
     * name of the template
     * @type {string}
     * @memberof ToolTemplatelibraryLoadCanonicalTemplateRequest
     */
    Template: string;
}

/**
 * Check if a given object implements the ToolTemplatelibraryLoadCanonicalTemplateRequest interface.
 */
export function instanceOfToolTemplatelibraryLoadCanonicalTemplateRequest(value: object): boolean {
    if (!('Component' in value)) return false;
    if (!('Template' in value)) return false;
    return true;
}

export function ToolTemplatelibraryLoadCanonicalTemplateRequestFromJSON(json: any): ToolTemplatelibraryLoadCanonicalTemplateRequest {
    return ToolTemplatelibraryLoadCanonicalTemplateRequestFromJSONTyped(json, false);
}

export function ToolTemplatelibraryLoadCanonicalTemplateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolTemplatelibraryLoadCanonicalTemplateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'],
        'Template': json['template'],
    };
}

export function ToolTemplatelibraryLoadCanonicalTemplateRequestToJSON(value?: ToolTemplatelibraryLoadCanonicalTemplateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'template': value['Template'],
    };
}

