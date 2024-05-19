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
 * @interface GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
 */
export interface GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {
    /**
     * class
     * @type {string}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
     */
    _class: string;
    /**
     * cell content
     * @type {string}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
     */
    content: string;
    /**
     * headers
     * @type {string}
     * @memberof GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
     */
    headers: string;
}

/**
 * Check if a given object implements the GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal interface.
 */
export function instanceOfGradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal(value: object): boolean {
    if (!('_class' in value)) return false;
    if (!('content' in value)) return false;
    if (!('headers' in value)) return false;
    return true;
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSON(json: any): GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {
    return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSONTyped(json, false);
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {
    if (json == null) {
        return json;
    }
    return {
        
        '_class': json['class'],
        'content': json['content'],
        'headers': json['headers'],
    };
}

export function GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotalToJSON(value?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'class': value['_class'],
        'content': value['content'],
        'headers': value['headers'],
    };
}

