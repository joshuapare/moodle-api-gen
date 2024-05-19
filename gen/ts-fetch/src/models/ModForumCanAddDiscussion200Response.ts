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
 * @interface ModForumCanAddDiscussion200Response
 */
export interface ModForumCanAddDiscussion200Response {
    /**
     * True if the user can add attachments, false otherwise.
     * @type {boolean}
     * @memberof ModForumCanAddDiscussion200Response
     */
    Cancreateattachment?: boolean;
    /**
     * True if the user can pin discussions, false otherwise.
     * @type {boolean}
     * @memberof ModForumCanAddDiscussion200Response
     */
    Canpindiscussions?: boolean;
    /**
     * True if the user can add discussions, false otherwise.
     * @type {boolean}
     * @memberof ModForumCanAddDiscussion200Response
     */
    Status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModForumCanAddDiscussion200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModForumCanAddDiscussion200Response interface.
 */
export function instanceOfModForumCanAddDiscussion200Response(value: object): boolean {
    if (!('Status' in value)) return false;
    return true;
}

export function ModForumCanAddDiscussion200ResponseFromJSON(json: any): ModForumCanAddDiscussion200Response {
    return ModForumCanAddDiscussion200ResponseFromJSONTyped(json, false);
}

export function ModForumCanAddDiscussion200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumCanAddDiscussion200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Cancreateattachment': json['cancreateattachment'] == null ? undefined : json['cancreateattachment'],
        'Canpindiscussions': json['canpindiscussions'] == null ? undefined : json['canpindiscussions'],
        'Status': json['status'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModForumCanAddDiscussion200ResponseToJSON(value?: ModForumCanAddDiscussion200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cancreateattachment': value['Cancreateattachment'],
        'canpindiscussions': value['Canpindiscussions'],
        'status': value['Status'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

