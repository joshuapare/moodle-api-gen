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
    canaddinstance?: boolean;
    /**
     * Whether the user has the capability mod/scorm:deleteownresponses allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    candeleteownresponses?: boolean;
    /**
     * Whether the user has the capability mod/scorm:deleteresponses allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    candeleteresponses?: boolean;
    /**
     * Whether the user has the capability mod/scorm:savetrack allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    cansavetrack?: boolean;
    /**
     * Whether the user has the capability mod/scorm:skipview allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    canskipview?: boolean;
    /**
     * Whether the user has the capability mod/scorm:viewreport allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    canviewreport?: boolean;
    /**
     * Whether the user has the capability mod/scorm:viewscores allowed.
     * @type {boolean}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    canviewscores?: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModScormGetScormAccessInformation200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
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
        
        'canaddinstance': json['canaddinstance'] == null ? undefined : json['canaddinstance'],
        'candeleteownresponses': json['candeleteownresponses'] == null ? undefined : json['candeleteownresponses'],
        'candeleteresponses': json['candeleteresponses'] == null ? undefined : json['candeleteresponses'],
        'cansavetrack': json['cansavetrack'] == null ? undefined : json['cansavetrack'],
        'canskipview': json['canskipview'] == null ? undefined : json['canskipview'],
        'canviewreport': json['canviewreport'] == null ? undefined : json['canviewreport'],
        'canviewscores': json['canviewscores'] == null ? undefined : json['canviewscores'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModScormGetScormAccessInformation200ResponseToJSON(value?: ModScormGetScormAccessInformation200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canaddinstance': value['canaddinstance'],
        'candeleteownresponses': value['candeleteownresponses'],
        'candeleteresponses': value['candeleteresponses'],
        'cansavetrack': value['cansavetrack'],
        'canskipview': value['canskipview'],
        'canviewreport': value['canviewreport'],
        'canviewscores': value['canviewscores'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
