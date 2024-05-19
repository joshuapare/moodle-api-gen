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
 * @interface EnrolLicenseGetInstanceInfo200Response
 */
export interface EnrolLicenseGetInstanceInfo200Response {
    /**
     * id of course
     * @type {number}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Courseid: number;
    /**
     * password required for enrolment
     * @type {string}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Enrolpassword?: string;
    /**
     * id of course enrolment instance
     * @type {number}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Id: number;
    /**
     * name of enrolment plugin
     * @type {string}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Name: string;
    /**
     * status of enrolment plugin
     * @type {string}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Status: string;
    /**
     * type of enrolment plugin
     * @type {string}
     * @memberof EnrolLicenseGetInstanceInfo200Response
     */
    Type: string;
}

/**
 * Check if a given object implements the EnrolLicenseGetInstanceInfo200Response interface.
 */
export function instanceOfEnrolLicenseGetInstanceInfo200Response(value: object): boolean {
    if (!('Courseid' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Status' in value)) return false;
    if (!('Type' in value)) return false;
    return true;
}

export function EnrolLicenseGetInstanceInfo200ResponseFromJSON(json: any): EnrolLicenseGetInstanceInfo200Response {
    return EnrolLicenseGetInstanceInfo200ResponseFromJSONTyped(json, false);
}

export function EnrolLicenseGetInstanceInfo200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolLicenseGetInstanceInfo200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Enrolpassword': json['enrolpassword'] == null ? undefined : json['enrolpassword'],
        'Id': json['id'],
        'Name': json['name'],
        'Status': json['status'],
        'Type': json['type'],
    };
}

export function EnrolLicenseGetInstanceInfo200ResponseToJSON(value?: EnrolLicenseGetInstanceInfo200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'enrolpassword': value['Enrolpassword'],
        'id': value['Id'],
        'name': value['Name'],
        'status': value['Status'],
        'type': value['Type'],
    };
}
