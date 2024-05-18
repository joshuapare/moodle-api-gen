# ToolMobileGetPublicConfig200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agedigitalconsentverification** | **bool** | Whether age digital consent verification                     is enabled. | [optional] [default to False]
**authinstructions** | **str** | Authentication instructions. | [default to 'null']
**authloginviaemail** | **int** | Whether log in via email is enabled. | [default to null]
**authnoneenabled** | **int** | Whether auth none is enabled. | [default to null]
**autolang** | **int** | Whether to detect default language                     from browser setting. | [optional] [default to null]
**compactlogourl** | **str** | The site compact logo URL | [optional] [default to 'null']
**country** | **str** | Default site country | [optional] [default to 'null']
**enablemobilewebservice** | **int** | Whether the Mobile service is enabled. | [default to null]
**enablewebservices** | **int** | Whether Web Services are enabled. | [default to null]
**forgottenpasswordurl** | **str** | Forgotten password URL. | [default to 'null']
**guestlogin** | **int** | Whether guest login is enabled. | [default to null]
**httpswwwroot** | **str** | Site https URL (if httpslogin is enabled). | [default to 'null']
**identityproviders** | [**List[ToolMobileGetPublicConfig200ResponseIdentityprovidersInner]**](ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md) |  | [optional] 
**lang** | **str** | Default language for the site. | [optional] [default to 'null']
**langlist** | **str** | Languages on language menu. | [optional] [default to 'null']
**langmenu** | **int** | Whether the language menu should be displayed. | [optional] [default to null]
**launchurl** | **str** | SSO login launch URL. | [optional] [default to 'null']
**locale** | **str** | Sitewide locale. | [optional] [default to 'null']
**logourl** | **str** | The site logo URL | [optional] [default to 'null']
**maintenanceenabled** | **int** | Whether site maintenance is enabled. | [default to null]
**maintenancemessage** | **str** | Maintenance message. | [default to 'null']
**mobilecssurl** | **str** | Mobile custom CSS theme | [optional] 
**registerauth** | **str** | Authentication method for user registration. | [default to 'null']
**rememberusername** | **int** | Values: 0 for No, 1 for Yes, 2 for optional. | [default to null]
**sitename** | **str** | Site name. | [default to 'null']
**supportavailability** | **int** | Determines who has access to contact site support. | [optional] [default to null]
**supportemail** | **str** | Site support contact email                     (only if age verification is enabled). | [optional] [default to 'null']
**supportname** | **str** | Site support contact name                     (only if age verification is enabled). | [optional] [default to 'null']
**supportpage** | **str** | Site support page link. | [optional] [default to 'null']
**tool_mobile_androidappid** | **str** | Android app&#39;s unique identifier. | [optional] [default to 'null']
**tool_mobile_disabledfeatures** | **str** | Disabled features in the app | [optional] [default to 'null']
**tool_mobile_iosappid** | **str** | iOS app&#39;s unique identifier. | [optional] [default to 'null']
**tool_mobile_minimumversion** | **str** | Minimum required version to access. | [optional] [default to 'null']
**tool_mobile_qrcodetype** | **int** | QR login configuration. | [optional] [default to null]
**tool_mobile_setuplink** | **str** | App download page. | [optional] [default to 'null']
**typeoflogin** | **int** | The type of login. 1 for app, 2 for browser, 3 for embedded. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**wwwroot** | **str** | Site URL. | [default to 'null']

## Example

```python
from openapi_client.models.tool_mobile_get_public_config200_response import ToolMobileGetPublicConfig200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetPublicConfig200Response from a JSON string
tool_mobile_get_public_config200_response_instance = ToolMobileGetPublicConfig200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetPublicConfig200Response.to_json())

# convert the object into a dict
tool_mobile_get_public_config200_response_dict = tool_mobile_get_public_config200_response_instance.to_dict()
# create an instance of ToolMobileGetPublicConfig200Response from a dict
tool_mobile_get_public_config200_response_from_dict = ToolMobileGetPublicConfig200Response.from_dict(tool_mobile_get_public_config200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


