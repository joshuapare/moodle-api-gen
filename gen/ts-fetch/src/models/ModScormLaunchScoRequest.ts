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
 * @interface ModScormLaunchScoRequest
 */
export interface ModScormLaunchScoRequest {
    /**
     * SCO id (empty for launching the first SCO)
     * @type {number}
     * @memberof ModScormLaunchScoRequest
     */
    Scoid?: number;
    /**
     * SCORM instance id
     * @type {number}
     * @memberof ModScormLaunchScoRequest
     */
    Scormid: number;
}

/**
 * Check if a given object implements the ModScormLaunchScoRequest interface.
 */
export function instanceOfModScormLaunchScoRequest(value: object): boolean {
    if (!('Scormid' in value)) return false;
    return true;
}

export function ModScormLaunchScoRequestFromJSON(json: any): ModScormLaunchScoRequest {
    return ModScormLaunchScoRequestFromJSONTyped(json, false);
}

export function ModScormLaunchScoRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormLaunchScoRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Scoid': json['scoid'] == null ? undefined : json['scoid'],
        'Scormid': json['scormid'],
    };
}

export function ModScormLaunchScoRequestToJSON(value?: ModScormLaunchScoRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'scoid': value['Scoid'],
        'scormid': value['Scormid'],
    };
}

