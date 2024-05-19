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
import { ToolMobileGetContentRequestArgsInner } from './tool-mobile-get-content-request-args-inner';


export interface ToolMobileGetContentRequest { 
    Args?: Array<ToolMobileGetContentRequestArgsInner>;
    /**
     * Component where the class is e.g. mod_assign.
     */
    Component: string;
    /**
     * Method to execute in class \\$component\\output\\mobile.
     */
    Method: string;
}

