# MoodleClient.Model.ToolMobileGetPublicConfig200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Agedigitalconsentverification** | **bool** | Whether age digital consent verification                     is enabled. | [optional] [default to null]
**Authinstructions** | **string** | Authentication instructions. | [default to "null"]
**Authloginviaemail** | **int** | Whether log in via email is enabled. | [default to null]
**Authnoneenabled** | **int** | Whether auth none is enabled. | [default to null]
**Autolang** | **int** | Whether to detect default language                     from browser setting. | [optional] [default to null]
**Compactlogourl** | **string** | The site compact logo URL | [optional] [default to "null"]
**Country** | **string** | Default site country | [optional] [default to "null"]
**Enablemobilewebservice** | **int** | Whether the Mobile service is enabled. | [default to null]
**Enablewebservices** | **int** | Whether Web Services are enabled. | [default to null]
**Forgottenpasswordurl** | **string** | Forgotten password URL. | [default to "null"]
**Guestlogin** | **int** | Whether guest login is enabled. | [default to null]
**Httpswwwroot** | **string** | Site https URL (if httpslogin is enabled). | [default to "null"]
**Identityproviders** | [**List&lt;ToolMobileGetPublicConfig200ResponseIdentityprovidersInner&gt;**](ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md) |  | [optional] 
**Lang** | **string** | Default language for the site. | [optional] [default to "null"]
**Langlist** | **string** | Languages on language menu. | [optional] [default to "null"]
**Langmenu** | **int** | Whether the language menu should be displayed. | [optional] [default to null]
**Launchurl** | **string** | SSO login launch URL. | [optional] [default to "null"]
**Locale** | **string** | Sitewide locale. | [optional] [default to "null"]
**Logourl** | **string** | The site logo URL | [optional] [default to "null"]
**Maintenanceenabled** | **int** | Whether site maintenance is enabled. | [default to null]
**Maintenancemessage** | **string** | Maintenance message. | [default to "null"]
**Mobilecssurl** | **string** | Mobile custom CSS theme | [optional] 
**Registerauth** | **string** | Authentication method for user registration. | [default to "null"]
**Rememberusername** | **int** | Values: 0 for No, 1 for Yes, 2 for optional. | [default to null]
**Sitename** | **string** | Site name. | [default to "null"]
**Supportavailability** | **int** | Determines who has access to contact site support. | [optional] [default to null]
**Supportemail** | **string** | Site support contact email                     (only if age verification is enabled). | [optional] [default to "null"]
**Supportname** | **string** | Site support contact name                     (only if age verification is enabled). | [optional] [default to "null"]
**Supportpage** | **string** | Site support page link. | [optional] [default to "null"]
**ToolMobileAndroidappid** | **string** | Android app&#39;s unique identifier. | [optional] [default to "null"]
**ToolMobileDisabledfeatures** | **string** | Disabled features in the app | [optional] [default to "null"]
**ToolMobileIosappid** | **string** | iOS app&#39;s unique identifier. | [optional] [default to "null"]
**ToolMobileMinimumversion** | **string** | Minimum required version to access. | [optional] [default to "null"]
**ToolMobileQrcodetype** | **int** | QR login configuration. | [optional] [default to null]
**ToolMobileSetuplink** | **string** | App download page. | [optional] [default to "null"]
**Typeoflogin** | **int** | The type of login. 1 for app, 2 for browser, 3 for embedded. | [default to null]
**Warnings** | [**List&lt;AuthEmailSignupUser200ResponseWarningsInner&gt;**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**Wwwroot** | **string** | Site URL. | [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

