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
 * @interface ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
 */
export interface ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner {
    /**
     * allocated marker
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Allocatedmarker?: number;
    /**
     * extension due date
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Extensionduedate?: number;
    /**
     * user flag id
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Id?: number;
    /**
     * locked
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Locked?: number;
    /**
     * mailed
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Mailed?: number;
    /**
     * student id
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Userid?: number;
    /**
     * marking workflow state
     * @type {string}
     * @memberof ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
     */
    Workflowstate?: string;
}

/**
 * Check if a given object implements the ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner interface.
 */
export function instanceOfModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner(value: object): boolean {
    return true;
}

export function ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInnerFromJSON(json: any): ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner {
    return ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInnerFromJSONTyped(json, false);
}

export function ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Allocatedmarker': json['allocatedmarker'] == null ? undefined : json['allocatedmarker'],
        'Extensionduedate': json['extensionduedate'] == null ? undefined : json['extensionduedate'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Locked': json['locked'] == null ? undefined : json['locked'],
        'Mailed': json['mailed'] == null ? undefined : json['mailed'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Workflowstate': json['workflowstate'] == null ? undefined : json['workflowstate'],
    };
}

export function ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInnerToJSON(value?: ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allocatedmarker': value['Allocatedmarker'],
        'extensionduedate': value['Extensionduedate'],
        'id': value['Id'],
        'locked': value['Locked'],
        'mailed': value['Mailed'],
        'userid': value['Userid'],
        'workflowstate': value['Workflowstate'],
    };
}
