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
 * @interface EnrolGuestGetInstanceInfo200ResponseInstanceinfo
 */
export interface EnrolGuestGetInstanceInfo200ResponseInstanceinfo {
    /**
     * Id of course
     * @type {number}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    courseid: number;
    /**
     * Id of course enrolment instance
     * @type {number}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    id: number;
    /**
     * Name of enrolment plugin
     * @type {string}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    name: string;
    /**
     * Is a password required?
     * @type {boolean}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    passwordrequired: boolean;
    /**
     * Is the enrolment enabled?
     * @type {boolean}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    status: boolean;
    /**
     * Type of enrolment plugin
     * @type {string}
     * @memberof EnrolGuestGetInstanceInfo200ResponseInstanceinfo
     */
    type: string;
}

/**
 * Check if a given object implements the EnrolGuestGetInstanceInfo200ResponseInstanceinfo interface.
 */
export function instanceOfEnrolGuestGetInstanceInfo200ResponseInstanceinfo(value: object): boolean {
    if (!('courseid' in value)) return false;
    if (!('id' in value)) return false;
    if (!('name' in value)) return false;
    if (!('passwordrequired' in value)) return false;
    if (!('status' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSON(json: any): EnrolGuestGetInstanceInfo200ResponseInstanceinfo {
    return EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSONTyped(json, false);
}

export function EnrolGuestGetInstanceInfo200ResponseInstanceinfoFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolGuestGetInstanceInfo200ResponseInstanceinfo {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'],
        'id': json['id'],
        'name': json['name'],
        'passwordrequired': json['passwordrequired'],
        'status': json['status'],
        'type': json['type'],
    };
}

export function EnrolGuestGetInstanceInfo200ResponseInstanceinfoToJSON(value?: EnrolGuestGetInstanceInfo200ResponseInstanceinfo | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
        'id': value['id'],
        'name': value['name'],
        'passwordrequired': value['passwordrequired'],
        'status': value['status'],
        'type': value['type'],
    };
}
