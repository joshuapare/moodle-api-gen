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
 * @interface ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
 */
export interface ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner {
    /**
     * Whether this column contains HTML
     * @type {boolean}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    AllowHTML?: boolean;
    /**
     * Formatter name
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Formatter?: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Key?: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Label?: string;
    /**
     * Whether this column is sortable
     * @type {boolean}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Sortable?: boolean;
    /**
     * Column type
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Type?: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner
     */
    Width?: string;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner interface.
 */
export function instanceOfModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner(value: object): boolean {
    return true;
}

export function ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInnerFromJSON(json: any): ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner {
    return ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInnerFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'AllowHTML': json['allowHTML'] == null ? undefined : json['allowHTML'],
        'Formatter': json['formatter'] == null ? undefined : json['formatter'],
        'Key': json['key'] == null ? undefined : json['key'],
        'Label': json['label'] == null ? undefined : json['label'],
        'Sortable': json['sortable'] == null ? undefined : json['sortable'],
        'Type': json['type'] == null ? undefined : json['type'],
        'Width': json['width'] == null ? undefined : json['width'],
    };
}

export function ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInnerToJSON(value?: ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowHTML': value['AllowHTML'],
        'formatter': value['Formatter'],
        'key': value['Key'],
        'label': value['Label'],
        'sortable': value['Sortable'],
        'type': value['Type'],
        'width': value['Width'],
    };
}

