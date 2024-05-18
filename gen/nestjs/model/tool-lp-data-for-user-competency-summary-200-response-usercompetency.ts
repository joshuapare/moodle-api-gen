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
import { CoreCompetencyGradeCompetency200ResponseActionuser } from './core-competency-grade-competency200-response-actionuser';


export interface ToolLpDataForUserCompetencySummary200ResponseUsercompetency { 
    /**
     * canrequestreview
     */
    Canrequestreview: boolean;
    /**
     * canreview
     */
    Canreview: boolean;
    /**
     * competencyid
     */
    Competencyid: number;
    /**
     * grade
     */
    Grade: number;
    /**
     * gradename
     */
    Gradename: string;
    /**
     * id
     */
    Id: number;
    /**
     * iscancelreviewrequestallowed
     */
    Iscancelreviewrequestallowed: boolean;
    /**
     * isrequestreviewallowed
     */
    Isrequestreviewallowed: boolean;
    /**
     * isstartreviewallowed
     */
    Isstartreviewallowed: boolean;
    /**
     * isstatusidle
     */
    Isstatusidle: boolean;
    /**
     * isstatusinreview
     */
    Isstatusinreview: boolean;
    /**
     * isstatuswaitingforreview
     */
    Isstatuswaitingforreview: boolean;
    /**
     * isstopreviewallowed
     */
    Isstopreviewallowed: boolean;
    /**
     * proficiency
     */
    Proficiency: boolean;
    /**
     * proficiencyname
     */
    Proficiencyname: string;
    Reviewer?: CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
     * reviewerid
     */
    Reviewerid: number;
    /**
     * status
     */
    Status: number;
    /**
     * statusname
     */
    Statusname: string;
    /**
     * timecreated
     */
    Timecreated: number;
    /**
     * timemodified
     */
    Timemodified: number;
    /**
     * url
     */
    Url: string;
    /**
     * userid
     */
    Userid: number;
    /**
     * usermodified
     */
    Usermodified: number;
}

