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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import type { ToolMobileGetContent200ResponseOtherdataInner } from './ToolMobileGetContent200ResponseOtherdataInner';
import {
    ToolMobileGetContent200ResponseOtherdataInnerFromJSON,
    ToolMobileGetContent200ResponseOtherdataInnerFromJSONTyped,
    ToolMobileGetContent200ResponseOtherdataInnerToJSON,
} from './ToolMobileGetContent200ResponseOtherdataInner';
import type { ToolMobileGetContent200ResponseRestrict } from './ToolMobileGetContent200ResponseRestrict';
import {
    ToolMobileGetContent200ResponseRestrictFromJSON,
    ToolMobileGetContent200ResponseRestrictFromJSONTyped,
    ToolMobileGetContent200ResponseRestrictToJSON,
} from './ToolMobileGetContent200ResponseRestrict';
import type { ToolMobileGetContent200ResponseTemplatesInner } from './ToolMobileGetContent200ResponseTemplatesInner';
import {
    ToolMobileGetContent200ResponseTemplatesInnerFromJSON,
    ToolMobileGetContent200ResponseTemplatesInnerFromJSONTyped,
    ToolMobileGetContent200ResponseTemplatesInnerToJSON,
} from './ToolMobileGetContent200ResponseTemplatesInner';

/**
 * 
 * @export
 * @interface ToolMobileGetContent200Response
 */
export interface ToolMobileGetContent200Response {
    /**
     * Whether we consider this disabled or not.
     * @type {boolean}
     * @memberof ToolMobileGetContent200Response
     */
    Disabled?: boolean;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ToolMobileGetContent200Response
     */
    Files: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * JavaScript code.
     * @type {string}
     * @memberof ToolMobileGetContent200Response
     */
    Javascript: string;
    /**
     * 
     * @type {Array<ToolMobileGetContent200ResponseOtherdataInner>}
     * @memberof ToolMobileGetContent200Response
     */
    Otherdata: Array<ToolMobileGetContent200ResponseOtherdataInner>;
    /**
     * 
     * @type {ToolMobileGetContent200ResponseRestrict}
     * @memberof ToolMobileGetContent200Response
     */
    Restrict: ToolMobileGetContent200ResponseRestrict;
    /**
     * 
     * @type {Array<ToolMobileGetContent200ResponseTemplatesInner>}
     * @memberof ToolMobileGetContent200Response
     */
    Templates: Array<ToolMobileGetContent200ResponseTemplatesInner>;
}

/**
 * Check if a given object implements the ToolMobileGetContent200Response interface.
 */
export function instanceOfToolMobileGetContent200Response(value: object): boolean {
    if (!('Files' in value)) return false;
    if (!('Javascript' in value)) return false;
    if (!('Otherdata' in value)) return false;
    if (!('Restrict' in value)) return false;
    if (!('Templates' in value)) return false;
    return true;
}

export function ToolMobileGetContent200ResponseFromJSON(json: any): ToolMobileGetContent200Response {
    return ToolMobileGetContent200ResponseFromJSONTyped(json, false);
}

export function ToolMobileGetContent200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolMobileGetContent200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Disabled': json['disabled'] == null ? undefined : json['disabled'],
        'Files': ((json['files'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Javascript': json['javascript'],
        'Otherdata': ((json['otherdata'] as Array<any>).map(ToolMobileGetContent200ResponseOtherdataInnerFromJSON)),
        'Restrict': ToolMobileGetContent200ResponseRestrictFromJSON(json['restrict']),
        'Templates': ((json['templates'] as Array<any>).map(ToolMobileGetContent200ResponseTemplatesInnerFromJSON)),
    };
}

export function ToolMobileGetContent200ResponseToJSON(value?: ToolMobileGetContent200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'disabled': value['Disabled'],
        'files': ((value['Files'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'javascript': value['Javascript'],
        'otherdata': ((value['Otherdata'] as Array<any>).map(ToolMobileGetContent200ResponseOtherdataInnerToJSON)),
        'restrict': ToolMobileGetContent200ResponseRestrictToJSON(value['Restrict']),
        'templates': ((value['Templates'] as Array<any>).map(ToolMobileGetContent200ResponseTemplatesInnerToJSON)),
    };
}
