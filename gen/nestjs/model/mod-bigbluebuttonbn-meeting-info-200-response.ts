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
import { ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner } from './mod-bigbluebuttonbn-meeting-info200-response-presentations-inner';
import { ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner } from './mod-bigbluebuttonbn-meeting-info200-response-features-inner';


export interface ModBigbluebuttonbnMeetingInfo200Response { 
    /**
     * bigbluebuttonbn instance id
     */
    Bigbluebuttonbnid: string;
    /**
     * Can join
     */
    Canjoin: boolean;
    /**
     * Closing time
     */
    Closingtime?: number;
    /**
     * CM id
     */
    Cmid: number;
    Features?: Array<ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner>;
    /**
     * bigbluebuttonbn group id
     */
    Groupid?: number;
    /**
     * Guest access enabled
     */
    Guestaccessenabled?: boolean;
    /**
     * Guest URL
     */
    Guestjoinurl?: string;
    /**
     * Guest join password
     */
    Guestpassword?: string;
    /**
     * Is moderator
     */
    Ismoderator: boolean;
    /**
     * Join URL
     */
    Joinurl: string;
    /**
     * Meeting id
     */
    Meetingid: string;
    /**
     * Moderator count
     */
    Moderatorcount?: number;
    /**
     * Several moderators ?
     */
    Moderatorplural?: boolean;
    /**
     * Opening time
     */
    Openingtime?: number;
    /**
     * Participant count
     */
    Participantcount?: number;
    /**
     * Several participants ?
     */
    Participantplural?: boolean;
    Presentations: Array<ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner>;
    /**
     * Started at
     */
    Startedat?: number;
    /**
     * Status closed
     */
    Statusclosed?: boolean;
    /**
     * Status message
     */
    Statusmessage?: string;
    /**
     * Status open
     */
    Statusopen?: boolean;
    /**
     * Status running
     */
    Statusrunning?: boolean;
    /**
     * User limit
     */
    Userlimit: number;
}

