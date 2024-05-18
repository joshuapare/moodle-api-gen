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


export interface CoreCompetencyReadUserEvidence200ResponseCompetenciesInner { 
    /**
     * competencyframeworkid
     */
    Competencyframeworkid?: number;
    /**
     * description
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Descriptionformat?: number;
    /**
     * id
     */
    Id?: number;
    /**
     * idnumber
     */
    Idnumber?: string;
    /**
     * parentid
     */
    Parentid?: number;
    /**
     * path
     */
    Path?: string;
    /**
     * ruleconfig
     */
    Ruleconfig?: string;
    /**
     * ruleoutcome
     */
    Ruleoutcome?: number;
    /**
     * ruletype
     */
    Ruletype?: string;
    /**
     * scaleconfiguration
     */
    Scaleconfiguration?: string;
    /**
     * scaleid
     */
    Scaleid?: number;
    /**
     * shortname
     */
    Shortname?: string;
    /**
     * sortorder
     */
    Sortorder?: number;
    /**
     * timecreated
     */
    Timecreated?: number;
    /**
     * timemodified
     */
    Timemodified?: number;
    /**
     * usermodified
     */
    Usermodified?: number;
}

