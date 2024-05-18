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
 * event
 */
export interface CoreCalendarCreateCalendarEvents200ResponseEventsInner { 
    /**
     * course id
     */
    Courseid?: number;
    /**
     * Description
     */
    Description?: string;
    /**
     * Event type
     */
    Eventtype?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Format?: number;
    /**
     * group id
     */
    Groupid?: number;
    /**
     * event id
     */
    Id?: number;
    /**
     * instance id
     */
    Instance?: number;
    /**
     * module name
     */
    Modulename?: string;
    /**
     * event name
     */
    Name?: string;
    /**
     * repeat id
     */
    Repeatid?: number;
    /**
     * sequence
     */
    Sequence?: number;
    /**
     * Subscription id
     */
    Subscriptionid?: number;
    /**
     * time duration
     */
    Timeduration?: number;
    /**
     * time modified
     */
    Timemodified?: number;
    /**
     * timestart
     */
    Timestart?: number;
    /**
     * user id
     */
    Userid?: number;
    /**
     * unique id of ical events
     */
    Uuid?: string;
    /**
     * visible
     */
    Visible?: number;
}

