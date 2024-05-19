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

export class ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
    /**
    * Number of question attempts
    */
    'Attempts': number = null;
    /**
    * Points earned by student
    */
    'Earned': number = null;
    /**
    * Calculated percentage grade
    */
    'Grade': number = null;
    /**
    * Point value for manually graded questions
    */
    'Manualpoints': number = null;
    /**
    * Number of manually graded questions
    */
    'Nmanual': number = null;
    /**
    * Number of questions answered
    */
    'Nquestions': number = null;
    /**
    * Max points possible
    */
    'Total': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attempts",
            "baseName": "attempts",
            "type": "number"
        },
        {
            "name": "Earned",
            "baseName": "earned",
            "type": "number"
        },
        {
            "name": "Grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "Manualpoints",
            "baseName": "manualpoints",
            "type": "number"
        },
        {
            "name": "Nmanual",
            "baseName": "nmanual",
            "type": "number"
        },
        {
            "name": "Nquestions",
            "baseName": "nquestions",
            "type": "number"
        },
        {
            "name": "Total",
            "baseName": "total",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.attributeTypeMap;
    }
}

