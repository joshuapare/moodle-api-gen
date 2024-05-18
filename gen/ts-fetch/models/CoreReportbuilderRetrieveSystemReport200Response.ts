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
import type { CoreReportbuilderRetrieveSystemReport200ResponseData } from './CoreReportbuilderRetrieveSystemReport200ResponseData';
import {
    CoreReportbuilderRetrieveSystemReport200ResponseDataFromJSON,
    CoreReportbuilderRetrieveSystemReport200ResponseDataFromJSONTyped,
    CoreReportbuilderRetrieveSystemReport200ResponseDataToJSON,
} from './CoreReportbuilderRetrieveSystemReport200ResponseData';

/**
 * 
 * @export
 * @interface CoreReportbuilderRetrieveSystemReport200Response
 */
export interface CoreReportbuilderRetrieveSystemReport200Response {
    /**
     * 
     * @type {CoreReportbuilderRetrieveSystemReport200ResponseData}
     * @memberof CoreReportbuilderRetrieveSystemReport200Response
     */
    data: CoreReportbuilderRetrieveSystemReport200ResponseData;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreReportbuilderRetrieveSystemReport200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreReportbuilderRetrieveSystemReport200Response interface.
 */
export function instanceOfCoreReportbuilderRetrieveSystemReport200Response(value: object): boolean {
    if (!('data' in value)) return false;
    return true;
}

export function CoreReportbuilderRetrieveSystemReport200ResponseFromJSON(json: any): CoreReportbuilderRetrieveSystemReport200Response {
    return CoreReportbuilderRetrieveSystemReport200ResponseFromJSONTyped(json, false);
}

export function CoreReportbuilderRetrieveSystemReport200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderRetrieveSystemReport200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'data': CoreReportbuilderRetrieveSystemReport200ResponseDataFromJSON(json['data']),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreReportbuilderRetrieveSystemReport200ResponseToJSON(value?: CoreReportbuilderRetrieveSystemReport200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'data': CoreReportbuilderRetrieveSystemReport200ResponseDataToJSON(value['data']),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

