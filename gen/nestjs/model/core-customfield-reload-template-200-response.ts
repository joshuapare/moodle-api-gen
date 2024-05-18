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
import { CoreCustomfieldReloadTemplate200ResponseCategoriesInner } from './core-customfield-reload-template200-response-categories-inner';


export interface CoreCustomfieldReloadTemplate200Response { 
    /**
     * area
     */
    Area: string;
    Categories: Array<CoreCustomfieldReloadTemplate200ResponseCategoriesInner>;
    /**
     * component
     */
    Component: string;
    /**
     * itemid
     */
    Itemid: number;
    /**
     * view has categories
     */
    Usescategories: boolean;
}
