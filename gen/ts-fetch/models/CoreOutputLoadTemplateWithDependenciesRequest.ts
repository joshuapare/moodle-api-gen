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
 * @interface CoreOutputLoadTemplateWithDependenciesRequest
 */
export interface CoreOutputLoadTemplateWithDependenciesRequest {
    /**
     * component containing the template
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependenciesRequest
     */
    component: string;
    /**
     * Include comments or not
     * @type {boolean}
     * @memberof CoreOutputLoadTemplateWithDependenciesRequest
     */
    includecomments?: boolean;
    /**
     * lang
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependenciesRequest
     */
    lang?: string;
    /**
     * name of the template
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependenciesRequest
     */
    template: string;
    /**
     * The current theme.
     * @type {string}
     * @memberof CoreOutputLoadTemplateWithDependenciesRequest
     */
    themename: string;
}

/**
 * Check if a given object implements the CoreOutputLoadTemplateWithDependenciesRequest interface.
 */
export function instanceOfCoreOutputLoadTemplateWithDependenciesRequest(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('template' in value)) return false;
    if (!('themename' in value)) return false;
    return true;
}

export function CoreOutputLoadTemplateWithDependenciesRequestFromJSON(json: any): CoreOutputLoadTemplateWithDependenciesRequest {
    return CoreOutputLoadTemplateWithDependenciesRequestFromJSONTyped(json, false);
}

export function CoreOutputLoadTemplateWithDependenciesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreOutputLoadTemplateWithDependenciesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'],
        'includecomments': json['includecomments'] == null ? undefined : json['includecomments'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'template': json['template'],
        'themename': json['themename'],
    };
}

export function CoreOutputLoadTemplateWithDependenciesRequestToJSON(value?: CoreOutputLoadTemplateWithDependenciesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'includecomments': value['includecomments'],
        'lang': value['lang'],
        'template': value['template'],
        'themename': value['themename'],
    };
}

