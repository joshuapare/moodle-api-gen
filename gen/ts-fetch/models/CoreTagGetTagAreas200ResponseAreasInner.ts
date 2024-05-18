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
 * @interface CoreTagGetTagAreas200ResponseAreasInner
 */
export interface CoreTagGetTagAreas200ResponseAreasInner {
    /**
     * Component callback for processing tags.
     * @type {string}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    callback?: string;
    /**
     * Component callback file.
     * @type {string}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    callbackfile?: string;
    /**
     * Component the area is related to.
     * @type {string}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    component?: string;
    /**
     * Whether this area is enabled.
     * @type {boolean}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    enabled?: boolean;
    /**
     * Area id.
     * @type {number}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    id?: number;
    /**
     * Type of item in the component.
     * @type {string}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    itemtype?: string;
    /**
     * Whether the area is locked.
     * @type {boolean}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    locked?: boolean;
    /**
     * Whether the tag area allows tag instances to be created in multiple contexts. 
     * @type {boolean}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    multiplecontexts?: boolean;
    /**
     * Return whether to display only standard, only non-standard or both tags.
     * @type {number}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    showstandard?: number;
    /**
     * The tag collection this are belongs to.
     * @type {number}
     * @memberof CoreTagGetTagAreas200ResponseAreasInner
     */
    tagcollid?: number;
}

/**
 * Check if a given object implements the CoreTagGetTagAreas200ResponseAreasInner interface.
 */
export function instanceOfCoreTagGetTagAreas200ResponseAreasInner(value: object): boolean {
    return true;
}

export function CoreTagGetTagAreas200ResponseAreasInnerFromJSON(json: any): CoreTagGetTagAreas200ResponseAreasInner {
    return CoreTagGetTagAreas200ResponseAreasInnerFromJSONTyped(json, false);
}

export function CoreTagGetTagAreas200ResponseAreasInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTagAreas200ResponseAreasInner {
    if (json == null) {
        return json;
    }
    return {
        
        'callback': json['callback'] == null ? undefined : json['callback'],
        'callbackfile': json['callbackfile'] == null ? undefined : json['callbackfile'],
        'component': json['component'] == null ? undefined : json['component'],
        'enabled': json['enabled'] == null ? undefined : json['enabled'],
        'id': json['id'] == null ? undefined : json['id'],
        'itemtype': json['itemtype'] == null ? undefined : json['itemtype'],
        'locked': json['locked'] == null ? undefined : json['locked'],
        'multiplecontexts': json['multiplecontexts'] == null ? undefined : json['multiplecontexts'],
        'showstandard': json['showstandard'] == null ? undefined : json['showstandard'],
        'tagcollid': json['tagcollid'] == null ? undefined : json['tagcollid'],
    };
}

export function CoreTagGetTagAreas200ResponseAreasInnerToJSON(value?: CoreTagGetTagAreas200ResponseAreasInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'callback': value['callback'],
        'callbackfile': value['callbackfile'],
        'component': value['component'],
        'enabled': value['enabled'],
        'id': value['id'],
        'itemtype': value['itemtype'],
        'locked': value['locked'],
        'multiplecontexts': value['multiplecontexts'],
        'showstandard': value['showstandard'],
        'tagcollid': value['tagcollid'],
    };
}
