# CoreWebserviceGetSiteInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Advancedfeatures** | Pointer to [**[]CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner**](CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md) |  | [optional] 
**Downloadfiles** | Pointer to **int32** | 1 if users are allowed to download files, 0 if not | [optional] [default to null]
**Firstname** | **string** | first name | [default to "null"]
**Fullname** | **string** | user full name | [default to "null"]
**Functions** | [**[]CoreWebserviceGetSiteInfo200ResponseFunctionsInner**](CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md) |  | 
**Lang** | **string** | Current language. | [default to "null"]
**Lastname** | **string** | last name | [default to "null"]
**Limitconcurrentlogins** | Pointer to **int32** | Number of concurrent sessions allowed | [optional] [default to null]
**Mobilecssurl** | Pointer to **string** | Mobile custom CSS theme | [optional] [default to "null"]
**Release** | Pointer to **string** | Moodle release number | [optional] [default to "null"]
**Sitecalendartype** | Pointer to **string** | Calendar type set in the site. | [optional] [default to "null"]
**Siteid** | Pointer to **int32** | Site course ID | [optional] [default to null]
**Sitename** | **string** | site name | [default to "null"]
**Siteurl** | **string** | site url | [default to "null"]
**Theme** | Pointer to **string** | Current theme for the user. | [optional] [default to "null"]
**Uploadfiles** | Pointer to **int32** | 1 if users are allowed to upload files, 0 if not | [optional] [default to null]
**Usercalendartype** | Pointer to **string** | Calendar typed used by the user. | [optional] [default to "null"]
**Usercanmanageownfiles** | Pointer to **bool** | true if the user can manage his own files | [optional] [default to null]
**Userhomepage** | Pointer to **int32** | the default home page for the user: 0 for the site home, 1 for dashboard | [optional] [default to null]
**Userid** | **int32** | user id | 
**Userissiteadmin** | Pointer to **bool** | Whether the user is a site admin or not. | [optional] [default to null]
**Usermaxuploadfilesize** | Pointer to **int32** | user max upload file size (bytes). -1 means the user can ignore the upload file size | [optional] [default to null]
**Username** | **string** | username | [default to "null"]
**Userpictureurl** | **string** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \&quot;pluginfile.php\&quot; by                     \&quot;webservice/pluginfile.php?token&#x3D;WSTOKEN&amp;file&#x3D;\&quot;                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. | [default to "null"]
**Userprivateaccesskey** | Pointer to **string** | Private user access key for fetching files. | [optional] [default to "null"]
**Userquota** | Pointer to **int32** | user quota (bytes). 0 means user can ignore the quota | [optional] [default to null]
**Usersessionscount** | Pointer to **int32** | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. | [optional] [default to null]
**Version** | Pointer to **string** | Moodle version number | [optional] [default to "null"]

## Methods

### NewCoreWebserviceGetSiteInfo200Response

`func NewCoreWebserviceGetSiteInfo200Response(firstname string, fullname string, functions []CoreWebserviceGetSiteInfo200ResponseFunctionsInner, lang string, lastname string, sitename string, siteurl string, userid int32, username string, userpictureurl string, ) *CoreWebserviceGetSiteInfo200Response`

NewCoreWebserviceGetSiteInfo200Response instantiates a new CoreWebserviceGetSiteInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreWebserviceGetSiteInfo200ResponseWithDefaults

`func NewCoreWebserviceGetSiteInfo200ResponseWithDefaults() *CoreWebserviceGetSiteInfo200Response`

NewCoreWebserviceGetSiteInfo200ResponseWithDefaults instantiates a new CoreWebserviceGetSiteInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvancedfeatures

`func (o *CoreWebserviceGetSiteInfo200Response) GetAdvancedfeatures() []CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner`

GetAdvancedfeatures returns the Advancedfeatures field if non-nil, zero value otherwise.

### GetAdvancedfeaturesOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetAdvancedfeaturesOk() (*[]CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner, bool)`

GetAdvancedfeaturesOk returns a tuple with the Advancedfeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvancedfeatures

`func (o *CoreWebserviceGetSiteInfo200Response) SetAdvancedfeatures(v []CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner)`

SetAdvancedfeatures sets Advancedfeatures field to given value.

### HasAdvancedfeatures

`func (o *CoreWebserviceGetSiteInfo200Response) HasAdvancedfeatures() bool`

HasAdvancedfeatures returns a boolean if a field has been set.

### GetDownloadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) GetDownloadfiles() int32`

GetDownloadfiles returns the Downloadfiles field if non-nil, zero value otherwise.

### GetDownloadfilesOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetDownloadfilesOk() (*int32, bool)`

GetDownloadfilesOk returns a tuple with the Downloadfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) SetDownloadfiles(v int32)`

SetDownloadfiles sets Downloadfiles field to given value.

### HasDownloadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) HasDownloadfiles() bool`

HasDownloadfiles returns a boolean if a field has been set.

### GetFirstname

`func (o *CoreWebserviceGetSiteInfo200Response) GetFirstname() string`

GetFirstname returns the Firstname field if non-nil, zero value otherwise.

### GetFirstnameOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetFirstnameOk() (*string, bool)`

GetFirstnameOk returns a tuple with the Firstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstname

`func (o *CoreWebserviceGetSiteInfo200Response) SetFirstname(v string)`

SetFirstname sets Firstname field to given value.


### GetFullname

`func (o *CoreWebserviceGetSiteInfo200Response) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreWebserviceGetSiteInfo200Response) SetFullname(v string)`

SetFullname sets Fullname field to given value.


### GetFunctions

`func (o *CoreWebserviceGetSiteInfo200Response) GetFunctions() []CoreWebserviceGetSiteInfo200ResponseFunctionsInner`

GetFunctions returns the Functions field if non-nil, zero value otherwise.

### GetFunctionsOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetFunctionsOk() (*[]CoreWebserviceGetSiteInfo200ResponseFunctionsInner, bool)`

GetFunctionsOk returns a tuple with the Functions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunctions

`func (o *CoreWebserviceGetSiteInfo200Response) SetFunctions(v []CoreWebserviceGetSiteInfo200ResponseFunctionsInner)`

SetFunctions sets Functions field to given value.


### GetLang

`func (o *CoreWebserviceGetSiteInfo200Response) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreWebserviceGetSiteInfo200Response) SetLang(v string)`

SetLang sets Lang field to given value.


### GetLastname

`func (o *CoreWebserviceGetSiteInfo200Response) GetLastname() string`

GetLastname returns the Lastname field if non-nil, zero value otherwise.

### GetLastnameOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetLastnameOk() (*string, bool)`

GetLastnameOk returns a tuple with the Lastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastname

`func (o *CoreWebserviceGetSiteInfo200Response) SetLastname(v string)`

SetLastname sets Lastname field to given value.


### GetLimitconcurrentlogins

`func (o *CoreWebserviceGetSiteInfo200Response) GetLimitconcurrentlogins() int32`

GetLimitconcurrentlogins returns the Limitconcurrentlogins field if non-nil, zero value otherwise.

### GetLimitconcurrentloginsOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetLimitconcurrentloginsOk() (*int32, bool)`

GetLimitconcurrentloginsOk returns a tuple with the Limitconcurrentlogins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitconcurrentlogins

`func (o *CoreWebserviceGetSiteInfo200Response) SetLimitconcurrentlogins(v int32)`

SetLimitconcurrentlogins sets Limitconcurrentlogins field to given value.

### HasLimitconcurrentlogins

`func (o *CoreWebserviceGetSiteInfo200Response) HasLimitconcurrentlogins() bool`

HasLimitconcurrentlogins returns a boolean if a field has been set.

### GetMobilecssurl

`func (o *CoreWebserviceGetSiteInfo200Response) GetMobilecssurl() string`

GetMobilecssurl returns the Mobilecssurl field if non-nil, zero value otherwise.

### GetMobilecssurlOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetMobilecssurlOk() (*string, bool)`

GetMobilecssurlOk returns a tuple with the Mobilecssurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobilecssurl

`func (o *CoreWebserviceGetSiteInfo200Response) SetMobilecssurl(v string)`

SetMobilecssurl sets Mobilecssurl field to given value.

### HasMobilecssurl

`func (o *CoreWebserviceGetSiteInfo200Response) HasMobilecssurl() bool`

HasMobilecssurl returns a boolean if a field has been set.

### GetRelease

`func (o *CoreWebserviceGetSiteInfo200Response) GetRelease() string`

GetRelease returns the Release field if non-nil, zero value otherwise.

### GetReleaseOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetReleaseOk() (*string, bool)`

GetReleaseOk returns a tuple with the Release field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelease

`func (o *CoreWebserviceGetSiteInfo200Response) SetRelease(v string)`

SetRelease sets Release field to given value.

### HasRelease

`func (o *CoreWebserviceGetSiteInfo200Response) HasRelease() bool`

HasRelease returns a boolean if a field has been set.

### GetSitecalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) GetSitecalendartype() string`

GetSitecalendartype returns the Sitecalendartype field if non-nil, zero value otherwise.

### GetSitecalendartypeOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetSitecalendartypeOk() (*string, bool)`

GetSitecalendartypeOk returns a tuple with the Sitecalendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitecalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) SetSitecalendartype(v string)`

SetSitecalendartype sets Sitecalendartype field to given value.

### HasSitecalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) HasSitecalendartype() bool`

HasSitecalendartype returns a boolean if a field has been set.

### GetSiteid

`func (o *CoreWebserviceGetSiteInfo200Response) GetSiteid() int32`

GetSiteid returns the Siteid field if non-nil, zero value otherwise.

### GetSiteidOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetSiteidOk() (*int32, bool)`

GetSiteidOk returns a tuple with the Siteid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSiteid

`func (o *CoreWebserviceGetSiteInfo200Response) SetSiteid(v int32)`

SetSiteid sets Siteid field to given value.

### HasSiteid

`func (o *CoreWebserviceGetSiteInfo200Response) HasSiteid() bool`

HasSiteid returns a boolean if a field has been set.

### GetSitename

`func (o *CoreWebserviceGetSiteInfo200Response) GetSitename() string`

GetSitename returns the Sitename field if non-nil, zero value otherwise.

### GetSitenameOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetSitenameOk() (*string, bool)`

GetSitenameOk returns a tuple with the Sitename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSitename

`func (o *CoreWebserviceGetSiteInfo200Response) SetSitename(v string)`

SetSitename sets Sitename field to given value.


### GetSiteurl

`func (o *CoreWebserviceGetSiteInfo200Response) GetSiteurl() string`

GetSiteurl returns the Siteurl field if non-nil, zero value otherwise.

### GetSiteurlOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetSiteurlOk() (*string, bool)`

GetSiteurlOk returns a tuple with the Siteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSiteurl

`func (o *CoreWebserviceGetSiteInfo200Response) SetSiteurl(v string)`

SetSiteurl sets Siteurl field to given value.


### GetTheme

`func (o *CoreWebserviceGetSiteInfo200Response) GetTheme() string`

GetTheme returns the Theme field if non-nil, zero value otherwise.

### GetThemeOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetThemeOk() (*string, bool)`

GetThemeOk returns a tuple with the Theme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTheme

`func (o *CoreWebserviceGetSiteInfo200Response) SetTheme(v string)`

SetTheme sets Theme field to given value.

### HasTheme

`func (o *CoreWebserviceGetSiteInfo200Response) HasTheme() bool`

HasTheme returns a boolean if a field has been set.

### GetUploadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) GetUploadfiles() int32`

GetUploadfiles returns the Uploadfiles field if non-nil, zero value otherwise.

### GetUploadfilesOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUploadfilesOk() (*int32, bool)`

GetUploadfilesOk returns a tuple with the Uploadfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) SetUploadfiles(v int32)`

SetUploadfiles sets Uploadfiles field to given value.

### HasUploadfiles

`func (o *CoreWebserviceGetSiteInfo200Response) HasUploadfiles() bool`

HasUploadfiles returns a boolean if a field has been set.

### GetUsercalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsercalendartype() string`

GetUsercalendartype returns the Usercalendartype field if non-nil, zero value otherwise.

### GetUsercalendartypeOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsercalendartypeOk() (*string, bool)`

GetUsercalendartypeOk returns a tuple with the Usercalendartype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) SetUsercalendartype(v string)`

SetUsercalendartype sets Usercalendartype field to given value.

### HasUsercalendartype

`func (o *CoreWebserviceGetSiteInfo200Response) HasUsercalendartype() bool`

HasUsercalendartype returns a boolean if a field has been set.

### GetUsercanmanageownfiles

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsercanmanageownfiles() bool`

GetUsercanmanageownfiles returns the Usercanmanageownfiles field if non-nil, zero value otherwise.

### GetUsercanmanageownfilesOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsercanmanageownfilesOk() (*bool, bool)`

GetUsercanmanageownfilesOk returns a tuple with the Usercanmanageownfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercanmanageownfiles

`func (o *CoreWebserviceGetSiteInfo200Response) SetUsercanmanageownfiles(v bool)`

SetUsercanmanageownfiles sets Usercanmanageownfiles field to given value.

### HasUsercanmanageownfiles

`func (o *CoreWebserviceGetSiteInfo200Response) HasUsercanmanageownfiles() bool`

HasUsercanmanageownfiles returns a boolean if a field has been set.

### GetUserhomepage

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserhomepage() int32`

GetUserhomepage returns the Userhomepage field if non-nil, zero value otherwise.

### GetUserhomepageOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserhomepageOk() (*int32, bool)`

GetUserhomepageOk returns a tuple with the Userhomepage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserhomepage

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserhomepage(v int32)`

SetUserhomepage sets Userhomepage field to given value.

### HasUserhomepage

`func (o *CoreWebserviceGetSiteInfo200Response) HasUserhomepage() bool`

HasUserhomepage returns a boolean if a field has been set.

### GetUserid

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUserissiteadmin

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserissiteadmin() bool`

GetUserissiteadmin returns the Userissiteadmin field if non-nil, zero value otherwise.

### GetUserissiteadminOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserissiteadminOk() (*bool, bool)`

GetUserissiteadminOk returns a tuple with the Userissiteadmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserissiteadmin

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserissiteadmin(v bool)`

SetUserissiteadmin sets Userissiteadmin field to given value.

### HasUserissiteadmin

`func (o *CoreWebserviceGetSiteInfo200Response) HasUserissiteadmin() bool`

HasUserissiteadmin returns a boolean if a field has been set.

### GetUsermaxuploadfilesize

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsermaxuploadfilesize() int32`

GetUsermaxuploadfilesize returns the Usermaxuploadfilesize field if non-nil, zero value otherwise.

### GetUsermaxuploadfilesizeOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsermaxuploadfilesizeOk() (*int32, bool)`

GetUsermaxuploadfilesizeOk returns a tuple with the Usermaxuploadfilesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermaxuploadfilesize

`func (o *CoreWebserviceGetSiteInfo200Response) SetUsermaxuploadfilesize(v int32)`

SetUsermaxuploadfilesize sets Usermaxuploadfilesize field to given value.

### HasUsermaxuploadfilesize

`func (o *CoreWebserviceGetSiteInfo200Response) HasUsermaxuploadfilesize() bool`

HasUsermaxuploadfilesize returns a boolean if a field has been set.

### GetUsername

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *CoreWebserviceGetSiteInfo200Response) SetUsername(v string)`

SetUsername sets Username field to given value.


### GetUserpictureurl

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.


### GetUserprivateaccesskey

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserprivateaccesskey() string`

GetUserprivateaccesskey returns the Userprivateaccesskey field if non-nil, zero value otherwise.

### GetUserprivateaccesskeyOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserprivateaccesskeyOk() (*string, bool)`

GetUserprivateaccesskeyOk returns a tuple with the Userprivateaccesskey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserprivateaccesskey

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserprivateaccesskey(v string)`

SetUserprivateaccesskey sets Userprivateaccesskey field to given value.

### HasUserprivateaccesskey

`func (o *CoreWebserviceGetSiteInfo200Response) HasUserprivateaccesskey() bool`

HasUserprivateaccesskey returns a boolean if a field has been set.

### GetUserquota

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserquota() int32`

GetUserquota returns the Userquota field if non-nil, zero value otherwise.

### GetUserquotaOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUserquotaOk() (*int32, bool)`

GetUserquotaOk returns a tuple with the Userquota field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserquota

`func (o *CoreWebserviceGetSiteInfo200Response) SetUserquota(v int32)`

SetUserquota sets Userquota field to given value.

### HasUserquota

`func (o *CoreWebserviceGetSiteInfo200Response) HasUserquota() bool`

HasUserquota returns a boolean if a field has been set.

### GetUsersessionscount

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsersessionscount() int32`

GetUsersessionscount returns the Usersessionscount field if non-nil, zero value otherwise.

### GetUsersessionscountOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetUsersessionscountOk() (*int32, bool)`

GetUsersessionscountOk returns a tuple with the Usersessionscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsersessionscount

`func (o *CoreWebserviceGetSiteInfo200Response) SetUsersessionscount(v int32)`

SetUsersessionscount sets Usersessionscount field to given value.

### HasUsersessionscount

`func (o *CoreWebserviceGetSiteInfo200Response) HasUsersessionscount() bool`

HasUsersessionscount returns a boolean if a field has been set.

### GetVersion

`func (o *CoreWebserviceGetSiteInfo200Response) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *CoreWebserviceGetSiteInfo200Response) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *CoreWebserviceGetSiteInfo200Response) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *CoreWebserviceGetSiteInfo200Response) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


