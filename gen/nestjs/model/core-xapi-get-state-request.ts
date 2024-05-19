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


export interface CoreXapiGetStateRequest { 
    /**
     * xAPI activity ID IRI
     */
    ActivityId: string;
    /**
     * The xAPI agent json
     */
    Agent: string;
    /**
     * Component name
     */
    Component: string;
    /**
     * The xAPI registration UUID
     */
    Registration?: string;
    /**
     * The xAPI state ID
     */
    StateId: string;
}

