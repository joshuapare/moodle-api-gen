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

export class ModWorkshopGetSubmissionsRequest {
    /**
    * Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group.
    */
    'Groupid'?: number = 0;
    /**
    * The page of records to return.
    */
    'Page'?: number = 0;
    /**
    * The number of records to return per page.
    */
    'Perpage'?: number = 0;
    /**
    * Get submissions done by this user. Use 0 or empty for the current user
    */
    'Userid'?: number = 0;
    /**
    * Workshop instance id.
    */
    'Workshopid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "Page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "Perpage",
            "baseName": "perpage",
            "type": "number"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "Workshopid",
            "baseName": "workshopid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModWorkshopGetSubmissionsRequest.attributeTypeMap;
    }
}

