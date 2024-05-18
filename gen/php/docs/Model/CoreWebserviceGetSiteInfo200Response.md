# # CoreWebserviceGetSiteInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advancedfeatures** | [**\OpenAPI\Client\Model\CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner[]**](CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md) |  | [optional]
**downloadfiles** | **int** | 1 if users are allowed to download files, 0 if not | [optional] [default to null]
**firstname** | **string** | first name | [default to 'null']
**fullname** | **string** | user full name | [default to 'null']
**functions** | [**\OpenAPI\Client\Model\CoreWebserviceGetSiteInfo200ResponseFunctionsInner[]**](CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md) |  |
**lang** | **string** | Current language. | [default to 'null']
**lastname** | **string** | last name | [default to 'null']
**limitconcurrentlogins** | **int** | Number of concurrent sessions allowed | [optional] [default to null]
**mobilecssurl** | **string** | Mobile custom CSS theme | [optional] [default to 'null']
**release** | **string** | Moodle release number | [optional] [default to 'null']
**sitecalendartype** | **string** | Calendar type set in the site. | [optional] [default to 'null']
**siteid** | **int** | Site course ID | [optional] [default to null]
**sitename** | **string** | site name | [default to 'null']
**siteurl** | **string** | site url | [default to 'null']
**theme** | **string** | Current theme for the user. | [optional] [default to 'null']
**uploadfiles** | **int** | 1 if users are allowed to upload files, 0 if not | [optional] [default to null]
**usercalendartype** | **string** | Calendar typed used by the user. | [optional] [default to 'null']
**usercanmanageownfiles** | **bool** | true if the user can manage his own files | [optional] [default to null]
**userhomepage** | **int** | the default home page for the user: 0 for the site home, 1 for dashboard | [optional] [default to null]
**userid** | **int** | user id |
**userissiteadmin** | **bool** | Whether the user is a site admin or not. | [optional] [default to null]
**usermaxuploadfilesize** | **int** | user max upload file size (bytes). -1 means the user can ignore the upload file size | [optional] [default to null]
**username** | **string** | username | [default to 'null']
**userpictureurl** | **string** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \&quot;pluginfile.php\&quot; by                     \&quot;webservice/pluginfile.php?token&#x3D;WSTOKEN&amp;file&#x3D;\&quot;                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. | [default to 'null']
**userprivateaccesskey** | **string** | Private user access key for fetching files. | [optional] [default to 'null']
**userquota** | **int** | user quota (bytes). 0 means user can ignore the quota | [optional] [default to null]
**usersessionscount** | **int** | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. | [optional] [default to null]
**version** | **string** | Moodle version number | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
