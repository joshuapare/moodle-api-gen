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

import { RequestFile } from './models';

export class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription {
    /**
    * displayeventsource
    */
    'Displayeventsource': boolean;
    /**
    * subscriptionname
    */
    'Subscriptionname'?: string;
    /**
    * subscriptionurl
    */
    'Subscriptionurl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Displayeventsource",
            "baseName": "displayeventsource",
            "type": "boolean"
        },
        {
            "name": "Subscriptionname",
            "baseName": "subscriptionname",
            "type": "string"
        },
        {
            "name": "Subscriptionurl",
            "baseName": "subscriptionurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.attributeTypeMap;
    }
}

