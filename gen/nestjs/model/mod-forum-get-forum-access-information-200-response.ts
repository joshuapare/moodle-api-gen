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
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';


export interface ModForumGetForumAccessInformation200Response { 
    /**
     * Whether the user has the capability mod/forum:addinstance allowed.
     */
    Canaddinstance?: boolean;
    /**
     * Whether the user has the capability mod/forum:addnews allowed.
     */
    Canaddnews?: boolean;
    /**
     * Whether the user has the capability mod/forum:addquestion allowed.
     */
    Canaddquestion?: boolean;
    /**
     * Whether the user has the capability mod/forum:allowforcesubscribe allowed.
     */
    Canallowforcesubscribe?: boolean;
    /**
     * Whether the user has the capability mod/forum:canmailnow allowed.
     */
    Cancanmailnow?: boolean;
    /**
     * Whether the user has the capability mod/forum:canoverridecutoff allowed.
     */
    Cancanoverridecutoff?: boolean;
    /**
     * Whether the user has the capability mod/forum:canoverridediscussionlock allowed.
     */
    Cancanoverridediscussionlock?: boolean;
    /**
     * Whether the user has the capability mod/forum:canposttomygroups allowed.
     */
    Cancanposttomygroups?: boolean;
    /**
     * Whether the user has the capability mod/forum:cantogglefavourite allowed.
     */
    Cancantogglefavourite?: boolean;
    /**
     * Whether the user has the capability mod/forum:createattachment allowed.
     */
    Cancreateattachment?: boolean;
    /**
     * Whether the user has the capability mod/forum:deleteanypost allowed.
     */
    Candeleteanypost?: boolean;
    /**
     * Whether the user has the capability mod/forum:deleteownpost allowed.
     */
    Candeleteownpost?: boolean;
    /**
     * Whether the user has the capability mod/forum:editanypost allowed.
     */
    Caneditanypost?: boolean;
    /**
     * Whether the user has the capability mod/forum:exportdiscussion allowed.
     */
    Canexportdiscussion?: boolean;
    /**
     * Whether the user has the capability mod/forum:exportforum allowed.
     */
    Canexportforum?: boolean;
    /**
     * Whether the user has the capability mod/forum:exportownpost allowed.
     */
    Canexportownpost?: boolean;
    /**
     * Whether the user has the capability mod/forum:exportpost allowed.
     */
    Canexportpost?: boolean;
    /**
     * Whether the user has the capability mod/forum:grade allowed.
     */
    Cangrade?: boolean;
    /**
     * Whether the user has the capability mod/forum:managesubscriptions allowed.
     */
    Canmanagesubscriptions?: boolean;
    /**
     * Whether the user has the capability mod/forum:movediscussions allowed.
     */
    Canmovediscussions?: boolean;
    /**
     * Whether the user has the capability mod/forum:pindiscussions allowed.
     */
    Canpindiscussions?: boolean;
    /**
     * Whether the user has the capability mod/forum:postprivatereply allowed.
     */
    Canpostprivatereply?: boolean;
    /**
     * Whether the user has the capability mod/forum:postwithoutthrottling allowed.
     */
    Canpostwithoutthrottling?: boolean;
    /**
     * Whether the user has the capability mod/forum:rate allowed.
     */
    Canrate?: boolean;
    /**
     * Whether the user has the capability mod/forum:readprivatereplies allowed.
     */
    Canreadprivatereplies?: boolean;
    /**
     * Whether the user has the capability mod/forum:replynews allowed.
     */
    Canreplynews?: boolean;
    /**
     * Whether the user has the capability mod/forum:replypost allowed.
     */
    Canreplypost?: boolean;
    /**
     * Whether the user has the capability mod/forum:splitdiscussions allowed.
     */
    Cansplitdiscussions?: boolean;
    /**
     * Whether the user has the capability mod/forum:startdiscussion allowed.
     */
    Canstartdiscussion?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewallratings allowed.
     */
    Canviewallratings?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewanyrating allowed.
     */
    Canviewanyrating?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewdiscussion allowed.
     */
    Canviewdiscussion?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewhiddentimedposts allowed.
     */
    Canviewhiddentimedposts?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewqandawithoutposting allowed.
     */
    Canviewqandawithoutposting?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewrating allowed.
     */
    Canviewrating?: boolean;
    /**
     * Whether the user has the capability mod/forum:viewsubscribers allowed.
     */
    Canviewsubscribers?: boolean;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}
