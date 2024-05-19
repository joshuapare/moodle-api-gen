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

export class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
    /**
    * alttext
    */
    'Alttext': string;
    /**
    * component
    */
    'Component': string;
    /**
    * iconclass
    */
    'Iconclass': string;
    /**
    * iconurl
    */
    'Iconurl': string;
    /**
    * key
    */
    'Key': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Alttext",
            "baseName": "alttext",
            "type": "string"
        },
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Iconclass",
            "baseName": "iconclass",
            "type": "string"
        },
        {
            "name": "Iconurl",
            "baseName": "iconurl",
            "type": "string"
        },
        {
            "name": "Key",
            "baseName": "key",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.attributeTypeMap;
    }
}

