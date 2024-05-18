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
import { ModForumGetDiscussionPosts200ResponseRatinginfo } from './modForumGetDiscussionPosts200ResponseRatinginfo';
import { ModGlossaryGetEntriesByAuthor200ResponseEntriesInner } from './modGlossaryGetEntriesByAuthor200ResponseEntriesInner';

export class ModGlossaryGetEntriesByAuthor200Response {
    /**
    * The total number of records matching the request.
    */
    'count': number = null;
    'entries': Array<ModGlossaryGetEntriesByAuthor200ResponseEntriesInner>;
    'ratinginfo'?: ModForumGetDiscussionPosts200ResponseRatinginfo;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "count",
            "baseName": "count",
            "type": "number"
        },
        {
            "name": "entries",
            "baseName": "entries",
            "type": "Array<ModGlossaryGetEntriesByAuthor200ResponseEntriesInner>"
        },
        {
            "name": "ratinginfo",
            "baseName": "ratinginfo",
            "type": "ModForumGetDiscussionPosts200ResponseRatinginfo"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModGlossaryGetEntriesByAuthor200Response.attributeTypeMap;
    }
}
