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

import { RequestFile } from './models';
import { ModDataGetEntry200ResponseRatinginfoRatingsInner } from './modDataGetEntry200ResponseRatinginfoRatingsInner';
import { ModDataGetEntry200ResponseRatinginfoScalesInner } from './modDataGetEntry200ResponseRatinginfoScalesInner';

export class ModDataGetEntry200ResponseRatinginfo {
    /**
    * Whether the user can view all the individual ratings.
    */
    'Canviewall'?: boolean = null;
    /**
    * Whether the user can view aggregate of ratings of others.
    */
    'Canviewany'?: boolean = null;
    /**
    * Context name.
    */
    'Component': string = 'null';
    /**
    * Context id.
    */
    'Contextid': number = null;
    /**
    * Rating area name.
    */
    'Ratingarea': string = 'null';
    'Ratings'?: Array<ModDataGetEntry200ResponseRatinginfoRatingsInner>;
    'Scales'?: Array<ModDataGetEntry200ResponseRatinginfoScalesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canviewall",
            "baseName": "canviewall",
            "type": "boolean"
        },
        {
            "name": "Canviewany",
            "baseName": "canviewany",
            "type": "boolean"
        },
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Ratingarea",
            "baseName": "ratingarea",
            "type": "string"
        },
        {
            "name": "Ratings",
            "baseName": "ratings",
            "type": "Array<ModDataGetEntry200ResponseRatinginfoRatingsInner>"
        },
        {
            "name": "Scales",
            "baseName": "scales",
            "type": "Array<ModDataGetEntry200ResponseRatinginfoScalesInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModDataGetEntry200ResponseRatinginfo.attributeTypeMap;
    }
}

