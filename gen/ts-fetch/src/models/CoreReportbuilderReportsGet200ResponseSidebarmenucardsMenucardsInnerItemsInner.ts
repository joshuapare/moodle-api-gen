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
 * @interface CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
 */
export interface CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner {
    /**
     * action
     * @type {string}
     * @memberof CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
     */
    Action?: string;
    /**
     * disabled
     * @type {boolean}
     * @memberof CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
     */
    Disabled?: boolean;
    /**
     * identifier
     * @type {string}
     * @memberof CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
     */
    Identifier?: string;
    /**
     * name
     * @type {string}
     * @memberof CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
     */
    Name?: string;
    /**
     * title
     * @type {string}
     * @memberof CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
     */
    Title?: string;
}

/**
 * Check if a given object implements the CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner interface.
 */
export function instanceOfCoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner(value: object): boolean {
    return true;
}

export function CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInnerFromJSON(json: any): CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner {
    return CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInnerFromJSONTyped(json, false);
}

export function CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Action': json['action'] == null ? undefined : json['action'],
        'Disabled': json['disabled'] == null ? undefined : json['disabled'],
        'Identifier': json['identifier'] == null ? undefined : json['identifier'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Title': json['title'] == null ? undefined : json['title'],
    };
}

export function CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInnerToJSON(value?: CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'action': value['Action'],
        'disabled': value['Disabled'],
        'identifier': value['Identifier'],
        'name': value['Name'],
        'title': value['Title'],
    };
}

