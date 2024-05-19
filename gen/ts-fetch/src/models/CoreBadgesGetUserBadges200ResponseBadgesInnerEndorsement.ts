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
 * @interface CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
 */
export interface CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement {
    /**
     * Badge id
     * @type {number}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Badgeid: number;
    /**
     * Claim comment
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Claimcomment: string;
    /**
     * Claim URL
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Claimid: string;
    /**
     * Date issued
     * @type {number}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Dateissued: number;
    /**
     * Endorsement id
     * @type {number}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Id: number;
    /**
     * Endorsement issuer email
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Issueremail: string;
    /**
     * Endorsement issuer name
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Issuername: string;
    /**
     * Endorsement issuer URL
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
     */
    Issuerurl: string;
}

/**
 * Check if a given object implements the CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement interface.
 */
export function instanceOfCoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement(value: object): boolean {
    if (!('Badgeid' in value)) return false;
    if (!('Claimcomment' in value)) return false;
    if (!('Claimid' in value)) return false;
    if (!('Dateissued' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Issueremail' in value)) return false;
    if (!('Issuername' in value)) return false;
    if (!('Issuerurl' in value)) return false;
    return true;
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsementFromJSON(json: any): CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement {
    return CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsementFromJSONTyped(json, false);
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsementFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement {
    if (json == null) {
        return json;
    }
    return {
        
        'Badgeid': json['badgeid'],
        'Claimcomment': json['claimcomment'],
        'Claimid': json['claimid'],
        'Dateissued': json['dateissued'],
        'Id': json['id'],
        'Issueremail': json['issueremail'],
        'Issuername': json['issuername'],
        'Issuerurl': json['issuerurl'],
    };
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsementToJSON(value?: CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'badgeid': value['Badgeid'],
        'claimcomment': value['Claimcomment'],
        'claimid': value['Claimid'],
        'dateissued': value['Dateissued'],
        'id': value['Id'],
        'issueremail': value['Issueremail'],
        'issuername': value['Issuername'],
        'issuerurl': value['Issuerurl'],
    };
}

