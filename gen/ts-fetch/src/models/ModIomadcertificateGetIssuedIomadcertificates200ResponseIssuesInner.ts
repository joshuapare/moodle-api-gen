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
 * @interface ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
 */
export interface ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner {
    /**
     * Certificate code
     * @type {string}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Code?: string;
    /**
     * Time created
     * @type {string}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Filename?: string;
    /**
     * Time created
     * @type {string}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Fileurl?: string;
    /**
     * Certificate grade
     * @type {string}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Grade?: string;
    /**
     * Issue id
     * @type {number}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Id?: number;
    /**
     * Certificate id
     * @type {number}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Iomadcertificateid?: number;
    /**
     * mime type
     * @type {string}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Mimetype?: string;
    /**
     * Time created
     * @type {number}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Timecreated?: number;
    /**
     * User id
     * @type {number}
     * @memberof ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner interface.
 */
export function instanceOfModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner(value: object): boolean {
    return true;
}

export function ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInnerFromJSON(json: any): ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner {
    return ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInnerFromJSONTyped(json, false);
}

export function ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Code': json['code'] == null ? undefined : json['code'],
        'Filename': json['filename'] == null ? undefined : json['filename'],
        'Fileurl': json['fileurl'] == null ? undefined : json['fileurl'],
        'Grade': json['grade'] == null ? undefined : json['grade'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Iomadcertificateid': json['iomadcertificateid'] == null ? undefined : json['iomadcertificateid'],
        'Mimetype': json['mimetype'] == null ? undefined : json['mimetype'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInnerToJSON(value?: ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['Code'],
        'filename': value['Filename'],
        'fileurl': value['Fileurl'],
        'grade': value['Grade'],
        'id': value['Id'],
        'iomadcertificateid': value['Iomadcertificateid'],
        'mimetype': value['Mimetype'],
        'timecreated': value['Timecreated'],
        'userid': value['Userid'],
    };
}
