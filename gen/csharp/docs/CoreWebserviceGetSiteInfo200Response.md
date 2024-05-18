# Org.OpenAPITools.Model.CoreWebserviceGetSiteInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Advancedfeatures** | [**List&lt;CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner&gt;**](CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md) |  | [optional] 
**Downloadfiles** | **int** | 1 if users are allowed to download files, 0 if not | [optional] [default to null]
**Firstname** | **string** | first name | [default to "null"]
**Fullname** | **string** | user full name | [default to "null"]
**Functions** | [**List&lt;CoreWebserviceGetSiteInfo200ResponseFunctionsInner&gt;**](CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md) |  | 
**Lang** | **string** | Current language. | [default to "null"]
**Lastname** | **string** | last name | [default to "null"]
**Limitconcurrentlogins** | **int** | Number of concurrent sessions allowed | [optional] [default to null]
**Mobilecssurl** | **string** | Mobile custom CSS theme | [optional] [default to "null"]
**Release** | **string** | Moodle release number | [optional] [default to "null"]
**Sitecalendartype** | **string** | Calendar type set in the site. | [optional] [default to "null"]
**Siteid** | **int** | Site course ID | [optional] [default to null]
**Sitename** | **string** | site name | [default to "null"]
**Siteurl** | **string** | site url | [default to "null"]
**Theme** | **string** | Current theme for the user. | [optional] [default to "null"]
**Uploadfiles** | **int** | 1 if users are allowed to upload files, 0 if not | [optional] [default to null]
**Usercalendartype** | **string** | Calendar typed used by the user. | [optional] [default to "null"]
**Usercanmanageownfiles** | **bool** | true if the user can manage his own files | [optional] [default to null]
**Userhomepage** | **int** | the default home page for the user: 0 for the site home, 1 for dashboard | [optional] [default to null]
**Userid** | **int** | user id | 
**Userissiteadmin** | **bool** | Whether the user is a site admin or not. | [optional] [default to null]
**Usermaxuploadfilesize** | **int** | user max upload file size (bytes). -1 means the user can ignore the upload file size | [optional] [default to null]
**Username** | **string** | username | [default to "null"]
**Userpictureurl** | **string** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \&quot;pluginfile.php\&quot; by                     \&quot;webservice/pluginfile.php?token&#x3D;WSTOKEN&amp;file&#x3D;\&quot;                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. | [default to "null"]
**Userprivateaccesskey** | **string** | Private user access key for fetching files. | [optional] [default to "null"]
**Userquota** | **int** | user quota (bytes). 0 means user can ignore the quota | [optional] [default to null]
**Usersessionscount** | **int** | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. | [optional] [default to null]
**VarVersion** | **string** | Moodle version number | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
