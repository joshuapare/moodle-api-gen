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
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner } from './core-grading-get-definitions200-response-areas-inner-definitions-inner';


export interface CoreGradingGetDefinitions200ResponseAreasInner { 
    /**
     * active method
     */
    Activemethod?: string;
    /**
     * area name
     */
    Areaname?: string;
    /**
     * course module id
     */
    Cmid?: number;
    /**
     * component name
     */
    Component?: string;
    /**
     * context id
     */
    Contextid?: number;
    Definitions?: Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner>;
}
