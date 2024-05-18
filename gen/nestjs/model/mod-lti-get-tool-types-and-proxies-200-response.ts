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
import { ModLtiGetToolTypesAndProxies200ResponseTypesInner } from './mod-lti-get-tool-types-and-proxies200-response-types-inner';
import { ModLtiGetToolTypesAndProxies200ResponseProxiesInner } from './mod-lti-get-tool-types-and-proxies200-response-proxies-inner';


export interface ModLtiGetToolTypesAndProxies200Response { 
    /**
     * Limit of how many tool types to show
     */
    Limit?: number;
    /**
     * Offset of tool types
     */
    Offset?: number;
    Proxies: Array<ModLtiGetToolTypesAndProxies200ResponseProxiesInner>;
    Types: Array<ModLtiGetToolTypesAndProxies200ResponseTypesInner>;
}

