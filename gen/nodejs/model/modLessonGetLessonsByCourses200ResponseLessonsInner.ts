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
import { CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner } from './coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner';

export class ModLessonGetLessonsByCourses200ResponseLessonsInner {
    /**
    * Id of the next activity to be linked once the lesson is completed
    */
    'activitylink'?: number;
    /**
    * Whether to allow the lesson to be attempted offline in the mobile app
    */
    'allowofflineattempts'?: boolean;
    /**
    * Available from
    */
    'available'?: number;
    /**
    * Slideshow bgcolor
    */
    'bgcolor'?: string;
    /**
    * Require end reached for completion?
    */
    'completionendreached'?: number;
    /**
    * Student must do this activity at least for
    */
    'completiontimespent'?: number;
    /**
    * Conditions to enable the lesson
    */
    'conditions'?: string;
    /**
    * Foreign key reference to the course this lesson is part of.
    */
    'course'?: number;
    /**
    * Course module id.
    */
    'coursemodule'?: number;
    /**
    * Custom scoring?
    */
    'custom'?: boolean;
    /**
    * Available until
    */
    'deadline'?: number;
    /**
    * Dependent on (another lesson id)
    */
    'dependency'?: number;
    /**
    * Display left pages menu?
    */
    'displayleft'?: boolean;
    /**
    * Minimum grade to display menu
    */
    'displayleftif'?: number;
    /**
    * Display default feedback
    */
    'feedback'?: boolean;
    /**
    * The total that the grade is scaled to be out of
    */
    'grade'?: number;
    /**
    * Slideshow height
    */
    'height'?: number;
    /**
    * Standard Moodle primary key.
    */
    'id'?: number;
    /**
    * Lesson introduction text.
    */
    'intro'?: string;
    'introfiles'?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
    * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'introformat'?: number = 0;
    /**
    * Forced activity language
    */
    'lang'?: string;
    /**
    * Maximum answers per page
    */
    'maxanswers'?: number;
    /**
    * Maximum attempts
    */
    'maxattempts'?: number;
    /**
    * Number of pages to show
    */
    'maxpages'?: number;
    /**
    * Display a close button in the popup?
    */
    'mediaclose'?: number;
    /**
    * Local file path or full external URL
    */
    'mediafile'?: string;
    'mediafiles'?: Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>;
    /**
    * Popup for media file height
    */
    'mediaheight'?: number;
    /**
    * Popup for media with
    */
    'mediawidth'?: number;
    /**
    * Minimum number of questions
    */
    'minquestions'?: number;
    /**
    * Allow student review?
    */
    'modattempts'?: boolean;
    /**
    * Lesson name.
    */
    'name'?: string;
    /**
    * Action for a correct answer
    */
    'nextpagedefault'?: number;
    /**
    * Display ongoing score?
    */
    'ongoing'?: boolean;
    /**
    * Password
    */
    'password'?: string;
    /**
    * Practice lesson?
    */
    'practice'?: boolean;
    /**
    * Display progress bar?
    */
    'progressbar'?: boolean;
    /**
    * Re-takes allowed
    */
    'retake'?: boolean;
    /**
    * Provide option to try a question again
    */
    'review'?: boolean;
    /**
    * Display lesson as slideshow
    */
    'slideshow'?: boolean;
    /**
    * Time limit
    */
    'timelimit'?: number;
    /**
    * Last time settings were updated
    */
    'timemodified'?: number;
    /**
    * How to calculate the final grade
    */
    'usemaxgrade'?: number;
    /**
    * Password protected lesson?
    */
    'usepassword'?: boolean;
    /**
    * Slideshow width
    */
    'width'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "activitylink",
            "baseName": "activitylink",
            "type": "number"
        },
        {
            "name": "allowofflineattempts",
            "baseName": "allowofflineattempts",
            "type": "boolean"
        },
        {
            "name": "available",
            "baseName": "available",
            "type": "number"
        },
        {
            "name": "bgcolor",
            "baseName": "bgcolor",
            "type": "string"
        },
        {
            "name": "completionendreached",
            "baseName": "completionendreached",
            "type": "number"
        },
        {
            "name": "completiontimespent",
            "baseName": "completiontimespent",
            "type": "number"
        },
        {
            "name": "conditions",
            "baseName": "conditions",
            "type": "string"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "coursemodule",
            "baseName": "coursemodule",
            "type": "number"
        },
        {
            "name": "custom",
            "baseName": "custom",
            "type": "boolean"
        },
        {
            "name": "deadline",
            "baseName": "deadline",
            "type": "number"
        },
        {
            "name": "dependency",
            "baseName": "dependency",
            "type": "number"
        },
        {
            "name": "displayleft",
            "baseName": "displayleft",
            "type": "boolean"
        },
        {
            "name": "displayleftif",
            "baseName": "displayleftif",
            "type": "number"
        },
        {
            "name": "feedback",
            "baseName": "feedback",
            "type": "boolean"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "height",
            "baseName": "height",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "intro",
            "baseName": "intro",
            "type": "string"
        },
        {
            "name": "introfiles",
            "baseName": "introfiles",
            "type": "Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>"
        },
        {
            "name": "introformat",
            "baseName": "introformat",
            "type": "number"
        },
        {
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "maxanswers",
            "baseName": "maxanswers",
            "type": "number"
        },
        {
            "name": "maxattempts",
            "baseName": "maxattempts",
            "type": "number"
        },
        {
            "name": "maxpages",
            "baseName": "maxpages",
            "type": "number"
        },
        {
            "name": "mediaclose",
            "baseName": "mediaclose",
            "type": "number"
        },
        {
            "name": "mediafile",
            "baseName": "mediafile",
            "type": "string"
        },
        {
            "name": "mediafiles",
            "baseName": "mediafiles",
            "type": "Array<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>"
        },
        {
            "name": "mediaheight",
            "baseName": "mediaheight",
            "type": "number"
        },
        {
            "name": "mediawidth",
            "baseName": "mediawidth",
            "type": "number"
        },
        {
            "name": "minquestions",
            "baseName": "minquestions",
            "type": "number"
        },
        {
            "name": "modattempts",
            "baseName": "modattempts",
            "type": "boolean"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "nextpagedefault",
            "baseName": "nextpagedefault",
            "type": "number"
        },
        {
            "name": "ongoing",
            "baseName": "ongoing",
            "type": "boolean"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "practice",
            "baseName": "practice",
            "type": "boolean"
        },
        {
            "name": "progressbar",
            "baseName": "progressbar",
            "type": "boolean"
        },
        {
            "name": "retake",
            "baseName": "retake",
            "type": "boolean"
        },
        {
            "name": "review",
            "baseName": "review",
            "type": "boolean"
        },
        {
            "name": "slideshow",
            "baseName": "slideshow",
            "type": "boolean"
        },
        {
            "name": "timelimit",
            "baseName": "timelimit",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "usemaxgrade",
            "baseName": "usemaxgrade",
            "type": "number"
        },
        {
            "name": "usepassword",
            "baseName": "usepassword",
            "type": "boolean"
        },
        {
            "name": "width",
            "baseName": "width",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetLessonsByCourses200ResponseLessonsInner.attributeTypeMap;
    }
}

