/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
 */
export interface CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon {
    /**
     * alttext
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
     */
    Alttext: string;
    /**
     * component
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
     */
    Component: string;
    /**
     * iconclass
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
     */
    Iconclass: string;
    /**
     * iconurl
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
     */
    Iconurl: string;
    /**
     * key
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
     */
    Key: string;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon(value: object): boolean {
    if (!('Alttext' in value)) return false;
    if (!('Component' in value)) return false;
    if (!('Iconclass' in value)) return false;
    if (!('Iconurl' in value)) return false;
    if (!('Key' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIconFromJSON(json: any): CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon {
    return CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIconFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIconFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon {
    if (json == null) {
        return json;
    }
    return {
        
        'Alttext': json['alttext'],
        'Component': json['component'],
        'Iconclass': json['iconclass'],
        'Iconurl': json['iconurl'],
        'Key': json['key'],
    };
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIconToJSON(value?: CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'alttext': value['Alttext'],
        'component': value['Component'],
        'iconclass': value['Iconclass'],
        'iconurl': value['Iconurl'],
        'key': value['Key'],
    };
}

