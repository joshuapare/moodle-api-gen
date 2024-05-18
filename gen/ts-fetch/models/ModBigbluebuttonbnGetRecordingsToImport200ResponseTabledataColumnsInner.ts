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
 * @interface ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
 */
export interface ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner {
    /**
     * Whether this column contains HTML
     * @type {boolean}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    allowHTML?: boolean;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    key?: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    label?: string;
    /**
     * Whether this column is sortable
     * @type {boolean}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    sortable?: boolean;
    /**
     * Column type
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
     */
    width?: string;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner interface.
 */
export function instanceOfModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner(value: object): boolean {
    return true;
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSON(json: any): ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner {
    return ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'allowHTML': json['allowHTML'] == null ? undefined : json['allowHTML'],
        'key': json['key'] == null ? undefined : json['key'],
        'label': json['label'] == null ? undefined : json['label'],
        'sortable': json['sortable'] == null ? undefined : json['sortable'],
        'type': json['type'] == null ? undefined : json['type'],
        'width': json['width'] == null ? undefined : json['width'],
    };
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerToJSON(value?: ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowHTML': value['allowHTML'],
        'key': value['key'],
        'label': value['label'],
        'sortable': value['sortable'],
        'type': value['type'],
        'width': value['width'],
    };
}

