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

export class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement {
    /**
    * Badge id
    */
    'Badgeid': number;
    /**
    * Claim comment
    */
    'Claimcomment': string = 'null';
    /**
    * Claim URL
    */
    'Claimid': string = 'null';
    /**
    * Date issued
    */
    'Dateissued': number = 0;
    /**
    * Endorsement id
    */
    'Id': number = null;
    /**
    * Endorsement issuer email
    */
    'Issueremail': string = 'null';
    /**
    * Endorsement issuer name
    */
    'Issuername': string = 'null';
    /**
    * Endorsement issuer URL
    */
    'Issuerurl': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Badgeid",
            "baseName": "badgeid",
            "type": "number"
        },
        {
            "name": "Claimcomment",
            "baseName": "claimcomment",
            "type": "string"
        },
        {
            "name": "Claimid",
            "baseName": "claimid",
            "type": "string"
        },
        {
            "name": "Dateissued",
            "baseName": "dateissued",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Issueremail",
            "baseName": "issueremail",
            "type": "string"
        },
        {
            "name": "Issuername",
            "baseName": "issuername",
            "type": "string"
        },
        {
            "name": "Issuerurl",
            "baseName": "issuerurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.attributeTypeMap;
    }
}

