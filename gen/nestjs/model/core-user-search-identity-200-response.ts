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
import { CoreUserSearchIdentity200ResponseListInner } from './core-user-search-identity200-response-list-inner';


export interface CoreUserSearchIdentity200Response { 
    List: Array<CoreUserSearchIdentity200ResponseListInner>;
    /**
     * Configured maximum users per page.
     */
    Maxusersperpage: number;
    /**
     * Were there more records than maxusersperpage found?
     */
    Overflow: boolean;
}
