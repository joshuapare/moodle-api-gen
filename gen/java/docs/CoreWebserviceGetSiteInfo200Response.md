

# CoreWebserviceGetSiteInfo200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advancedfeatures** | [**List&lt;CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner&gt;**](CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md) |  |  [optional] |
|**downloadfiles** | **Integer** | 1 if users are allowed to download files, 0 if not |  [optional] |
|**firstname** | **String** | first name |  |
|**fullname** | **String** | user full name |  |
|**functions** | [**List&lt;CoreWebserviceGetSiteInfo200ResponseFunctionsInner&gt;**](CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md) |  |  |
|**lang** | **String** | Current language. |  |
|**lastname** | **String** | last name |  |
|**limitconcurrentlogins** | **Integer** | Number of concurrent sessions allowed |  [optional] |
|**mobilecssurl** | **String** | Mobile custom CSS theme |  [optional] |
|**release** | **String** | Moodle release number |  [optional] |
|**sitecalendartype** | **String** | Calendar type set in the site. |  [optional] |
|**siteid** | **Integer** | Site course ID |  [optional] |
|**sitename** | **String** | site name |  |
|**siteurl** | **String** | site url |  |
|**theme** | **String** | Current theme for the user. |  [optional] |
|**uploadfiles** | **Integer** | 1 if users are allowed to upload files, 0 if not |  [optional] |
|**usercalendartype** | **String** | Calendar typed used by the user. |  [optional] |
|**usercanmanageownfiles** | **Boolean** | true if the user can manage his own files |  [optional] |
|**userhomepage** | **Integer** | the default home page for the user: 0 for the site home, 1 for dashboard |  [optional] |
|**userid** | **Integer** | user id |  |
|**userissiteadmin** | **Boolean** | Whether the user is a site admin or not. |  [optional] |
|**usermaxuploadfilesize** | **Integer** | user max upload file size (bytes). -1 means the user can ignore the upload file size |  [optional] |
|**username** | **String** | username |  |
|**userpictureurl** | **String** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \&quot;pluginfile.php\&quot; by                     \&quot;webservice/pluginfile.php?token&#x3D;WSTOKEN&amp;file&#x3D;\&quot;                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. |  |
|**userprivateaccesskey** | **String** | Private user access key for fetching files. |  [optional] |
|**userquota** | **Integer** | user quota (bytes). 0 means user can ignore the quota |  [optional] |
|**usersessionscount** | **Integer** | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. |  [optional] |
|**version** | **String** | Moodle version number |  [optional] |



