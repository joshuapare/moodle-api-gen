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
 * @interface CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon
 */
export interface CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon {
    /**
     * component
     * @type {string}
     * @memberof CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon
     */
    component: string;
    /**
     * key
     * @type {string}
     * @memberof CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon
     */
    key: string;
    /**
     * title
     * @type {string}
     * @memberof CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon
     */
    title: string;
}

/**
 * Check if a given object implements the CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon interface.
 */
export function instanceOfCoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('key' in value)) return false;
    if (!('title' in value)) return false;
    return true;
}

export function CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticonFromJSON(json: any): CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon {
    return CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticonFromJSONTyped(json, false);
}

export function CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticonFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'],
        'key': json['key'],
        'title': json['title'],
    };
}

export function CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticonToJSON(value?: CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'key': value['key'],
        'title': value['title'],
    };
}

