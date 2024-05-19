# CoreWebserviceGetSiteInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advancedfeatures** | [**List[CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner]**](CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md) |  | [optional] 
**downloadfiles** | **int** | 1 if users are allowed to download files, 0 if not | [optional] [default to null]
**firstname** | **str** | first name | [default to 'null']
**fullname** | **str** | user full name | [default to 'null']
**functions** | [**List[CoreWebserviceGetSiteInfo200ResponseFunctionsInner]**](CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md) |  | 
**lang** | **str** | Current language. | [default to 'null']
**lastname** | **str** | last name | [default to 'null']
**limitconcurrentlogins** | **int** | Number of concurrent sessions allowed | [optional] [default to null]
**mobilecssurl** | **str** | Mobile custom CSS theme | [optional] [default to 'null']
**release** | **str** | Moodle release number | [optional] [default to 'null']
**sitecalendartype** | **str** | Calendar type set in the site. | [optional] [default to 'null']
**siteid** | **int** | Site course ID | [optional] [default to null]
**sitename** | **str** | site name | [default to 'null']
**siteurl** | **str** | site url | [default to 'null']
**theme** | **str** | Current theme for the user. | [optional] [default to 'null']
**uploadfiles** | **int** | 1 if users are allowed to upload files, 0 if not | [optional] [default to null]
**usercalendartype** | **str** | Calendar typed used by the user. | [optional] [default to 'null']
**usercanmanageownfiles** | **bool** | true if the user can manage his own files | [optional] [default to False]
**userhomepage** | **int** | the default home page for the user: 0 for the site home, 1 for dashboard | [optional] [default to null]
**userid** | **int** | user id | 
**userissiteadmin** | **bool** | Whether the user is a site admin or not. | [optional] [default to False]
**usermaxuploadfilesize** | **int** | user max upload file size (bytes). -1 means the user can ignore the upload file size | [optional] [default to null]
**username** | **str** | username | [default to 'null']
**userpictureurl** | **str** | the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \&quot;pluginfile.php\&quot; by                     \&quot;webservice/pluginfile.php?token&#x3D;WSTOKEN&amp;file&#x3D;\&quot;                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too. | [default to 'null']
**userprivateaccesskey** | **str** | Private user access key for fetching files. | [optional] [default to 'null']
**userquota** | **int** | user quota (bytes). 0 means user can ignore the quota | [optional] [default to null]
**usersessionscount** | **int** | Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used. | [optional] [default to null]
**version** | **str** | Moodle version number | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_webservice_get_site_info200_response import CoreWebserviceGetSiteInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreWebserviceGetSiteInfo200Response from a JSON string
core_webservice_get_site_info200_response_instance = CoreWebserviceGetSiteInfo200Response.from_json(json)
# print the JSON string representation of the object
print(CoreWebserviceGetSiteInfo200Response.to_json())

# convert the object into a dict
core_webservice_get_site_info200_response_dict = core_webservice_get_site_info200_response_instance.to_dict()
# create an instance of CoreWebserviceGetSiteInfo200Response from a dict
core_webservice_get_site_info200_response_from_dict = CoreWebserviceGetSiteInfo200Response.from_dict(core_webservice_get_site_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


