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
import { ModGlossaryUpdateEntryRequestOptionsInner } from './mod-glossary-update-entry-request-options-inner';


export interface ModGlossaryUpdateEntryRequest { 
    /**
     * Glossary concept
     */
    Concept: string;
    /**
     * Glossary concept definition
     */
    Definition: string;
    /**
     * definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Definitionformat: number;
    /**
     * Glossary entry id to update
     */
    Entryid: number;
    Options?: Array<ModGlossaryUpdateEntryRequestOptionsInner>;
}

