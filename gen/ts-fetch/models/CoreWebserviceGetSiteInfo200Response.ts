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
import type { CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner } from './CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner';
import {
    CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInnerFromJSON,
    CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInnerFromJSONTyped,
    CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInnerToJSON,
} from './CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner';
import type { CoreWebserviceGetSiteInfo200ResponseFunctionsInner } from './CoreWebserviceGetSiteInfo200ResponseFunctionsInner';
import {
    CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSON,
    CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSONTyped,
    CoreWebserviceGetSiteInfo200ResponseFunctionsInnerToJSON,
} from './CoreWebserviceGetSiteInfo200ResponseFunctionsInner';

/**
 * 
 * @export
 * @interface CoreWebserviceGetSiteInfo200Response
 */
export interface CoreWebserviceGetSiteInfo200Response {
    /**
     * 
     * @type {Array<CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner>}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    advancedfeatures?: Array<CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner>;
    /**
     * 1 if users are allowed to download files, 0 if not
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    downloadfiles?: number;
    /**
     * first name
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    firstname: string;
    /**
     * user full name
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    fullname: string;
    /**
     * 
     * @type {Array<CoreWebserviceGetSiteInfo200ResponseFunctionsInner>}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    functions: Array<CoreWebserviceGetSiteInfo200ResponseFunctionsInner>;
    /**
     * Current language.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    lang: string;
    /**
     * last name
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    lastname: string;
    /**
     * Number of concurrent sessions allowed
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    limitconcurrentlogins?: number;
    /**
     * Mobile custom CSS theme
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    mobilecssurl?: string;
    /**
     * Moodle release number
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    release?: string;
    /**
     * Calendar type set in the site.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    sitecalendartype?: string;
    /**
     * Site course ID
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    siteid?: number;
    /**
     * site name
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    sitename: string;
    /**
     * site url
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    siteurl: string;
    /**
     * Current theme for the user.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    theme?: string;
    /**
     * 1 if users are allowed to upload files, 0 if not
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    uploadfiles?: number;
    /**
     * Calendar typed used by the user.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    usercalendartype?: string;
    /**
     * true if the user can manage his own files
     * @type {boolean}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    usercanmanageownfiles?: boolean;
    /**
     * the default home page for the user: 0 for the site home, 1 for dashboard
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userhomepage?: number;
    /**
     * user id
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userid: number;
    /**
     * Whether the user is a site admin or not.
     * @type {boolean}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userissiteadmin?: boolean;
    /**
     * user max upload file size (bytes). -1 means the user can ignore the upload file size
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    usermaxuploadfilesize?: number;
    /**
     * username
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    username: string;
    /**
     * the user profile picture.
     *                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.
     *                     In order to retrieve user profile pictures independently of the Moodle config, replace "pluginfile.php" by
     *                     "webservice/pluginfile.php?token=WSTOKEN&file="
     *                     Of course the user can only see profile picture depending
     *                     on his/her permissions. Moreover it is recommended to use HTTPS too.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userpictureurl: string;
    /**
     * Private user access key for fetching files.
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userprivateaccesskey?: string;
    /**
     * user quota (bytes). 0 means user can ignore the quota
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    userquota?: number;
    /**
     * Number of active sessions for current user.
     *                     Only returned when limitconcurrentlogins is used.
     * @type {number}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    usersessionscount?: number;
    /**
     * Moodle version number
     * @type {string}
     * @memberof CoreWebserviceGetSiteInfo200Response
     */
    version?: string;
}

/**
 * Check if a given object implements the CoreWebserviceGetSiteInfo200Response interface.
 */
export function instanceOfCoreWebserviceGetSiteInfo200Response(value: object): boolean {
    if (!('firstname' in value)) return false;
    if (!('fullname' in value)) return false;
    if (!('functions' in value)) return false;
    if (!('lang' in value)) return false;
    if (!('lastname' in value)) return false;
    if (!('sitename' in value)) return false;
    if (!('siteurl' in value)) return false;
    if (!('userid' in value)) return false;
    if (!('username' in value)) return false;
    if (!('userpictureurl' in value)) return false;
    return true;
}

export function CoreWebserviceGetSiteInfo200ResponseFromJSON(json: any): CoreWebserviceGetSiteInfo200Response {
    return CoreWebserviceGetSiteInfo200ResponseFromJSONTyped(json, false);
}

export function CoreWebserviceGetSiteInfo200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreWebserviceGetSiteInfo200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'advancedfeatures': json['advancedfeatures'] == null ? undefined : ((json['advancedfeatures'] as Array<any>).map(CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInnerFromJSON)),
        'downloadfiles': json['downloadfiles'] == null ? undefined : json['downloadfiles'],
        'firstname': json['firstname'],
        'fullname': json['fullname'],
        'functions': ((json['functions'] as Array<any>).map(CoreWebserviceGetSiteInfo200ResponseFunctionsInnerFromJSON)),
        'lang': json['lang'],
        'lastname': json['lastname'],
        'limitconcurrentlogins': json['limitconcurrentlogins'] == null ? undefined : json['limitconcurrentlogins'],
        'mobilecssurl': json['mobilecssurl'] == null ? undefined : json['mobilecssurl'],
        'release': json['release'] == null ? undefined : json['release'],
        'sitecalendartype': json['sitecalendartype'] == null ? undefined : json['sitecalendartype'],
        'siteid': json['siteid'] == null ? undefined : json['siteid'],
        'sitename': json['sitename'],
        'siteurl': json['siteurl'],
        'theme': json['theme'] == null ? undefined : json['theme'],
        'uploadfiles': json['uploadfiles'] == null ? undefined : json['uploadfiles'],
        'usercalendartype': json['usercalendartype'] == null ? undefined : json['usercalendartype'],
        'usercanmanageownfiles': json['usercanmanageownfiles'] == null ? undefined : json['usercanmanageownfiles'],
        'userhomepage': json['userhomepage'] == null ? undefined : json['userhomepage'],
        'userid': json['userid'],
        'userissiteadmin': json['userissiteadmin'] == null ? undefined : json['userissiteadmin'],
        'usermaxuploadfilesize': json['usermaxuploadfilesize'] == null ? undefined : json['usermaxuploadfilesize'],
        'username': json['username'],
        'userpictureurl': json['userpictureurl'],
        'userprivateaccesskey': json['userprivateaccesskey'] == null ? undefined : json['userprivateaccesskey'],
        'userquota': json['userquota'] == null ? undefined : json['userquota'],
        'usersessionscount': json['usersessionscount'] == null ? undefined : json['usersessionscount'],
        'version': json['version'] == null ? undefined : json['version'],
    };
}

export function CoreWebserviceGetSiteInfo200ResponseToJSON(value?: CoreWebserviceGetSiteInfo200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'advancedfeatures': value['advancedfeatures'] == null ? undefined : ((value['advancedfeatures'] as Array<any>).map(CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInnerToJSON)),
        'downloadfiles': value['downloadfiles'],
        'firstname': value['firstname'],
        'fullname': value['fullname'],
        'functions': ((value['functions'] as Array<any>).map(CoreWebserviceGetSiteInfo200ResponseFunctionsInnerToJSON)),
        'lang': value['lang'],
        'lastname': value['lastname'],
        'limitconcurrentlogins': value['limitconcurrentlogins'],
        'mobilecssurl': value['mobilecssurl'],
        'release': value['release'],
        'sitecalendartype': value['sitecalendartype'],
        'siteid': value['siteid'],
        'sitename': value['sitename'],
        'siteurl': value['siteurl'],
        'theme': value['theme'],
        'uploadfiles': value['uploadfiles'],
        'usercalendartype': value['usercalendartype'],
        'usercanmanageownfiles': value['usercanmanageownfiles'],
        'userhomepage': value['userhomepage'],
        'userid': value['userid'],
        'userissiteadmin': value['userissiteadmin'],
        'usermaxuploadfilesize': value['usermaxuploadfilesize'],
        'username': value['username'],
        'userpictureurl': value['userpictureurl'],
        'userprivateaccesskey': value['userprivateaccesskey'],
        'userquota': value['userquota'],
        'usersessionscount': value['usersessionscount'],
        'version': value['version'],
    };
}
