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

export class ModDataApproveEntryRequest {
    /**
    * Whether to approve (true) or unapprove the entry.
    */
    'approve'?: boolean = true;
    /**
    * Record entry id.
    */
    'entryid': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "approve",
            "baseName": "approve",
            "type": "boolean"
        },
        {
            "name": "entryid",
            "baseName": "entryid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModDataApproveEntryRequest.attributeTypeMap;
    }
}
