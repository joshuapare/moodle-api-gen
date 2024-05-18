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


export interface ToolLpDataForCompetencySummaryRequest { 
    /**
     * The competency id
     */
    Competencyid: number;
    /**
     * Include or not competency courses
     */
    Includecourses?: boolean;
    /**
     * Include or not related competencies
     */
    Includerelated?: boolean;
}

