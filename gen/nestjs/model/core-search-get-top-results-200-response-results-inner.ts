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


export interface CoreSearchGetTopResults200ResponseResultsInner { 
    /**
     * search area name
     */
    Areaname?: string;
    /**
     * component name
     */
    Componentname?: string;
    /**
     * result contents
     */
    Content?: string;
    /**
     * result context id
     */
    Contextid?: number;
    /**
     * result context url
     */
    Contexturl?: string;
    /**
     * result course fullname
     */
    Coursefullname?: string;
    /**
     * result course url
     */
    Courseurl?: string;
    /**
     * extra result contents, depends on the search area
     */
    Description1?: string;
    /**
     * extra result contents, depends on the search area
     */
    Description2?: string;
    /**
     * result url
     */
    Docurl?: string;
    /**
     * result file name if present
     */
    Filename?: string;
    /**
     * result file names if present
     */
    Filenames?: string;
    /**
     * icon url
     */
    Iconurl?: string;
    /**
     * unique id in the search area scope
     */
    Itemid?: number;
    /**
     * whether multiple files are returned or not
     */
    Multiplefiles?: number;
    /**
     * text fields format, it is the same for all of them
     */
    Textformat?: number;
    /**
     * result modified time
     */
    Timemodified?: number;
    /**
     * result title
     */
    Title?: string;
    /**
     * user fullname
     */
    Userfullname?: string;
    /**
     * user id
     */
    Userid?: number;
    /**
     * user url
     */
    Userurl?: string;
}

