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
 * @interface ModDataUpdateEntryRequestDataInner
 */
export interface ModDataUpdateEntryRequestDataInner {
    /**
     * The field id.
     * @type {number}
     * @memberof ModDataUpdateEntryRequestDataInner
     */
    Fieldid?: number;
    /**
     * The subfield name (if required).
     * @type {string}
     * @memberof ModDataUpdateEntryRequestDataInner
     */
    Subfield?: string;
    /**
     * The new contents for the field always JSON encoded.
     * @type {string}
     * @memberof ModDataUpdateEntryRequestDataInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModDataUpdateEntryRequestDataInner interface.
 */
export function instanceOfModDataUpdateEntryRequestDataInner(value: object): boolean {
    return true;
}

export function ModDataUpdateEntryRequestDataInnerFromJSON(json: any): ModDataUpdateEntryRequestDataInner {
    return ModDataUpdateEntryRequestDataInnerFromJSONTyped(json, false);
}

export function ModDataUpdateEntryRequestDataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataUpdateEntryRequestDataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Fieldid': json['fieldid'] == null ? undefined : json['fieldid'],
        'Subfield': json['subfield'] == null ? undefined : json['subfield'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModDataUpdateEntryRequestDataInnerToJSON(value?: ModDataUpdateEntryRequestDataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'fieldid': value['Fieldid'],
        'subfield': value['Subfield'],
        'value': value['Value'],
    };
}

