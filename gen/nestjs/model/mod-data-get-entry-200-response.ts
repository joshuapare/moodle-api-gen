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
import { ModDataGetEntry200ResponseEntry } from './mod-data-get-entry200-response-entry';
import { ModDataGetEntry200ResponseRatinginfo } from './mod-data-get-entry200-response-ratinginfo';
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';


export interface ModDataGetEntry200Response { 
    Entry: ModDataGetEntry200ResponseEntry;
    /**
     * The entry as is rendered in the site.
     */
    Entryviewcontents?: string;
    Ratinginfo?: ModDataGetEntry200ResponseRatinginfo;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

