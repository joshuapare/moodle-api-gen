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
import { ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner } from './mod-h5pactivity-get-results200-response-attempts-inner-results-inner-options-inner';


/**
 * A single result statement tracking information
 */
export interface ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner { 
    /**
     * Label used for user answers
     */
    Answerlabel?: string;
    /**
     * ID of the H5P attempt
     */
    Attemptid?: number;
    /**
     * Result completion
     */
    Completion?: number;
    /**
     * Result extra content
     */
    Content?: string;
    /**
     * Label used for correct answers
     */
    Correctlabel?: string;
    /**
     * Result description
     */
    Description?: string;
    /**
     * Result duration in seconds
     */
    Duration?: number;
    /**
     * ID of the context
     */
    Id?: number;
    /**
     * Interaction type
     */
    Interactiontype?: string;
    /**
     * Result max score
     */
    Maxscore?: number;
    Options?: Array<ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner>;
    /**
     * Label used for result options
     */
    Optionslabel?: string;
    /**
     * Result score value
     */
    Rawscore?: number;
    /**
     * Subcontent identifier
     */
    Subcontent?: string;
    /**
     * Result success
     */
    Success?: number;
    /**
     * Result creation
     */
    Timecreated?: number;
    /**
     * If the result has valid track information
     */
    Track?: boolean;
}
