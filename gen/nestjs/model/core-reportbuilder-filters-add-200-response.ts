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
import { CoreReportbuilderFiltersAdd200ResponseActivefiltersInner } from './core-reportbuilder-filters-add200-response-activefilters-inner';
import { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner } from './core-reportbuilder-conditions-delete200-response-availableconditions-inner';


export interface CoreReportbuilderFiltersAdd200Response { 
    Activefilters: Array<CoreReportbuilderFiltersAdd200ResponseActivefiltersInner>;
    Availablefilters: Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>;
    /**
     * hasactivefilters
     */
    Hasactivefilters: boolean;
    /**
     * hasavailablefilters
     */
    Hasavailablefilters: boolean;
    /**
     * helpicon
     */
    Helpicon: string;
}
