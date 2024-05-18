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
 * @interface CoreTagGetTagCloudRequest
 */
export interface CoreTagGetTagCloudRequest {
    /**
     * Only retrieve tag instances in this context.
     * @type {number}
     * @memberof CoreTagGetTagCloudRequest
     */
    ctx?: number;
    /**
     * Context id where this tag cloud is displayed.
     * @type {number}
     * @memberof CoreTagGetTagCloudRequest
     */
    fromctx?: number;
    /**
     * Whether to return only standard tags.
     * @type {boolean}
     * @memberof CoreTagGetTagCloudRequest
     */
    isstandard?: boolean;
    /**
     * Maximum number of tags to retrieve.
     * @type {number}
     * @memberof CoreTagGetTagCloudRequest
     */
    limit?: number;
    /**
     * Retrieve tag instances in the $ctx context and it's children.
     * @type {number}
     * @memberof CoreTagGetTagCloudRequest
     */
    rec?: number;
    /**
     * Search string.
     * @type {string}
     * @memberof CoreTagGetTagCloudRequest
     */
    search?: string;
    /**
     * Sort order for display
     *                     (id, name, rawname, count, flag, isstandard, tagcollid).
     * @type {string}
     * @memberof CoreTagGetTagCloudRequest
     */
    sort?: string;
    /**
     * Tag collection id.
     * @type {number}
     * @memberof CoreTagGetTagCloudRequest
     */
    tagcollid?: number;
}

/**
 * Check if a given object implements the CoreTagGetTagCloudRequest interface.
 */
export function instanceOfCoreTagGetTagCloudRequest(value: object): boolean {
    return true;
}

export function CoreTagGetTagCloudRequestFromJSON(json: any): CoreTagGetTagCloudRequest {
    return CoreTagGetTagCloudRequestFromJSONTyped(json, false);
}

export function CoreTagGetTagCloudRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTagCloudRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'ctx': json['ctx'] == null ? undefined : json['ctx'],
        'fromctx': json['fromctx'] == null ? undefined : json['fromctx'],
        'isstandard': json['isstandard'] == null ? undefined : json['isstandard'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'rec': json['rec'] == null ? undefined : json['rec'],
        'search': json['search'] == null ? undefined : json['search'],
        'sort': json['sort'] == null ? undefined : json['sort'],
        'tagcollid': json['tagcollid'] == null ? undefined : json['tagcollid'],
    };
}

export function CoreTagGetTagCloudRequestToJSON(value?: CoreTagGetTagCloudRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ctx': value['ctx'],
        'fromctx': value['fromctx'],
        'isstandard': value['isstandard'],
        'limit': value['limit'],
        'rec': value['rec'],
        'search': value['search'],
        'sort': value['sort'],
        'tagcollid': value['tagcollid'],
    };
}
