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
import { CoreCalendarGetActionEventsByCourse200ResponseEventsInner } from './core-calendar-get-action-events-by-course200-response-events-inner';


export interface CoreCalendarGetActionEventsByCourse200Response { 
    Events: Array<CoreCalendarGetActionEventsByCourse200ResponseEventsInner>;
    /**
     * firstid
     */
    Firstid: number;
    /**
     * lastid
     */
    Lastid: number;
}
