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
import { ModGlossaryGetEntriesByAuthorRequestOptions } from './mod-glossary-get-entries-by-author-request-options';


export interface ModGlossaryGetEntriesByTermRequest { 
    /**
     * Start returning records from here
     */
    From?: number;
    /**
     * Glossary entry ID
     */
    Id: number;
    /**
     * Number of records to return
     */
    Limit?: number;
    Options?: ModGlossaryGetEntriesByAuthorRequestOptions;
    /**
     * The entry concept, or alias
     */
    Term: string;
}

