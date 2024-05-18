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


export interface CoreMessageGetConversationsRequest { 
    /**
     * Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null)
     */
    Favourites?: boolean;
    /**
     * The offset to start at
     */
    Limitfrom?: number;
    /**
     * Limit number of conversations to this
     */
    Limitnum?: number;
    /**
     * Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested.
     */
    Mergeself?: boolean;
    /**
     * Filter by type
     */
    Type?: number;
    /**
     * The id of the user who we are viewing conversations for
     */
    Userid: number;
}
