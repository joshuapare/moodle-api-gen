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

export class CoreCalendarGetCalendarDayView200ResponseDate {
    /**
    * hours
    */
    'hours': number = null;
    /**
    * mday
    */
    'mday': number = null;
    /**
    * minutes
    */
    'minutes': number = null;
    /**
    * mon
    */
    'mon': number = null;
    /**
    * month
    */
    'month': string = 'null';
    /**
    * seconds
    */
    'seconds': number = null;
    /**
    * timestamp
    */
    'timestamp': number = null;
    /**
    * wday
    */
    'wday': number = null;
    /**
    * weekday
    */
    'weekday': string = 'null';
    /**
    * yday
    */
    'yday': number = null;
    /**
    * year
    */
    'year': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "hours",
            "baseName": "hours",
            "type": "number"
        },
        {
            "name": "mday",
            "baseName": "mday",
            "type": "number"
        },
        {
            "name": "minutes",
            "baseName": "minutes",
            "type": "number"
        },
        {
            "name": "mon",
            "baseName": "mon",
            "type": "number"
        },
        {
            "name": "month",
            "baseName": "month",
            "type": "string"
        },
        {
            "name": "seconds",
            "baseName": "seconds",
            "type": "number"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "number"
        },
        {
            "name": "wday",
            "baseName": "wday",
            "type": "number"
        },
        {
            "name": "weekday",
            "baseName": "weekday",
            "type": "string"
        },
        {
            "name": "yday",
            "baseName": "yday",
            "type": "number"
        },
        {
            "name": "year",
            "baseName": "year",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarDayView200ResponseDate.attributeTypeMap;
    }
}
