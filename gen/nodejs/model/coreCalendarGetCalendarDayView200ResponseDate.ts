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
    'Hours': number = null;
    /**
    * mday
    */
    'Mday': number = null;
    /**
    * minutes
    */
    'Minutes': number = null;
    /**
    * mon
    */
    'Mon': number = null;
    /**
    * month
    */
    'Month': string = 'null';
    /**
    * seconds
    */
    'Seconds': number = null;
    /**
    * timestamp
    */
    'Timestamp': number = null;
    /**
    * wday
    */
    'Wday': number = null;
    /**
    * weekday
    */
    'Weekday': string = 'null';
    /**
    * yday
    */
    'Yday': number = null;
    /**
    * year
    */
    'Year': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Hours",
            "baseName": "hours",
            "type": "number"
        },
        {
            "name": "Mday",
            "baseName": "mday",
            "type": "number"
        },
        {
            "name": "Minutes",
            "baseName": "minutes",
            "type": "number"
        },
        {
            "name": "Mon",
            "baseName": "mon",
            "type": "number"
        },
        {
            "name": "Month",
            "baseName": "month",
            "type": "string"
        },
        {
            "name": "Seconds",
            "baseName": "seconds",
            "type": "number"
        },
        {
            "name": "Timestamp",
            "baseName": "timestamp",
            "type": "number"
        },
        {
            "name": "Wday",
            "baseName": "wday",
            "type": "number"
        },
        {
            "name": "Weekday",
            "baseName": "weekday",
            "type": "string"
        },
        {
            "name": "Yday",
            "baseName": "yday",
            "type": "number"
        },
        {
            "name": "Year",
            "baseName": "year",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarDayView200ResponseDate.attributeTypeMap;
    }
}

