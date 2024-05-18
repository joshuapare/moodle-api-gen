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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { CoreCourseSearchCourses200ResponseCoursesInner } from './coreCourseSearchCourses200ResponseCoursesInner';

export class CoreCourseSearchCourses200Response {
    'courses': Array<CoreCourseSearchCourses200ResponseCoursesInner>;
    /**
    * total course count
    */
    'total': number = null;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courses",
            "baseName": "courses",
            "type": "Array<CoreCourseSearchCourses200ResponseCoursesInner>"
        },
        {
            "name": "total",
            "baseName": "total",
            "type": "number"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseSearchCourses200Response.attributeTypeMap;
    }
}

