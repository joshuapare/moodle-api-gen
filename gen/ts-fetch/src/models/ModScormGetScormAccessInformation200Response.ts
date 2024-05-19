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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModScormGetScormAccessInformation200Response
 */
export interface ModScormGetScormAccessInformation200Response {
    /**
     * Whether the user has the capability mod/scorm:addinstance allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Canaddinstance?: boolean;
    /**
     * Whether the user has the capability mod/scorm:deleteownresponses allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Candeleteownresponses?: boolean;
    /**
     * Whether the user has the capability mod/scorm:deleteresponses allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Candeleteresponses?: boolean;
    /**
     * Whether the user has the capability mod/scorm:savetrack allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Cansavetrack?: boolean;
    /**
     * Whether the user has the capability mod/scorm:skipview allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Canskipview?: boolean;
    /**
     * Whether the user has the capability mod/scorm:viewreport allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Canviewreport?: boolean;
    /**
     * Whether the user has the capability mod/scorm:viewscores allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Canviewscores?: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModScormGetScormAccessInformation200Response interface.
 */
export function instanceOfModScormGetScormAccessInformation200Response(value: object): boolean {
    return true;
}

export function ModScormGetScormAccessInformation200ResponseFromJSON(json: any): ModScormGetScormAccessInformation200Response {
    return ModScormGetScormAccessInformation200ResponseFromJSONTyped(json, false);
}

export function ModScormGetScormAccessInformation200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormAccessInformation200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Canaddinstance': json['canaddinstance'] == null ? undefined : json['canaddinstance'],
        'Candeleteownresponses': json['candeleteownresponses'] == null ? undefined : json['candeleteownresponses'],
        'Candeleteresponses': json['candeleteresponses'] == null ? undefined : json['candeleteresponses'],
        'Cansavetrack': json['cansavetrack'] == null ? undefined : json['cansavetrack'],
        'Canskipview': json['canskipview'] == null ? undefined : json['canskipview'],
        'Canviewreport': json['canviewreport'] == null ? undefined : json['canviewreport'],
        'Canviewscores': json['canviewscores'] == null ? undefined : json['canviewscores'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModScormGetScormAccessInformation200ResponseToJSON(value?: ModScormGetScormAccessInformation200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canaddinstance': value['Canaddinstance'],
        'candeleteownresponses': value['Candeleteownresponses'],
        'candeleteresponses': value['Candeleteresponses'],
        'cansavetrack': value['Cansavetrack'],
        'canskipview': value['Canskipview'],
        'canviewreport': value['Canviewreport'],
        'canviewscores': value['Canviewscores'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
