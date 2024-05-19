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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';

export class ModForumGetForumAccessInformation200Response {
    /**
    * Whether the user has the capability mod/forum:addinstance allowed.
    */
    'Canaddinstance'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:addnews allowed.
    */
    'Canaddnews'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:addquestion allowed.
    */
    'Canaddquestion'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:allowforcesubscribe allowed.
    */
    'Canallowforcesubscribe'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:canmailnow allowed.
    */
    'Cancanmailnow'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:canoverridecutoff allowed.
    */
    'Cancanoverridecutoff'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:canoverridediscussionlock allowed.
    */
    'Cancanoverridediscussionlock'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:canposttomygroups allowed.
    */
    'Cancanposttomygroups'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:cantogglefavourite allowed.
    */
    'Cancantogglefavourite'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:createattachment allowed.
    */
    'Cancreateattachment'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:deleteanypost allowed.
    */
    'Candeleteanypost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:deleteownpost allowed.
    */
    'Candeleteownpost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:editanypost allowed.
    */
    'Caneditanypost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:exportdiscussion allowed.
    */
    'Canexportdiscussion'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:exportforum allowed.
    */
    'Canexportforum'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:exportownpost allowed.
    */
    'Canexportownpost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:exportpost allowed.
    */
    'Canexportpost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:grade allowed.
    */
    'Cangrade'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:managesubscriptions allowed.
    */
    'Canmanagesubscriptions'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:movediscussions allowed.
    */
    'Canmovediscussions'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:pindiscussions allowed.
    */
    'Canpindiscussions'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:postprivatereply allowed.
    */
    'Canpostprivatereply'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:postwithoutthrottling allowed.
    */
    'Canpostwithoutthrottling'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:rate allowed.
    */
    'Canrate'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:readprivatereplies allowed.
    */
    'Canreadprivatereplies'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:replynews allowed.
    */
    'Canreplynews'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:replypost allowed.
    */
    'Canreplypost'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:splitdiscussions allowed.
    */
    'Cansplitdiscussions'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:startdiscussion allowed.
    */
    'Canstartdiscussion'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewallratings allowed.
    */
    'Canviewallratings'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewanyrating allowed.
    */
    'Canviewanyrating'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewdiscussion allowed.
    */
    'Canviewdiscussion'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewhiddentimedposts allowed.
    */
    'Canviewhiddentimedposts'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewqandawithoutposting allowed.
    */
    'Canviewqandawithoutposting'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewrating allowed.
    */
    'Canviewrating'?: boolean = null;
    /**
    * Whether the user has the capability mod/forum:viewsubscribers allowed.
    */
    'Canviewsubscribers'?: boolean = null;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canaddinstance",
            "baseName": "canaddinstance",
            "type": "boolean"
        },
        {
            "name": "Canaddnews",
            "baseName": "canaddnews",
            "type": "boolean"
        },
        {
            "name": "Canaddquestion",
            "baseName": "canaddquestion",
            "type": "boolean"
        },
        {
            "name": "Canallowforcesubscribe",
            "baseName": "canallowforcesubscribe",
            "type": "boolean"
        },
        {
            "name": "Cancanmailnow",
            "baseName": "cancanmailnow",
            "type": "boolean"
        },
        {
            "name": "Cancanoverridecutoff",
            "baseName": "cancanoverridecutoff",
            "type": "boolean"
        },
        {
            "name": "Cancanoverridediscussionlock",
            "baseName": "cancanoverridediscussionlock",
            "type": "boolean"
        },
        {
            "name": "Cancanposttomygroups",
            "baseName": "cancanposttomygroups",
            "type": "boolean"
        },
        {
            "name": "Cancantogglefavourite",
            "baseName": "cancantogglefavourite",
            "type": "boolean"
        },
        {
            "name": "Cancreateattachment",
            "baseName": "cancreateattachment",
            "type": "boolean"
        },
        {
            "name": "Candeleteanypost",
            "baseName": "candeleteanypost",
            "type": "boolean"
        },
        {
            "name": "Candeleteownpost",
            "baseName": "candeleteownpost",
            "type": "boolean"
        },
        {
            "name": "Caneditanypost",
            "baseName": "caneditanypost",
            "type": "boolean"
        },
        {
            "name": "Canexportdiscussion",
            "baseName": "canexportdiscussion",
            "type": "boolean"
        },
        {
            "name": "Canexportforum",
            "baseName": "canexportforum",
            "type": "boolean"
        },
        {
            "name": "Canexportownpost",
            "baseName": "canexportownpost",
            "type": "boolean"
        },
        {
            "name": "Canexportpost",
            "baseName": "canexportpost",
            "type": "boolean"
        },
        {
            "name": "Cangrade",
            "baseName": "cangrade",
            "type": "boolean"
        },
        {
            "name": "Canmanagesubscriptions",
            "baseName": "canmanagesubscriptions",
            "type": "boolean"
        },
        {
            "name": "Canmovediscussions",
            "baseName": "canmovediscussions",
            "type": "boolean"
        },
        {
            "name": "Canpindiscussions",
            "baseName": "canpindiscussions",
            "type": "boolean"
        },
        {
            "name": "Canpostprivatereply",
            "baseName": "canpostprivatereply",
            "type": "boolean"
        },
        {
            "name": "Canpostwithoutthrottling",
            "baseName": "canpostwithoutthrottling",
            "type": "boolean"
        },
        {
            "name": "Canrate",
            "baseName": "canrate",
            "type": "boolean"
        },
        {
            "name": "Canreadprivatereplies",
            "baseName": "canreadprivatereplies",
            "type": "boolean"
        },
        {
            "name": "Canreplynews",
            "baseName": "canreplynews",
            "type": "boolean"
        },
        {
            "name": "Canreplypost",
            "baseName": "canreplypost",
            "type": "boolean"
        },
        {
            "name": "Cansplitdiscussions",
            "baseName": "cansplitdiscussions",
            "type": "boolean"
        },
        {
            "name": "Canstartdiscussion",
            "baseName": "canstartdiscussion",
            "type": "boolean"
        },
        {
            "name": "Canviewallratings",
            "baseName": "canviewallratings",
            "type": "boolean"
        },
        {
            "name": "Canviewanyrating",
            "baseName": "canviewanyrating",
            "type": "boolean"
        },
        {
            "name": "Canviewdiscussion",
            "baseName": "canviewdiscussion",
            "type": "boolean"
        },
        {
            "name": "Canviewhiddentimedposts",
            "baseName": "canviewhiddentimedposts",
            "type": "boolean"
        },
        {
            "name": "Canviewqandawithoutposting",
            "baseName": "canviewqandawithoutposting",
            "type": "boolean"
        },
        {
            "name": "Canviewrating",
            "baseName": "canviewrating",
            "type": "boolean"
        },
        {
            "name": "Canviewsubscribers",
            "baseName": "canviewsubscribers",
            "type": "boolean"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModForumGetForumAccessInformation200Response.attributeTypeMap;
    }
}

