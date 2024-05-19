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

/**
* event
*/
export class CoreCalendarGetCalendarEvents200ResponseEventsInner {
    /**
    * Category id (only for category events).
    */
    'categoryid'?: number = null;
    /**
    * course id
    */
    'courseid'?: number;
    /**
    * Description
    */
    'description'?: string;
    /**
    * Event type
    */
    'eventtype'?: string;
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'format'?: number;
    /**
    * group id
    */
    'groupid'?: number;
    /**
    * event id
    */
    'id'?: number;
    /**
    * instance id
    */
    'instance'?: number;
    /**
    * module name
    */
    'modulename'?: string;
    /**
    * event name
    */
    'name'?: string;
    /**
    * repeat id
    */
    'repeatid'?: number;
    /**
    * sequence
    */
    'sequence'?: number;
    /**
    * Subscription id
    */
    'subscriptionid'?: number;
    /**
    * time duration
    */
    'timeduration'?: number;
    /**
    * time modified
    */
    'timemodified'?: number;
    /**
    * timestart
    */
    'timestart'?: number;
    /**
    * user id
    */
    'userid'?: number;
    /**
    * unique id of ical events
    */
    'uuid'?: string = 'null';
    /**
    * visible
    */
    'visible'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "eventtype",
            "baseName": "eventtype",
            "type": "string"
        },
        {
            "name": "format",
            "baseName": "format",
            "type": "number"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "instance",
            "baseName": "instance",
            "type": "number"
        },
        {
            "name": "modulename",
            "baseName": "modulename",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "repeatid",
            "baseName": "repeatid",
            "type": "number"
        },
        {
            "name": "sequence",
            "baseName": "sequence",
            "type": "number"
        },
        {
            "name": "subscriptionid",
            "baseName": "subscriptionid",
            "type": "number"
        },
        {
            "name": "timeduration",
            "baseName": "timeduration",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "uuid",
            "baseName": "uuid",
            "type": "string"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarEvents200ResponseEventsInner.attributeTypeMap;
    }
}

