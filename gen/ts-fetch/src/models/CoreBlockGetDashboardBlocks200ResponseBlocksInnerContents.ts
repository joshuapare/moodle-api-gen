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

/**
 * 
 * @export
 * @interface CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
 */
export interface CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents {
    /**
     * Block contents.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
     */
    Content: string;
    /**
     * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
     */
    Contentformat: number;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
     */
    Files: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * Block footer.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
     */
    Footer: string;
    /**
     * Block title.
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
     */
    Title: string;
}

/**
 * Check if a given object implements the CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents interface.
 */
export function instanceOfCoreBlockGetDashboardBlocks200ResponseBlocksInnerContents(value: object): boolean {
    if (!('Content' in value)) return false;
    if (!('Contentformat' in value)) return false;
    if (!('Files' in value)) return false;
    if (!('Footer' in value)) return false;
    if (!('Title' in value)) return false;
    return true;
}

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFromJSON(json: any): CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents {
    return CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFromJSONTyped(json, false);
}

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents {
    if (json == null) {
        return json;
    }
    return {
        
        'Content': json['content'],
        'Contentformat': json['contentformat'],
        'Files': ((json['files'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Footer': json['footer'],
        'Title': json['title'],
    };
}

export function CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsToJSON(value?: CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['Content'],
        'contentformat': value['Contentformat'],
        'files': ((value['Files'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'footer': value['Footer'],
        'title': value['Title'],
    };
}
