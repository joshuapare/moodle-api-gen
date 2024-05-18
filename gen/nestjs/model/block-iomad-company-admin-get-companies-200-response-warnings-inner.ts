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


/**
 * warning
 */
export interface BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner { 
    /**
     * always set to \'key\'
     */
    Item?: string;
    /**
     * faulty key name
     */
    Itemid?: number;
    /**
     * untranslated english message to explain the warning
     */
    Message?: string;
    /**
     * the warning code can be used by the client app to implement specific behaviour
     */
    Warningcode?: string;
}

