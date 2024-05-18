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


/**
 * information about one tag
 */
export interface CoreTagGetTags200ResponseTagsInner { 
    /**
     * tag description
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Descriptionformat?: number;
    /**
     * flag
     */
    Flag?: number;
    /**
     * tag id
     */
    Id?: number;
    /**
     * whether this flag is standard
     */
    Isstandard?: number;
    /**
     * name
     */
    Name?: string;
    /**
     * whether this flag is standard (deprecated, use isstandard)
     */
    Official?: number;
    /**
     * tag raw name (may contain capital letters)
     */
    Rawname?: string;
    /**
     * tag collection id
     */
    Tagcollid?: number;
    /**
     * URL to view
     */
    Viewurl?: string;
}

