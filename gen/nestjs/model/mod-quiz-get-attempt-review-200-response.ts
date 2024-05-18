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
import { ModQuizGetAttemptReview200ResponseAttempt } from './mod-quiz-get-attempt-review200-response-attempt';
import { ModQuizGetAttemptReview200ResponseQuestionsInner } from './mod-quiz-get-attempt-review200-response-questions-inner';
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';
import { ModQuizGetAttemptReview200ResponseAdditionaldataInner } from './mod-quiz-get-attempt-review200-response-additionaldata-inner';


export interface ModQuizGetAttemptReview200Response { 
    Additionaldata: Array<ModQuizGetAttemptReview200ResponseAdditionaldataInner>;
    Attempt: ModQuizGetAttemptReview200ResponseAttempt;
    /**
     * grade for the quiz (or empty or \"notyetgraded\")
     */
    Grade: string;
    Questions: Array<ModQuizGetAttemptReview200ResponseQuestionsInner>;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

