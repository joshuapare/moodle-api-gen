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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { ModDataSearchEntries200ResponseEntriesInner } from './modDataSearchEntries200ResponseEntriesInner';

export class ModDataSearchEntries200Response {
    'entries': Array<ModDataSearchEntries200ResponseEntriesInner>;
    /**
    * The list view contents as is rendered in the site.
    */
    'listviewcontents'?: string;
    /**
    * Total count of records that the user could see in the database                     (if all the search criterias were removed).
    */
    'maxcount'?: number = null;
    /**
    * Total count of records returned by the search.
    */
    'totalcount': number = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "entries",
            "baseName": "entries",
            "type": "Array<ModDataSearchEntries200ResponseEntriesInner>"
        },
        {
            "name": "listviewcontents",
            "baseName": "listviewcontents",
            "type": "string"
        },
        {
            "name": "maxcount",
            "baseName": "maxcount",
            "type": "number"
        },
        {
            "name": "totalcount",
            "baseName": "totalcount",
            "type": "number"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModDataSearchEntries200Response.attributeTypeMap;
    }
}
