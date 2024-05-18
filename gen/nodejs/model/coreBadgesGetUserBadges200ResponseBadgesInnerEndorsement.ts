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

import { RequestFile } from './models';

export class CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement {
    /**
    * Badge id
    */
    'badgeid': number;
    /**
    * Claim comment
    */
    'claimcomment': string;
    /**
    * Claim URL
    */
    'claimid': string;
    /**
    * Date issued
    */
    'dateissued': number = 0;
    /**
    * Endorsement id
    */
    'id': number;
    /**
    * Endorsement issuer email
    */
    'issueremail': string;
    /**
    * Endorsement issuer name
    */
    'issuername': string;
    /**
    * Endorsement issuer URL
    */
    'issuerurl': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "badgeid",
            "baseName": "badgeid",
            "type": "number"
        },
        {
            "name": "claimcomment",
            "baseName": "claimcomment",
            "type": "string"
        },
        {
            "name": "claimid",
            "baseName": "claimid",
            "type": "string"
        },
        {
            "name": "dateissued",
            "baseName": "dateissued",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "issueremail",
            "baseName": "issueremail",
            "type": "string"
        },
        {
            "name": "issuername",
            "baseName": "issuername",
            "type": "string"
        },
        {
            "name": "issuerurl",
            "baseName": "issuerurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.attributeTypeMap;
    }
}

