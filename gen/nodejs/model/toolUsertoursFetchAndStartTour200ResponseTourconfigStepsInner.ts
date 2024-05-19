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

export class ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner {
    /**
    * Whether a backdrop should be used
    */
    'backdrop'?: boolean = null;
    /**
    * Step Content
    */
    'content'?: string = 'null';
    /**
    * Delay before showing the step (ms)
    */
    'delay'?: number = null;
    /**
    * Step Target
    */
    'element'?: string = 'null';
    /**
    * Whether to display the step even if it could not be found
    */
    'orphan'?: boolean = null;
    /**
    * Step Placement
    */
    'placement'?: string = 'null';
    /**
    * Whether to move to the next step when the target element is clicked
    */
    'reflex'?: boolean = null;
    /**
    * The actual ID of the step
    */
    'stepid'?: number = null;
    /**
    * Step Title
    */
    'title'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "backdrop",
            "baseName": "backdrop",
            "type": "boolean"
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "delay",
            "baseName": "delay",
            "type": "number"
        },
        {
            "name": "element",
            "baseName": "element",
            "type": "string"
        },
        {
            "name": "orphan",
            "baseName": "orphan",
            "type": "boolean"
        },
        {
            "name": "placement",
            "baseName": "placement",
            "type": "string"
        },
        {
            "name": "reflex",
            "baseName": "reflex",
            "type": "boolean"
        },
        {
            "name": "stepid",
            "baseName": "stepid",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.attributeTypeMap;
    }
}

