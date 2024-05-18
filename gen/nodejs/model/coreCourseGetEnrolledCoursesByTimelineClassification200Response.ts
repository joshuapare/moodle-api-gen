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
import { CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner } from './coreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner';

export class CoreCourseGetEnrolledCoursesByTimelineClassification200Response {
    'courses': Array<CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>;
    /**
    * Offset for the next request
    */
    'nextoffset': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courses",
            "baseName": "courses",
            "type": "Array<CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner>"
        },
        {
            "name": "nextoffset",
            "baseName": "nextoffset",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetEnrolledCoursesByTimelineClassification200Response.attributeTypeMap;
    }
}

