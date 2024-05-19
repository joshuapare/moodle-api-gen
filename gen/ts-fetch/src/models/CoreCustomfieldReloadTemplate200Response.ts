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
import type { CoreCustomfieldReloadTemplate200ResponseCategoriesInner } from './CoreCustomfieldReloadTemplate200ResponseCategoriesInner';
import {
    CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFromJSON,
    CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFromJSONTyped,
    CoreCustomfieldReloadTemplate200ResponseCategoriesInnerToJSON,
} from './CoreCustomfieldReloadTemplate200ResponseCategoriesInner';

/**
 * 
 * @export
 * @interface CoreCustomfieldReloadTemplate200Response
 */
export interface CoreCustomfieldReloadTemplate200Response {
    /**
     * area
     * @type {string}
     * @memberof CoreCustomfieldReloadTemplate200Response
     */
    Area: string;
    /**
     * 
     * @type {Array<CoreCustomfieldReloadTemplate200ResponseCategoriesInner>}
     * @memberof CoreCustomfieldReloadTemplate200Response
     */
    Categories: Array<CoreCustomfieldReloadTemplate200ResponseCategoriesInner>;
    /**
     * component
     * @type {string}
     * @memberof CoreCustomfieldReloadTemplate200Response
     */
    Component: string;
    /**
     * itemid
     * @type {number}
     * @memberof CoreCustomfieldReloadTemplate200Response
     */
    Itemid: number;
    /**
     * view has categories
     * @type {boolean}
     * @memberof CoreCustomfieldReloadTemplate200Response
     */
    Usescategories: boolean;
}

/**
 * Check if a given object implements the CoreCustomfieldReloadTemplate200Response interface.
 */
export function instanceOfCoreCustomfieldReloadTemplate200Response(value: object): boolean {
    if (!('Area' in value)) return false;
    if (!('Categories' in value)) return false;
    if (!('Component' in value)) return false;
    if (!('Itemid' in value)) return false;
    if (!('Usescategories' in value)) return false;
    return true;
}

export function CoreCustomfieldReloadTemplate200ResponseFromJSON(json: any): CoreCustomfieldReloadTemplate200Response {
    return CoreCustomfieldReloadTemplate200ResponseFromJSONTyped(json, false);
}

export function CoreCustomfieldReloadTemplate200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCustomfieldReloadTemplate200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Area': json['area'],
        'Categories': ((json['categories'] as Array<any>).map(CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFromJSON)),
        'Component': json['component'],
        'Itemid': json['itemid'],
        'Usescategories': json['usescategories'],
    };
}

export function CoreCustomfieldReloadTemplate200ResponseToJSON(value?: CoreCustomfieldReloadTemplate200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'area': value['Area'],
        'categories': ((value['Categories'] as Array<any>).map(CoreCustomfieldReloadTemplate200ResponseCategoriesInnerToJSON)),
        'component': value['Component'],
        'itemid': value['Itemid'],
        'usescategories': value['Usescategories'],
    };
}
