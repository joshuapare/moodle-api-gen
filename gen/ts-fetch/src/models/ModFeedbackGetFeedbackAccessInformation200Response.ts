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
 * @interface ModFeedbackGetFeedbackAccessInformation200Response
 */
export interface ModFeedbackGetFeedbackAccessInformation200Response {
    /**
     * Whether the user can complete the feedback or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Cancomplete: boolean;
    /**
     * Whether the user can delete submissions or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Candeletesubmissions: boolean;
    /**
     * Whether the user can edit feedback items or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Canedititems: boolean;
    /**
     * Whether the user can submit the feedback or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Cansubmit: boolean;
    /**
     * Whether the user can view the analysis or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Canviewanalysis: boolean;
    /**
     * Whether the user can view the feedback reports or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Canviewreports: boolean;
    /**
     * Whether the feedback is already submitted or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Isalreadysubmitted: boolean;
    /**
     * Whether the feedback is anonymous or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Isanonymous: boolean;
    /**
     * Whether the feedback has questions or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Isempty: boolean;
    /**
     * Whether the feedback has active access time restrictions or not.
     * @type {boolean}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Isopen: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModFeedbackGetFeedbackAccessInformation200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModFeedbackGetFeedbackAccessInformation200Response interface.
 */
export function instanceOfModFeedbackGetFeedbackAccessInformation200Response(value: object): boolean {
    if (!('Cancomplete' in value)) return false;
    if (!('Candeletesubmissions' in value)) return false;
    if (!('Canedititems' in value)) return false;
    if (!('Cansubmit' in value)) return false;
    if (!('Canviewanalysis' in value)) return false;
    if (!('Canviewreports' in value)) return false;
    if (!('Isalreadysubmitted' in value)) return false;
    if (!('Isanonymous' in value)) return false;
    if (!('Isempty' in value)) return false;
    if (!('Isopen' in value)) return false;
    return true;
}

export function ModFeedbackGetFeedbackAccessInformation200ResponseFromJSON(json: any): ModFeedbackGetFeedbackAccessInformation200Response {
    return ModFeedbackGetFeedbackAccessInformation200ResponseFromJSONTyped(json, false);
}

export function ModFeedbackGetFeedbackAccessInformation200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetFeedbackAccessInformation200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Cancomplete': json['cancomplete'],
        'Candeletesubmissions': json['candeletesubmissions'],
        'Canedititems': json['canedititems'],
        'Cansubmit': json['cansubmit'],
        'Canviewanalysis': json['canviewanalysis'],
        'Canviewreports': json['canviewreports'],
        'Isalreadysubmitted': json['isalreadysubmitted'],
        'Isanonymous': json['isanonymous'],
        'Isempty': json['isempty'],
        'Isopen': json['isopen'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModFeedbackGetFeedbackAccessInformation200ResponseToJSON(value?: ModFeedbackGetFeedbackAccessInformation200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cancomplete': value['Cancomplete'],
        'candeletesubmissions': value['Candeletesubmissions'],
        'canedititems': value['Canedititems'],
        'cansubmit': value['Cansubmit'],
        'canviewanalysis': value['Canviewanalysis'],
        'canviewreports': value['Canviewreports'],
        'isalreadysubmitted': value['Isalreadysubmitted'],
        'isanonymous': value['Isanonymous'],
        'isempty': value['Isempty'],
        'isopen': value['Isopen'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

