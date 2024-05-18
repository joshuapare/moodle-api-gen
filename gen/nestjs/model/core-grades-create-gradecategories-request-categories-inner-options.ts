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


export interface CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions { 
    /**
     * exclude empty grades
     */
    Aggregateonlygraded?: boolean;
    /**
     * aggregate outcomes
     */
    Aggregateoutcomes?: boolean;
    /**
     * aggregation method
     */
    Aggregation?: number;
    /**
     * weight coefficient
     */
    Aggregationcoef2?: string;
    /**
     * the decimal count
     */
    Decimals?: number;
    /**
     * the display type
     */
    Display?: number;
    /**
     * drop low grades
     */
    Droplow?: number;
    /**
     * the grade max
     */
    Grademax?: number;
    /**
     * the grade min
     */
    Grademin?: number;
    /**
     * the grade to pass
     */
    Gradepass?: number;
    /**
     * the grade type
     */
    Gradetype?: number;
    /**
     * grades hidden until
     */
    Hiddenuntil?: number;
    /**
     * the category idnumber
     */
    Idnumber?: string;
    /**
     * the category iteminfo
     */
    Iteminfo?: string;
    /**
     * the category total name
     */
    Itemname?: string;
    /**
     * lock grades after
     */
    Locktime?: number;
    /**
     * The parent category id
     */
    Parentcategoryid?: number;
    /**
     * the parent category idnumber
     */
    Parentcategoryidnumber?: string;
    /**
     * weight adjusted
     */
    Weightoverride?: boolean;
}
