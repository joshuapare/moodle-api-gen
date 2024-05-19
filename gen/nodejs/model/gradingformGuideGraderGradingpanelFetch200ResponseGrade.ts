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
import { GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner } from './gradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner';
import { GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner } from './gradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner';

export class GradingformGuideGraderGradingpanelFetch200ResponseGrade {
    'comments': Array<GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner>;
    'criterion': Array<GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner>;
    /**
    * The assumed grader of this grading instance
    */
    'gradedby': string;
    /**
    * Whether there are any frequently-used comments
    */
    'hascomments': boolean = null;
    /**
    * The id of the current grading instance
    */
    'instanceid': number = null;
    /**
    * Max possible grade
    */
    'maxgrade': string;
    /**
    * The time that the grade was created
    */
    'timecreated': number;
    /**
    * The time that the grade was last updated
    */
    'timemodified': number;
    /**
    * Current user grade
    */
    'usergrade': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "comments",
            "baseName": "comments",
            "type": "Array<GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner>"
        },
        {
            "name": "criterion",
            "baseName": "criterion",
            "type": "Array<GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner>"
        },
        {
            "name": "gradedby",
            "baseName": "gradedby",
            "type": "string"
        },
        {
            "name": "hascomments",
            "baseName": "hascomments",
            "type": "boolean"
        },
        {
            "name": "instanceid",
            "baseName": "instanceid",
            "type": "number"
        },
        {
            "name": "maxgrade",
            "baseName": "maxgrade",
            "type": "string"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "usergrade",
            "baseName": "usergrade",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return GradingformGuideGraderGradingpanelFetch200ResponseGrade.attributeTypeMap;
    }
}

