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
 * @interface ModDataAddEntryRequestDataInner
 */
export interface ModDataAddEntryRequestDataInner {
    /**
     * The field id.
     * @type {number}
     * @memberof ModDataAddEntryRequestDataInner
     */
    fieldid?: number;
    /**
     * The subfield name (if required).
     * @type {string}
     * @memberof ModDataAddEntryRequestDataInner
     */
    subfield?: string;
    /**
     * The contents for the field always JSON encoded.
     * @type {string}
     * @memberof ModDataAddEntryRequestDataInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModDataAddEntryRequestDataInner interface.
 */
export function instanceOfModDataAddEntryRequestDataInner(value: object): boolean {
    return true;
}

export function ModDataAddEntryRequestDataInnerFromJSON(json: any): ModDataAddEntryRequestDataInner {
    return ModDataAddEntryRequestDataInnerFromJSONTyped(json, false);
}

export function ModDataAddEntryRequestDataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataAddEntryRequestDataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'fieldid': json['fieldid'] == null ? undefined : json['fieldid'],
        'subfield': json['subfield'] == null ? undefined : json['subfield'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModDataAddEntryRequestDataInnerToJSON(value?: ModDataAddEntryRequestDataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'fieldid': value['fieldid'],
        'subfield': value['subfield'],
        'value': value['value'],
    };
}

