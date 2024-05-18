# CoreWebserviceGetSiteInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advancedfeatures** | Option<[**Vec<models::CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner>**](core_webservice_get_site_info_200_response_advancedfeatures_inner.md)> |  | [optional]
**downloadfiles** | Option<**i32**> | 1 if users are allowed to download files, 0 if not | [optional][default to null]
**firstname** | **String** | first name | [default to null]
**fullname** | **String** | user full name | [default to null]
**functions** | [**Vec<models::CoreWebserviceGetSiteInfo200ResponseFunctionsInner>**](core_webservice_get_site_info_200_response_functions_inner.md) |  | 
**lang** | **String** | Current language. | [default to null]
**lastname** | **String** | last name | [default to null]
**limitconcurrentlogins** | Option<**i32**> | Number of concurrent sessions allowed | [optional][default to null]
**mobilecssurl** | Option<**String**> | Mobile custom CSS theme | [optional][default to null]
**release** | Option<**String**> | Moodle release number | [optional][default to null]
**sitecalendartype** | Option<**String**> | Calendar type set in the site. | [optional][default to null]
**siteid** | Option<**i32**> | Site course ID | [optional][default to null]
**sitename** | **String** | site name | [default to null]
**siteurl** | **String** | site url | [default to null]
**theme** | Option<**String**> | Current theme for the user. | [optional][default to null]
**uploadfiles** | Option<**i32**> | 1 if users are allowed to upload files, 0 if not | [optional][default to null]
**usercalendartype** | Option<**String**> | Calendar typed used by the user. | [optional][default to null]
**usercanmanageownfiles** | Option<**bool**> | true if the user can manage his own files | [optional][default to null]
**userhomepage** | Option<**i32**> | the default home page for the user: 0 for the site home, 1 for dashboard | [optional][default to null]
**userid** | **i32** | user id | 
**userissiteadmin** | Option<**bool**> | Whether the user is a site admin or not. | [optional][default to null]
**usermaxuploadfilesize** | Option<**i32**> | user max upload file size (bytes). -1 means the user can ignore the upload file size | [optional][default to null]
**username** | **String** | username | [default to null]
**userpictureurl** | **String** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \"pluginfile.php\" by                     \"webservice/pluginfile.php?token=WSTOKEN&file=\"                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. | [default to null]
**userprivateaccesskey** | Option<**String**> | Private user access key for fetching files. | [optional][default to null]
**userquota** | Option<**i32**> | user quota (bytes). 0 means user can ignore the quota | [optional][default to null]
**usersessionscount** | Option<**i32**> | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. | [optional][default to null]
**version** | Option<**String**> | Moodle version number | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


