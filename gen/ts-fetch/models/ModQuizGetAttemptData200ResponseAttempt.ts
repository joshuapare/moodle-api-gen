/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ModQuizGetAttemptData200ResponseAttempt
 */
export interface ModQuizGetAttemptData200ResponseAttempt {
    /**
     * Sequentially numbers this students attempts at this quiz.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    attempt?: number;
    /**
     * Attempt current page.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    currentpage?: number;
    /**
     * Time when the student was notified that manual grading of their attempt was complete.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    gradednotificationsenttime?: number;
    /**
     * Attempt id.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    id?: number;
    /**
     * Attempt layout.
     * @type {string}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    layout?: string;
    /**
     * Whether is a preview attempt or not.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    preview?: number;
    /**
     * Foreign key reference to the quiz that was attempted.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    quiz?: number;
    /**
     * The current state of the attempts. 'inprogress',
     *                                                 'overdue', 'finished' or 'abandoned'.
     * @type {string}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    state?: string;
    /**
     * Total marks for this attempt.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    sumgrades?: number;
    /**
     * Next time quiz cron should check attempt for
     *                                                         state changes.  NULL means never check.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    timecheckstate?: number;
    /**
     * Time when the attempt was submitted.
     *                                                     0 if the attempt has not been submitted yet.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    timefinish?: number;
    /**
     * Last modified time.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    timemodified?: number;
    /**
     * Last modified time via webservices.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    timemodifiedoffline?: number;
    /**
     * Time when the attempt was started.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    timestart?: number;
    /**
     * Foreign key reference to the question_usage that holds the
     *                                                     details of the the question_attempts that make up this quiz
     *                                                     attempt.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    uniqueid?: number;
    /**
     * Foreign key reference to the user whose attempt this is.
     * @type {number}
     * @memberof ModQuizGetAttemptData200ResponseAttempt
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModQuizGetAttemptData200ResponseAttempt interface.
 */
export function instanceOfModQuizGetAttemptData200ResponseAttempt(value: object): boolean {
    return true;
}

export function ModQuizGetAttemptData200ResponseAttemptFromJSON(json: any): ModQuizGetAttemptData200ResponseAttempt {
    return ModQuizGetAttemptData200ResponseAttemptFromJSONTyped(json, false);
}

export function ModQuizGetAttemptData200ResponseAttemptFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetAttemptData200ResponseAttempt {
    if (json == null) {
        return json;
    }
    return {
        
        'attempt': json['attempt'] == null ? undefined : json['attempt'],
        'currentpage': json['currentpage'] == null ? undefined : json['currentpage'],
        'gradednotificationsenttime': json['gradednotificationsenttime'] == null ? undefined : json['gradednotificationsenttime'],
        'id': json['id'] == null ? undefined : json['id'],
        'layout': json['layout'] == null ? undefined : json['layout'],
        'preview': json['preview'] == null ? undefined : json['preview'],
        'quiz': json['quiz'] == null ? undefined : json['quiz'],
        'state': json['state'] == null ? undefined : json['state'],
        'sumgrades': json['sumgrades'] == null ? undefined : json['sumgrades'],
        'timecheckstate': json['timecheckstate'] == null ? undefined : json['timecheckstate'],
        'timefinish': json['timefinish'] == null ? undefined : json['timefinish'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timemodifiedoffline': json['timemodifiedoffline'] == null ? undefined : json['timemodifiedoffline'],
        'timestart': json['timestart'] == null ? undefined : json['timestart'],
        'uniqueid': json['uniqueid'] == null ? undefined : json['uniqueid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModQuizGetAttemptData200ResponseAttemptToJSON(value?: ModQuizGetAttemptData200ResponseAttempt | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempt': value['attempt'],
        'currentpage': value['currentpage'],
        'gradednotificationsenttime': value['gradednotificationsenttime'],
        'id': value['id'],
        'layout': value['layout'],
        'preview': value['preview'],
        'quiz': value['quiz'],
        'state': value['state'],
        'sumgrades': value['sumgrades'],
        'timecheckstate': value['timecheckstate'],
        'timefinish': value['timefinish'],
        'timemodified': value['timemodified'],
        'timemodifiedoffline': value['timemodifiedoffline'],
        'timestart': value['timestart'],
        'uniqueid': value['uniqueid'],
        'userid': value['userid'],
    };
}

