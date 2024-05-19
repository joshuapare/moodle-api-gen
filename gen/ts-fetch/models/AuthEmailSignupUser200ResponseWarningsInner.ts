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
 * warning
 * @export
 * @interface AuthEmailSignupUser200ResponseWarningsInner
 */
export interface AuthEmailSignupUser200ResponseWarningsInner {
    /**
     * item
     * @type {string}
     * @memberof AuthEmailSignupUser200ResponseWarningsInner
     */
    item?: string;
    /**
     * item id
     * @type {number}
     * @memberof AuthEmailSignupUser200ResponseWarningsInner
     */
    itemid?: number;
    /**
     * untranslated english message to explain the warning
     * @type {string}
     * @memberof AuthEmailSignupUser200ResponseWarningsInner
     */
    message?: string;
    /**
     * the warning code can be used by the client app to implement specific behaviour
     * @type {string}
     * @memberof AuthEmailSignupUser200ResponseWarningsInner
     */
    warningcode?: string;
}

/**
 * Check if a given object implements the AuthEmailSignupUser200ResponseWarningsInner interface.
 */
export function instanceOfAuthEmailSignupUser200ResponseWarningsInner(value: object): boolean {
    return true;
}

export function AuthEmailSignupUser200ResponseWarningsInnerFromJSON(json: any): AuthEmailSignupUser200ResponseWarningsInner {
    return AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped(json, false);
}

export function AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): AuthEmailSignupUser200ResponseWarningsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'item': json['item'] == null ? undefined : json['item'],
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'message': json['message'] == null ? undefined : json['message'],
        'warningcode': json['warningcode'] == null ? undefined : json['warningcode'],
    };
}

export function AuthEmailSignupUser200ResponseWarningsInnerToJSON(value?: AuthEmailSignupUser200ResponseWarningsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'item': value['item'],
        'itemid': value['itemid'],
        'message': value['message'],
        'warningcode': value['warningcode'],
    };
}

