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
 * @interface ToolTemplatelibraryListTemplatesRequest
 */
export interface ToolTemplatelibraryListTemplatesRequest {
    /**
     * The component to search
     * @type {string}
     * @memberof ToolTemplatelibraryListTemplatesRequest
     */
    component?: string;
    /**
     * The search string
     * @type {string}
     * @memberof ToolTemplatelibraryListTemplatesRequest
     */
    search?: string;
    /**
     * The current theme
     * @type {string}
     * @memberof ToolTemplatelibraryListTemplatesRequest
     */
    themename?: string;
}

/**
 * Check if a given object implements the ToolTemplatelibraryListTemplatesRequest interface.
 */
export function instanceOfToolTemplatelibraryListTemplatesRequest(value: object): boolean {
    return true;
}

export function ToolTemplatelibraryListTemplatesRequestFromJSON(json: any): ToolTemplatelibraryListTemplatesRequest {
    return ToolTemplatelibraryListTemplatesRequestFromJSONTyped(json, false);
}

export function ToolTemplatelibraryListTemplatesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolTemplatelibraryListTemplatesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'] == null ? undefined : json['component'],
        'search': json['search'] == null ? undefined : json['search'],
        'themename': json['themename'] == null ? undefined : json['themename'],
    };
}

export function ToolTemplatelibraryListTemplatesRequestToJSON(value?: ToolTemplatelibraryListTemplatesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'search': value['search'],
        'themename': value['themename'],
    };
}

