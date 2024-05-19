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
 * @interface CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
 */
export interface CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
    /**
     * Badge id
     * @type {number}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    Badgeid?: number;
    /**
     * Alignment id
     * @type {number}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    Id?: number;
    /**
     * Target code
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    TargetCode?: string;
    /**
     * Target description
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    TargetDescription?: string;
    /**
     * Target framework
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    TargetFramework?: string;
    /**
     * Target name
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    TargetName?: string;
    /**
     * Target URL
     * @type {string}
     * @memberof CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
     */
    TargetUrl?: string;
}

/**
 * Check if a given object implements the CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner interface.
 */
export function instanceOfCoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner(value: object): boolean {
    return true;
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerFromJSON(json: any): CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
    return CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerFromJSONTyped(json, false);
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Badgeid': json['badgeid'] == null ? undefined : json['badgeid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'TargetCode': json['targetCode'] == null ? undefined : json['targetCode'],
        'TargetDescription': json['targetDescription'] == null ? undefined : json['targetDescription'],
        'TargetFramework': json['targetFramework'] == null ? undefined : json['targetFramework'],
        'TargetName': json['targetName'] == null ? undefined : json['targetName'],
        'TargetUrl': json['targetUrl'] == null ? undefined : json['targetUrl'],
    };
}

export function CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInnerToJSON(value?: CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'badgeid': value['Badgeid'],
        'id': value['Id'],
        'targetCode': value['TargetCode'],
        'targetDescription': value['TargetDescription'],
        'targetFramework': value['TargetFramework'],
        'targetName': value['TargetName'],
        'targetUrl': value['TargetUrl'],
    };
}
