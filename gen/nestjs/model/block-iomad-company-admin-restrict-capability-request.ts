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


export interface BlockIomadCompanyAdminRestrictCapabilityRequest { 
    /**
     * Set capability?
     */
    Allow: boolean;
    /**
     * The capability
     */
    Capability: string;
    /**
     * Company ID. Ignored if templateid is non-zero
     */
    Companyid: number;
    /**
     * Role ID
     */
    Roleid: number;
    /**
     * Template ID. Set to 0 if company restriction
     */
    Templateid?: number;
}
